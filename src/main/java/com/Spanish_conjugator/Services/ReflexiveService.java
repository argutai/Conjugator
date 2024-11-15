package com.Spanish_conjugator.Services;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ReflexiveService {

    public String getPronoun(String verb, String form) {

        boolean isReflexive = verb.endsWith("se");
        String reflexivePronoun = REFLEXIVE_PRONOUN_MAP.get(form);
        String pronoun = isReflexive ? reflexivePronoun + " " : "";

        return pronoun;
    }
    
    public String removeSe(String verb, String form) {

        boolean isReflexive = verb.endsWith("se");
        verb = isReflexive ? verb.substring(0, verb.length() - 2) : verb;

        return verb;
    }

    
    public static final Map<String, String> REFLEXIVE_PRONOUN_MAP = Map.of(
        "1s", "me", 
        "2s", "te",
        "3s", "se", 
        "1p", "nos",
        "2p", "os", 
        "3p", "se"
    );
}
