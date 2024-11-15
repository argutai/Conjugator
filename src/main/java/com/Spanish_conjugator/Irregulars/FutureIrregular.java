package com.Spanish_conjugator.Irregulars;
import java.util.List;
import java.util.Map;

import com.Spanish_conjugator.IrregularVerb;
public class FutureIrregular {

    public static final List<IrregularVerb> IRREGULAR_VERBS = List.of(
        
        // totally irregular
        new IrregularVerb("hacer", Map.of(
            "1s", "haré", 
            "2s", "harás", 
            "3s", "hará",
            "1p", "haremos",
            "2p", "haréis",
            "3p", "harán"
        )),
        new IrregularVerb("decir", Map.of(
            "1s", "diré", 
            "2s", "dirás", 
            "3s", "dirá",
            "1p", "diremos",
            "2p", "diréis",
            "3p", "dirán"
        ))

        // // contract, add 'd'
        // new IrregularVerb("tener", Map.of(
        //     "1s", "tendré", 
        //     "2s", "tendrás", 
        //     "3s", "tendrá",
        //     "1p", "tendremos",
        //     "2p", "tendréis",
        //     "3p", "tendrán"
        // )),
        // new IrregularVerb("venir", Map.of(
        //     "1s", "vendré", 
        //     "2s", "vendrás", 
        //     "3s", "vendrá",
        //     "1p", "vendremos",
        //     "2p", "vendréis",
        //     "3p", "vendrán"
        // )),
        // new IrregularVerb("poner", Map.of(
        //     "1s", "pondré", 
        //     "2s", "pondrás", 
        //     "3s", "pondrá",
        //     "1p", "pondremos",
        //     "2p", "pondréis",
        //     "3p", "pondrán"
        // )),
        // new IrregularVerb("salir", Map.of(
        //     "1s", "saldré", 
        //     "2s", "saldrás", 
        //     "3s", "saldrá",
        //     "1p", "saldramos",
        //     "2p", "saldréis",
        //     "3p", "saldrán"
        // )),
        // new IrregularVerb("valer", Map.of(
        //     "1s", "valdré", 
        //     "2s", "valdrás", 
        //     "3s", "valdrá",
        //     "1p", "valdremos",
        //     "2p", "valdréis",
        //     "3p", "valdrán"
        // )),

        // // contract
        // new IrregularVerb("poder", Map.of(
        //     "1s", "podré", 
        //     "2s", "podrás", 
        //     "3s", "podrá",
        //     "1p", "podremos",
        //     "2p", "podréis",
        //     "3p", "podrán"
        // )),
        // new IrregularVerb("saber", Map.of(
        //     "1s", "sabré", 
        //     "2s", "sabrás", 
        //     "3s", "sabrá",
        //     "1p", "sabremos",
        //     "2p", "sabréis",
        //     "3p", "sabrán"
        // )),
        // new IrregularVerb("querer", Map.of(
        //     "1s", "querré", 
        //     "2s", "querrás", 
        //     "3s", "querrá",
        //     "1p", "querremos",
        //     "2p", "querréis",
        //     "3p", "querrán"
        // )),
        // new IrregularVerb("caber", Map.of(
        //     "1s", "cabré", 
        //     "2s", "cabrás", 
        //     "3s", "cabrá",
        //     "1p", "cabremos",
        //     "2p", "cabréis",
        //     "3p", "cabran"
        // )),
        // new IrregularVerb("haber", Map.of(
        //     "1s", "habré", 
        //     "2s", "habrás", 
        //     "3s", "habrá",
        //     "1p", "habremos",
        //     "2p", "habréis",
        //     "3p", "habrán"
        // ))
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
