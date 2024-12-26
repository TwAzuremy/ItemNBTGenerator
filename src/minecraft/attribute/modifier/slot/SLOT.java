package minecraft.attribute.modifier.slot;

public enum SLOT {
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
