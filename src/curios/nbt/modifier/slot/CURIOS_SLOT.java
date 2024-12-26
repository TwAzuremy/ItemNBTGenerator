package curios.nbt.modifier.slot;

import minecraft.nbt.modifier.slot.SlotEnumType;

public enum CURIOS_SLOT implements SlotEnumType {
    BACK,
    BELT,
    BODY,
    BRACELET,
    CHARM,
    CURIO,
    HANDS,
    HEAD,
    NECKLACE,
    RING;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
