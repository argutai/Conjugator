package com.Spanish_conjugator.Aspects;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spanish_conjugator.Services.EndingService;
import com.Spanish_conjugator.Services.IrregularService;
import com.Spanish_conjugator.Services.ReflexiveService;
import com.Spanish_conjugator.Services.StemService;


@Service
public class SimpleService implements AspectService {

    @Autowired
    private IrregularService irregularService;
    @Autowired
    private StemService stemService;
    @Autowired
    private EndingService endingService;
    @Autowired
    private ReflexiveService reflexiveService;


    @Override
    public String conjugate(String verb, String tense, String form) {

        String negative = "";

        // handle negative
        if (tense.equals("imperative negative present")) {
            negative = "no ";
        }

        // handle reflexive
        String pronoun = reflexiveService.getPronoun(verb, form);
        verb = reflexiveService.removeSe(verb, form);

        // handle irregular
        Optional<String> irregularConjugation = irregularService.getIrregularConjugation(verb, form, tense);
        if (irregularConjugation.isPresent()) {
            return negative + pronoun + irregularConjugation.get();
        }

        // get stem
        String stem = stemService.getStem(verb, form, tense);

        // get ending
        String ending = endingService.getEnding(tense, form, verb);

        return negative + pronoun + stem + ending;
    }
}
