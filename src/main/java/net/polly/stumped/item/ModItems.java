package net.polly.stumped.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.polly.stumped.StumpedMod;
import net.polly.stumped.block.ModBlocks;

public class ModItems {

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(StumpedMod.MOD_ID, name), item);
    }

    public static final Item TEST_SIGN = registerItem("test_sign",
            new SignItem(new FabricItemSettings().group(ModItemGroup.STUMPED_ITEMS).maxCount(16),
                    ModBlocks.TEST_SIGN_BLOCK, ModBlocks.TEST_WALL_SIGN_BLOCK));

    public static void registerModItems() {
        StumpedMod.LOGGER.info("Registering Mod Items for "+StumpedMod.MOD_ID);
    }
}
