package minecraft.nbt.enchantment;

public class CustomEnchantment implements EnchantmentType{
    private String namespace;
    private String enchantmentId;

    public CustomEnchantment(String namespace, String enchantmentId) {
        this.namespace = namespace;
        this.enchantmentId = enchantmentId;
    }

    @Override
    public String getEnchantment() {
        return namespace + ":" + enchantmentId;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getEnchantmentId() {
        return enchantmentId;
    }

    public void setEnchantmentId(String enchantmentId) {
        this.enchantmentId = enchantmentId;
    }
}
