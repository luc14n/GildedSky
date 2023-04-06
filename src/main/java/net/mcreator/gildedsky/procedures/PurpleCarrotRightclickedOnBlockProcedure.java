package net.mcreator.gildedsky.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class PurpleCarrotRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		BlockState blockFarmland = Blocks.AIR.defaultBlockState();
		BlockState blockStag0 = Blocks.AIR.defaultBlockState();
		ItemStack itemSeeds = ItemStack.EMPTY;
		itemSeeds = new ItemStack(GildedskyModItems.DELETED_MOD_ELEMENT.get());
		blockStag0 = GildedskyModItems.DELETED_MOD_ELEMENT.get().defaultBlockState();
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
