package minecraft.attribute.display.color;

public enum MINECRAFT_COLOR {
    WHITE,
    ORANGE,
    MAGENTA,
    LIGHT_BLUE,
    YELLOW,
    LIME,
    PINK,
    GRAY,
    LIGHT_GRAY,
    CYAN,
    PURPLE,
    BLUE,
    BROWN,
    GREEN,
    RED,
    BLACK;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
