package minecraft.nbt.modifier.slot;

public class CustomSlot implements SlotEnumType {
    private final String slot;

    public CustomSlot(String slot) {
        this.slot = slot.toLowerCase();
    }

    @Override
    public String toString() {
        return slot;
    }
}
