package com.Spanish_conjugator.architechture;

public class ConjugatedVerbResponse {

    private String conjugatedVerb;

    // Constructor
    public ConjugatedVerbResponse(String conjugatedVerb) {
        this.conjugatedVerb = conjugatedVerb;
    }

    // Getter
    public String getConjugatedVerb() {
        return conjugatedVerb;
    }

    // Setter
    public void setConjugatedVerb(String conjugatedVerb) {
        this.conjugatedVerb = conjugatedVerb;
    }
}
