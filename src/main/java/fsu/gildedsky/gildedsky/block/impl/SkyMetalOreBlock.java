
package fsu.gildedsky.gildedsky.block.impl;

import fsu.gildedsky.gildedsky.item.ModItems;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;


import java.util.List;
import java.util.Collections;

public class SkyMetalOreBlock extends Block {
	public SkyMetalOreBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(3.5999999999999996f, 5.785155024015763f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof PickaxeItem tieredItem)
			return tieredItem.getTier().getLevel() >= 2;
		return false;
	}
//TODO reimplement
//	@Override
//	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
//		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
//		if (!dropsOriginal.isEmpty())
//			return dropsOriginal;
//		return Collections.singletonList(new ItemStack(ModItems.SKY_METAL_INGOT.get()));
//	}
}
