import java.util.HashMap;
import java.util.Map;

/**
 * Created by cts1 on 16/3/14.
 */
public class KeywordHighlightRule {

    private static final Map<String,KeywordDetail> keywordMap = new HashMap<String, KeywordDetail>();

    static {
        keywordMap.put("as",new KeywordDetail(Color.BLUE,true,Style.NORMAL));
        keywordMap.put("If",new KeywordDetail(Color.RED,false,Style.BOLD));
        keywordMap.put("and",new KeywordDetail(Color.RED,true,Style.BOLD));
        keywordMap.put("then",new KeywordDetail(Color.GREEN,false,Style.NORMAL));
        keywordMap.put("when",new KeywordDetail(Color.BLUE,false,Style.NORMAL));

    }

    public static Map<String,KeywordDetail> getKeywordHighlightRuleMap(){
        return keywordMap;
    }
}
