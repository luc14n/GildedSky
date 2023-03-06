
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gildedsky.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class GildedskyModTabs {
	public static CreativeModeTab TAB_GILDED_SKY;

	public static void load() {
		TAB_GILDED_SKY = new CreativeModeTab("tabgilded_sky") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(GildedskyModBlocks.SKY_STONE_BRICKS.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
