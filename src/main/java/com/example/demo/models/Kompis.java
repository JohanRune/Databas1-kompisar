package com.example.demo.models;

/**
 * Created by Johan Rune
 * Date: 2021-04-08
 * Time: 14:44
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
public class Kompis {


    protected int id;
    protected String namn;
    protected String adress;
    protected int telefonnummer;

    public Kompis (){}

    public Kompis(int id, String namn, String adress, int telefonnummer){
        this.id = id;
        this.namn = namn;
        this.adress = adress;
        this.telefonnummer = telefonnummer;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(int telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

}
