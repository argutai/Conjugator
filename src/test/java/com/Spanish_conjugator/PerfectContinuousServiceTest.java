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

    // range

    @Test
    void testPresentPerfectContinuousIndicativeRegular1s() {
        String result = perfectContinuousService.conjugate("hablar", "present", "1s");
        assertEquals("he estado hablando", result);
    }
    
    @Test
    void testPresentPerfectContinuousIndicativeIrregular3p() {
        String result = perfectContinuousService.conjugate("ir", "present", "3p");
        assertEquals("han estado yendo", result);
    }
    
    @Test
    void testPresentPerfectContinuousIndicativeReflexive2s() {
        String result = perfectContinuousService.conjugate("levantarse", "present", "2s");
        assertEquals("te has estado levantando", result);
    }
    
    @Test
    void testPreteritePerfectContinuousIndicativeRegular1p() {
        String result = perfectContinuousService.conjugate("comer", "preterite", "1p");
        assertEquals("hubimos estado comiendo", result);
    }
    
    @Test
    void testPreteritePerfectContinuousIndicativeIrregular3s() {
        String result = perfectContinuousService.conjugate("dormir", "preterite", "3s");
        assertEquals("hubo estado durmiendo", result);
    }
    
    @Test
    void testPreteritePerfectContinuousIndicativeReflexive2p() {
        String result = perfectContinuousService.conjugate("lavarse", "preterite", "2p");
        assertEquals("os hubisteis estado lavando", result);
    }
    
    @Test
    void testImperfectPerfectContinuousIndicativeRegular3s() {
        String result = perfectContinuousService.conjugate("vivir", "imperfect", "3s");
        assertEquals("había estado viviendo", result);
    }
    
    @Test
    void testImperfectPerfectContinuousIndicativeIrregular1s() {
        String result = perfectContinuousService.conjugate("morir", "imperfect", "1s");
        assertEquals("había estado muriendo", result);
    }
    
    @Test
    void testImperfectPerfectContinuousIndicativeReflexive1p() {
        String result = perfectContinuousService.conjugate("acostarse", "imperfect", "1p");
        assertEquals("nos habíamos estado acostando", result);
    }
    
    @Test
    void testFuturePerfectContinuousIndicativeRegular2p() {
        String result = perfectContinuousService.conjugate("correr", "future", "2p");
        assertEquals("habréis estado corriendo", result);
    }
    
    @Test
    void testFuturePerfectContinuousIndicativeIrregular3p() {
        String result = perfectContinuousService.conjugate("ver", "future", "3p");
        assertEquals("habrán estado viendo", result);
    }
    
    @Test
    void testFuturePerfectContinuousIndicativeReflexive1s() {
        String result = perfectContinuousService.conjugate("ducharse", "future", "1s");
        assertEquals("me habré estado duchando", result);
    }
    
    @Test
    void testConditionalPerfectContinuousIndicativeRegular2s() {
        String result = perfectContinuousService.conjugate("hablar", "conditional", "2s");
        assertEquals("habrías estado hablando", result);
    }
    
    @Test
    void testConditionalPerfectContinuousIndicativeIrregular3s() {
        String result = perfectContinuousService.conjugate("decir", "conditional", "3s");
        assertEquals("habría estado diciendo", result);
    }
    
    @Test
    void testConditionalPerfectContinuousIndicativeReflexive3p() {
        String result = perfectContinuousService.conjugate("peinarse", "conditional", "3p");
        assertEquals("se habrían estado peinando", result);
    }
    
    @Test
    void testPresentPerfectContinuousSubjunctiveRegular1p() {
        String result = perfectContinuousService.conjugate("comer", "subjunctive present", "1p");
        assertEquals("hayamos estado comiendo", result);
    }
    
    @Test
    void testPresentPerfectContinuousSubjunctiveIrregular2p() {
        String result = perfectContinuousService.conjugate("pedir", "subjunctive present", "2p");
        assertEquals("hayáis estado pidiendo", result);
    }
    
    @Test
    void testPresentPerfectContinuousSubjunctiveReflexive3p() {
        String result = perfectContinuousService.conjugate("despertarse", "subjunctive present", "3p");
        assertEquals("se hayan estado despertando", result);
    }
    
    @Test
    void testImperfectPerfectContinuousSubjunctiveRegular1s() {
        String result = perfectContinuousService.conjugate("hablar", "subjunctive imperfect", "1s");
        assertEquals("hubiera estado hablando", result);
    }
    
    @Test
    void testImperfectPerfectContinuousSubjunctiveIrregular3s() {
        String result = perfectContinuousService.conjugate("abrir", "subjunctive imperfect", "3s");
        assertEquals("hubiera estado abriendo", result);
    }
    
    @Test
    void testImperfectPerfectContinuousSubjunctiveReflexive2p() {
        String result = perfectContinuousService.conjugate("irse", "subjunctive imperfect", "2p");
        assertEquals("os hubierais estado yendo", result);
    }
    
    @Test
    void testFuturePerfectContinuousSubjunctiveRegular3p() {
        String result = perfectContinuousService.conjugate("vivir", "subjunctive future", "3p");
        assertEquals("hubieren estado viviendo", result);
    }
    
    @Test
    void testFuturePerfectContinuousSubjunctiveIrregular1p() {
        String result = perfectContinuousService.conjugate("ver", "subjunctive future", "1p");
        assertEquals("hubiéremos estado viendo", result);
    }
    
    @Test
    void testFuturePerfectContinuousSubjunctiveReflexive2s() {
        String result = perfectContinuousService.conjugate("acostarse", "subjunctive future", "2s");
        assertEquals("te hubieres estado acostando", result);
    }
    

}
