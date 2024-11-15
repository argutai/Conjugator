package com.Spanish_conjugator.Irregulars;
import java.util.List;
import java.util.Map;

import com.Spanish_conjugator.IrregularVerb;

public class ConditionalIrregular {
    
    public static final List<IrregularVerb> IRREGULAR_VERBS = List.of(
    // stem change
    new IrregularVerb("hacer", Map.of(
            "1s", "haría", 
            "2s", "harías", 
            "3s", "haría",
            "1p", "haríamos",
            "2p", "haríais",
            "3p", "harían"
        )),
        new IrregularVerb("decir", Map.of(
            "1s", "diría", 
            "2s", "dirías", 
            "3s", "diría",
            "1p", "diríamos",
            "2p", "diríais",
            "3p", "dirían"
        )),

        // Contract, add 'd
        new IrregularVerb("tener", Map.of(
            "1s", "tendría", 
            "2s", "tendrías", 
            "3s", "tendría",
            "1p", "tendríamos",
            "2p", "tendríais",
            "3p", "tendrían"
        )),
        new IrregularVerb("venir", Map.of(
            "1s", "vendría", 
            "2s", "vendrías", 
            "3s", "vendría",
            "1p", "vendríamos",
            "2p", "vendríais",
            "3p", "vendrían"
        )),
        new IrregularVerb("poner", Map.of(
            "1s", "pondría", 
            "2s", "pondrías", 
            "3s", "pondría",
            "1p", "pondríamos",
            "2p", "pondríais",
            "3p", "pondrían"
        )),
        new IrregularVerb("salir", Map.of(
            "1s", "saldría", 
            "2s", "saldrías", 
            "3s", "saldría",
            "1p", "saldríamos",
            "2p", "saldríais",
            "3p", "saldrían"
        )),
        new IrregularVerb("valer", Map.of(
            "1s", "valdría", 
            "2s", "valdrías", 
            "3s", "valdría",
            "1p", "valdriamos",
            "2p", "valdríais",
            "3p", "valdrían"
        )),

        // contract only
        new IrregularVerb("poder", Map.of(
            "1s", "podría", 
            "2s", "podrías", 
            "3s", "podría",
            "1p", "podríamos",
            "2p", "podríais",
            "3p", "podrían"
        )),
        new IrregularVerb("saber", Map.of(
            "1s", "sabría", 
            "2s", "sabrías", 
            "3s", "sabría",
            "1p", "sabríamos",
            "2p", "sabríais",
            "3p", "sabrían"
        )),
        new IrregularVerb("querer", Map.of(
            "1s", "querría", 
            "2s", "querrías", 
            "3s", "querría",
            "1p", "querríamos",
            "2p", "querríais",
            "3p", "querrían"
        )),
        new IrregularVerb("caber", Map.of(
            "1s", "cabría", 
            "2s", "cabrías", 
            "3s", "cabría",
            "1p", "cabriamos",
            "2p", "cabríais",
            "3p", "cabrían"
        )),
        new IrregularVerb("haber", Map.of(
            "1s", "habría", 
            "2s", "habrías", 
            "3s", "habría",
            "1p", "habríamos",
            "2p", "habríais",
            "3p", "habrían"
        ))
    );

    public boolean getIrregular(String verb) {
        for (IrregularVerb irregularVerb : IRREGULAR_VERBS) {
            if (irregularVerb.getVerb().equals(verb)) {
                return true;
            }
        }
        return false;
    }

}
