package minecraft.attribute.enchantment;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class EnchantedItem {
    private Map<ENCHANTMENT, Integer> enchantments = new HashMap<>();

    public EnchantedItem(Map<ENCHANTMENT, Integer> enchantments) {
        this.enchantments = enchantments;
    }

    public EnchantedItem() {}

    public void addEnchantment(ENCHANTMENT enchantment, int level) {
        enchantments.put(enchantment, level);
    }

    @Override
    public String toString() {
        String format = enchantments.entrySet().stream()
                .map(entry -> "{id: \"" + entry.getKey().getEnchantment() + "\", lvl: " + entry.getValue() + "s}")
                .collect(Collectors.joining(", "));

        return "Enchantments: [" + format + "]";
    }
}
