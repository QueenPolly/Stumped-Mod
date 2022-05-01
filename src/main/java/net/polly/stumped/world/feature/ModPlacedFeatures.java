package net.polly.stumped.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;

public class ModPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> BLOSSOM_PLACED = PlacedFeatures.register("blossom_placed",
            ModConfiguredFeatures.BLOSSOM_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(1, 0.1f, 2)));

    public static final RegistryEntry<PlacedFeature> ARAUCARIA_PLACED = PlacedFeatures.register("araucaria_placed",
            ModConfiguredFeatures.ARAUCARIA_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(1, 0.1f, 2)));
}
