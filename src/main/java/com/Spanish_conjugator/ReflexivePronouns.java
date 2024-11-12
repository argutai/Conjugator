package com.Spanish_conjugator;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ReflexivePronouns {
    public static final Map<String, String> REFLEXIVE_PRONOUN_MAP = Map.of(
        "1s", "me", 
        "2s", "te",
        "3s", "se", 
        "1p", "nos",
        "2p", "os", 
        "3p", "se"
    );
}
