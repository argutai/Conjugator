package com.Spanish_conjugator.RegularEndings;

import java.util.Map;

public class PreteriteEndings {

    public static final Map<String, Map<String, String>> ENDING_MAP = Map.of(
        "1s", Map.of(
            "ar", "é", 
            "er", "í", 
            "ir", "í"
        ), 
        "2s", Map.of(
            "ar", "aste", 
            "er", "iste", 
            "ir", "iste"
        ),
        "3s", Map.of(
            "ar", "ó",
            "er", "ió",
            "ir", "ió"
        ),
        "1p", Map.of(
            "ar", "amos",
            "er", "imos",
            "ir", "imos"
        ),
        "2p", Map.of(
            "ar", "asteis",
            "er", "isteis",
            "ir", "isteis"
        ),
        "3p", Map.of(
            "ar", "aron",
            "er", "ieron",
            "ir", "ieron"
        )
    );

}
