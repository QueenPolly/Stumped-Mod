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
        StrippableBlockRegistry.register(ModBlocks.CHERRY_BLOSSOM_LOG, ModBlocks.STRIPPED_CHERRY_BLOSSOM_LOG);
        StrippableBlockRegistry.register(ModBlocks.CHERRY_BLOSSOM_WOOD, ModBlocks.STRIPPED_CHERRY_BLOSSOM_WOOD);
    }
    private static void registerFlammableBlock() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(ModBlocks.CHERRY_BLOSSOM_LOG, 5, 5);
        instance.add(ModBlocks.CHERRY_BLOSSOM_WOOD, 5, 5);
        instance.add(ModBlocks.STRIPPED_CHERRY_BLOSSOM_LOG, 5, 5);
        instance.add(ModBlocks.STRIPPED_CHERRY_BLOSSOM_WOOD, 5, 5);
        instance.add(ModBlocks.CHERRY_BLOSSOM_PLANKS, 5, 20);
        instance.add(ModBlocks.CHERRY_BLOSSOM_SLAB, 5, 20);
        instance.add(ModBlocks.CHERRY_BLOSSOM_STAIRS, 5, 20);
        instance.add(ModBlocks.CHERRY_BLOSSOM_LEAVES, 30, 60);
        instance.add(ModBlocks.CHERRY_BLOSSOM_FENCE_GATE, 5, 20);
        instance.add(ModBlocks.CHERRY_BLOSSOM_FENCE, 5, 20);
    }
}
