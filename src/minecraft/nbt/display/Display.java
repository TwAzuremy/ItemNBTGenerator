package minecraft.nbt.display;

import minecraft.nbt.display.attribute.Text;

import java.util.List;
import java.util.stream.Collectors;

public class Display {
    private List<Text> name;
    private List<Text> lore;

    public Display() {}

    public Display(List<Text> name, List<Text> lore) {
        this.name = name;
        this.lore = lore;
    }

    public Display(Text name, List<Text> lore) {
        this.name = List.of(name);
        this.lore = lore;
    }

    private String nameFormat() {
        String format = this.name.stream().map(Text::toString).collect(Collectors.joining(", "));

        return "\"[" + format + "]\"";
    }

    private String loreFormat() {
        String format = this.lore.stream().map(Text::toString).collect(Collectors.joining("\", \""));

        return "[\"" + format + "\"]";
    }

    @Override
    public String toString() {
        return "display: {" +
                "Name: " + this.nameFormat() +
                ", Lore: " + this.loreFormat() +
                '}';
    }

    public List<Text> getLore() {
        return lore;
    }

    /**
     * Set the text of the lore.
     * @param lore Each element will be treated as a new line.
     */
    public void setLore(List<Text> lore) {
        this.lore = lore;
    }

    /**
     * Set the text of the lore.
     * @param texts Each element will be treated as a new line.
     */
    public void setLore(Text... texts) {
        this.lore = List.of(texts);
    }

    public List<Text> getName() {
        return name;
    }

    /**
     * Set the text of the name.
     * @param name Each element can be set individually, making the combined text more colorful.
     */
    public void setName(List<Text> name) {
        this.name = name;
    }

    /**
     * Set the text of the name.
     * @param texts Each element can be set individually, making the combined text more colorful.
     */
    public void setName(Text... texts) {
        this.name = List.of(texts);
    }
}
