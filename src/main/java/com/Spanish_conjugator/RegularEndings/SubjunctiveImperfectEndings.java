package com.Spanish_conjugator.RegularEndings;

import java.util.Map;


public class SubjunctiveImperfectEndings {
    public static final Map<String, Map<String, String>> ENDING_MAP = Map.of(
        "1s", Map.of(
            "ar", "ra", 
            "er", "ra", 
            "ir", "ra"
        ), 
        "2s", Map.of(
            "ar", "ras", 
            "er", "ras", 
            "ir", "ras"
        ),
        "3s", Map.of(
            "ar", "ra",
            "er", "ra",
            "ir", "ra"
        ),
        "1p", Map.of(
            "ar", "ramos",
            "er", "ramos",
            "ir", "ramos"
        ),
        "2p", Map.of(
            "ar", "rais",
            "er", "rais",
            "ir", "rais"
        ),
        "3p", Map.of(
            "ar", "ran",
            "er", "ran",
            "ir", "ran"
        )
    );
}
