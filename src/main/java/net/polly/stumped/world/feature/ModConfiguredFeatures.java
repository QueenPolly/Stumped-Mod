package net.polly.stumped.world.feature;

import net.minecraft.block.Blocks;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.size.ThreeLayersFeatureSize;
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
import java.util.OptionalInt;

public class ModConfiguredFeatures {

    //Blossom
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> BLOSSOM_TREE =
            ConfiguredFeatures.register("blossom_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.BLOSSOM_LOG),
                    new ForkingTrunkPlacer(3, 4, 3),
                    BlockStateProvider.of(ModBlocks.BLOSSOM_LEAVES),
                    new RandomSpreadFoliagePlacer(UniformIntProvider.create(2, 4), ConstantIntProvider.create(0), ConstantIntProvider.create(3), 90),
                    new TwoLayersFeatureSize(2, 1, 4))
                    .ignoreVines().build());

    public static final RegistryEntry<PlacedFeature> BLOSSOM_CHECKED =
            PlacedFeatures.register("blossom_checked", BLOSSOM_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.BLOSSOM_SAPLING));
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> BLOSSOM_SPAWN =
            ConfiguredFeatures.register("blossom_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(BLOSSOM_CHECKED, 0.2f)),
                            BLOSSOM_CHECKED));

    //Monkey Puzzle
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> ARAUCARIA_TREE =
            ConfiguredFeatures.register("araucaria_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.ARAUCARIA_LOG),
                    new StraightTrunkPlacer(10, 5, 5),
                    BlockStateProvider.of(ModBlocks.ARAUCARIA_LEAVES),
                    new LargeOakFoliagePlacer(UniformIntProvider.create(2,4), ConstantIntProvider.create(1), 3),
                    new TwoLayersFeatureSize(0, 0, 0,OptionalInt.of(4)))
                    .ignoreVines().build());

    public static final RegistryEntry<PlacedFeature> ARAUCARIA_CHECKED =
            PlacedFeatures.register("araucaria_checked", ARAUCARIA_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.ARAUCARIA_SAPLING));
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> ARAUCARIA_SPAWN =
            ConfiguredFeatures.register("araucaria_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(ARAUCARIA_CHECKED, 0.2f)),
                            ARAUCARIA_CHECKED));

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + StumpedMod.MOD_ID);
    }
}