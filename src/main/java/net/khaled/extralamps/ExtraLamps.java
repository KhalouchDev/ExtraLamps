package net.khaled.extralamps;

import net.fabricmc.api.ModInitializer;
import net.khaled.extralamps.block.ModBlocks;
import net.khaled.extralamps.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExtraLamps implements ModInitializer {
	public static final String MOD_ID = "extralamps";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
