public class ReportStyle {
    private String backgroundColor;
    private String fontColor;
    private int fontSize;

    public ReportStyle(String backgroundColor, String fontColor, int fontSize) {
        this.backgroundColor = backgroundColor;
        this.fontColor = fontColor;
        this.fontSize = fontSize;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public String getFontColor() {
        return fontColor;
    }

    public int getFontSize() {
        return fontSize;
    }

    @Override
    public String toString() {
        return "Style - " + backgroundColor + " font= " + fontSize + " "+ fontColor;
    }
}
