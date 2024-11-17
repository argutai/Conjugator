package com.Spanish_conjugator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.Spanish_conjugator.Services.ReflexiveService;


class ReflexiveServiceTest {
    
    ReflexiveService reflexiveService = new ReflexiveService();

    String verb = "hablar";
    String form = "1p";

    @Test
    void testGetPronoun() {

        String result = reflexiveService.getPronoun(verb, form);
        String expectedResult = "";
        assertEquals(expectedResult, result);
    }    

    @Test
    void testRemoveSe() {
        
        // removeSe
        String result = reflexiveService.removeSe(verb, form);
        String expectedResult = verb;
        assertEquals(expectedResult, result);
    }    

    String reflexiveVerb = "bañarse";

    @Test
    void testGetPronounReflexive() {

        String result = reflexiveService.getPronoun(reflexiveVerb, form);
        String expectedResult = "nos ";
        assertEquals(expectedResult, result);
    }    

    @Test
    void testRemoveSeReflexive() {
        
        // removeSe
        String result = reflexiveService.removeSe(reflexiveVerb, form);
        String expectedResult = "bañar";
        assertEquals(expectedResult, result);
    }
}
