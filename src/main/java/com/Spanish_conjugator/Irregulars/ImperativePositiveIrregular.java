package com.Spanish_conjugator.Irregulars;
import java.util.List;
import java.util.Map;

import com.Spanish_conjugator.IrregularVerb;

public class ImperativePositiveIrregular {

    public static final List<IrregularVerb> IRREGULAR_VERBS = List.of(
        new IrregularVerb("ser", Map.of(
            "2s", "sé",          // 2nd person singular
            "3s", "sea",         // 3rd person singular
            "1p", "seamos",      // 1st person plural (nosotros)
            "2p", "sed",         // 2nd person plural (vosotros)
            "3p", "sean"         // 3rd person plural
        )),
        new IrregularVerb("ir", Map.of(
            "2s", "ve",
            "3s", "vaya",
            "1p", "vayamos",     // 1st person plural (nosotros)
            "2p", "id",          // 2nd person plural (vosotros)
            "3p", "vayan"
        )),
        new IrregularVerb("hacer", Map.of(
            "2s", "haz",
            "3s", "haga",
            "1p", "hagamos",     // 1st person plural (nosotros)
            "2p", "haced",       // 2nd person plural (vosotros)
            "3p", "hagan"
        )),
        new IrregularVerb("decir", Map.of(
            "2s", "di",
            "3s", "diga",
            "1p", "digamos",     // 1st person plural (nosotros)
            "2p", "decid",       // 2nd person plural (vosotros)
            "3p", "digan"
        )),
        new IrregularVerb("tener", Map.of(
            "2s", "ten",
            "3s", "tenga",
            "1p", "tengamos",    // 1st person plural (nosotros)
            "2p", "tened",       // 2nd person plural (vosotros)
            "3p", "tengan"
        )),
        new IrregularVerb("venir", Map.of(
            "2s", "ven",
            "3s", "venga",
            "1p", "vengamos",    // 1st person plural (nosotros)
            "2p", "venid",       // 2nd person plural (vosotros)
            "3p", "vengan"
        )),
        new IrregularVerb("salir", Map.of(
            "2s", "sal",
            "3s", "salga",
            "1p", "salgamos",    // 1st person plural (nosotros)
            "2p", "salid",       // 2nd person plural (vosotros)
            "3p", "salgan"
        )),
        new IrregularVerb("poner", Map.of(
            "2s", "pon",
            "3s", "ponga",
            "1p", "pongamos",    // 1st person plural (nosotros)
            "2p", "poned",       // 2nd person plural (vosotros)
            "3p", "pongan"
        )),
        new IrregularVerb("dar", Map.of(
            "2s", "da",
            "3s", "dé",
            "1p", "demos",       // 1st person plural (nosotros)
            "2p", "dad",         // 2nd person plural (vosotros)
            "3p", "den"
        )),
        new IrregularVerb("ver", Map.of(
            "2s", "ve",
            "3s", "vea",
            "1p", "veamos",      // 1st person plural (nosotros)
            "2p", "ved",         // 2nd person plural (vosotros)
            "3p", "vean"
        )),
        new IrregularVerb("oír", Map.of(
            "2s", "oye",
            "3s", "oiga",
            "1p", "oigamos",     // 1st person plural (nosotros)
            "2p", "oid",         // 2nd person plural (vosotros)
            "3p", "oigan"
        )),
        new IrregularVerb("saber", Map.of(
            "2s", "sabe",
            "3s", "sepa",
            "1p", "sepamos",     // 1st person plural (nosotros)
            "2p", "sabed",       // 2nd person plural (vosotros)
            "3p", "sepan"
        )),
        new IrregularVerb("caber", Map.of(
            "2s", "cabe",
            "3s", "quepa",
            "1p", "quepamos",    // 1st person plural (nosotros)
            "2p", "cabed",       // 2nd person plural (vosotros)
            "3p", "quepan"
        )),
        new IrregularVerb("traer", Map.of(
            "2s", "trae",
            "3s", "traiga",
            "1p", "traigamos",   // 1st person plural (nosotros)
            "2p", "traed",       // 2nd person plural (vosotros)
            "3p", "traigan"
        )),
        new IrregularVerb("conducir", Map.of(
            "2s", "conduce",
            "3s", "conduzca",
            "1p", "conduzcamos", // 1st person plural (nosotros)
            "2p", "conducid",    // 2nd person plural (vosotros)
            "3p", "conduzcan"
        )),
        new IrregularVerb("traducir", Map.of(
            "2s", "traduce",
            "3s", "traduzca",
            "1p", "traduzcamos", // 1st person plural (nosotros)
            "2p", "traducid",    // 2nd person plural (vosotros)
            "3p", "traduzcan"
        ))
    );
}
