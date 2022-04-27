package net.polly.stumped.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;

public class ModPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> TEMPLATE_PLACED = PlacedFeatures.register("template_placed",
            ModConfiguredFeatures.TEMPLATE_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(1, 0.1f, 2)));


}
