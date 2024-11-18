package com.Spanish_conjugator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Spanish_conjugator.Aspects.SimpleService;

@SpringBootTest
class SimpleServiceTest {
    
    @Autowired
    private SimpleService simpleService;

    // Go through the example table
    
    @Test
    void testPresentSimpleIndicative() {

        String result = simpleService.conjugate("hablar", "present", "1s");
        assertEquals("hablo", result);

    }    
    
    @Test
    void testPreteriteSimpleIndicative() {

        String result = simpleService.conjugate("hablar", "preterite", "1s");
        assertEquals("hablé", result);

    }    
    
    @Test
    void testImperfectSimpleIndicative() {

        String result = simpleService.conjugate("hablar", "imperfect", "1s");
        assertEquals("hablaba", result);

    }    
    
    @Test
    void testFutureSimpleIndicative() {

        String result = simpleService.conjugate("hablar", "future", "1s");
        assertEquals("hablaré", result);

    }    
    
    @Test
    void testConditionalSimpleIndicative() {

        String result = simpleService.conjugate("hablar", "conditional", "1s");
        assertEquals("hablaría", result);

    }    
    
    @Test
    void testPresentSimpleSubjunctive() {

        String result = simpleService.conjugate("hablar", "subjunctive present", "1s");
        assertEquals("hable", result);

    }    
    
    @Test
    void testImperfectSimpleSubjunctive() {

        String result = simpleService.conjugate("hablar", "subjunctive imperfect", "1s");
        assertEquals("hablara", result);

    }    

    
    @Test
    void testFutureSimpleSubjunctive() {

        String result = simpleService.conjugate("hablar", "subjunctive future", "1s");
        assertEquals("hablare", result);

    }    

}
