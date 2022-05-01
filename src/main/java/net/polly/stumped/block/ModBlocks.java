package net.polly.stumped.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.polly.stumped.StumpedMod;
import net.polly.stumped.block.custom.*;
import net.polly.stumped.block.entity.ModSignTypes;
import net.polly.stumped.item.ModItemGroup;
import net.polly.stumped.world.feature.tree.BlossomSaplingGenerator;
import net.polly.stumped.world.feature.tree.AraucariaSaplingGenerator;

public class ModBlocks {

    //Blossom Blocks
    public static final Block BLOSSOM_LOG = registerBlock("blossom_log",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.STUMPED_BLOCKS);
    public static final Block BLOSSOM_WOOD = registerBlock("blossom_wood",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.STUMPED_BLOCKS);
    public static final Block STRIPPED_BLOSSOM_LOG = registerBlock("stripped_blossom_log",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.STUMPED_BLOCKS);
    public static final Block STRIPPED_BLOSSOM_WOOD = registerBlock("stripped_blossom_wood",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.STUMPED_BLOCKS);
    public static final Block BLOSSOM_PLANKS = registerBlock("blossom_planks",
            new Block(FabricBlockSettings
                    .copy(Blocks.OAK_PLANKS).strength(4.0f).requiresTool()), ModItemGroup.STUMPED_BLOCKS);
    public static final Block BLOSSOM_SLAB = registerBlock("blossom_slab",
            new SlabBlock(FabricBlockSettings
                    .copy(Blocks.OAK_SLAB).strength(4.0f).requiresTool()), ModItemGroup.STUMPED_BLOCKS);
    public static final Block BLOSSOM_STAIRS = registerBlock("blossom_stairs",
            new ModStairsBlock(ModBlocks.BLOSSOM_PLANKS.getDefaultState(), FabricBlockSettings
                    .copy(Blocks.OAK_STAIRS).strength(4.0f).requiresTool()), ModItemGroup.STUMPED_BLOCKS);
    public static final Block BLOSSOM_LEAVES = registerBlock("blossom_leaves",
            new LeavesBlock(FabricBlockSettings
                    .copy(Blocks.OAK_LEAVES).nonOpaque()), ModItemGroup.STUMPED_BLOCKS);
    public static final Block BLOSSOM_FENCE = registerBlock("blossom_fence",
            new FenceBlock(FabricBlockSettings
                    .copy(Blocks.OAK_FENCE).strength(4.0f).requiresTool()), ModItemGroup.STUMPED_BLOCKS);
    public static final Block BLOSSOM_FENCE_GATE = registerBlock("blossom_fence_gate",
            new FenceGateBlock(FabricBlockSettings
                    .copy(Blocks.OAK_FENCE_GATE).strength(4.0f).requiresTool()), ModItemGroup.STUMPED_BLOCKS);
    public static final Block BLOSSOM_BUTTON = registerBlock("blossom_button",
            new ModWoodenButtonBlock(FabricBlockSettings
                    .copy(Blocks.OAK_BUTTON).strength(4.0f).requiresTool().noCollision()), ModItemGroup.STUMPED_BLOCKS);
    public static final Block BLOSSOM_PRESSURE_PLATE = registerBlock("blossom_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings
                    .copy(Blocks.OAK_PRESSURE_PLATE).strength(4.0f).requiresTool()), ModItemGroup.STUMPED_BLOCKS);
    public static final Block BLOSSOM_DOOR = registerBlock("blossom_door",
            new ModDoorBlock(FabricBlockSettings
                    .copy(Blocks.OAK_DOOR).strength(4.0f).requiresTool().nonOpaque()), ModItemGroup.STUMPED_BLOCKS);
    public static final Block BLOSSOM_TRAPDOOR = registerBlock("blossom_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings
                    .copy(Blocks.OAK_TRAPDOOR).strength(4.0f).requiresTool().nonOpaque()), ModItemGroup.STUMPED_BLOCKS);
    public static final Block BLOSSOM_SAPLING = registerBlock("blossom_sapling",
            new ModSaplingBlock(new BlossomSaplingGenerator(),FabricBlockSettings
                    .copy(Blocks.OAK_SAPLING)), ModItemGroup.STUMPED_ITEMS);
    public static final Block POTTED_BLOSSOM_SAPLING = registerBlockWithoutBlockItem("potted_blossom_sapling",
            new FlowerPotBlock(ModBlocks.BLOSSOM_SAPLING, FabricBlockSettings
                    .copy(Blocks.POTTED_OAK_SAPLING).nonOpaque()), ModItemGroup.STUMPED_ITEMS);
    public static final Block BLOSSOM_WALL_SIGN_BLOCK = registerBlockWithoutBlockItem("blossom_wall_sign",
            new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModSignTypes.BLOSSOM), ModItemGroup.STUMPED_ITEMS);
    public static final Block BLOSSOM_SIGN_BLOCK = registerBlockWithoutBlockItem("blossom_sign",
            new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModSignTypes.BLOSSOM), ModItemGroup.STUMPED_ITEMS);

    //Araucaria Blocks
    public static final Block ARAUCARIA_LOG = registerBlock("araucaria_log",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.STUMPED_BLOCKS);
    public static final Block ARAUCARIA_WOOD = registerBlock("araucaria_wood",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.STUMPED_BLOCKS);
    public static final Block STRIPPED_ARAUCARIA_LOG = registerBlock("stripped_araucaria_log",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.STUMPED_BLOCKS);
    public static final Block STRIPPED_ARAUCARIA_WOOD = registerBlock("stripped_araucaria_wood",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.STUMPED_BLOCKS);
    public static final Block ARAUCARIA_PLANKS = registerBlock("araucaria_planks",
            new Block(FabricBlockSettings
                    .copy(Blocks.OAK_PLANKS).strength(4.0f).requiresTool()), ModItemGroup.STUMPED_BLOCKS);
    public static final Block ARAUCARIA_SLAB = registerBlock("araucaria_slab",
            new SlabBlock(FabricBlockSettings
                    .copy(Blocks.OAK_SLAB).strength(4.0f).requiresTool()), ModItemGroup.STUMPED_BLOCKS);
    public static final Block ARAUCARIA_STAIRS = registerBlock("araucaria_stairs",
            new ModStairsBlock(ModBlocks.ARAUCARIA_PLANKS.getDefaultState(), FabricBlockSettings
                    .copy(Blocks.OAK_STAIRS).strength(4.0f).requiresTool()), ModItemGroup.STUMPED_BLOCKS);
    public static final Block ARAUCARIA_LEAVES = registerBlock("araucaria_leaves",
            new LeavesBlock(FabricBlockSettings
                    .copy(Blocks.OAK_LEAVES).nonOpaque()), ModItemGroup.STUMPED_BLOCKS);
    public static final Block ARAUCARIA_FENCE = registerBlock("araucaria_fence",
            new FenceBlock(FabricBlockSettings
                    .copy(Blocks.OAK_FENCE).strength(4.0f).requiresTool()), ModItemGroup.STUMPED_BLOCKS);
    public static final Block ARAUCARIA_FENCE_GATE = registerBlock("araucaria_fence_gate",
            new FenceGateBlock(FabricBlockSettings
                    .copy(Blocks.OAK_FENCE_GATE).strength(4.0f).requiresTool()), ModItemGroup.STUMPED_BLOCKS);
    public static final Block ARAUCARIA_BUTTON = registerBlock("araucaria_button",
            new ModWoodenButtonBlock(FabricBlockSettings
                    .copy(Blocks.OAK_BUTTON).strength(4.0f).requiresTool().noCollision()), ModItemGroup.STUMPED_BLOCKS);
    public static final Block ARAUCARIA_PRESSURE_PLATE = registerBlock("araucaria_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings
                    .copy(Blocks.OAK_PRESSURE_PLATE).strength(4.0f).requiresTool()), ModItemGroup.STUMPED_BLOCKS);
    public static final Block ARAUCARIA_DOOR = registerBlock("araucaria_door",
            new ModDoorBlock(FabricBlockSettings
                    .copy(Blocks.OAK_DOOR).strength(4.0f).requiresTool().nonOpaque()), ModItemGroup.STUMPED_BLOCKS);
    public static final Block ARAUCARIA_TRAPDOOR = registerBlock("araucaria_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings
                    .copy(Blocks.OAK_TRAPDOOR).strength(4.0f).requiresTool().nonOpaque()), ModItemGroup.STUMPED_BLOCKS);
    public static final Block ARAUCARIA_SAPLING = registerBlock("araucaria_sapling",
            new ModSaplingBlock(new AraucariaSaplingGenerator(),FabricBlockSettings
                    .copy(Blocks.OAK_SAPLING)), ModItemGroup.STUMPED_ITEMS);
    public static final Block POTTED_ARAUCARIA_SAPLING = registerBlockWithoutBlockItem("potted_araucaria_sapling",
            new FlowerPotBlock(ModBlocks.ARAUCARIA_SAPLING, FabricBlockSettings
                    .copy(Blocks.POTTED_OAK_SAPLING).nonOpaque()), ModItemGroup.STUMPED_ITEMS);
    public static final Block ARAUCARIA_WALL_SIGN_BLOCK = registerBlockWithoutBlockItem("araucaria_wall_sign",
            new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModSignTypes.ARAUCARIA), ModItemGroup.STUMPED_ITEMS);
    public static final Block ARAUCARIA_SIGN_BLOCK = registerBlockWithoutBlockItem("araucaria_sign",
            new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModSignTypes.ARAUCARIA), ModItemGroup.STUMPED_ITEMS);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(StumpedMod.MOD_ID, name), block);
    }
    public static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(StumpedMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
    private static Block registerBlockWithoutBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.BLOCK, new Identifier(StumpedMod.MOD_ID, name), block);
    }
    public static void registerModBlocks() {
        StumpedMod.LOGGER.info("Registering Mod Blocks for "+StumpedMod.MOD_ID);
    }
}
