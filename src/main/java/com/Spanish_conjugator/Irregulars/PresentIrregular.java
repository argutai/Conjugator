package com.Spanish_conjugator.Irregulars;
import java.util.List;
import java.util.Map;

import com.Spanish_conjugator.Archive.IrregularVerb;

public class PresentIrregular {

    public static final List<IrregularVerb> IRREGULAR_VERBS = List.of(
        new IrregularVerb("ser", Map.of(
            "1s", "soy", 
            "2s", "eres", 
            "3s", "es",
            "1p", "somos",
            "2p", "sois",
            "3p", "son"
        )),
        new IrregularVerb("ir", Map.of(
            "1s", "voy", 
            "2s", "vas", 
            "3s", "va",
            "1p", "vamos",
            "2p", "vais",
            "3p", "van"
        )),
        new IrregularVerb("estar", Map.of(
            "1s", "estoy", 
            "2s", "estás", 
            "3s", "está",
            "1p", "estamos",
            "2p", "estáis",
            "3p", "están"
        )),
        new IrregularVerb("haber", Map.of(
            "1s", "he", 
            "2s", "has", 
            "3s", "ha",
            "1p", "hemos",
            "2p", "habéis",
            "3p", "han"
        )),
        new IrregularVerb("oír", Map.of(
            "1s", "oigo", 
            "2s", "oyes", 
            "3s", "oye",
            "1p", "oímos",
            "2p", "oís",
            "3p", "oyen"
        )),
        
        // ner -> ngo
        new IrregularVerb("tener", Map.of(
            "1s", "tengo"
        )),
        new IrregularVerb("venir", Map.of(
            "1s", "vengo"
        )),
        new IrregularVerb("caer", Map.of(
            "1s", "caigo"
        )),
        new IrregularVerb("decir", Map.of(
            "1s", "digo"
        )),
        new IrregularVerb("salir", Map.of(
            "1s", "salgo"
        )),
        new IrregularVerb("caber", Map.of(
            "1s", "quepo"
        )),
        new IrregularVerb("dar", Map.of(
            "1s", "doy"
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
