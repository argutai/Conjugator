package com.Spanish_conjugator.StemChanges;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class SubjunctivePresentStems {

    public static final Map<Function<String, String>, List<String>> PRESENT_STEM_CHANGE_RULES = Map.of(
        stem -> stem.replace("o", "ue"), List.of("acomodar", "almorzar", "avanzar", "cocer", "colocar", "comenzar", "confesar", "contar", "costar", "demostrar", "despedir", "devolver", "dormir", "encontrar", "forzar", "jugar", "mostrar", "mover", "oler", "poder", "probar", "recordar", "revolver", "soñar", "volver"),
        stem -> stem.replace("e", "ie"), List.of("acertar", "apretar", "atender", "cerrar", "comenzar", "confesar", "convertir", "despertar", "empezar", "encender", "entender", "fregar", "mentir", "negar", "pensar", "perder", "preferir", "recomendar", "sentir", "sugerir"),
        stem -> stem.replace("e", "i"), List.of("adquirir", "consentir", "corregir", "decir", "despedir", "elegir", "freír", "medir", "pedir", "reír", "seguir", "servir", "sugerir"),
        stem -> stem.replace("u", "ue"), List.of("jugar", "mostrar", "resolver"),
        stem -> stem.replace("e", "ie"), List.of("tener", "venir")
    );

}
