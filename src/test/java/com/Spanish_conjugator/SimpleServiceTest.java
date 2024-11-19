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

    // range of test cases

    @Test
    void testPresentIndicativeStemChanging2s() {
        String result = simpleService.conjugate("pensar", "present", "2s");
        assertEquals("piensas", result);
    }
    
    @Test
    void testPreteriteIndicativeIrregular1p() {
        String result = simpleService.conjugate("tener", "preterite", "1p");
        assertEquals("tuvimos", result);
    }
    
    @Test
    void testPreteriteIndicativeReflexive3s() {
        String result = simpleService.conjugate("levantarse", "preterite", "3s");
        assertEquals("se levantó", result);
    }
    
    @Test
    void testImperfectIndicativeRegular3p() {
        String result = simpleService.conjugate("vivir", "imperfect", "3p");
        assertEquals("vivían", result);
    }
    
    @Test
    void testImperfectIndicativeStemChanging1s() {
        String result = simpleService.conjugate("dormir", "imperfect", "1s");
        assertEquals("dormía", result);
    }
    
    @Test
    void testFutureIndicativeHighlyIrregular3s() {
        String result = simpleService.conjugate("saber", "future", "3s");
        assertEquals("sabrá", result);
    }
    
    @Test
    void testFutureIndicativeReflexive2p() {
        String result = simpleService.conjugate("bañarse", "future", "2p");
        assertEquals("os bañaréis", result);
    }
    
    @Test
    void testConditionalIndicativeRegular1s() {
        String result = simpleService.conjugate("correr", "conditional", "1s");
        assertEquals("correría", result);
    }
    
    @Test
    void testConditionalIndicativeIrregular3p() {
        String result = simpleService.conjugate("poner", "conditional", "3p");
        assertEquals("pondrían", result);
    }
    
    @Test
    void testPresentSubjunctiveRegular1p() {
        String result = simpleService.conjugate("hablar", "subjunctive present", "1p");
        assertEquals("hablemos", result);
    }
    
    @Test
    void testPresentSubjunctiveStemChanging3s() {
        String result = simpleService.conjugate("dormir", "subjunctive present", "3s");
        assertEquals("duerma", result);
    }
    
    @Test
    void testImperfectSubjunctiveIrregular1s() {
        String result = simpleService.conjugate("tener", "subjunctive imperfect", "1s");
        assertEquals("tuviera", result);
    }
    
    @Test
    void testImperfectSubjunctiveHighlyIrregular2p() {
        String result = simpleService.conjugate("ir", "subjunctive imperfect", "2p");
        assertEquals("fuerais", result);
    }
    
    @Test
    void testFutureSubjunctiveRegular3p() {
        String result = simpleService.conjugate("comer", "subjunctive future", "3p");
        assertEquals("comieren", result);
    }
    
    @Test
    void testFutureSubjunctiveReflexive3s() {
        String result = simpleService.conjugate("levantarse", "subjunctive future", "1p");
        assertEquals("nos levantáremos", result);
    }
    
}
