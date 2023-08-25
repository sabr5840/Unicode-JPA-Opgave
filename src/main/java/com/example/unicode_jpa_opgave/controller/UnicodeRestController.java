package com.example.unicode_jpa_opgave.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Styrer HTTP-anmodninger og genererer svar i form af data - bruges til at opbygge RESTful webtjenester
@RestController
public class UnicodeRestController {


    //Metode der konvertere et Unicode-nummer til det tilsvarende tegn og returnere en besked, der indeholder både Unicode-nummeret og tegnet
    @GetMapping("/unicode/{i}") //http://localhost:8080/unicode/97
    public String unicodeToChar(@PathVariable int i) {
        char c = (char)i;
        return "unicode=" + i + " char=" + c;
    }



    //Metode der konvertere et tegn til det tilsvarende Unicode-nummer og returnere en besked, som indeholder begge komponenter
    @GetMapping("/char/{c}") //http://localhost:8080/char/b
    public String charToUnicode(@PathVariable char c){
        int i = (int) c;
        return "char=" + c + " unicode=" + i;

    }




}
