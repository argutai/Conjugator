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
        
        
        // handle other moods, not supported for now
        if (!mood.equals("indicative")) {
            throw new IllegalArgumentException("Unsupported mood: " + mood + ", check again soon");
        }
        

        // get AspectService for aspect and conjugate
        AspectService aspectService = aspectServiceMap.get(aspect);
        if (aspectService != null) {
            String conjugatedVerb = aspectService.conjugate(verb, tense, mood, aspect, form);
            return new ConjugatedVerbResponse(conjugatedVerb);
        } else {
            // Handle invalid aspect if needed
            throw new IllegalArgumentException("Invalid aspect: " + aspect);
        }

    }
}
