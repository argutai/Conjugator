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
        assertEquals(result, "o");
    }    

    @Test
    void testPresent2s() {
        String result = endingService.getEnding("present", "2s", "conocer");
        assertEquals(result, "es");
    }      

    // PRETERITE
    @Test
    void testPreterite3s() {
        String result = endingService.getEnding("preterite", "3s", "pintar");
        assertEquals(result, "ó");
    }    

    @Test
    void testPreterite1p() {
        String result = endingService.getEnding("preterite", "1p", "comer");
        assertEquals(result, "imos");
    }    

    // IMPERFECT
    @Test
    void testImperfect2p() {
        String result = endingService.getEnding("imperfect", "2p", "vivir");
        assertEquals(result, "íais");
    }    

    @Test
    void testImperfect3p() {
        String result = endingService.getEnding("imperfect", "3p", "hablar");
        assertEquals(result, "aban");
    }     

    // FUTURE
    @Test
    void testFuture1s() {
        String result = endingService.getEnding("future", "1s", "tener");
        assertEquals(result, "é");
    }    

    @Test
    void testFuture2s() {
        String result = endingService.getEnding("future", "2s", "vivir");
        assertEquals(result, "ás");
    }    

    // CONDITIONAL
    @Test
    void testConditional3s() {
        String result = endingService.getEnding("conditional", "3s", "hablar");
        assertEquals(result, "ía");
    }    

    @Test
    void testConditional1p() {
        String result = endingService.getEnding("conditional", "1p", "saber");
        assertEquals(result, "íamos");
    }    

}
