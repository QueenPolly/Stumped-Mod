package net.polly.stumped.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.polly.stumped.StumpedMod;
import net.polly.stumped.block.ModBlocks;

public class ModItemGroup {
    public static final ItemGroup STUMPED_BLOCKS = FabricItemGroupBuilder.build(new Identifier(StumpedMod.MOD_ID, "stumped_blocks"),
            () -> new ItemStack(ModBlocks.STUMPIUM_BLOCK));

    public static final ItemGroup STUMPED_ITEMS = FabricItemGroupBuilder.build(new Identifier(StumpedMod.MOD_ID, "stumped_items"),
            () -> new ItemStack(ModItems.STUMPIUM_INGOT));
}
