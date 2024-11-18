package com.Spanish_conjugator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Spanish_conjugator.Aspects.ContinuousService;

@SpringBootTest
class ContinuousServiceTest {
    
    @Autowired
    private ContinuousService continuousService;

    // Go through the example table
    
    @Test
    void testPresentContinuousIndicative() {

        String result = continuousService.conjugate("hablar", "present", "1s");
        assertEquals("estoy hablando", result);

    }    
    
    @Test
    void testPreteriteContinuousIndicative() {

        String result = continuousService.conjugate("hablar", "preterite", "1s");
        assertEquals("estuve hablando", result);

    }    
    
    @Test
    void testImperfectContinuousIndicative() {

        String result = continuousService.conjugate("hablar", "imperfect", "1s");
        assertEquals("estaba hablando", result);

    }    
    
    @Test
    void testFutureContinuousIndicative() {

        String result = continuousService.conjugate("hablar", "future", "1s");
        assertEquals("estaré hablando", result);

    }    
    
    @Test
    void testConditionalContinuousIndicative() {

        String result = continuousService.conjugate("hablar", "conditional", "1s");
        assertEquals("estaría hablando", result);

    }    
    
    @Test
    void testPresentContinuousSubjunctive() {

        String result = continuousService.conjugate("hablar", "subjunctive present", "1s");
        assertEquals("esté hablando", result);

    }    
    
    @Test
    void testImperfectContinuousSubjunctive() {

        String result = continuousService.conjugate("hablar", "subjunctive imperfect", "1s");
        assertEquals("estuviera hablando", result);

    }    

    @Test
    void testFutureContinuousSubjunctive() {

        String result = continuousService.conjugate("hablar", "subjunctive future", "1s");
        assertEquals("estuviere hablando", result);

    }    

}
