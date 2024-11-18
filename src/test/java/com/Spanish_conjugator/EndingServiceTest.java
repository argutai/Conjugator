package com.Spanish_conjugator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.Spanish_conjugator.Services.EndingService;


class EndingServiceTest {
    
    EndingService endingService = new EndingService();

    // PRESENT
    @Test
    void testPresent1s() {
        String result = endingService.getEnding("present", "1s", "hablar");
        assertEquals("o", result);
    }    

    @Test
    void testPresent2s() {
        String result = endingService.getEnding("present", "2s", "conocer");
        assertEquals("es", result);
    }      

    // PRETERITE
    @Test
    void testPreterite3s() {
        String result = endingService.getEnding("preterite", "3s", "pintar");
        assertEquals("ó", result);
    }    

    @Test
    void testPreterite1p() {
        String result = endingService.getEnding("preterite", "1p", "comer");
        assertEquals("imos", result);
    }    

    // IMPERFECT
    @Test
    void testImperfect2p() {
        String result = endingService.getEnding("imperfect", "2p", "vivir");
        assertEquals("íais", result);
    }    

    @Test
    void testImperfect3p() {
        String result = endingService.getEnding("imperfect", "3p", "hablar");
        assertEquals("aban", result);
    }     

    // FUTURE
    @Test
    void testFuture1s() {
        String result = endingService.getEnding("future", "1s", "tener");
        assertEquals("é", result);
    }    

    @Test
    void testFuture2s() {
        String result = endingService.getEnding("future", "2s", "vivir");
        assertEquals("ás", result);
    }    

    // CONDITIONAL
    @Test
    void testConditional3s() {
        String result = endingService.getEnding("conditional", "3s", "hablar");
        assertEquals("ía", result);
    }    

    @Test
    void testConditional1p() {
        String result = endingService.getEnding("conditional", "1p", "saber");
        assertEquals("íamos", result);
    }    

    // SUBJUNCTIVE PRESENT
    @Test
    void testSubjunctivePresent2p() {
        String result = endingService.getEnding("subjunctive present", "2p", "hablar");
        assertEquals("éis", result);
    }    

    @Test
    void testSubjunctivePresent3p() {
        String result = endingService.getEnding("subjunctive present", "3p", "saber");
        assertEquals("an", result);
    }     

    // SUBJUNCTIVE IMPERFECT
    @Test
    void testSubjunctiveImperfect1s() {
        String result = endingService.getEnding("subjunctive imperfect", "2p", "hablar");
        assertEquals("rais", result);
    }    

    @Test
    void testSubjunctiveImperfect2s() {
        String result = endingService.getEnding("subjunctive imperfect", "3p", "saber");
        assertEquals("ran", result);
    }    

    // SUBJUNCTIVE FUTURE
    @Test
    void testSubjunctiveFuture3s() {
        String result = endingService.getEnding("subjunctive future", "3s", "hablar");
        assertEquals("re", result);
    }    

    @Test
    void testSubjunctiveFuture1p() {
        String result = endingService.getEnding("subjunctive future", "1p", "saber");
        assertEquals("remos", result);
    }    

}
