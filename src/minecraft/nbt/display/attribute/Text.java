package minecraft.nbt.display.attribute;

import minecraft.nbt.display.color.MINECRAFT_COLOR;

public class Text {
    private String text;
    private String color = MINECRAFT_COLOR.WHITE.toString();
    private Boolean bold = false;
    private Boolean italic = false;

    public Text(String text) {
        this.text = text;
    }

    public Text(String text, MINECRAFT_COLOR color) {
        this.text = text;
        this.color = color.toString();
    }

    public Text(String text, String color) {
        this.text = text;
        this.color = color;
    }

    public Text(String text, MINECRAFT_COLOR color, Boolean bold, Boolean italic) {
        this.text = text;
        this.color = color.toString();
        this.bold = bold;
        this.italic = italic;
    }

    public Text(String text, String hexColor, Boolean bold, Boolean italic) {
        this.text = text;
        this.color = hexColor;
        this.bold = bold;
        this.italic = italic;
    }

    @Override
    public String toString() {
        return "{" +
                "\\\"text\\\": \\\"" + text + "\\\"" +
                ", \\\"color\\\": \\\"" + color + "\\\"" +
                ", \\\"bold\\\": " + bold +
                ", \\\"italic\\\": " + italic +
                "}";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setColor(MINECRAFT_COLOR color) {
        this.color = color.toString();
    }

    public Boolean getBold() {
        return bold;
    }

    public void setBold(Boolean bold) {
        this.bold = bold;
    }

    public Boolean getItalic() {
        return italic;
    }

    public void setItalic(Boolean italic) {
        this.italic = italic;
    }
}
