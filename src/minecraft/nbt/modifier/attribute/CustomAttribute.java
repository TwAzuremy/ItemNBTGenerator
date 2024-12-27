package minecraft.nbt.modifier.attribute;

public class CustomAttribute implements AttributeType {
    private String attributeName;

    public CustomAttribute(String attributeName) {
        this.attributeName = attributeName;
    }

    @Override
    public String getAttributeName(int version) {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }
}
