package com.Spanish_conjugator.Services;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Spanish_conjugator.IrregularVerb;
import com.Spanish_conjugator.Irregulars.ConditionalIrregular;
import com.Spanish_conjugator.Irregulars.FutureIrregular;
import com.Spanish_conjugator.Irregulars.ImperativeNegativeIrregular;
import com.Spanish_conjugator.Irregulars.ImperativePositiveIrregular;
import com.Spanish_conjugator.Irregulars.ImperfectIrregular;
import com.Spanish_conjugator.Irregulars.PresentIrregular;
import com.Spanish_conjugator.Irregulars.PreteriteIrregular;
import com.Spanish_conjugator.Irregulars.SubjunctiveFutureIrregular;
import com.Spanish_conjugator.Irregulars.SubjunctiveImperfectIrregular;
import com.Spanish_conjugator.Irregulars.SubjunctivePresentIrregular;

@Service
public class IrregularService {

    public Optional<String> getIrregularConjugation(String verb, String form, String tense) {
        // Choose correct list for tense
        List<IrregularVerb> irregularVerbs = selectIrregularVerbs(tense);

        return irregularVerbs.stream()
                .filter(irregularVerb -> irregularVerb.getVerb().equals(verb))
                .map(irregularVerb -> irregularVerb.getConjugations().get(form))
                .filter(Objects::nonNull) // Ensure the map contains the form
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
            case "future" -> {
                return FutureIrregular.IRREGULAR_VERBS;
            }
            case "conditional" -> {
                return ConditionalIrregular.IRREGULAR_VERBS;
            }
            case "subjunctive present" -> {
                return SubjunctivePresentIrregular.IRREGULAR_VERBS;
            }
            case "subjunctive imperfect" -> {
                return SubjunctiveImperfectIrregular.IRREGULAR_VERBS;
            }
            case "subjunctive future" -> {
                return SubjunctiveFutureIrregular.IRREGULAR_VERBS;
            }
            case "imperative positive present" -> {
                return ImperativePositiveIrregular.IRREGULAR_VERBS;
            }
            case "imperative negative present" -> {
                return ImperativeNegativeIrregular.IRREGULAR_VERBS;
            }
            default -> throw new IllegalArgumentException("Unsupported tense: " + tense);
        }
    }
}
