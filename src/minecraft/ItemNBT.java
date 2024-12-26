package minecraft;

import minecraft.nbt.display.Display;
import minecraft.nbt.enchantment.Enchantments;
import minecraft.nbt.hideFlags.HIDEFLAGS;
import minecraft.nbt.modifier.AttributeModifiers;

import java.util.Arrays;

public class ItemNBT {
    private AttributeModifiers attributeModifiers;
    private Display display;
    private Enchantments enchantment;

    private int CustomModelData;
    private int Damage;
    private int RepairCost;
    private Boolean unBreakable = false;
    private int hideFlags = 0;

    public ItemNBT() {
    }

    @Override
    public String toString() {
        return "{" +
                (attributeModifiers != null ? attributeModifiers + ", " : "") +
                (display != null ? display + ", " : "") +
                (enchantment != null ? enchantment + ", " : "") +
                (CustomModelData != 0 ? "CustomModelData: " + CustomModelData + ", " : "") +
                (Damage != 0 ? "Damage: " + Damage + ", " : "") +
                (RepairCost != 0 ? "RepairCost: " + RepairCost + ", " : "") +
                (hideFlags != 0 ? "HideFlags: " + hideFlags + ", " : "") +
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

    public Enchantments getEnchantment() {
        return enchantment;
    }

    public void setEnchantment(Enchantments enchantment) {
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

    public int getHideFlags() {
        return hideFlags;
    }

    /**
     * Set the flags you want to hide
     * @param hideFlags the flags you want to hide
     */
    public void setHideFlags(HIDEFLAGS... hideFlags) {
        this.hideFlags = Arrays.stream(hideFlags)
                .mapToInt(HIDEFLAGS::getValue)
                .reduce(0, (a, b) -> a | b);
    }
}
