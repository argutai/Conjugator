package com.Spanish_conjugator.Irregulars;

import java.util.Map;

public class GerundIrregulars {

    public static final Map<String, String> IRREGULAR_GERUNDS = Map.ofEntries(
        // Stem-changing ir verbs (e → i or o → u)
        Map.entry("decir", "diciendo"),
        Map.entry("dormir", "durmiendo"),
        Map.entry("morir", "muriendo"),
        Map.entry("pedir", "pidiendo"),
        Map.entry("preferir", "prefiriendo"),
        Map.entry("reír", "riendo"),
        Map.entry("seguir", "siguiendo"),
        Map.entry("sentir", "sintiendo"),
        Map.entry("servir", "sirviendo"),
        Map.entry("venir", "viniendo"),
        
        // Add y for vowel-ending stem verbs 
        Map.entry("caer", "cayendo"),
        Map.entry("construir", "construyendo"),
        Map.entry("creer", "creyendo"),
        Map.entry("destruir", "destruyendo"),
        Map.entry("huir", "huyendo"),
        Map.entry("incluir", "incluyendo"),
        Map.entry("influir", "influyendo"),
        Map.entry("ir", "yendo"), // Fully irregular
        Map.entry("leer", "leyendo"),
        Map.entry("oír", "oyendo"),
        Map.entry("traer", "trayendo")
    );
    
}