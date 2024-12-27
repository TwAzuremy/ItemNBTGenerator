package minecraft.nbt.modifier;

import minecraft.nbt.modifier.attribute.AttributeType;
import minecraft.nbt.modifier.operation.OPERATION;
import minecraft.nbt.modifier.slot.SlotType;

public class Attribute {
    private int version;

    private SlotType slot;
    private OPERATION operation = OPERATION.ADD_VALUE;
    private String itemUUID = null;
    private float amount;
    private AttributeType attributeName;

    public Attribute(int version, SlotType slot, float amount, AttributeType attributeName) {
        this.version = version;
        this.slot = slot;
        this.amount = amount;
        this.attributeName = attributeName;
    }

    @Override
    public String toString() {
        return "{" +
                "Operation: " + operation.getValue() +
                ", Amount: " + amount +
                (itemUUID != null ? ", UUID: " + itemUUID : "") +
                ", Slot: \"" + slot + "\"" +
                ", AttributeName: \"" + attributeName.getAttributeName(version) + "\"" +
                "}";
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public SlotType getSlot() {
        return slot;
    }

    public void setSlot(SlotType slot) {
        this.slot = slot;
    }

    public OPERATION getOperation() {
        return operation;
    }

    public void setOperation(OPERATION operation) {
        this.operation = operation;
    }

    public String getItemUUID() {
        return itemUUID;
    }

    public void setItemUUID(String itemUUID) {
        this.itemUUID = itemUUID;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public AttributeType getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(AttributeType attributeName) {
        this.attributeName = attributeName;
    }
}
