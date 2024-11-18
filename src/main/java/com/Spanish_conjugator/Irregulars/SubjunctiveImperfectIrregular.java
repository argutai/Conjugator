package com.Spanish_conjugator.Irregulars;
import java.util.List;
import java.util.Map;

import com.Spanish_conjugator.IrregularVerb;

public class SubjunctiveImperfectIrregular {
    
    public static final List<IrregularVerb> IRREGULAR_VERBS = List.of(
    // ToDo: Simply copied over from present subjunctive
    new IrregularVerb("ser", Map.of(
        "1s", "fuera", 
        "2s", "fueras", 
        "3s", "fuera",
        "1p", "fuéramos",
        "2p", "fuerais",
        "3p", "fueran"
    )),
    new IrregularVerb("ir", Map.of(
        "1s", "fuera", 
        "2s", "fueras", 
        "3s", "fuera",
        "1p", "fuéramos",
        "2p", "fuerais",
        "3p", "fueran"
    )),
    new IrregularVerb("tener", Map.of(
        "1s", "tuviera", 
        "2s", "tuvieras", 
        "3s", "tuviera",
        "1p", "tuviéramos",
        "2p", "tuvierais",
        "3p", "tuvieran"
    )),
    new IrregularVerb("haber", Map.of(
        "1s", "hubiera", 
        "2s", "hubieras", 
        "3s", "hubiera",
        "1p", "hubiéramos",
        "2p", "hubierais",
        "3p", "hubieran"
    )),
    new IrregularVerb("hacer", Map.of(
        "1s", "hiciera", 
        "2s", "hicieras", 
        "3s", "hiciera",
        "1p", "hiciéramos",
        "2p", "hiciera",
        "3p", "hicieran"
    )),
    new IrregularVerb("decir", Map.of(
        "1s", "dijera", 
        "2s", "dijeras", 
        "3s", "dijera",
        "1p", "dijéramos",
        "2p", "dijerais",
        "3p", "dijeran"
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
