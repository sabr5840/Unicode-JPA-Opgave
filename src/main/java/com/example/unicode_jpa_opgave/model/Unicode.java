package com.example.unicode_jpa_opgave.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity //Angiver, at klassen er en JPA-entitet, der skal være mappet til en database tabel
public class Unicode {

    @Id //Markerer feltet id som primærnøglen for entiteten. Primærnøglen identificerer entiteten unikt i databasen
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Databasen selv genererer unikke nøgleværdier ved indsættelse af rækker i tabellen

    private int id;
    private int unicode;
    private char bogstav;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUnicode() {
        return unicode;
    }

    public void setUnicode(int unicode) {
        this.unicode = unicode;
    }

    public char getBogstav() {
        return bogstav;
    }

    public void setBogstav(char bogstav) {
        this.bogstav = bogstav;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }




}
