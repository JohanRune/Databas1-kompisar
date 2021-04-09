package com.example.demo.controllers;

import com.example.demo.models.Kompis;
import com.example.demo.models.Message;
import com.example.demo.repos.DAO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Johan Rune
 * Date: 2021-04-08
 * Time: 14:52
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */

// ta bort

@RestController
public class KompisController {
    DAO db = new DAO();
    List<Kompis> myKompisar = db.getAllKompisar();

    @RequestMapping("/kompiss")
    public List<Kompis> kompiss() {
        return myKompisar;
    }

    @RequestMapping("/kompis/{id}")
    public Kompis enKompiss(@PathVariable int id) {
        for (Kompis k : myKompisar) {
            if (k.getId() == id)
                return k;
        }
        return null;
    }

    @RequestMapping("/kompis/{id}/delete")
    public String deleteKompisById(@PathVariable int id) {
        for (Kompis k : myKompisar) {
            if (k.getId() == id) {
                myKompisar.remove(id - 1);
                return "Kompis med id " + id + " togs bort.";
            }
        }
        return null;
    }

    @PostMapping("/kompis/add")
    public String addBook(@RequestBody Kompis k) {
        myKompisar.add(k);
        return "kompis added";
    }


    @PostMapping("/kompis/upsert")
    public Message upsertBook(@RequestBody Kompis k) {
        int indexToUpdate = -1;

        for (int i = 0; i < myKompisar.size(); i++) {
            if (myKompisar.get(i).getId() == k.getId()) {
                indexToUpdate = i;
            }
        }

        System.out.println("index: " + indexToUpdate);

        if (indexToUpdate == -1) {
            myKompisar.add(k);
            Message m = new Message(true, "Kompis was created");
            return m;
        } else {
            myKompisar.set(indexToUpdate, k);
            Message m = new Message(true, "Kompis was updated");
            return m;
        }


    }
}