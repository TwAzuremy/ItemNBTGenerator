package minecraft.attribute.hideFlags;

public enum HIDEFLAGS {
    ENCHANTMENTS(1),
    ATTRIBUTEMODIFIERS(2),
    UNBREAKABLE(4),
    CANDESTROY(8),
    CANPLACE(16),
    OTHER(32),
    COLOR(64),
    TRIM(128);


    private final int value;

    HIDEFLAGS(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
