package com.Spanish_conjugator.RegularEndings;

import java.util.Map;


public class SubjunctiveFutureEndings {
    public static final Map<String, Map<String, String>> ENDING_MAP = Map.of(
        "1s", Map.of(
            "ar", "re", 
            "er", "re", 
            "ir", "re"
        ), 
        "2s", Map.of(
            "ar", "res", 
            "er", "res", 
            "ir", "res"
        ),
        "3s", Map.of(
            "ar", "re",
            "er", "re",
            "ir", "re"
        ),
        "1p", Map.of(
            "ar", "remos",
            "er", "remos",
            "ir", "remos"
        ),
        "2p", Map.of(
            "ar", "reis",
            "er", "reis",
            "ir", "reis"
        ),
        "3p", Map.of(
            "ar", "ren",
            "er", "ren",
            "ir", "ren"
        )
    );
}
