package minecraft.attribute.modifier;

import minecraft.attribute.modifier.attribute.ATTRIBUTE;
import minecraft.attribute.modifier.operation.OPERATION;
import minecraft.attribute.modifier.slot.SLOT;

public class PropertyModifier {
    private int version;

    private SLOT slot;
    private OPERATION operation = OPERATION.ADD_VALUE;
    private String itemUUID = null;
    private float amount;
    private ATTRIBUTE attributeName;

    public PropertyModifier(int version, SLOT slot, float amount, ATTRIBUTE attributeName) {
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

    public SLOT getSlot() {
        return slot;
    }

    public void setSlot(SLOT slot) {
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

    public ATTRIBUTE getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(ATTRIBUTE attributeName) {
        this.attributeName = attributeName;
    }
}
