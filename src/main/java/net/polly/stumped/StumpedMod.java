package net.polly.stumped;

import net.fabricmc.api.ModInitializer;
import net.polly.stumped.block.ModBlocks;
import net.polly.stumped.item.ModItems;
import net.polly.stumped.util.ModRegistries;
import net.polly.stumped.world.feature.ModConfiguredFeatures;
import net.polly.stumped.world.gen.ModWorldGen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StumpedMod implements ModInitializer {
	public static final String MOD_ID = "stumped";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModConfiguredFeatures.registerConfiguredFeatures();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRegistries.registerModStuffs();
		ModWorldGen.generateModWorldGen();
	}
}
