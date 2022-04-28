package net.polly.stumped.world.feature;


import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.polly.stumped.StumpedMod;
import net.polly.stumped.block.ModBlocks;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> TEMPLATE_TREE =
            ConfiguredFeatures.register("template_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.TEMPLATE_LOG),
                    new BendingTrunkPlacer(5, 3, 2, 4, UniformIntProvider.create(1, 3)),
                    BlockStateProvider.of(ModBlocks.TEMPLATE_LEAVES),
                    new RandomSpreadFoliagePlacer(UniformIntProvider.create(3, 4), ConstantIntProvider.create(0), ConstantIntProvider.create(3), 68),
                    new TwoLayersFeatureSize(1, 0, 1)).build());
    public static final RegistryEntry<PlacedFeature> TEMPLATE_CHECKED =
            PlacedFeatures.register("template_checked", TEMPLATE_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.TEMPLATE_SAPLING));
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> TEMPLATE_SPAWN =
            ConfiguredFeatures.register("template_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(TEMPLATE_CHECKED, 0.5f)),
                            TEMPLATE_CHECKED));

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> CHERRY_BLOSSOM_TREE =
            ConfiguredFeatures.register("cherry_blossom_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.CHERRY_BLOSSOM_LOG),
                    new BendingTrunkPlacer(5, 3, 2, 4, UniformIntProvider.create(1, 3)),
                    BlockStateProvider.of(ModBlocks.CHERRY_BLOSSOM_LEAVES),
                    new RandomSpreadFoliagePlacer(UniformIntProvider.create(3, 4), ConstantIntProvider.create(0), ConstantIntProvider.create(3), 68),
                    new TwoLayersFeatureSize(1, 0, 1)).build());
    public static final RegistryEntry<PlacedFeature> CHERRY_BLOSSOM_CHECKED =
            PlacedFeatures.register("cherry_blossom_checked", CHERRY_BLOSSOM_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.CHERRY_BLOSSOM_SAPLING));
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> CHERRY_BLOSSOM_SPAWN =
            ConfiguredFeatures.register("cherry_blossom_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(CHERRY_BLOSSOM_CHECKED, 0.5f)),
                            CHERRY_BLOSSOM_CHECKED));

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + StumpedMod.MOD_ID);
    }
}