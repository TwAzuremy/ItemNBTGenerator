package minecraft.nbt.modifier;

import java.util.List;
import java.util.stream.Collectors;

public class AttributeModifiers {
    private List<? extends Attribute> attribute;

    public AttributeModifiers(List<? extends Attribute> modifiers) {
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

    public List<? extends Attribute> getAttribute() {
        return attribute;
    }

    public void setAttribute(List<? extends Attribute> attribute) {
        this.attribute = attribute;
    }
}
