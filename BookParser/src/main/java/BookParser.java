import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * Created by cts1 on 17/3/14.
 */
public class BookParser {

    private static final String[] auxiliary = new String[]{"is", "are", "was", "were", "am", "do", "does", "did", "have", "has", "had"};
    private static final String[] preposition = new String[]{"on", "in", "at", "since", "above", "for", "ago", "before", "to", "past", "till",
            "until", "by", "of"};
    private Dictionary dictionary = new Dictionary();
    private InputTextReader inputTextReader = new InputTextReader();

    public Map<String, Word> getWordWithItsFrequency(InputText inputText) {
        String inputString = inputTextReader.getInputString(inputText);

        StringTokenizer stringTokenizer = new StringTokenizer(inputString, " ");
        List auxiliaryList = Arrays.asList(auxiliary);
        List prepositionList = Arrays.asList(preposition);

        Map<String, Word> wordMap = new HashMap<String, Word>();

        while (stringTokenizer.hasMoreTokens()) {
            String token = stringTokenizer.nextToken();
            if (!auxiliaryList.contains(token.toLowerCase()) && !prepositionList.contains(token.toLowerCase())) {
                Word word = wordMap.get(token.toLowerCase());
                if (word == null) {
                    word = new Word(token.toLowerCase(), 1,dictionary.getDictionaryMeaning(inputText.getDictionaryType(),
                            token.toLowerCase()));
                } else {
                    word.setCount(word.getCount() + 1);
                }

                wordMap.put(token.toLowerCase(), word);
            }
        }

        return wordMap;
    }

}
