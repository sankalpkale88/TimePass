import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by cts1 on 16/3/14.
 */
public class TestSyntaxHighlighter extends TestCase {

    @Test
    public void testSyntaxHighlighter(){
        SyntaxHighlighter syntaxHighlighter = new SyntaxHighlighter();
        String inputString = "If we write a program and compile it, then as we run the program, we will get output";
        String highlightedString = syntaxHighlighter.getHighLightedSyntax(inputString);
        String expectedString = "[red][bold]if[bold][red] we write a program [red][bold]AND[bold][red] compile it, [green]then[green] [blue]AS[blue] we run the program, we will get output";

        Assert.assertEquals(expectedString,
                highlightedString);
    }
}
