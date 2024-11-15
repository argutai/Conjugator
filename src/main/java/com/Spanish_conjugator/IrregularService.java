package com.Spanish_conjugator;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Spanish_conjugator.Archive.IrregularVerb;
import com.Spanish_conjugator.Irregulars.ImperfectIrregular;
import com.Spanish_conjugator.Irregulars.PresentIrregular;
import com.Spanish_conjugator.Irregulars.PreteriteIrregular;

@Service
public class IrregularService {

    public Optional<String> getIrregularConjugation(String verb, String form, String tense) {
        // Choose the correct list based on the tense
        List<IrregularVerb> irregularVerbs = selectIrregularVerbs(tense);


        return irregularVerbs.stream()
                .filter(irregularVerb -> irregularVerb.getVerb().equals(verb))
                .map(irregularVerb -> irregularVerb.getConjugations().get(form))
                .findFirst();
    }

    private List<IrregularVerb> selectIrregularVerbs(String tense) {
        switch (tense.toLowerCase()) {
            case "present" -> {
                return PresentIrregular.IRREGULAR_VERBS;
            }
            case "preterite" -> {
                return PreteriteIrregular.IRREGULAR_VERBS;
            }
            case "imperfect" -> {
                return ImperfectIrregular.IRREGULAR_VERBS;
            }
            default -> throw new IllegalArgumentException("Unsupported tense: " + tense);
        }
    }
}
