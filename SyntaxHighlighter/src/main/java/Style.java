/**
 * Created by cts1 on 16/3/14.
 */
public enum Style {

    BOLD("bold"),ITALIC("italic"),NORMAL("normal");

    private String style;

    private Style(String style){
        this.style = style;
    }

    public String getValue(){
        return this.style;
    }
}
