/**
 * Created by cts1 on 17/3/14.
 */
public class Word {

    private String word;
    private int count;
    private String dictionary;

    public Word(String word, int count, String dictionary) {
        this.word = word;
        this.count = count;
        this.dictionary = dictionary;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getDictionary() {
        return dictionary;
    }

    public void setDictionary(String dictionary) {
        this.dictionary = dictionary;
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                ", count=" + count +
                ", dictionary='" + dictionary + '\'' +
                '}';
    }
}
