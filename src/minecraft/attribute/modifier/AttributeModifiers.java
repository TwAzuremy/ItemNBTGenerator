package minecraft.attribute.modifier;

import java.util.List;
import java.util.stream.Collectors;

public class AttributeModifiers {
    private List<PropertyModifier> modifiers;

    public AttributeModifiers(List<PropertyModifier> modifiers) {
        this.modifiers = modifiers;
    }

    public AttributeModifiers(PropertyModifier... modifiers) {
        this.modifiers = List.of(modifiers);
    }

    @Override
    public String toString() {
        return "AttributeModifiers: [" +
                modifiers.stream().map(PropertyModifier::toString).collect(Collectors.joining(", "))
                + "]";
    }

    public List<PropertyModifier> getModifiers() {
        return modifiers;
    }

    public void setModifiers(List<PropertyModifier> modifiers) {
        this.modifiers = modifiers;
    }
}
