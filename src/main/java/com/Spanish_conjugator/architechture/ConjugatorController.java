package com.Spanish_conjugator.architechture;


import java.util.Optional;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConjugatorController {

    private final IrregularService IrregularService;

    public ConjugatorController(IrregularService IrregularService) {
        this.IrregularService = IrregularService;
    }

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
        
        // ToDo; logic between aspects, for now just simple aspect!!

        // Get pronoun if reflexive
        String pronoun = ""; // assume non-reflexive now
        
        // Return irregular if found:
        Optional<String> irregularConjugation;
        irregularConjugation = IrregularService.getIrregularConjugation(verb, form, tense);

        if (irregularConjugation.isPresent()) {
            return irregularConjugation.get();
        }

        // ToDo: get stem if stem-changing or not
        // String stem = "bañ";

        // ToDo: get regular verb ending
        // String ending = "o";

        // ToDo: put together to return pronoun + stem + ending;
        return "place holder";
    }
}

