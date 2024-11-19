package com.Spanish_conjugator.RegularEndings;

import java.util.Map;


public class ImperativePositiveEndings {
    public static final Map<String, Map<String, String>> ENDING_MAP = Map.of(
        "2s", Map.of(
            "ar", "a", 
            "er", "e", 
            "ir", "e"
        ), 
        "3s", Map.of(
            "ar", "e", 
            "er", "a", 
            "ir", "a"
        ),
        "1p", Map.of(
            "ar", "emos",
            "er", "amos",
            "ir", "amos"
        ),
        "2p", Map.of(
            "ar", "ad",
            "er", "ed",
            "ir", "id" 
        ),
        "3p", Map.of(
            "ar", "en",
            "er", "an",
            "ir", "an"
        )
    );
}
