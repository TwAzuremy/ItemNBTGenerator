import minecraft.ItemNBT;
import minecraft.attribute.display.Display;
import minecraft.attribute.display.attribute.Text;
import minecraft.attribute.display.color.MINECRAFT_COLOR;
import minecraft.attribute.enchantment.ENCHANTMENT;
import minecraft.attribute.enchantment.EnchantedItem;
import minecraft.attribute.hideFlags.HIDEFLAGS;
import minecraft.attribute.modifier.AttributeModifiers;
import minecraft.attribute.modifier.Attribute;
import minecraft.attribute.modifier.attribute.ATTRIBUTE;
import minecraft.attribute.modifier.slot.SLOT;
import minecraft.attribute.modifier.uuid.MinecraftUUIDGenerator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Example

        // Set the Minecraft version
        int version = 20;

        // Generate an uuid, which is generally possible without using uuid.
        String uuid = MinecraftUUIDGenerator.get();

        // Create Attributes. Here we create two attributes, "max_health" and "armor", and set a series of attributes.
        Attribute max_health = new Attribute(version, SLOT.HEAD, 20.0f, ATTRIBUTE.MAX_HEALTH);
        Attribute armor = new Attribute(version, SLOT.HEAD, 8.0f, ATTRIBUTE.ARMOR);

        // Set the uuid, sometimes it doesn't work if you don't set it.
        max_health.setItemUUID(uuid);
        armor.setItemUUID(uuid);

        // Add attribute to "attributeModifiers"
        AttributeModifiers attributeModifiers = new AttributeModifiers(max_health, armor);

        // Create the text of the name and lore.
        Text name = new Text("Example Helmet", MINECRAFT_COLOR.YELLOW, true, false);
        Text lore_1 = new Text("This is a demonstration helmet.", MINECRAFT_COLOR.PURPLE, false, false);
        Text lore_2 = new Text("It can increase max_health, as well as provide armor.", MINECRAFT_COLOR.PURPLE, false, false);

        // Put name and lore in display.
        Display display = new Display(name, List.of(lore_1, lore_2));

        // Create enchantment. Here a "Protection" is added with a value of 10
        EnchantedItem enchantment = new EnchantedItem();
        enchantment.addEnchantment(ENCHANTMENT.PROTECTION, 10);

        // Add all properties to nbt.
        ItemNBT nbt = new ItemNBT();
        nbt.setAttributeModifiers(attributeModifiers);
        nbt.setDisplay(display);
        nbt.setEnchantment(enchantment);

        // Hide "enchantment" and "unbreakable".
        // But it doesn't seem to be set "unbreakable". All here only hides the effect of "enchantment".
        nbt.setHideFlags(HIDEFLAGS.ENCHANTMENTS, HIDEFLAGS.UNBREAKABLE);

        // Get the string and paste it into your instruction.
        // You can try sticking it to the back of a helmet. Because the example code sets the slot to be the "head".
        System.out.println(nbt);
    }
}