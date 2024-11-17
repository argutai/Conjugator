package com.Spanish_conjugator.Irregulars;
import java.util.List;
import java.util.Map;

import com.Spanish_conjugator.IrregularVerb;

public class PreteriteIrregular {

    public static final List<IrregularVerb> IRREGULAR_VERBS = List.of(

    // totally irregular
        new IrregularVerb("hacer", Map.of(
            "1s", "hice", 
            "2s", "hiciste", 
            "3s", "hizo",
            "1p", "hicimos",
            "2p", "hicisteis",
            "3p", "hicieron"
        )),
        new IrregularVerb("rehacer", Map.of(
            "1s", "rehice", 
            "2s", "rehiciste", 
            "3s", "rehizo",
            "1p", "rehicimos",
            "2p", "rehicisteis",
            "3p", "rehicieron"
        )),
        new IrregularVerb("ir", Map.of(
            "1s", "fui", 
            "2s", "fuiste", 
            "3s", "fue",
            "1p", "fuimos",
            "2p", "fuisteis",
            "3p", "fueron"
        )),
        new IrregularVerb("ser", Map.of(
            "1s", "fui", 
            "2s", "fuiste", 
            "3s", "fue",
            "1p", "fuimos",
            "2p", "fuisteis",
            "3p", "fueron"
        )),


        // i, iste, io, imos, isteis, ieron
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
        )),
        new IrregularVerb("estar", Map.of(
            "1s", "estuve", 
            "2s", "estuviste", 
            "3s", "estuvo",
            "1p", "estuvimos",
            "2p", "estuvisteis",
            "3p", "estuvieron"
        )),
        new IrregularVerb("tener", Map.of(
            "1s", "tuve", 
            "2s", "tuviste", 
            "3s", "tuvo",
            "1p", "tuvimos",
            "2p", "tuvisteis",
            "3p", "tuvieron"
        )),
        new IrregularVerb("venir", Map.of(
            "1s", "vine", 
            "2s", "viniste", 
            "3s", "vino",
            "1p", "vinimos",
            "2p", "vinisteis",
            "3p", "vinieron"
        )),
        new IrregularVerb("poder", Map.of(
            "1s", "pude", 
            "2s", "pudiste", 
            "3s", "pudo",
            "1p", "pudimos",
            "2p", "pudisteis",
            "3p", "pudieron"
        )),
        new IrregularVerb("saber", Map.of(
            "1s", "supe", 
            "2s", "supiste", 
            "3s", "supo",
            "1p", "supimos",
            "2p", "supisteis",
            "3p", "supieron"
        )),
        new IrregularVerb("andar", Map.of(
            "1s", "anduve", 
            "2s", "anduviste", 
            "3s", "anduvo",
            "1p", "anduvimos",
            "2p", "anduvisteis",
            "3p", "anduvieron"
        )),
        new IrregularVerb("caber", Map.of(
            "1s", "cupe", 
            "2s", "cupiste", 
            "3s", "cupo",
            "1p", "cupimos",
            "2p", "cupisteis",
            "3p", "cupieron"
        )),
        new IrregularVerb("satisfacer", Map.of(
            "1s", "satisfice", 
            "2s", "satisficiste", 
            "3s", "satisfizo",
            "1p", "satisficimos",
            "2p", "satisficisteis",
            "3p", "satisficieron"
        )),

        // i, iste, io, imos, isteis, ieron
        new IrregularVerb("decir", Map.of(
            "1s", "dije", 
            "2s", "dijiste", 
            "3s", "dijo",
            "1p", "dijimos",
            "2p", "dijisteis",
            "3p", "dijeron"
        )),
        new IrregularVerb("traer", Map.of(
            "1s", "traje", 
            "2s", "trajiste", 
            "3s", "trajo",
            "1p", "trajimos",
            "2p", "trajisteis",
            "3p", "trajeron"
        )),
        new IrregularVerb("traducir", Map.of(
            "1s", "traduje", 
            "2s", "tradujiste", 
            "3s", "tradujo",
            "1p", "tradujimos",
            "2p", "tradujisteis",
            "3p", "tradujeron"
        )),
        new IrregularVerb("conducir", Map.of(
            "1s", "conduje", 
            "2s", "condujiste", 
            "3s", "condujo",
            "1p", "condujimos",
            "2p", "condujisteis",
            "3p", "condujeron"
        )),
        new IrregularVerb("producir", Map.of(
            "1s", "produje", 
            "2s", "produjiste", 
            "3s", "produjo",
            "1p", "produjimos",
            "2p", "produjisteis",
            "3p", "produjeron"
        )),

        // 3rd person only 
        // ending in vowel -> y
        new IrregularVerb("leer", Map.of(
            "3s", "leyó",
            "3p", "leyeron"
        )),
        new IrregularVerb("oír", Map.of(
            "3s", "oyó",
            "3p", "oyeron"
        )),
        new IrregularVerb("construir", Map.of(
            "3s", "construyó",
            "3p", "construyeron"
        )),
        new IrregularVerb("caer", Map.of(
            "3s", "cayó",
            "3p", "cayeron"
        )),
        new IrregularVerb("creer", Map.of(
            "3s", "creyó",
            "3p", "creyeron"
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
