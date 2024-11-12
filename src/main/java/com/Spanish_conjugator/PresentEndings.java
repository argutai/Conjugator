package com.Spanish_conjugator;

import java.util.Map;

public class PresentEndings {
    public static final Map<String, Map<String, String>> ENDING_MAP = Map.of(
        "1s", Map.of(
            "ar", "o", 
            "er", "o", 
            "ir", "o"
        ), 
        "2s", Map.of(
            "ar", "as", 
            "er", "es", 
            "ir", "es"
        ),
        "3s", Map.of(
                "ar", "a",
                "er", "e",
                "ir", "e"
        ),
        "1p", Map.of(
                "ar", "amos",
                "er", "emos",
                "ir", "imos"
        ),
        "2p", Map.of(
                "ar", "áis",
                "er", "éis",
                "ir", "ís"
        ),
        "3p", Map.of(
                "ar", "an",
                "er", "en",
                "ir", "en"
        )
    );
}
