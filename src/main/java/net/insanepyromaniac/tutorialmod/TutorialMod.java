package net.insanepyromaniac.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.insanepyromaniac.tutorialmod.block.ModBlocks;
import net.insanepyromaniac.tutorialmod.item.ModItemGroups;
import net.insanepyromaniac.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static String ModID = ("tutorialmod");
    public static final Logger LOGGER = LoggerFactory.getLogger(ModID);

	@Override
	public void onInitialize() {
		//register Item Groups
		ModItemGroups.registerItemGroup();
		//register blocks
		ModBlocks.registerModblocks();
		//register items
		ModItems.registerModitems();
	}
}