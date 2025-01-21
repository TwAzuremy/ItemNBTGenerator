package minecraft.nbt.modifier.attribute;

public class CustomAttribute implements AttributeType {
    private String namespace;
    private String attributeName;

    public CustomAttribute(String namespace, String attributeName) {
        this.namespace = namespace;
        this.attributeName = attributeName;
    }

    @Override
    public String getAttributeName(int version) {
        return namespace + ":" + attributeName;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
}
