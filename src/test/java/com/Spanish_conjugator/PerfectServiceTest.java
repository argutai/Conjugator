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

    // Range 

    @Test
    void testPresentPerfectIndicativeIrregular3p() {
        String result = perfectService.conjugate("abrir", "present", "3p");
        assertEquals("han abierto", result);
    }

    @Test
    void testPresentPerfectIndicativeReflexive2s() {
        String result = perfectService.conjugate("levantarse", "present", "2s");
        assertEquals("te has levantado", result);
    }

    @Test
    void testPreteritePerfectIndicativeRegular1p() {
        String result = perfectService.conjugate("comer", "preterite", "1p");
        assertEquals("hubimos comido", result);
    }

    @Test
    void testPreteritePerfectIndicativeIrregular3s() {
        String result = perfectService.conjugate("romper", "preterite", "3s");
        assertEquals("hubo roto", result);
    }

    @Test
    void testPreteritePerfectIndicativeReflexive2p() {
        String result = perfectService.conjugate("lavarse", "preterite", "2p");
        assertEquals("os hubisteis lavado", result);
    }

    @Test
    void testImperfectPerfectIndicativeRegular3s() {
        String result = perfectService.conjugate("vivir", "imperfect", "3s");
        assertEquals("había vivido", result);
    }

    @Test
    void testImperfectPerfectIndicativeIrregular1s() {
        String result = perfectService.conjugate("escribir", "imperfect", "1s");
        assertEquals("había escrito", result);
    }

    @Test
    void testImperfectPerfectIndicativeReflexive1p() {
        String result = perfectService.conjugate("acostarse", "imperfect", "1p");
        assertEquals("nos habíamos acostado", result);
    }

    @Test
    void testFuturePerfectIndicativeRegular2p() {
        String result = perfectService.conjugate("correr", "future", "2p");
        assertEquals("habréis corrido", result);
    }

    @Test
    void testFuturePerfectIndicativeIrregular3p() {
        String result = perfectService.conjugate("ver", "future", "3p");
        assertEquals("habrán visto", result);
    }

    @Test
    void testFuturePerfectIndicativeReflexive1s() {
        String result = perfectService.conjugate("ducharse", "future", "1s");
        assertEquals("me habré duchado", result);
    }

    @Test
    void testConditionalPerfectIndicativeRegular2s() {
        String result = perfectService.conjugate("hablar", "conditional", "2s");
        assertEquals("habrías hablado", result);
    }

    @Test
    void testConditionalPerfectIndicativeIrregular3s() {
        String result = perfectService.conjugate("poner", "conditional", "3s");
        assertEquals("habría puesto", result);
    }

    @Test
    void testConditionalPerfectIndicativeReflexive3p() {
        String result = perfectService.conjugate("peinarse", "conditional", "3p");
        assertEquals("se habrían peinado", result);
    }

    @Test
    void testPresentPerfectSubjunctiveRegular1p() {
        String result = perfectService.conjugate("comer", "subjunctive present", "1p");
        assertEquals("hayamos comido", result);
    }

    @Test
    void testPresentPerfectSubjunctiveIrregular2p() {
        String result = perfectService.conjugate("decir", "subjunctive present", "2p");
        assertEquals("hayáis dicho", result);
    }

    @Test
    void testPresentPerfectSubjunctiveReflexive3p() {
        String result = perfectService.conjugate("despertarse", "subjunctive present", "3p");
        assertEquals("se hayan despertado", result);
    }

    @Test
    void testImperfectPerfectSubjunctiveRegular1s() {
        String result = perfectService.conjugate("hablar", "subjunctive imperfect", "1s");
        assertEquals("hubiera hablado", result);
    }

    @Test
    void testImperfectPerfectSubjunctiveIrregular3s() {
        String result = perfectService.conjugate("abrir", "subjunctive imperfect", "3s");
        assertEquals("hubiera abierto", result);
    }

    @Test
    void testImperfectPerfectSubjunctiveReflexive2p() {
        String result = perfectService.conjugate("irse", "subjunctive imperfect", "2p");
        assertEquals("os hubierais ido", result);
    }

    @Test
    void testFuturePerfectSubjunctiveRegular3p() {
        String result = perfectService.conjugate("vivir", "subjunctive future", "3p");
        assertEquals("hubieren vivido", result);
    }

    @Test
    void testFuturePerfectSubjunctiveIrregular1p() {
        String result = perfectService.conjugate("ver", "subjunctive future", "1p");
        assertEquals("hubiéremos visto", result);
    }

    @Test
    void testFuturePerfectSubjunctiveReflexive2s() {
        String result = perfectService.conjugate("acostarse", "subjunctive future", "2s");
        assertEquals("te hubieres acostado", result);
    }


}
