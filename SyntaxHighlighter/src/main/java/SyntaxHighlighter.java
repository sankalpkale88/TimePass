import javafx.beans.binding.StringBinding;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cts1 on 16/3/14.
 */
public class SyntaxHighlighter {


    private static final String OPEN_BRACKET="[";
    private static final String CLOSE_BRACKET="]";



    public String getHighLightedSyntax(String inputString){
        Map<String,KeywordDetail> keywordMap = KeywordHighlightRule.getKeywordHighlightRuleMap();

        for(String keyword :   keywordMap.keySet()){
            StringBuffer replaceString = new StringBuffer();
            replaceString.append(OPEN_BRACKET);
            replaceString.append(keywordMap.get(keyword).getColor().getValue());
            replaceString.append(CLOSE_BRACKET);
            if(keywordMap.get(keyword).getStyle() != Style.NORMAL){
                replaceString.append(OPEN_BRACKET);
                replaceString.append(keywordMap.get(keyword).getStyle().getValue());
                replaceString.append(CLOSE_BRACKET);
            }

            if(keywordMap.get(keyword).isCapital()){
                replaceString.append(keyword.toUpperCase());
            }else{
                replaceString.append(keyword.toLowerCase());
            }
            if(keywordMap.get(keyword).getStyle() != Style.NORMAL){
                replaceString.append(OPEN_BRACKET);
                replaceString.append(keywordMap.get(keyword).getStyle().getValue());
                replaceString.append(CLOSE_BRACKET);
            }
            replaceString.append(OPEN_BRACKET);
            replaceString.append(keywordMap.get(keyword).getColor().getValue());
            replaceString.append(CLOSE_BRACKET);

            inputString = inputString.replaceAll("(?i)"+keyword,replaceString.toString());
        }

        return inputString;
    }
}
