package com.Spanish_conjugator;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Spanish_conjugator.Services.EndingService;
import com.Spanish_conjugator.Services.IrregularService;
import com.Spanish_conjugator.Services.ReflexiveService;
import com.Spanish_conjugator.Services.StemService;


@RestController
public class ConjugatorController {

    @Autowired
    private IrregularService irregularService;
    @Autowired
    private StemService stemService;
    @Autowired
    private EndingService endingService;
    @Autowired
    private ReflexiveService reflexiveService;


    @PostMapping("/conjugate")
    public ConjugatedVerbResponse conjugateVerb(@RequestBody ConjugatorRequest request) {
        String verb = request.getVerb();
        String tense = request.getTense();
        String mood = request.getMood();
        String aspect = request.getAspect();
        String form = request.getForm();

        String conjugatedVerb = conjugate(verb, tense, mood, aspect, form);
        
        return new ConjugatedVerbResponse(conjugatedVerb);
    }


    private String conjugate(String verb, String tense, String mood, String aspect, String form) {
        
        // ToDo logic between aspects, for now just simple aspect!!


        // Get pronoun if reflexive
        String pronoun = reflexiveService.getPronoun(verb, form);
        verb = reflexiveService.removeSe(verb, form);

        // Return irregular if found:
        Optional<String> irregularConjugation;
        irregularConjugation = irregularService.getIrregularConjugation(verb, form, tense);

        if (irregularConjugation.isPresent()) {
            return pronoun + irregularConjugation.get();
        }


        // Get stem if stem-changing or not
        String stem = stemService.getStem(verb, form, tense); // returns verb with or without stem change


        // Get regular verb ending
        String ending = endingService.getEnding(tense, form, verb);

        
        // ToDo: pronoun + stem + ending
        return pronoun + stem + ending;
    }
}

