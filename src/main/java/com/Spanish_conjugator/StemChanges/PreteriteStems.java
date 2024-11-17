package com.Spanish_conjugator.StemChanges;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class PreteriteStems {

    public static final Map<Function<String, String>, List<String>> PRETERITE_STEM_CHANGE_RULES = Map.of(
        stem -> stem.replace("e", "i"), List.of("pedir", "sentir", "divertir", "repetir", "servir", "vestir", "preferir", "mentir"),
        stem -> stem.replace("o", "u"), List.of("dormir", "morir")
        // ToDo: ending in vowel, add y verbs
    );

}
