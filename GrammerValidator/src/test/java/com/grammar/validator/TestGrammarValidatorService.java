package com.grammar.validator;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by cts1 on 16/3/14.
 */
public class TestGrammarValidatorService extends TestCase{


    @org.junit.Test
    public void testGrammarValidatorForPunctuations(){

        GrammarValidatorService grammarValidatorService = new GrammarValidatorService();
        String inputString = "Hello!How are you?I am fine.";
        String rectifiedString = grammarValidatorService.rectifyParagraph(inputString);
        Assert.assertEquals("Hello! How are you? I am fine.",rectifiedString);
    }


    @org.junit.Test
    public void testGrammerValidatorForFirstCharacter(){

        GrammarValidatorService grammarValidatorService = new GrammarValidatorService();
        String inputString = "hello!How are you?i am fine.";
        String rectifiedString = grammarValidatorService.rectifyParagraph(inputString);
        Assert.assertEquals("Hello! How are you? I am fine.",rectifiedString);
    }

    @org.junit.Test
    public void testGrammerValidatorForArticle(){

        GrammarValidatorService grammarValidatorService = new GrammarValidatorService();
        String inputString = "A apple an day keeps doctor away.";
        String rectifiedString = grammarValidatorService.rectifyParagraph(inputString);
        Assert.assertEquals("An apple a day keeps doctor away.",rectifiedString);
    }

}
