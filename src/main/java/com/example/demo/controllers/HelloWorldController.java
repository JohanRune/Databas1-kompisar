package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Johan Rune
 * Date: 2021-04-08
 * Time: 10:56
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String index() {
        return "Hello World!!!!!";
    }

    @RequestMapping("/esp")
    public String index2() {
        return "Hola Mundo!!!!!";
    }

    @RequestMapping("/hej")
    public String hej(@RequestParam(defaultValue = "Johan") String firstName) {
        return "Hello " + firstName;
    }

    public int randomNumber() {
        //return randomNumber
        return ThreadLocalRandom.current().nextInt(1, 11);
    }

    public String randomLuckyAnimal() {
        String[] list = new String[4];
        int i = ThreadLocalRandom.current().nextInt(0, 3);
        return list[i];
    }
    //randomNumber(bound: 4)
    @RequestMapping("/hej2")
    public String hej2(@RequestParam(defaultValue = "Johan") String luckyYou) {
        String lucky = "hej";
        if (luckyYou == "animal") {
            lucky = randomLuckyAnimal();
            System.out.println(lucky);
        }
        else if (luckyYou == "number") {
            Integer j = randomNumber();
            System.out.println(j);
            String k = j.toString();
            lucky = k;
        }

        return lucky;
    }

    @RequestMapping("/hejPath/{name}")
    public String index3(@PathVariable String name) {
        return "Hello " + name;
    }

    @RequestMapping("/hej4")
    public String index4(@RequestParam List<String> names) {
        return "Hello " + names;
    }





}
