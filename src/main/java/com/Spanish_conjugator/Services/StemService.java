package com.Spanish_conjugator.Services;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spanish_conjugator.Aspects.SimpleService;
import com.Spanish_conjugator.StemChanges.ConditionalStems;
import com.Spanish_conjugator.StemChanges.FutureStems;
import com.Spanish_conjugator.StemChanges.ImperfectStems;
import com.Spanish_conjugator.StemChanges.PresentStems;
import com.Spanish_conjugator.StemChanges.PreteriteStems;


@Service
public class StemService {
    
    @Autowired
    private SimpleService simpleService;
    

    private static final Map<String, Map<Function<String, String>, List<String>>> STEM_CHANGE_RULES_BY_TENSE = Map.of(
        "present", PresentStems.PRESENT_STEM_CHANGE_RULES,
        "preterite", PreteriteStems.PRETERITE_STEM_CHANGE_RULES,
        "future", FutureStems.FUTURE_STEM_CHANGE_RULES,
        "conditional", ConditionalStems.CONDITIONAL_STEM_CHANGE_RULES,
        "imperfect", ImperfectStems.IMPERFECT_STEM_CHANGE_RULES
    );

    public String getStem(String verb, String form, String tense) {
        // ToDo: throw error if no tense, do not default to present
        Map<Function<String, String>, List<String>> stemChangeRules = STEM_CHANGE_RULES_BY_TENSE.getOrDefault(tense, PresentStems.PRESENT_STEM_CHANGE_RULES);

        String stem = verb;

        if (tense.equals("present") || tense.equals("imperfect") || tense.equals("preterite") || tense.equals("imperative positive present") || tense.equals("imperative negative present")) {
            stem = verb.substring(0, verb.length() - 2);
        }

        if (tense.equals("subjunctive present")) {
            String present1s = simpleService.conjugate(verb, "present", "1s");
            stem = present1s.substring(0, present1s.length() - 1);
        }
        
        if (tense.equals("subjunctive imperfect") || tense.equals("subjunctive future")) {
            String preterite3p= simpleService.conjugate(verb, "preterite", "3p");
            stem = preterite3p.substring(0, preterite3p.length() - 3);

            // accent change for 1p
            if (form.equals("1p")) {
                stem = AccentAdder.replaceFinalLetter(stem);
            }
        }
        
        // Boot rule: no stem change plural forms in present tense
        if (tense.equals("present") && (form.equals("1p") || form.equals("2p"))) {
            return stem;
        }
        
        // Stem changes in 3s and 3p verbs
        if (tense.equals("preterite") && !form.equals("3s") && !form.equals("3s")) {
            return stem;
        }
        
        String finalStem = stem;

        return stemChangeRules.entrySet().stream()
            .filter(entry -> entry.getValue().contains(verb))
            .map(entry -> entry.getKey().apply(finalStem))
            .findFirst()
            .orElse(finalStem); // Return original stem if no match
    }
}
