package com.Spanish_conjugator;

import java.util.List;
import java.util.Map;
import java.util.function.Function;


public class PresentStemChanger {

    private static final Map<Function<String, String>, List<String>> STEM_CHANGE_RULES = Map.of(
        stem -> stem.replace("o", "ue"), List.of("acomodar", "almorzar", "avanzar", "cocer", "colocar", "comenzar", "confesar", "contar", "costar", "demostrar", "despedir", "devolver", "dormir", "encontrar", "forzar", "jugar", "mostrar", "mover", "oler", "poder", "probar", "recordar", "revolver", "soñar", "volver"),
        stem -> stem.replace("e", "ie"), List.of("acertar", "apretar", "atender", "bailar", "cerrar", "comenzar", "confesar", "convertir", "correr", "despertar", "empezar", "encender", "entender", "fregar", "mentir", "negar", "pensar", "perder", "preferir", "proponer", "recomendar", "sentir", "sugerir", "advertir", "asistir", "convertir", "corregir", "defender", "desprender", "distraer", "impedir", "mentir", "perder", "prevenir", "recomendar", "convertir", "despedir", "mentir", "pedir", "preferir", "sentir", "sugerir"),
        stem -> stem.replace("e", "i"), List.of("adquirir", "consentir", "corregir", "decir", "despedir", "elegir", "freír", "medir", "pedir", "reír", "seguir", "servir", "sugerir"),
        stem -> stem.replace("u", "ue"), List.of("jugar", "mostrar", "costar", "proponer", "reponer", "resolver")
    );

    public String changeStem(String verb, String person) {
        String stem = verb.substring(0, verb.length() - 2);

        if (person.equals("1p") || person.equals("2p")) {
            return stem;
        }
        return STEM_CHANGE_RULES.entrySet().stream()
                .filter(entry -> entry.getValue().contains(verb))
                .map(entry -> entry.getKey().apply(stem))
                .findFirst()
                .orElse(stem); 
    }

}


