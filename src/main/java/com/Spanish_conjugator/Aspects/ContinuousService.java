package com.Spanish_conjugator.Aspects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spanish_conjugator.Services.GerundService;
import com.Spanish_conjugator.Services.ReflexiveService;


@Service
public class ContinuousService {

    @Autowired
    private SimpleService simpleService;
    @Autowired
    private ReflexiveService reflexiveService;
    @Autowired
    private GerundService gerundService;


    public String conjugate(String verb, String tense, String mood, String aspect, String form) {

        // handle reflexive
        String pronoun = reflexiveService.getPronoun(verb, form);
        verb = reflexiveService.removeSe(verb, form);

        // conjugate estar
        String auxillaryVerb = simpleService.conjugate("estar", tense, "indicative", "simple", form);

        // get gerund
        String gerund = gerundService.getGerund(verb);

        return pronoun + auxillaryVerb + " " + gerund;
    }
}
