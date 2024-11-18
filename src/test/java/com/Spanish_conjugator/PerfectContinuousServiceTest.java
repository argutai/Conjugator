package com.Spanish_conjugator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Spanish_conjugator.Aspects.PerfectContinuousService;

@SpringBootTest
class PerfectContinuousServiceTest {
    
    @Autowired
    private PerfectContinuousService perfectContinuousService;

    // Go through the example table
    
    @Test
    void testPresentPerfectContinuousIndicative() {

        String result = perfectContinuousService.conjugate("hablar", "present", "1s");
        assertEquals("he estado hablando", result);

    }    
    
    @Test
    void testPreteritePerfectContinuousIndicative() {

        String result = perfectContinuousService.conjugate("hablar", "preterite", "1s");
        assertEquals("hube estado hablando", result);

    }    
    
    @Test
    void testImperfectPerfectContinuousIndicative() {

        String result = perfectContinuousService.conjugate("hablar", "imperfect", "1s");
        assertEquals("había estado hablando", result);

    }    
    
    @Test
    void testFuturePerfectContinuousIndicative() {

        String result = perfectContinuousService.conjugate("hablar", "future", "1s");
        assertEquals("habré estado hablando", result);

    }    
    
    @Test
    void testConditionalPerfectContinuousIndicative() {

        String result = perfectContinuousService.conjugate("hablar", "conditional", "1s");
        assertEquals("habría estado hablando", result);

    }    
    
    @Test
    void testPresentPerfectContinuousSubjunctive() {

        String result = perfectContinuousService.conjugate("hablar", "subjunctive present", "1s");
        assertEquals("haya estado hablando", result);

    }    
    
    @Test
    void testImperfectPerfectContinuousSubjunctive() {

        String result = perfectContinuousService.conjugate("hablar", "subjunctive imperfect", "1s");
        assertEquals("hubiera estado hablando", result);

    }    

    @Test
    void testFuturePerfectContinuousSubjunctive() {

        String result = perfectContinuousService.conjugate("hablar", "subjunctive future", "1s");
        assertEquals("hubiere estado hablando", result);

    }    

}
