package net.polly.stumped.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.polly.stumped.StumpedMod;
import net.polly.stumped.item.ModItemGroup;

public class ModBlocks {

    public static final Block STUMPIUM_BLOCK = registerBlock("stumpium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.STUMPED_BLOCKS);

    public static final Block STUMPIUM_ORE = registerBlock("stumpium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ModItemGroup.STUMPED_BLOCKS);

    public static final Block DEEPSLATE_STUMPIUM_ORE = registerBlock("deepslate_stumpium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.STUMPED_BLOCKS);

    public static final Block NETHERRACK_STUMPIUM_ORE = registerBlock("netherrack_stumpium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool()), ModItemGroup.STUMPED_BLOCKS);

    public static final Block RAW_STUMPIUM_BLOCK = registerBlock("raw_stumpium_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ModItemGroup.STUMPED_BLOCKS);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(StumpedMod.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(StumpedMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        StumpedMod.LOGGER.info("Registering Mod Blocks for "+StumpedMod.MOD_ID);
    }
}
