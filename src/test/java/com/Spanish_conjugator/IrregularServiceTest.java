package com.Spanish_conjugator;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.Spanish_conjugator.Services.IrregularService;


class IrregularServiceTest {
    
    IrregularService irregularService = new IrregularService();

    String regularVerb = "hablar";
    String irregularVerb = "estar";
    String stemChangingVerb = "poder";
    String form = "1p";
    String tense = "present";

    @Test
    void testRegularRegularVerb() {

        Optional<String> result = irregularService.getIrregularConjugation(regularVerb, form, tense);
        assertTrue(result.isEmpty());

    }    

    @Test
    void testIrregularVerb() {

        Optional<String> result = irregularService.getIrregularConjugation(irregularVerb, form, tense);
        assertFalse(result.isEmpty());
        String expectedResult = "estamos";
        assertEquals(expectedResult, result.get());

    }

    @Test
    void testStemChangingVerb() {

        Optional<String> result = irregularService.getIrregularConjugation(stemChangingVerb, form, tense);
        assertTrue(result.isEmpty());

    }

}
