package com.Spanish_conjugator.Irregulars;
import java.util.List;
import java.util.Map;

import com.Spanish_conjugator.IrregularVerb;

public class ImperfectIrregular {

    public static final List<IrregularVerb> IRREGULAR_VERBS = List.of(
        new IrregularVerb("ir", Map.of(
            "1s", "iba", 
            "2s", "ibas", 
            "3s", "iba",
            "1p", "íbamos",
            "2p", "ibais",
            "3p", "iban"
        )),
        new IrregularVerb("ser", Map.of(
            "1s", "era", 
            "2s", "eras", 
            "3s", "era",
            "1p", "éramos",
            "2p", "erais",
            "3p", "eran"
        )),
        new IrregularVerb("ver", Map.of(
            "1s", "veía", 
            "2s", "veías", 
            "3s", "veía",
            "1p", "veíamos",
            "2p", "veíais",
            "3p", "veían"
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
