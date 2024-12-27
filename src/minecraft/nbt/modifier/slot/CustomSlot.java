package minecraft.nbt.modifier.slot;

public class CustomSlot implements SlotType {
    private String slot;

    public CustomSlot(String slot) {
        this.slot = slot.toLowerCase();
    }

    @Override
    public String toString() {
        return slot;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }
}
