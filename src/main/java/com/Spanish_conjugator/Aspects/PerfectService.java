/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.Spanish_conjugator.Aspects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spanish_conjugator.Services.ReflexiveService;
import com.Spanish_conjugator.Services.ParticipleService;


@Service
public class PerfectService {

    @Autowired
    private SimpleService simpleService;
    @Autowired
    private ReflexiveService reflexiveService;
    @Autowired
    private ParticipleService participleService;


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
