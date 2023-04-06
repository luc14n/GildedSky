package net.mcreator.gildedsky.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.BlockPos;

import net.mcreator.gildedsky.init.GildedskyModItems;
import net.mcreator.gildedsky.init.GildedskyModBlocks;

public class PurpleCarrotRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		BlockState blockFarmland = Blocks.AIR.defaultBlockState();
		BlockState blockStag0 = Blocks.AIR.defaultBlockState();
		ItemStack itemSeeds = ItemStack.EMPTY;
		itemSeeds = new ItemStack(GildedskyModItems.PURPLE_CARROT.get());
		blockStag0 = GildedskyModBlocks.PURPLECARROTSTAGE_0.get().defaultBlockState();
		blockFarmland = Blocks.FARMLAND.defaultBlockState();
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemSeeds.getItem() && (world.getBlockState(new BlockPos(x, y, z))).getBlock() == blockFarmland.getBlock()
				&& (world.getBlockState(new BlockPos(x, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR) {
			world.setBlock(new BlockPos(x, y + 1, z), blockStag0, 3);
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = itemSeeds;
				_setstack.setCount((int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount() - 1));
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
	}
}
