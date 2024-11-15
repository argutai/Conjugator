package com.Spanish_conjugator.RegularEndings;

import java.util.Map;

public class ImperfectEndings {

    public static final Map<String, Map<String, String>> ENDING_MAP = Map.of(
        "1s", Map.of(
            "ar", "aba", 
            "er", "ía", 
            "ir", "ía"
        ), 
        "2s", Map.of(
            "ar", "abas", 
            "er", "ías", 
            "ir", "ías"
        ),
        "3s", Map.of(
            "ar", "aba",
            "er", "ía",
            "ir", "ía"
        ),
        "1p", Map.of(
            "ar", "ábamos",
            "er", "íamos",
            "ir", "íamos"
        ),
        "2p", Map.of(
            "ar", "abais",
            "er", "íais",
            "ir", "íais"
        ),
        "3p", Map.of(
            "ar", "aban",
            "er", "ían",
            "ir", "ían"
        )
    );
}
