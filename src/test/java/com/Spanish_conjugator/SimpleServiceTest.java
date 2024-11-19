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


    @Test
    void testImperativePositive2sSer() {
        String result = simpleService.conjugate("ser", "imperative positive present", "2s");
        assertEquals("sé", result);
    }

    @Test
    void testImperativePositive3sSer() {
        String result = simpleService.conjugate("ser", "imperative positive present", "3s");
        assertEquals("sea", result);
    }

    @Test
    void testImperativePositive2sComer() {
        String result = simpleService.conjugate("comer", "imperative positive present", "2s");
        assertEquals("come", result);
    }

    @Test
    void testImperativePositive3sComer() {
        String result = simpleService.conjugate("comer", "imperative positive present", "3s");
        assertEquals("coma", result);
    }

    @Test
    void testImperativePositive1pComer() {
        String result = simpleService.conjugate("comer", "imperative positive present", "1p");
        assertEquals("comamos", result);
    }

    @Test
    void testImperativePositive2pComer() {
        String result = simpleService.conjugate("comer", "imperative positive present", "2p");
        assertEquals("comed", result);
    }

    @Test
    void testImperativePositive3pComer() {
        String result = simpleService.conjugate("comer", "imperative positive present", "3p");
        assertEquals("coman", result);
    }

    @Test
    void testImperativePositive2sHablar() {
        String result = simpleService.conjugate("hablar", "imperative positive present", "2s");
        assertEquals("habla", result);
    }

    @Test
    void testImperativePositive3sHablar() {
        String result = simpleService.conjugate("hablar", "imperative positive present", "3s");
        assertEquals("hable", result);
    }

    @Test
    void testImperativePositive1pHablar() {
        String result = simpleService.conjugate("hablar", "imperative positive present", "1p");
        assertEquals("hablemos", result);
    }

    @Test
    void testImperativePositive2pHablar() {
        String result = simpleService.conjugate("hablar", "imperative positive present", "2p");
        assertEquals("hablad", result);
    }

    @Test
    void testImperativePositive3pHablar() {
        String result = simpleService.conjugate("hablar", "imperative positive present", "3p");
        assertEquals("hablen", result);
    }

    @Test
    void testImperativePositive2sTener() {
        String result = simpleService.conjugate("tener", "imperative positive present", "2s");
        assertEquals("ten", result);
    }

    @Test
    void testImperativePositive3sTener() {
        String result = simpleService.conjugate("tener", "imperative positive present", "3s");
        assertEquals("tenga", result);
    }

    @Test
    void testImperativePositive1pTener() {
        String result = simpleService.conjugate("tener", "imperative positive present", "1p");
        assertEquals("tengamos", result);
    }

    @Test
    void testImperativePositive2pTener() {
        String result = simpleService.conjugate("tener", "imperative positive present", "2p");
        assertEquals("tened", result);
    }

    @Test
    void testImperativePositive3pTener() {
        String result = simpleService.conjugate("tener", "imperative positive present", "3p");
        assertEquals("tengan", result);
    }

    @Test
    void testImperativePositive2sEscribir() {
        String result = simpleService.conjugate("escribir", "imperative positive present", "2s");
        assertEquals("escribe", result);
    }

    @Test
    void testImperativePositive3sEscribir() {
        String result = simpleService.conjugate("escribir", "imperative positive present", "3s");
        assertEquals("escriba", result);
    }

    @Test
    void testImperativePositive1pEscribir() {
        String result = simpleService.conjugate("escribir", "imperative positive present", "1p");
        assertEquals("escribamos", result);
    }

    @Test
    void testImperativePositive2pEscribir() {
        String result = simpleService.conjugate("escribir", "imperative positive present", "2p");
        assertEquals("escribid", result);
    }

    @Test
    void testImperativePositive3pEscribir() {
        String result = simpleService.conjugate("escribir", "imperative positive present", "3p");
        assertEquals("escriban", result);
    }

    @Test
    void testImperativeNegative2sSer() {
        String result = simpleService.conjugate("ser", "imperative negative present", "2s");
        assertEquals("no seas", result);
    }

    @Test
    void testImperativeNegative3sSer() {
        String result = simpleService.conjugate("ser", "imperative negative present", "3s");
        assertEquals("no sea", result);
    }

    @Test
    void testImperativeNegative2sComer() {
        String result = simpleService.conjugate("comer", "imperative negative present", "2s");
        assertEquals("no comas", result);
    }

    @Test
    void testImperativeNegative3sComer() {
        String result = simpleService.conjugate("comer", "imperative negative present", "3s");
        assertEquals("no coma", result);
    }

    @Test
    void testImperativeNegative1pComer() {
        String result = simpleService.conjugate("comer", "imperative negative present", "1p");
        assertEquals("no comamos", result);
    }

    @Test
    void testImperativeNegative2pComer() {
        String result = simpleService.conjugate("comer", "imperative negative present", "2p");
        assertEquals("no comáis", result);
    }

    @Test
    void testImperativeNegative3pComer() {
        String result = simpleService.conjugate("comer", "imperative negative present", "3p");
        assertEquals("no coman", result);
    }

    @Test
    void testImperativeNegative2sHablar() {
        String result = simpleService.conjugate("hablar", "imperative negative present", "2s");
        assertEquals("no hables", result);
    }

    @Test
    void testImperativeNegative3sHablar() {
        String result = simpleService.conjugate("hablar", "imperative negative present", "3s");
        assertEquals("no hable", result);
    }

    @Test
    void testImperativeNegative1pHablar() {
        String result = simpleService.conjugate("hablar", "imperative negative present", "1p");
        assertEquals("no hablemos", result);
    }

    @Test
    void testImperativeNegative2pHablar() {
        String result = simpleService.conjugate("hablar", "imperative negative present", "2p");
        assertEquals("no habléis", result);
    }

    @Test
    void testImperativeNegative3pHablar() {
        String result = simpleService.conjugate("hablar", "imperative negative present", "3p");
        assertEquals("no hablen", result);
    }

    @Test
    void testImperativeNegative2sTener() {
        String result = simpleService.conjugate("tener", "imperative negative present", "2s");
        assertEquals("no tengas", result);
    }

    @Test
    void testImperativeNegative3sTener() {
        String result = simpleService.conjugate("tener", "imperative negative present", "3s");
        assertEquals("no tenga", result);
    }

    @Test
    void testImperativeNegative1pTener() {
        String result = simpleService.conjugate("tener", "imperative negative present", "1p");
        assertEquals("no tengamos", result);
    }

    @Test
    void testImperativeNegative2pTener() {
        String result = simpleService.conjugate("tener", "imperative negative present", "2p");
        assertEquals("no tengáis", result);
    }

}
