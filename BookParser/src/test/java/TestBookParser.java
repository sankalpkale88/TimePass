import junit.framework.TestCase;
import org.junit.Test;

import java.util.Map;

/**
 * Created by cts1 on 17/3/14.
 */
public class TestBookParser extends TestCase{

    @Test
    public void testGetWordsWithItsFrequency(){

        BookParser bookParser = new BookParser();
        String input = "Hey how are you ? How are you doing ? I am good . I am Sankalp . Sankalp is awesome . ";
        InputText inputText = new InputText(input,null,InputTextType.NORMAL_STRING,DictionaryType.OXFORD);
        Map<String,Word> worddMap = bookParser.getWordWithItsFrequency(inputText);

        for(Word word : worddMap.values()){
            System.out.println(word.getWord() + " " + word.getCount());
        }
    }
}
