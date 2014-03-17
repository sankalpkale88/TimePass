/**
 * Created by cts1 on 16/3/14.
 */
public class KeywordDetail {

    private Color color;
    private boolean isCapital;
    private Style style;

    public KeywordDetail(Color color, boolean isCapital, Style style) {
        this.color = color;
        this.isCapital = isCapital;
        this.style = style;
    }

    public Color getColor() {
        return color;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public Style getStyle() {
        return style;
    }
}
