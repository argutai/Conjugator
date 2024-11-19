package com.Spanish_conjugator.Services;

import org.springframework.stereotype.Service;

@Service
public class AccentAdder {
    
    public static String replaceFinalLetter(String input) {

        char lastChar = input.charAt(input.length() - 1);

        if (lastChar == 'a') {
            return input.substring(0, input.length() - 1) + 'á';
        } else if (lastChar == 'e') {
            return input.substring(0, input.length() - 1) + 'é';
        }

        return input;
    }
}
