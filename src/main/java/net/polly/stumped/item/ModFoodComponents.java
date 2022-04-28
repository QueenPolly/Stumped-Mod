package net.polly.stumped.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent CHERRY = new FoodComponent.Builder().hunger(1).alwaysEdible().snack().saturationModifier(0.2f).build();
}
