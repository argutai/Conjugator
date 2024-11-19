package com.Spanish_conjugator;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Spanish_conjugator.Aspects.AspectService;
import com.Spanish_conjugator.Aspects.ContinuousService;
import com.Spanish_conjugator.Aspects.PerfectContinuousService;
import com.Spanish_conjugator.Aspects.PerfectService;
import com.Spanish_conjugator.Aspects.SimpleService;



@RestController
public class ConjugatorController {

    @Autowired
    private SimpleService simpleService;
    @Autowired
    private PerfectService perfectService;
    @Autowired
    private ContinuousService continuousService;
    @Autowired
    private PerfectContinuousService perfectContinuousService;

    @PostMapping("/conjugate")
    public ConjugatedVerbResponse conjugateVerb(@RequestBody ConjugatorRequest request) {
        String verb = request.getVerb();
        String tense = request.getTense();
        String mood = request.getMood();
        String aspect = request.getAspect();
        String form = request.getForm();

        // Map of aspect to AspectService
        Map<String, AspectService> aspectServiceMap = Map.of(
            "simple", simpleService,
            "perfect", perfectService,
            "continous", continuousService,
            "perfect continuous", perfectContinuousService
        );
        
        
        // handle moods
        // Imperative
        if (mood.equals("imperative negative") || mood.equals("imperative positive")) {
            if (!tense.equals("present")) {
                throw new IllegalArgumentException("Imperative mood is only allowed with the present tense.");
            }
            if (form.equals("1s")) {
                throw new IllegalArgumentException("Imperative mood is not allowed for 1st person singular.");
            }
            if (!aspect.equals("simple")) {
                throw new IllegalArgumentException("Imperative mood only exists in the simple aspect");
            }
            tense = mood + " " + tense;
        } 

        // Subjunctive
        else if (mood.equals("subjunctive")) {
            if (!tense.equals("present") && !tense.equals("imperfect") && !tense.equals("future")) {
                throw new IllegalArgumentException("Invalid tense for subjunctive mood: " + tense + ". Only 'present', 'imperfect', and 'future' exist in the subjunctive mood.");
            }
            tense = mood + " " + tense;
        }

        // Indicative
        else if (!mood.equals("indicative")) {
            throw new IllegalArgumentException("Unsupported mood: " + mood + ", check again soon");
        }
        

        // get AspectService for aspect and conjugate
        AspectService aspectService = aspectServiceMap.get(aspect);
        if (aspectService != null) {
            String conjugatedVerb = aspectService.conjugate(verb, tense, form);
            return new ConjugatedVerbResponse(conjugatedVerb);
        } else {
            throw new IllegalArgumentException("Invalid aspect: " + aspect);
        }

    }
}
