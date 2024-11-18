package com.Spanish_conjugator.Aspects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spanish_conjugator.Services.ParticipleService;
import com.Spanish_conjugator.Services.ReflexiveService;


@Service
public class PerfectService implements AspectService {

    @Autowired
    private SimpleService simpleService;
    @Autowired
    private ReflexiveService reflexiveService;
    @Autowired
    private ParticipleService participleService;


    @Override
    public String conjugate(String verb, String tense, String mood, String aspect, String form) {

        // handle reflexive
        String pronoun = reflexiveService.getPronoun(verb, form);
        verb = reflexiveService.removeSe(verb, form);

        // conjugate haber
        String auxillaryVerb = simpleService.conjugate("haber", tense, "indicative", "simple", form);

        // get participle 
        String participle = participleService.getParticiple(verb);

        return pronoun + auxillaryVerb + " " + participle;
    }
}
