
package fsu.gildedsky.gildedsky.item.impl;

import fsu.gildedsky.gildedsky.item.ModItems;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;


public class SkyMetalShovelItem extends ShovelItem {
	public SkyMetalShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 323;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 17;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ModItems.SKY_METAL_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}