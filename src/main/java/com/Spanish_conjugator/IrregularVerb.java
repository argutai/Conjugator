package com.Spanish_conjugator;

import java.util.Map;

public class IrregularVerb {
    private String verb = null;
    private Map<String, String> conjugations = null;
        
    public IrregularVerb(String verb, Map<String, String> conjugation) {
        this.verb = verb;
        this.conjugations = conjugation;
    };

    public String getVerb() {
        return verb;
    };

    public Map<String, String> getConjugations() {
        return conjugations;
    };
}
