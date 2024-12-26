package minecraft.nbt.enchantment;

public enum VANILLA_ENCHANTMENT implements EnchantmentType {
    SWEEPING_EDGE("sweeping_edge"),
    AQUA_AFFINITY("aqua_affinity"),
    DEPTH_STRIDER("depth_strider"),
    RESPIRATION("respiration"),
    LURE("lure"),
    FIRE_ASPECT("fire_aspect"),
    LOOTING("looting"),
    CHANNELING("channeling"),
    LUCK_OF_THE_SEA("luck_of_the_sea"),
    SMITE("smite"),
    FEATHER_FALLING("feather_falling"),
    EFFICIENCY("efficiency"),
    IMPALING("impaling"),
    THORNS("thorns"),
    FLAME("flame"),
    BANE_OF_ARTHROPODS("bane_of_arthropods"),
    FORTUNE("fortune"),
    PUNCH("punch"),
    QUICK_CHARGE("quick_charge"),
    MULTISHOT("multishot"),
    PIERCING("piercing"),
    RIPTIDE("riptide"),
    INFINITY("infinity"),
    LOYALTY("loyalty"),
    BINDING_CURSE("binding_curse"),
    VANISHING_CURSE("vanishing_curse"),
    PROTECTION("protection"),
    BLAST_PROTECTION("blast_protection"),
    FIRE_PROTECTION("fire_protection"),
    PROJECTILE_PROTECTION("projectile_protection"),
    POWER("power"),
    MENDING("mending"),
    KNOCKBACK("knockback"),
    FROST_WALKER("frost_walker"),
    UNBREAKING("unbreaking"),
    SILK_TOUCH("silk_touch"),
    SHARPNESS("sharpness"),
    SOUL_SPEED("soul_speed"),
    SWIFT_SNEAK("swift_sneak"),
    BREACH("breach"),
    DENSITY("density"),
    WIND_BURST("wind_burst");

    private final String enchantment;

    VANILLA_ENCHANTMENT(String enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public String getEnchantment() {
        return enchantment;
    }
}
