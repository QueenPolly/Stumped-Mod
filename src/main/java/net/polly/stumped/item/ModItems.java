package net.polly.stumped.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.polly.stumped.StumpedMod;

public class ModItems {

    public static final Item STUMPIUM_INGOT = registerItem("stumpium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.STUMPED_ITEMS)));

    public static final Item STUMPIUM_NUGGET = registerItem("stumpium_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.STUMPED_ITEMS)));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(StumpedMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        StumpedMod.LOGGER.info("Registering Mod Items for "+StumpedMod.MOD_ID);
    }
}
