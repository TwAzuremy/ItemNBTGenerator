package curios.nbt.modifier;

import minecraft.nbt.modifier.Attribute;
import minecraft.nbt.modifier.AttributeModifiers;

import java.util.List;
import java.util.stream.Collectors;

public class CuriosAttributeModifiers extends AttributeModifiers {
    public CuriosAttributeModifiers(List<? extends Attribute> modifiers) {
        super(modifiers);
    }

    public CuriosAttributeModifiers(Attribute... modifiers) {
        super(modifiers);
    }

    @Override
    public String toString() {
        return "CurioAttributeModifiers: [" +
                super.getAttribute().stream().map(Attribute::toString).collect(Collectors.joining(", "))
                + "]";
    }
}
