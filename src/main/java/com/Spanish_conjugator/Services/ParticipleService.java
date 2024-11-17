package com.Spanish_conjugator.Services;

import org.springframework.stereotype.Service;

import com.Spanish_conjugator.Irregulars.ParticipleIrregulars;


@Service
public class ParticipleService {

    public String getParticiple(String verb) {
        if (ParticipleIrregulars.IRREGULAR_PARTICIPLES.containsKey(verb)) {
            return ParticipleIrregulars.IRREGULAR_PARTICIPLES.get(verb);
        }
        return conjugateRegularParticiple(verb);
    }

    private String conjugateRegularParticiple(String verb) {
        if (verb.endsWith("ar")) {
            return verb.substring(0, verb.length() - 2) + "ado";
        } else if (verb.endsWith("er") || verb.endsWith("ir")) {
            return verb.substring(0, verb.length() - 2) + "ido";
        }
        throw new IllegalArgumentException("Not a valid verb");
    }

}
