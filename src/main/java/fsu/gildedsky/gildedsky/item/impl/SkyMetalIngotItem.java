
package fsu.gildedsky.gildedsky.item.impl;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class SkyMetalIngotItem extends Item {
	public SkyMetalIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
