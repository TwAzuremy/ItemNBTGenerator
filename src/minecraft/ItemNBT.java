package minecraft;

import minecraft.attribute.display.Display;
import minecraft.attribute.enchantment.EnchantedItem;
import minecraft.attribute.modifier.AttributeModifiers;

public class ItemNBT {
    private AttributeModifiers attributeModifiers;
    private Display display;
    private EnchantedItem enchantment;

    private int CustomModelData;
    private int Damage;
    private int RepairCost;
    private Boolean unBreakable = false;

    public ItemNBT() {}

    @Override
    public String toString() {
        return "{" +
                (attributeModifiers != null ? attributeModifiers + ", " : "") +
                (display != null ? display + ", " : "") +
                (enchantment != null ? enchantment + ", " : "") +
                (CustomModelData != 0 ? "CustomModelData: " + CustomModelData + ", " : "") +
                (Damage != 0 ? "Damage: " + Damage + ", " : "") +
                (RepairCost != 0 ? "RepairCost: " + RepairCost + ", " : "") +
                "Unbreakable: " + (unBreakable ? "1b" : "0b") +
                '}';
    }

    public AttributeModifiers getAttributeModifiers() {
        return attributeModifiers;
    }

    public void setAttributeModifiers(AttributeModifiers attributeModifiers) {
        this.attributeModifiers = attributeModifiers;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public EnchantedItem getEnchantment() {
        return enchantment;
    }

    public void setEnchantment(EnchantedItem enchantment) {
        this.enchantment = enchantment;
    }

    public int getCustomModelData() {
        return CustomModelData;
    }

    public void setCustomModelData(int customModelData) {
        CustomModelData = customModelData;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public int getRepairCost() {
        return RepairCost;
    }

    public void setRepairCost(int repairCost) {
        RepairCost = repairCost;
    }

    public Boolean getUnBreakable() {
        return unBreakable;
    }

    public void setUnBreakable(Boolean unBreakable) {
        this.unBreakable = unBreakable;
    }
}
