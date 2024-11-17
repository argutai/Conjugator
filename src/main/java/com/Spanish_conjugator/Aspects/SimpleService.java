/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.Spanish_conjugator.Aspects;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spanish_conjugator.Services.EndingService;
import com.Spanish_conjugator.Services.IrregularService;
import com.Spanish_conjugator.Services.ReflexiveService;
import com.Spanish_conjugator.Services.StemService;


@Service
public class SimpleService {

    @Autowired
    private IrregularService irregularService;
    @Autowired
    private StemService stemService;
    @Autowired
    private EndingService endingService;
    @Autowired
    private ReflexiveService reflexiveService;


    public String conjugate(String verb, String tense, String mood, String aspect, String form) {

        // handle reflexive
        String pronoun = reflexiveService.getPronoun(verb, form);
        verb = reflexiveService.removeSe(verb, form);

        // handle irregular
        Optional<String> irregularConjugation = irregularService.getIrregularConjugation(verb, form, tense);
        if (irregularConjugation.isPresent()) {
            return pronoun + irregularConjugation.get();
        }

        // get stem
        String stem = stemService.getStem(verb, form, tense);

        // get ending
        String ending = endingService.getEnding(tense, form, verb);

        return pronoun + stem + ending;
    }
}
