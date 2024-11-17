package com.Spanish_conjugator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
    private PerfectContinuousService perfectcontinuousService;


    @PostMapping("/conjugate")
    public ConjugatedVerbResponse conjugateVerb(@RequestBody ConjugatorRequest request) {
        String verb = request.getVerb();
        String tense = request.getTense();
        String mood = request.getMood();
        String aspect = request.getAspect();
        String form = request.getForm();

        // handle other moods, not supported for now
        if (!mood.equals("indicative")) {
            throw new IllegalArgumentException("Unsupported mood: " + mood + ", check again soon");
        }
        
        // Simple aspect
        if (aspect.equals("simple")) {
            String conjugatedVerb = simpleService.conjugate(verb, tense, mood, aspect, form);
            return new ConjugatedVerbResponse(conjugatedVerb);
        }  

        // Perfect aspect
        if (aspect.equals("perfect")) {
            String conjugatedVerb = perfectService.conjugate(verb, tense, mood, aspect, form);
            return new ConjugatedVerbResponse(conjugatedVerb);
        }

        // Continuous aspect
        if (aspect.equals("continous")) {
            String conjugatedVerb = continuousService.conjugate(verb, tense, mood, aspect, form);
            return new ConjugatedVerbResponse(conjugatedVerb);
        }

        // Perfect Continuous aspect
        if (aspect.equals("perfect continuous")) {
            String conjugatedVerb = perfectcontinuousService.conjugate(verb, tense, mood, aspect, form);
            return new ConjugatedVerbResponse(conjugatedVerb);
        }


        String conjugatedVerb = simpleService.conjugate(verb, tense, mood, aspect, form);
        return new ConjugatedVerbResponse(conjugatedVerb);
        
    }
}
