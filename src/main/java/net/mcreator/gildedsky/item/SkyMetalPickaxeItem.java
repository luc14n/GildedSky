
package net.mcreator.gildedsky.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class SkyMetalPickaxeItem extends PickaxeItem {
	public SkyMetalPickaxeItem() {
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
		}, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
