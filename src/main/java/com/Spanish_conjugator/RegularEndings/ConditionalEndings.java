package com.Spanish_conjugator.RegularEndings;

import java.util.Map;

public class ConditionalEndings {

    public static final Map<String, Map<String, String>> ENDING_MAP = Map.of(
        "1s", Map.of(
            "ar", "ía", 
            "er", "ía", 
            "ir", "ía"
        ), 
        "2s", Map.of(
            "ar", "ías", 
            "er", "ías", 
            "ir", "ías"
        ),
        "3s", Map.of(
            "ar", "ía",
            "er", "ía",
            "ir", "ía"
        ),
        "1p", Map.of(
            "ar", "íamos",
            "er", "íamos",
            "ir", "íamos"
        ),
        "2p", Map.of(
            "ar", "íais",
            "er", "íais",
            "ir", "íais"
        ),
        "3p", Map.of(
            "ar", "ían",
            "er", "ían",
            "ir", "ían"
        )
    );
}
