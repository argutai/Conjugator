package com.Spanish_conjugator.StemChanges;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FutureStems {

    public static final Map<Function<String, String>, List<String>> FUTURE_STEM_CHANGE_RULES = Map.of(
        stem -> stem.replace("er", "dr"), List.of("tener", "poner", "valer"),
        stem -> stem.replace("ir", "dr"), List.of("venir", "salir"),
        stem -> stem.replace("er", "r"), List.of("poder", "saber", "querer", "caber", "haber")
    );

}
