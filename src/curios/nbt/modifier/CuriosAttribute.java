package curios.nbt.modifier;

import minecraft.nbt.modifier.Attribute;
import minecraft.nbt.modifier.attribute.AttributeEnumType;
import minecraft.nbt.modifier.slot.SlotEnumType;

public class CuriosAttribute extends Attribute {
    private AttributeEnumType name;

    public CuriosAttribute(int version, SlotEnumType slot, float amount, AttributeEnumType attributeName, AttributeEnumType name) {
        super(version, slot, amount, attributeName);
        this.name = name;
    }

    public CuriosAttribute(int version, SlotEnumType slot, float amount, AttributeEnumType attributeName) {
        super(version, slot, amount, attributeName);
        this.name = attributeName;
    }

    @Override
    public String toString() {
        return "{" +
                "Operation: " + super.getOperation().getValue() +
                ", Amount: " + super.getAmount() +
                (super.getItemUUID() != null ? ", UUID: " + super.getItemUUID() : "") +
                ", Slot: \"" + super.getSlot() + "\"" +
                ", AttributeName: \"" + super.getAttributeName().getAttributeName(super.getVersion()) + "\"" +
                ", Name: \"" + name.getAttributeName(super.getVersion()) + "\"" +
                "}";
    }

    public AttributeEnumType getName() {
        return name;
    }

    public void setName(AttributeEnumType name) {
        this.name = name;
    }
}
