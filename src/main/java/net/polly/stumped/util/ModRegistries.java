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
        StrippableBlockRegistry.register(ModBlocks.BLOSSOM_LOG, ModBlocks.STRIPPED_BLOSSOM_LOG);
        StrippableBlockRegistry.register(ModBlocks.BLOSSOM_WOOD, ModBlocks.STRIPPED_BLOSSOM_WOOD);

        StrippableBlockRegistry.register(ModBlocks.ARAUCARIA_LOG, ModBlocks.STRIPPED_ARAUCARIA_LOG);
        StrippableBlockRegistry.register(ModBlocks.ARAUCARIA_WOOD, ModBlocks.STRIPPED_ARAUCARIA_WOOD);
    }
    private static void registerFlammableBlock() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(ModBlocks.BLOSSOM_LOG, 5, 5);
        instance.add(ModBlocks.BLOSSOM_WOOD, 5, 5);
        instance.add(ModBlocks.STRIPPED_BLOSSOM_LOG, 5, 5);
        instance.add(ModBlocks.STRIPPED_BLOSSOM_WOOD, 5, 5);
        instance.add(ModBlocks.BLOSSOM_PLANKS, 5, 20);
        instance.add(ModBlocks.BLOSSOM_SLAB, 5, 20);
        instance.add(ModBlocks.BLOSSOM_STAIRS, 5, 20);
        instance.add(ModBlocks.BLOSSOM_LEAVES, 30, 60);
        instance.add(ModBlocks.BLOSSOM_FENCE_GATE, 5, 20);
        instance.add(ModBlocks.BLOSSOM_FENCE, 5, 20);

        instance.add(ModBlocks.ARAUCARIA_LOG, 5, 5);
        instance.add(ModBlocks.ARAUCARIA_WOOD, 5, 5);
        instance.add(ModBlocks.STRIPPED_ARAUCARIA_LOG, 5, 5);
        instance.add(ModBlocks.STRIPPED_ARAUCARIA_WOOD, 5, 5);
        instance.add(ModBlocks.ARAUCARIA_PLANKS, 5, 20);
        instance.add(ModBlocks.ARAUCARIA_SLAB, 5, 20);
        instance.add(ModBlocks.ARAUCARIA_STAIRS, 5, 20);
        instance.add(ModBlocks.ARAUCARIA_LEAVES, 30, 60);
        instance.add(ModBlocks.ARAUCARIA_FENCE_GATE, 5, 20);
        instance.add(ModBlocks.ARAUCARIA_FENCE, 5, 20);
    }
}
