
package net.mcreator.gildedsky.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.gildedsky.init.GildedskyModItems;

public class SkyMetalSwordItem extends SwordItem {
	public SkyMetalSwordItem() {
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
				return Ingredient.of(new ItemStack(GildedskyModItems.SKY_METAL_INGOT.get()));
			}
		}, 3, -3f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
	}
}
