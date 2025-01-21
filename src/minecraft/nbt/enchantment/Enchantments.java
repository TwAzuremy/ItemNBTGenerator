package minecraft.nbt.enchantment;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Enchantments {
    private Map<EnchantmentType, Integer> enchantments = new HashMap<>();

    public Enchantments(Map<EnchantmentType, Integer> enchantments) {
        this.enchantments = enchantments;
    }

    public Enchantments() {
    }

    public void addEnchantment(EnchantmentType enchantment, int level) {
        enchantments.put(enchantment, level);
    }

    private String format() {
        return enchantments.entrySet().stream()
                .map(entry -> "{id: \"" + entry.getKey().getEnchantment() + "\", lvl: " + entry.getValue() + "s}")
                .collect(Collectors.joining(", "));
    }

    public String toString(Boolean isEnchantmentBook) {
        return (isEnchantmentBook ? "StoredEnchantments" : "Enchantments") + ": [" + format() + "]";
    }
}
