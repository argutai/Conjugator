package com.Spanish_conjugator.Services;

import org.springframework.stereotype.Service;

import com.Spanish_conjugator.Irregulars.GerundIrregulars;


@Service
public class GerundService {

    public String getGerund(String verb) {
        if (GerundIrregulars.IRREGULAR_GERUNDS.containsKey(verb)) {
            return GerundIrregulars.IRREGULAR_GERUNDS.get(verb);
        }
        return conjugateRegularGerund(verb);
    }

    private String conjugateRegularGerund(String verb) {
        if (verb.endsWith("ar")) {
            return verb.substring(0, verb.length() - 2) + "ando";
        } else if (verb.endsWith("er") || verb.endsWith("ir")) {
            return verb.substring(0, verb.length() - 2) + "iendo";
        }
        throw new IllegalArgumentException("Not a valid verb");
    }

}
