package com.Spanish_conjugator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.Spanish_conjugator.Services.StemService;


class StemServiceTest {
    
    StemService stemService = new StemService();

    // PRESENT tense with boot verbs

    @Test
    void testPresentRegular() {
        String result = stemService.getStem("hablar", "1s", "present");
        assertEquals(result, "habl");
    }    

    @Test
    void testPresentStemChangerBoot() {
        String result = stemService.getStem("poder", "1s", "present");
        assertEquals(result, "pued");
    }    

    @Test
    void testPresentStemChanger1p() {
        String result = stemService.getStem("poder", "1p", "present");
        assertEquals(result, "pod");
    }    


    // PRETERITE tense with 3s and 3p tense changes

    @Test
    void testPreteriteRegular() {
        String result = stemService.getStem("hablar", "1s", "preterite");
        assertEquals(result, "habl");
    }    

    @Test
    void testPreteriteStemChanger3s() {
        String result = stemService.getStem("sentir", "3s", "preterite");
        assertEquals(result, "sint");
    }    

    @Test
    void testPreteriteStemChanger3p() {
        String result = stemService.getStem("pedir", "3s", "preterite");
        assertEquals(result, "pid");
    }    


    @Test
    void testPreteriteStemChanger2s() {
        String result = stemService.getStem("mentir", "2s", "preterite");
        assertEquals(result, "ment");
    }    

    @Test
    void testPreteriteStemChanger2p() {
        String result = stemService.getStem("morir", "2s", "preterite");
        assertEquals(result, "mor");
    }    


    // IMPERFECT: No stem changers

    @Test
    void testImperfectRegular() {
        String result = stemService.getStem("caber", "1s", "imperfect");
        assertEquals(result, "cab");
    }    

    // FUTURE and CONDITIONAL with contractions and 'd's

    @Test
    void testFutureRegular() {
        String result = stemService.getStem("morir", "1s", "future");
        assertEquals(result, "morir");
    }    

    @Test
    void testConditionalRegular() {
        String result = stemService.getStem("estar", "2s", "conditional");
        assertEquals(result, "estar");
    }    

    @Test
    void testFutureStemChanger3s() {
        String result = stemService.getStem("tener", "3s", "future");
        assertEquals(result, "tendr");
    }    

    @Test
    void testFutureStemChanger1p() {
        String result = stemService.getStem("tener", "1p", "conditional");
        assertEquals(result, "tendr");
    }    

    @Test
    void testFutureStemChanger2p() {
        String result = stemService.getStem("venir", "2p", "future");
        assertEquals(result, "vendr");
    }    

    @Test
    void testFutureStemChanger3p() {
        String result = stemService.getStem("saber", "3p", "conditional");
        assertEquals(result, "sabr");
    }    

}
