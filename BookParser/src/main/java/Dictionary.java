import java.util.HashMap;
import java.util.Map;

/**
 * Created by cts1 on 17/3/14.
 */
public class Dictionary {

    private static final Map<DictionaryType,Map<String,String>> DICTIONARY_TYPE_MAP = new HashMap<DictionaryType, Map<String, String>>();

    static {
        Map<String,String> dictionaryMap = new HashMap<String,String>();
        dictionaryMap.put("how","kaise");
        dictionaryMap.put("good","acha");
        dictionaryMap.put("sankalp","pratigya");

        DICTIONARY_TYPE_MAP.put(DictionaryType.OXFORD,dictionaryMap);
        DICTIONARY_TYPE_MAP.put(DictionaryType.WORDWEB,dictionaryMap);
        DICTIONARY_TYPE_MAP.put(DictionaryType.SABDANJALI,dictionaryMap);
    }

    public String getDictionaryMeaning(DictionaryType dictionaryType,String word){

        Map<String,String> dictionaryMap = DICTIONARY_TYPE_MAP.get(dictionaryType);
        return dictionaryMap.get(word);
    }
}
