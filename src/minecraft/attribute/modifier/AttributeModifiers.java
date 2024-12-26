package minecraft.attribute.modifier;

import java.util.List;
import java.util.stream.Collectors;

public class AttributeModifiers {
    private List<Attribute> attribute;

    public AttributeModifiers(List<Attribute> modifiers) {
        this.attribute = modifiers;
    }

    public AttributeModifiers(Attribute... modifiers) {
        this.attribute = List.of(modifiers);
    }

    @Override
    public String toString() {
        return "AttributeModifiers: [" +
                attribute.stream().map(Attribute::toString).collect(Collectors.joining(", "))
                + "]";
    }

    public List<Attribute> getModifiers() {
        return attribute;
    }

    public void setModifiers(List<Attribute> attribute) {
        this.attribute = attribute;
    }
}
