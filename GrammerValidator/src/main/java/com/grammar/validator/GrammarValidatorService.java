package com.grammar.validator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by cts1 on 16/3/14.
 */
public class GrammarValidatorService {

    private static final String PUNCTUATION_REGEX="\\p{Punct}";
    private static final String DOT_REGEX="\\.";
    private static final String FIRST_CHARACTER="^";
    private static final String ARTICLE_REGEX = "(a )|(A )|(an )|(An )";

    private static final Character[] vowels = new Character[]{'a','i','e','o','u'};
    private static final String BEFORE_CONSONANT="a";

    private static final String BEFORE_VOWEL="an";

    public String rectifyParagraph(String inputString){

        String rectifiedParagraph = rectifyPunctuation(inputString);
        rectifiedParagraph = rectifyArticle(rectifiedParagraph);
        return rectifyFirstCharcterOfStatement(rectifiedParagraph);


    }


    private String rectifyArticle(String inputString){
        Pattern pattern = Pattern.compile(ARTICLE_REGEX);
        Matcher matcher = pattern.matcher(inputString);
        StringBuffer sb = new StringBuffer();
        int index =0;

        while(matcher.find()){
            if(matcher.end() != inputString.length()){
                char characterAfterArticle = inputString.charAt(matcher.end());
                if(matcher.group().trim().toLowerCase().equals(BEFORE_CONSONANT)){
                    if(Arrays.asList(vowels).contains(characterAfterArticle)){
                        sb.append(inputString.substring(index,matcher.start()));
                        sb.append(BEFORE_VOWEL +" ");
                        index = matcher.start()+2;
                    }
                }else{
                    if(!Arrays.asList(vowels).contains(characterAfterArticle)){
                        sb.append(inputString.substring(index,matcher.start()));
                        sb.append(BEFORE_CONSONANT);
                        index = matcher.start()+2;
                    }
                }
            }

        }

        if(index==0){
            sb.append(inputString);
        }else{
            sb.append(inputString.substring(index,inputString.length()));
        }

        return sb.toString().trim();
    }

    private String rectifyFirstCharcterOfStatement(String inputString){
        StringBuffer sb = new StringBuffer();
        int index =0;

        if(Character.isLowerCase(inputString.charAt(0))){
            sb.append(Character.toUpperCase(inputString.charAt(0)));
            index = 1;
        }

        Pattern dotPattern = Pattern.compile(PUNCTUATION_REGEX);
        Matcher dotMatcher = dotPattern.matcher(inputString);

        while (dotMatcher.find()){
            if(dotMatcher.end() != inputString.length()){
                char firstCharacter = inputString.charAt(dotMatcher.end() + 1);
                if(Character.isLowerCase(firstCharacter)){
                    sb.append(inputString.substring(index,dotMatcher.end() + 1));
                    sb.append(Character.toUpperCase(firstCharacter));
                    System.out.println(sb);
                    index = dotMatcher.end()+2;
                }
            }
        }

        if(index==0){
            sb.append(inputString);
        }else{
            sb.append(inputString.substring(index,inputString.length()));
        }

        return  sb.toString().trim();

    }

    private String rectifyPunctuation(String inputString){
        Pattern pattern = Pattern.compile(PUNCTUATION_REGEX);
        Matcher matcher = pattern.matcher(inputString);
        StringBuffer sb = new StringBuffer();
        int index = 0;

        while(matcher.find()){

            if(matcher.end() != inputString.length() && !inputString.substring(matcher.end(),matcher.end()+1).equals(" ")){
                sb.append(inputString.substring(index,matcher.start()));
                sb.append(matcher.group()+" ");
                index = matcher.end();
            }

        }

        if(index==0){
            sb.append(inputString);
        }else{
            sb.append(inputString.substring(index,inputString.length()));
        }

        return  sb.toString().trim();
    }
}
