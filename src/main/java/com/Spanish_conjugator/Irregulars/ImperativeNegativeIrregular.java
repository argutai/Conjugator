package com.Spanish_conjugator.Irregulars;

import java.util.List;
import java.util.Map;

import com.Spanish_conjugator.IrregularVerb;

public class ImperativeNegativeIrregular {

    public static final List<IrregularVerb> IRREGULAR_VERBS = List.of(
        new IrregularVerb("ser", Map.of(
            "2s", "no seas",    // 2nd person singular
            "3s", "no sea",     // 3rd person singular
            "1p", "no seamos",  // 1st person plural (nosotros)
            "2p", "no seáis",   // 2nd person plural (vosotros)
            "3p", "no sean"     // 3rd person plural
        )),
        new IrregularVerb("ir", Map.of(
            "2s", "no vayas",
            "3s", "no vaya",
            "1p", "no vayamos", // 1st person plural (nosotros)
            "2p", "no vayáis",
            "3p", "no vayan"
        )),
        new IrregularVerb("hacer", Map.of(
            "2s", "no hagas",
            "3s", "no haga",
            "1p", "no hagamos", // 1st person plural (nosotros)
            "2p", "no hagáis",
            "3p", "no hagan"
        )),
        new IrregularVerb("decir", Map.of(
            "2s", "no digas",
            "3s", "no diga",
            "1p", "no digamos", // 1st person plural (nosotros)
            "2p", "no digáis",
            "3p", "no digan"
        )),
        new IrregularVerb("tener", Map.of(
            "2s", "no tengas",
            "3s", "no tenga",
            "1p", "no tengamos", // 1st person plural (nosotros)
            "2p", "no tengáis",
            "3p", "no tengan"
        )),
        new IrregularVerb("venir", Map.of(
            "2s", "no vengas",
            "3s", "no venga",
            "1p", "no vengamos", // 1st person plural (nosotros)
            "2p", "no vengáis",
            "3p", "no vengan"
        )),
        new IrregularVerb("salir", Map.of(
            "2s", "no salgas",
            "3s", "no salga",
            "1p", "no salgamos", // 1st person plural (nosotros)
            "2p", "no salgáis",
            "3p", "no salgan"
        )),
        new IrregularVerb("poner", Map.of(
            "2s", "no pongas",
            "3s", "no ponga",
            "1p", "no pongamos", // 1st person plural (nosotros)
            "2p", "no pongáis",
            "3p", "no pongan"
        )),
        new IrregularVerb("dar", Map.of(
            "2s", "no des",
            "3s", "no dé",
            "1p", "no demos",    // 1st person plural (nosotros)
            "2p", "no deis",
            "3p", "no den"
        )),
        new IrregularVerb("ver", Map.of(
            "2s", "no veas",
            "3s", "no vea",
            "1p", "no veamos",   // 1st person plural (nosotros)
            "2p", "no veáis",
            "3p", "no vean"
        )),
        new IrregularVerb("oír", Map.of(
            "2s", "no oigas",
            "3s", "no oiga",
            "1p", "no oigamos",  // 1st person plural (nosotros)
            "2p", "no oigáis",
            "3p", "no oigan"
        )),
        new IrregularVerb("saber", Map.of(
            "2s", "no sepas",
            "3s", "no sepa",
            "1p", "no sepamos",  // 1st person plural (nosotros)
            "2p", "no sepáis",
            "3p", "no sepan"
        )),
        new IrregularVerb("caber", Map.of(
            "2s", "no quepas",
            "3s", "no quepa",
            "1p", "no quepamos", // 1st person plural (nosotros)
            "2p", "no quepáis",
            "3p", "no quepan"
        )),
        new IrregularVerb("traer", Map.of(
            "2s", "no traigas",
            "3s", "no traiga",
            "1p", "no traigamos", // 1st person plural (nosotros)
            "2p", "no traigáis",
            "3p", "no traigan"
        )),
        new IrregularVerb("conducir", Map.of(
            "2s", "no conduzcas",
            "3s", "no conduzca",
            "1p", "no conduzcamos", // 1st person plural (nosotros)
            "2p", "no conduzcáis",
            "3p", "no conduzcan"
        )),
        new IrregularVerb("traducir", Map.of(
            "2s", "no traduzcas",
            "3s", "no traduzca",
            "1p", "no traduzcamos", // 1st person plural (nosotros)
            "2p", "no traduzcáis",
            "3p", "no traduzcan"
        ))
    );
}
