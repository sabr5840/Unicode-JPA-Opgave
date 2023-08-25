package com.example.unicode_jpa_opgave.config;

import com.example.unicode_jpa_opgave.model.Unicode;
import com.example.unicode_jpa_opgave.repositories.UnicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class InitData implements CommandLineRunner {


    @Autowired //Dependency injection
    UnicodeRepository unicodeRepository;

    @Override
    public void run(String... args) throws Exception {

        //Set med alle Unicode bogstaver
        Set<Character> unicodeCharacters = new HashSet<>();
        for (int i = 0; i <= Character.MAX_VALUE; i++) {
            char c = (char) i;
            unicodeCharacters.add(c);
        }


        // Gem hvert Unicode bogstav i databasen
        for (char c : unicodeCharacters) {
            Unicode unicode = new Unicode();
            unicode.setBogstav(c);
            unicode.setUnicode((int) c);
            unicode.setDescription("Beskrivelse for " + c);
            unicodeRepository.save(unicode);
        }

        System.out.println("Alle Unicode-bogstaver gemt i database");
    }

}

