package com.Spanish_conjugator.Irregulars;
import java.util.List;
import java.util.Map;

import com.Spanish_conjugator.IrregularVerb;

public class SubjunctivePresentIrregular {
    
    public static final List<IrregularVerb> IRREGULAR_VERBS = List.of(
    // ToDo: Some of these are just stem changers
    new IrregularVerb("ser", Map.of(
        "1s", "sea", 
        "2s", "seas", 
        "3s", "sea",
        "1p", "seamos",
        "2p", "seáis",
        "3p", "sean"
    )),
    new IrregularVerb("ir", Map.of(
        "1s", "vaya", 
        "2s", "vayas", 
        "3s", "vaya",
        "1p", "vayamos",
        "2p", "vayáis",
        "3p", "vayan"
    )),
    new IrregularVerb("estar", Map.of(
        "1s", "esté", 
        "2s", "estés", 
        "3s", "esté",
        "1p", "estemos",
        "2p", "estéis",
        "3p", "estén"
    )),
    new IrregularVerb("haber", Map.of(
        "1s", "haya", 
        "2s", "hayas", 
        "3s", "haya",
        "1p", "hayamos",
        "2p", "hayáis",
        "3p", "hayan"
    )),
    new IrregularVerb("saber", Map.of(
        "1s", "sepa", 
        "2s", "sepas", 
        "3s", "sepa",
        "1p", "sepamos",
        "2p", "sepáis",
        "3p", "sepan"
    )),
    new IrregularVerb("dar", Map.of(
        "1s", "dé", 
        "2s", "des", 
        "3s", "dé",
        "1p", "demos",
        "2p", "deis",
        "3p", "den"
    )),
    new IrregularVerb("ver", Map.of(
        "1s", "vea", 
        "2s", "veas", 
        "3s", "vea",
        "1p", "veamos",
        "2p", "veáis",
        "3p", "vean"
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
