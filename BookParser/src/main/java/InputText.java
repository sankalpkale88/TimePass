import java.io.File;

/**
 * Created by cts1 on 17/3/14.
 */
public class InputText {

    private String inputString;
    private File inputFile;
    private InputTextType inputTextType;
    private DictionaryType dictionaryType;

    public InputText(String inputString, File inputFile, InputTextType inputTextType, DictionaryType dictionaryType) {
        this.inputString = inputString;
        this.inputFile = inputFile;
        this.inputTextType = inputTextType;
        this.dictionaryType = dictionaryType;
    }

    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    public File getInputFile() {
        return inputFile;
    }

    public void setInputFile(File inputFile) {
        this.inputFile = inputFile;
    }

    public InputTextType getInputTextType() {
        return inputTextType;
    }

    public void setInputTextType(InputTextType inputTextType) {
        this.inputTextType = inputTextType;
    }

    public DictionaryType getDictionaryType() {
        return dictionaryType;
    }

    public void setDictionaryType(DictionaryType dictionaryType) {
        this.dictionaryType = dictionaryType;
    }
}
