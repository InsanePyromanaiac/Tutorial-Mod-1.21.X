package net.insanepyromaniac.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.insanepyromaniac.tutorialmod.block.ModBlocks;
import net.insanepyromaniac.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static String ModID = ("tutorialmod");
    public static final Logger LOGGER = LoggerFactory.getLogger(ModID);

	@Override
	public void onInitialize() {

		//register items and blocks
		ModBlocks.registerModblocks();
		ModItems.registerModitems();
	}
}