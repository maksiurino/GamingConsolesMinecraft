package net.maksiurino.gamingconsoles;

import net.fabricmc.api.ModInitializer;

import net.maksiurino.gamingconsoles.block.ModBlocks;
import net.maksiurino.gamingconsoles.item.ModItemGroups;
import net.maksiurino.gamingconsoles.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.GeckoLib;

public class GamingConsoles implements ModInitializer {
	public static final String MOD_ID = "gamingconsoles";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		GeckoLib.initialize();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}