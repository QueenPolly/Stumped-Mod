package net.polly.stumped.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.polly.stumped.block.ModBlocks;

public class ModRegistries {
    public static void registerModStuffs() {
        registerStrippables();
        registerFlammableBlock();
    }

    private static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.TEST_LOG, ModBlocks.STRIPPED_TEST_LOG);
        StrippableBlockRegistry.register(ModBlocks.TEST_WOOD, ModBlocks.STRIPPED_TEST_WOOD);
    }

    private static void registerFlammableBlock() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(ModBlocks.TEST_LOG, 5, 5);
        instance.add(ModBlocks.STRIPPED_TEST_LOG, 5, 5);
        instance.add(ModBlocks.TEST_WOOD, 5, 5);
        instance.add(ModBlocks.STRIPPED_TEST_WOOD, 5, 5);
        instance.add(ModBlocks.TEST_PLANKS, 5, 20);
        instance.add(ModBlocks.TEST_LEAVES, 30, 60);
    }

}
