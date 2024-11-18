package com.Spanish_conjugator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Spanish_conjugator.Aspects.PerfectService;

@SpringBootTest
class PerfectServiceTest {
    
    @Autowired
    private PerfectService perfectService;

    // Go through the example table
    
    @Test
    void testPresentPerfectIndicative() {

        String result = perfectService.conjugate("hablar", "present", "1s");
        assertEquals("he hablado", result);

    }    
    
    @Test
    void testPreteritePerfectIndicative() {

        String result = perfectService.conjugate("hablar", "preterite", "1s");
        assertEquals("hube hablado", result);

    }    
    
    @Test
    void testImperfectPerfectIndicative() {

        String result = perfectService.conjugate("hablar", "imperfect", "1s");
        assertEquals("había hablado", result);

    }    
    
    @Test
    void testFuturePerfectIndicative() {

        String result = perfectService.conjugate("hablar", "future", "1s");
        assertEquals("habré hablado", result);

    }    
    
    @Test
    void testConditionalPerfectIndicative() {

        String result = perfectService.conjugate("hablar", "conditional", "1s");
        assertEquals("habría hablado", result);

    }    
    
    @Test
    void testPresentperfectSubjunctive() {

        String result = perfectService.conjugate("hablar", "subjunctive present", "1s");
        assertEquals("haya hablado", result);

    }    
    
    @Test
    void testImperfectperfectSubjunctive() {

        String result = perfectService.conjugate("hablar", "subjunctive imperfect", "1s");
        assertEquals("hubiera hablado", result);

    }    

    @Test
    void testFutureperfectSubjunctive() {

        String result = perfectService.conjugate("hablar", "subjunctive future", "1s");
        assertEquals("hubiere hablado", result);

    }    

}
