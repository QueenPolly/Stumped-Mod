package net.polly.stumped.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent CHERRY = new FoodComponent.Builder().hunger(1).alwaysEdible().snack().saturationModifier(0.2f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20, 0), 1.0f).build();
    public static final FoodComponent CHERRY_PIE = new FoodComponent.Builder().hunger(6).saturationModifier(0.2f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 0), 1.0f).build();
}
