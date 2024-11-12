package com.Spanish_conjugator;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
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
        new IrregularVerb("estar", Map.of(
            "1s", "estoy", 
            "2s", "estás", 
            "3s", "está",
            "1p", "estamos",
            "2p", "estáis",
            "3p", "están"
        )),
        new IrregularVerb("ir", Map.of(
            "1s", "voy", 
            "2s", "vas", 
            "3s", "va",
            "1p", "vamos",
            "2p", "vais",
            "3p", "van"
        )),
        new IrregularVerb("tener", Map.of(
            "1s", "tengo", 
            "2s", "tienes", 
            "3s", "tiene",
            "1p", "tenemos",
            "2p", "tenéis",
            "3p", "tienen"
        )),
        new IrregularVerb("haber", Map.of(
            "1s", "he", 
            "2s", "has", 
            "3s", "ha",
            "1p", "hemos",
            "2p", "habéis",
            "3p", "han"
        )),
        new IrregularVerb("venir", Map.of(
            "1s", "vengo", 
            "2s", "vienes", 
            "3s", "viene",
            "1p", "venimos",
            "2p", "venís",
            "3p", "vienen"
        )),
        new IrregularVerb("decir", Map.of(
            "1s", "digo", 
            "2s", "dices", 
            "3s", "dice",
            "1p", "decimos",
            "2p", "decís",
            "3p", "dicen"
        )),
        new IrregularVerb("salir", Map.of(
            "1s", "salgo", 
            "2s", "sales", 
            "3s", "sale",
            "1p", "salimos",
            "2p", "salís",
            "3p", "salen"
        )),
        new IrregularVerb("oír", Map.of(
            "1s", "oigo", 
            "2s", "oyes", 
            "3s", "oye",
            "1p", "oímos",
            "2p", "oís",
            "3p", "oyen"
        )),
        new IrregularVerb("caber", Map.of(
            "1s", "quepo", 
            "2s", "cabes", 
            "3s", "cabe",
            "1p", "cabemos",
            "2p", "cabéis",
            "3p", "caben"
        )),
        new IrregularVerb("dar", Map.of(
            "1s", "doy", 
            "2s", "das", 
            "3s", "da",
            "1p", "damos",
            "2p", "dáis",
            "3p", "dan"
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
