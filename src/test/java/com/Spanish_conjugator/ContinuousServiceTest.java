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

    // range

    @Test
    void testPresentContinuousIndicativeRegular1s() {
        String result = continuousService.conjugate("hablar", "present", "1s");
        assertEquals("estoy hablando", result);
    }
    
    @Test
    void testPresentContinuousIndicativeIrregular3p() {
        String result = continuousService.conjugate("ir", "present", "3p");
        assertEquals("están yendo", result);
    }
    
    @Test
    void testPresentContinuousIndicativeReflexive2s() {
        String result = continuousService.conjugate("levantarse", "present", "2s");
        assertEquals("te estás levantando", result);
    }
    
    @Test
    void testPreteriteContinuousIndicativeRegular1p() {
        String result = continuousService.conjugate("comer", "preterite", "1p");
        assertEquals("estuvimos comiendo", result);
    }
    
    @Test
    void testPreteriteContinuousIndicativeIrregular3s() {
        String result = continuousService.conjugate("dormir", "preterite", "3s");
        assertEquals("estuvo durmiendo", result);
    }
    
    @Test
    void testPreteriteContinuousIndicativeReflexive2p() {
        String result = continuousService.conjugate("lavarse", "preterite", "2p");
        assertEquals("os estuvisteis lavando", result);
    }
    
    @Test
    void testImperfectContinuousIndicativeRegular3s() {
        String result = continuousService.conjugate("vivir", "imperfect", "3s");
        assertEquals("estaba viviendo", result);
    }
    
    @Test
    void testImperfectContinuousIndicativeIrregular1s() {
        String result = continuousService.conjugate("morir", "imperfect", "1s");
        assertEquals("estaba muriendo", result);
    }
    
    @Test
    void testImperfectContinuousIndicativeReflexive1p() {
        String result = continuousService.conjugate("acostarse", "imperfect", "1p");
        assertEquals("nos estábamos acostando", result);
    }
    
    @Test
    void testFutureContinuousIndicativeRegular2p() {
        String result = continuousService.conjugate("correr", "future", "2p");
        assertEquals("estaréis corriendo", result);
    }
    
    @Test
    void testFutureContinuousIndicativeIrregular3p() {
        String result = continuousService.conjugate("ver", "future", "3p");
        assertEquals("estarán viendo", result);
    }
    
    @Test
    void testFutureContinuousIndicativeReflexive1s() {
        String result = continuousService.conjugate("ducharse", "future", "1s");
        assertEquals("me estaré duchando", result);
    }
    
    @Test
    void testConditionalContinuousIndicativeRegular2s() {
        String result = continuousService.conjugate("hablar", "conditional", "2s");
        assertEquals("estarías hablando", result);
    }
    
    @Test
    void testConditionalContinuousIndicativeIrregular3s() {
        String result = continuousService.conjugate("decir", "conditional", "3s");
        assertEquals("estaría diciendo", result);
    }
    
    @Test
    void testConditionalContinuousIndicativeReflexive3p() {
        String result = continuousService.conjugate("peinarse", "conditional", "3p");
        assertEquals("se estarían peinando", result);
    }
    
    @Test
    void testPresentContinuousSubjunctiveRegular1p() {
        String result = continuousService.conjugate("comer", "subjunctive present", "1p");
        assertEquals("estemos comiendo", result);
    }
    
    @Test
    void testPresentContinuousSubjunctiveIrregular2p() {
        String result = continuousService.conjugate("pedir", "subjunctive present", "2p");
        assertEquals("estéis pidiendo", result);
    }
    
    @Test
    void testPresentContinuousSubjunctiveReflexive3p() {
        String result = continuousService.conjugate("despertarse", "subjunctive present", "3p");
        assertEquals("se estén despertando", result);
    }
    
    @Test
    void testImperfectContinuousSubjunctiveRegular1s() {
        String result = continuousService.conjugate("hablar", "subjunctive imperfect", "1s");
        assertEquals("estuviera hablando", result);
    }
    
    @Test
    void testImperfectContinuousSubjunctiveIrregular3s() {
        String result = continuousService.conjugate("abrir", "subjunctive imperfect", "3s");
        assertEquals("estuviera abriendo", result);
    }
    
    @Test
    void testImperfectContinuousSubjunctiveReflexive2p() {
        String result = continuousService.conjugate("irse", "subjunctive imperfect", "2p");
        assertEquals("os estuvierais yendo", result);
    }
    
    @Test
    void testFutureContinuousSubjunctiveRegular3p() {
        String result = continuousService.conjugate("vivir", "subjunctive future", "3p");
        assertEquals("estuvieren viviendo", result);
    }
    
    @Test
    void testFutureContinuousSubjunctiveIrregular1p() {
        String result = continuousService.conjugate("ver", "subjunctive future", "1p");
        assertEquals("estuviéremos viendo", result);
    }
    
    @Test
    void testFutureContinuousSubjunctiveReflexive2s() {
        String result = continuousService.conjugate("acostarse", "subjunctive future", "2s");
        assertEquals("te estuvieres acostando", result);
    }
    
}
