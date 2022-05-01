package net.polly.stumped.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.polly.stumped.world.feature.ModPlacedFeatures;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;

public class ModTreeGeneration {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BLOSSOM_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.ARAUCARIA_PLACED.getKey().get());
    }
}
