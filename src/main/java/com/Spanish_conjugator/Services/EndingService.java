package com.Spanish_conjugator.Services;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.Spanish_conjugator.RegularEndings.ConditionalEndings;
import com.Spanish_conjugator.RegularEndings.FutureEndings;
import com.Spanish_conjugator.RegularEndings.ImperfectEndings;
import com.Spanish_conjugator.RegularEndings.PresentEndings;
import com.Spanish_conjugator.RegularEndings.PreteriteEndings;

@Service
public class EndingService {


    private static final Map<String, Map<String, Map<String, String>>> ENDING_RULES_BY_TENSE = Map.of(
        "present", PresentEndings.ENDING_MAP,
        "preterite", PreteriteEndings.ENDING_MAP,
        "imperfect", ImperfectEndings.ENDING_MAP,
        "future", FutureEndings.ENDING_MAP,
        "conditional", ConditionalEndings.ENDING_MAP
    );

    public String getEnding(String tense, String person, String verb) {
        Map<String, Map<String, String>> endingMap = ENDING_RULES_BY_TENSE.getOrDefault(tense, Map.of());

        return endingMap.getOrDefault(person, Map.of()) // get form
                .entrySet().stream()
                .filter(entry -> verb.endsWith(entry.getKey())) // match verb ending (ar, er, ir)
                .map(Map.Entry::getValue) // get ending
                .findFirst()
                .orElse(""); // ToDo: error handle here
    }
}
