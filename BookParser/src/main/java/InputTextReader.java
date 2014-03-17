import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by cts1 on 17/3/14.
 */
public class InputTextReader {

    public String getInputString(InputText inputText){

        if(inputText.getInputTextType() == InputTextType.NORMAL_STRING){
            return  inputText.getInputString();
        }else{

            try {
                File inputFile = inputText.getInputFile();
                BufferedReader reader = null;
                reader = new BufferedReader(new FileReader(inputFile));
                return reader.readLine();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        return null;
    }
}
