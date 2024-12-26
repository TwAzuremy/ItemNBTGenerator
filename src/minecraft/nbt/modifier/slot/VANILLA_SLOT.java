package minecraft.nbt.modifier.slot;

public enum VANILLA_SLOT implements SlotEnumType {
    MAINHAND,
    OFFHAND,
    HEAD,
    CHEST,
    LEGS,
    FEET,
    BODY;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
