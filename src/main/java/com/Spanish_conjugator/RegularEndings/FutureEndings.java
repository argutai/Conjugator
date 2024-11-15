package com.Spanish_conjugator.RegularEndings;

import java.util.Map;


public class FutureEndings {

    public static final Map<String, Map<String, String>> ENDING_MAP = Map.of(
        "1s", Map.of(
            "ar", "é", 
            "er", "é", 
            "ir", "é"
        ), 
        "2s", Map.of(
            "ar", "ás", 
            "er", "ás", 
            "ir", "ás"
        ),
        "3s", Map.of(
            "ar", "á",
            "er", "á",
            "ir", "á"
        ),
        "1p", Map.of(
            "ar", "emos",
            "er", "emos",
            "ir", "emos"
        ),
        "2p", Map.of(
            "ar", "éis",
            "er", "éis",
            "ir", "éis"
        ),
        "3p", Map.of(
            "ar", "án",
            "er", "án",
            "ir", "án"
        )
    );
}
