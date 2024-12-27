package curios.nbt.modifier;

import minecraft.nbt.modifier.Attribute;
import minecraft.nbt.modifier.attribute.AttributeType;
import minecraft.nbt.modifier.slot.SlotType;

public class CuriosAttribute extends Attribute {
    private AttributeType name;

    public CuriosAttribute(int version, SlotType slot, float amount, AttributeType attributeName, AttributeType name) {
        super(version, slot, amount, attributeName);
        this.name = name;
    }

    public CuriosAttribute(int version, SlotType slot, float amount, AttributeType attributeName) {
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

    public AttributeType getName() {
        return name;
    }

    public void setName(AttributeType name) {
        this.name = name;
    }
}
