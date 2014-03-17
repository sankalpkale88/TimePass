/**
 * Created by cts1 on 16/3/14.
 */
public enum Color {

    RED("red"),BLUE("blue"),GREEN("green");

    private String color;

    private Color(String color){
        this.color = color;
    }

    public String getValue(){
        return this.color;
    }
}
