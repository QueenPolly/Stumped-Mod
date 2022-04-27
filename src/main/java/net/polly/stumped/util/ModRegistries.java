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
        StrippableBlockRegistry.register(ModBlocks.TEMPLATE_LOG, ModBlocks.STRIPPED_TEMPLATE_LOG);
        StrippableBlockRegistry.register(ModBlocks.TEMPLATE_WOOD, ModBlocks.STRIPPED_TEMPLATE_WOOD);
    }
    private static void registerFlammableBlock() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();
        instance.add(ModBlocks.TEMPLATE_LOG, 5, 5);
        instance.add(ModBlocks.TEMPLATE_WOOD, 5, 5);
        instance.add(ModBlocks.STRIPPED_TEMPLATE_LOG, 5, 5);
        instance.add(ModBlocks.STRIPPED_TEMPLATE_WOOD, 5, 5);
        instance.add(ModBlocks.TEMPLATE_PLANKS, 5, 20);
        instance.add(ModBlocks.TEMPLATE_SLAB, 5, 20);
        instance.add(ModBlocks.TEMPLATE_STAIRS, 5, 20);
        instance.add(ModBlocks.TEMPLATE_LEAVES, 30, 60);
        instance.add(ModBlocks.TEMPLATE_FENCE_GATE, 5, 20);
        instance.add(ModBlocks.TEMPLATE_FENCE, 5, 20);
    }
}
