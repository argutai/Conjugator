package com.Spanish_conjugator.Irregulars;
import java.util.List;
import java.util.Map;

import com.Spanish_conjugator.IrregularVerb;

public class SubjunctiveFutureIrregular {
    
    public static final List<IrregularVerb> IRREGULAR_VERBS = List.of(
    // ToDo: Simply copied over from present subjunctive
    new IrregularVerb("ser", Map.of(
        "1s", "fuere", 
        "2s", "fueres", 
        "3s", "fuere",
        "1p", "fuéremos",
        "2p", "fuereis",
        "3p", "fueren"
    )),
    new IrregularVerb("ir", Map.of(
        "1s", "fuere", 
        "2s", "fueres", 
        "3s", "fuere",
        "1p", "fuéremos",
        "2p", "fuereis",
        "3p", "fueren"
    )),
    new IrregularVerb("tener", Map.of(
        "1s", "tuviere", 
        "2s", "tuvieres", 
        "3s", "tuviere",
        "1p", "tuviéremos",
        "2p", "tuviereis",
        "3p", "tuvieren"
    )),
    new IrregularVerb("haber", Map.of(
        "1s", "hubiere", 
        "2s", "hubieres", 
        "3s", "hubiere",
        "1p", "hubiéremos",
        "2p", "hubiereis",
        "3p", "hubieren"
    )),
    new IrregularVerb("hacer", Map.of(
        "1s", "hiciere", 
        "2s", "hicieres", 
        "3s", "hiciere",
        "1p", "hiciéremos",
        "2p", "hiciere",
        "3p", "hicieren"
    )),
    new IrregularVerb("decir", Map.of(
        "1s", "dijere", 
        "2s", "dijeres", 
        "3s", "dijere",
        "1p", "dijéremos",
        "2p", "dijereis",
        "3p", "dijeren"
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
