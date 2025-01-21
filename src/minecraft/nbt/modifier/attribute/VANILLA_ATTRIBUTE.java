package minecraft.nbt.modifier.attribute;

import utils.Utils;

public enum VANILLA_ATTRIBUTE implements AttributeType {
    ARMOR("armor"),
    ARMOR_TOUGHNESS("armor_toughness"),
    ATTACK_DAMAGE("attackDamage"),
    ATTACK_SPEED("attackSpeed"),
    BURNING_TIME("burnTime"),
    EXPLOSION_KNOCKBACK_RESISTANCE("explosion_resistance"),
    FALL_DAMAGE_MULTIPLIER("fall_damage_multiplier"),
    FLYING_SPEED("flying_speed"),
    FOLLOW_RANGE("follow_range"),
    GRAVITY("gravity"),
    JUMP_STRENGTH("jump_strength"),
    KNOCKBACK_RESISTANCE("knockback_resistance"),
    LUCK("luck"),
    MAX_ABSORPTION("max_absorption"),
    MAX_HEALTH("max_health"),
    MOVEMENT_EFFICIENCY("movement_efficiency"),
    MOVEMENT_SPEED("movement_speed"),
    OXYGEN_BONUS("oxygen_bonus"),
    SAFE_FALL_DISTANCE("safe_fall_distance"),
    SCALE("scale"),
    STEP_HEIGHT("step_height"),
    WATER_MOVEMENT_EFFICIENCY("water_movement_efficiency"),
    BLOCK_BREAK_SPEED("block_break_speed"),
    BLOCK_INTERACTION_RANGE("block_interaction_range"),
    ENTITY_INTERACTION_RANGE("entity_interaction_range"),
    MINING_EFFICIENCY("mining_speed"),
    SNEAKING_SPEED("sneaking_speed"),
    SUBMERGED_MINING_SPEED("submerged_mining_speed"),
    SWEEPING_DAMAGE_RATIO("sweeping_damage_ratio"),
    SPAWN_REINFORCEMENTS("spawn_reinforcements");

    private final String attributeName;

    VANILLA_ATTRIBUTE(String attributeName) {
        this.attributeName = attributeName;
    }

    @Override
    public String getAttributeName(int version) {
        String namespace = "minecraft";

        return namespace + ":" + switch (version) {
            case 14, 15 -> "generic." + Utils.snakeToLowerCamel(attributeName);
            case 16, 17, 18, 19, 20 -> "generic." + attributeName;
            default -> attributeName;
        };
    }
}
