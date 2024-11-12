package com.Spanish_conjugator;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Conjugator {
    
    List<IrregularVerb> irregularVerbs = PresentIrregular.IRREGULAR_VERBS;
    PresentIrregular presentIrregular = new PresentIrregular();
    private static final Map<String, String> REFLEXIVE_PRONOUN_MAP = ReflexivePronouns.REFLEXIVE_PRONOUN_MAP;
    PresentStemChanger presentStemChanger = new PresentStemChanger();
    private static final Map<String, Map<String, String>> ENDING_MAP = PresentEndings.ENDING_MAP;

    public String conjugate(String verb, String person) {

        // handle reflexives
        boolean isReflexive = verb.endsWith("se");
        String reflexivePronoun = REFLEXIVE_PRONOUN_MAP.get(person);
        String pronoun = isReflexive ? reflexivePronoun + " " : "";
        verb = isReflexive ? verb.substring(0, verb.length() - 2) : verb;

        // irregular verbs
        boolean isIrregular = presentIrregular.getIrregular(verb);
        String finalVerb = verb;

        Optional<String> conjugatedVerbOpt = irregularVerbs.stream()
                .filter(irregularVerb -> irregularVerb.getVerb().equals(finalVerb))
                .map(irregularVerb -> irregularVerb.getConjugations().get(person))
                .findFirst();

        if (conjugatedVerbOpt.isPresent()) {
            return pronoun + conjugatedVerbOpt.get();  // return the conjugated verb if found
        }


        // stem changing verbs
        String stem = presentStemChanger.changeStem(verb, person); // returns verb with or without stem change
        
        // add ending
        String ending = ENDING_MAP.getOrDefault(person, Map.of()) // Get sub map by person
                 .entrySet().stream() // loop through keys (ar, er, ir)
                 .filter(entry -> finalVerb.endsWith(entry.getKey())) // Choose matching verb ending
                 .map(Map.Entry::getValue) // Add on end of stem
                 .findFirst()
                 .orElse("");
        
        return pronoun + stem + ending;
        
   }



    public static void main(String[] args) {
        Conjugator conjugator = new Conjugator();
        System.out.println("hablar, 1s:    " + conjugator.conjugate("hablar", "1s"));    // Outputs: "hablas"
        System.out.println("bañarse 2s     " + conjugator.conjugate("bañarse", "2s"));   // Outputs: "te bañas"
        System.out.println("comer, 3s      " + conjugator.conjugate("comer", "3s"));     // Outputs: "como"
        System.out.println("poder, 1p:     " + conjugator.conjugate("poder", "1p"));
        System.out.println("ser, 2p:       " + conjugator.conjugate("ser", "2p"));
        System.out.println("irse, 3p:      " + conjugator.conjugate("irse", "3p"));


    }
}



