package net.polly.stumped.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.SignItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.polly.stumped.StumpedMod;
import net.polly.stumped.block.ModBlocks;
import net.polly.stumped.block.custom.ModPressurePlateBlock;

public class ModItems {

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(StumpedMod.MOD_ID, name), item);
    }
    public static final Item TEMPLATE_SIGN = registerItem("template_sign",
            new SignItem(new FabricItemSettings().group(ModItemGroup.STUMPED_ITEMS).maxCount(16),
                    ModBlocks.TEMPLATE_SIGN_BLOCK, ModBlocks.TEMPLATE_WALL_SIGN_BLOCK));

    public static final Item CHERRY_BLOSSOM_SIGN = registerItem("cherry_blossom_sign",
            new SignItem(new FabricItemSettings().group(ModItemGroup.STUMPED_ITEMS).maxCount(16),
                    ModBlocks.CHERRY_BLOSSOM_SIGN_BLOCK, ModBlocks.CHERRY_BLOSSOM_WALL_SIGN_BLOCK));

    public static final Item CHERRY = registerItem("cherry",
            new Item(new FabricItemSettings().group(ModItemGroup.STUMPED_ITEMS).food(ModFoodComponents.CHERRY)));

    public static void registerModItems() {
        StumpedMod.LOGGER.info("Registering Mod Items for "+StumpedMod.MOD_ID);
    }
}
