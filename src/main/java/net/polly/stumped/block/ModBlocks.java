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
import net.polly.stumped.world.feature.tree.TestSaplingGenerator;

public class ModBlocks {

    //Test Blocks

    public static final Block TEST_LOG = registerBlock("test_log",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.STUMPED_BLOCKS);

    public static final Block TEST_WOOD = registerBlock("test_wood",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.STUMPED_BLOCKS);

    public static final Block STRIPPED_TEST_LOG = registerBlock("stripped_test_log",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_OAK_LOG).strength(4.0f).requiresTool()), ModItemGroup.STUMPED_BLOCKS);

    public static final Block STRIPPED_TEST_WOOD = registerBlock("stripped_test_wood",
            new PillarBlock(FabricBlockSettings
                    .copy(Blocks.STRIPPED_OAK_WOOD).strength(4.0f).requiresTool()), ModItemGroup.STUMPED_BLOCKS);

    public static final Block TEST_PLANKS = registerBlock("test_planks",
            new Block(FabricBlockSettings
                    .copy(Blocks.OAK_PLANKS).strength(4.0f).requiresTool()), ModItemGroup.STUMPED_BLOCKS);

    public static final Block TEST_BUTTON = registerBlock("test_button",
            new ModWoodenButtonBlock(FabricBlockSettings
                    .copy(Blocks.OAK_BUTTON).strength(4.0f).requiresTool().noCollision()), ModItemGroup.STUMPED_BLOCKS);

    public static final Block TEST_PRESSURE_PLATE = registerBlock("test_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings
                    .copy(Blocks.OAK_PRESSURE_PLATE).strength(4.0f).requiresTool()), ModItemGroup.STUMPED_BLOCKS);

    public static final Block TEST_FENCE = registerBlock("test_fence",
            new FenceBlock(FabricBlockSettings
                    .copy(Blocks.OAK_FENCE).strength(4.0f).requiresTool()), ModItemGroup.STUMPED_BLOCKS);

    public static final Block TEST_FENCE_GATE = registerBlock("test_fence_gate",
            new FenceGateBlock(FabricBlockSettings
                    .copy(Blocks.OAK_FENCE_GATE).strength(4.0f).requiresTool()), ModItemGroup.STUMPED_BLOCKS);

    public static final Block TEST_SLAB = registerBlock("test_slab",
            new SlabBlock(FabricBlockSettings
                    .copy(Blocks.OAK_SLAB).strength(4.0f).requiresTool()), ModItemGroup.STUMPED_BLOCKS);

    public static final Block TEST_STAIRS = registerBlock("test_stairs",
            new ModStairsBlock(ModBlocks.TEST_PLANKS.getDefaultState(), FabricBlockSettings
                    .copy(Blocks.OAK_STAIRS).strength(4.0f).requiresTool()), ModItemGroup.STUMPED_BLOCKS);

    public static final Block TEST_DOOR = registerBlock("test_door",
            new ModDoorBlock(FabricBlockSettings
                    .copy(Blocks.OAK_DOOR).strength(4.0f).requiresTool().nonOpaque()), ModItemGroup.STUMPED_BLOCKS);

    public static final Block TEST_TRAPDOOR = registerBlock("test_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings
                    .copy(Blocks.OAK_TRAPDOOR).strength(4.0f).requiresTool().nonOpaque()), ModItemGroup.STUMPED_BLOCKS);

    public static final Block TEST_LEAVES = registerBlock("test_leaves",
            new LeavesBlock(FabricBlockSettings
                    .copy(Blocks.OAK_LEAVES).nonOpaque()), ModItemGroup.STUMPED_BLOCKS);

    public static final Block TEST_SAPLING = registerBlock("test_sapling",
            new ModSaplingBlock(new TestSaplingGenerator(),FabricBlockSettings
                    .copy(Blocks.OAK_SAPLING)), ModItemGroup.STUMPED_ITEMS);

    public static final Block POTTED_TEST_SAPLING = registerBlockWithoutBlockItem("potted_test_sapling",
            new FlowerPotBlock(ModBlocks.TEST_SAPLING, FabricBlockSettings
                    .copy(Blocks.POTTED_OAK_SAPLING).nonOpaque()), ModItemGroup.STUMPED_ITEMS);

    public static final Block TEST_WALL_SIGN_BLOCK = registerBlockWithoutBlockItem("test_wall_sign",
            new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModSignTypes.TEST), ModItemGroup.STUMPED_ITEMS);

    public static final Block TEST_SIGN_BLOCK = registerBlockWithoutBlockItem("test_sign",
            new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModSignTypes.TEST), ModItemGroup.STUMPED_ITEMS);




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
