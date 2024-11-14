package com.Spanish_conjugator.Irregulars;
import java.util.List;
import java.util.Map;

import com.Spanish_conjugator.IrregularVerb;

public class PreteriteIrregular {

    public static final List<IrregularVerb> IRREGULAR_VERBS = List.of(
        new IrregularVerb("ir", Map.of(
            "1s", "fui", 
            "2s", "fuiste", 
            "3s", "fue",
            "1p", "fuimos",
            "2p", "fuisteis",
            "3p", "fueron"
        )),
        new IrregularVerb("dar", Map.of(
            "1s", "di", 
            "2s", "diste", 
            "3s", "dio",
            "1p", "dimos",
            "2p", "disteis",
            "3p", "dieron"
        )),
        new IrregularVerb("ver", Map.of(
            "1s", "vi", 
            "2s", "viste", 
            "3s", "vio",
            "1p", "vimos",
            "2p", "visteis",
            "3p", "vieron"
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
