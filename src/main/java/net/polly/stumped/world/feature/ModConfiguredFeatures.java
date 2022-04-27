package net.polly.stumped.world.feature;

import net.polly.stumped.StumpedMod;
import net.polly.stumped.block.ModBlocks;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> TEST_TREE =
            ConfiguredFeatures.register("test_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.TEST_LOG),
                    new StraightTrunkPlacer(5, 6, 3),
                    BlockStateProvider.of(ModBlocks.TEST_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final RegistryEntry<PlacedFeature> TEST_CHECKED =
            PlacedFeatures.register("test_checked", TEST_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.TEST_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> TEST_SPAWN =
            ConfiguredFeatures.register("test_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(TEST_CHECKED, 0.5f)),
                            TEST_CHECKED));


    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + StumpedMod.MOD_ID);
    }
}