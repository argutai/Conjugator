package com.Spanish_conjugator.architechture;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConjugatorController {

    @PostMapping("/conjugate")
    public ConjugatedVerbResponse conjugateVerb(@RequestBody ConjugatorRequest request) {
        String verb = request.getVerb();
        String tense = request.getTense();
        String mood = request.getMood();
        String aspect = request.getAspect();
        String form = request.getForm();

        // Add logic here to conjugate the verb based on the request parameters
        // For example, a simple conjugation could look like:
        String conjugatedVerb = conjugate(verb, tense, mood, aspect, form);
        
        return new ConjugatedVerbResponse(conjugatedVerb);
    }

    // Simple placeholder conjugation logic (you can replace this with more complex logic)
    private String conjugate(String verb, String tense, String mood, String aspect, String form) {
        // Add your verb conjugation logic here
        // For now, just return the verb as is (replace this logic as needed)
        return verb + " conjugated in " + tense + " " + aspect + " " + mood + " (" + form + ")";
    }
}

