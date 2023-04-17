package fsu.gildedsky.gildedsky.item.impl;

import fsu.gildedsky.gildedsky.block.ModBlocks;
import fsu.gildedsky.gildedsky.block.impl.SkyPortalBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.RegistryObject;

public class PurpleCarrotItem extends Item {
    public PurpleCarrotItem(){
        super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f).build()));
    }

    @Override
    public InteractionResult onItemUseFirst(ItemStack stack,  UseOnContext context) {
        LevelAccessor world = context.getLevel();
        BlockState clickBlock = world.getBlockState(context.getClickedPos());
        Player playerEntity = context.getPlayer();
            if (playerEntity != null) {
                BlockState blockFarmland = Blocks.FARMLAND.defaultBlockState();
                BlockState blockStag0 = ModBlocks.PURPLE_CARROT_BLOCK.get().defaultBlockState();
                ItemStack itemSeeds = new ItemStack(this);

                if (playerEntity.getMainHandItem().getItem() == this && clickBlock.getBlock() == blockFarmland.getBlock()
                        /*&& clickBlock.getMaterial() == Material.AIR*/) {
                    world.setBlock(new BlockPos(context.getClickedPos().getX(), context.getClickedPos().getY() + 1, context.getClickedPos().getZ()), blockStag0, 3);
                    itemSeeds.setCount((playerEntity.getMainHandItem().getCount() - 1));
                    playerEntity.setItemInHand(InteractionHand.MAIN_HAND, itemSeeds);
                    playerEntity.getInventory().setChanged();
                }
            }
        return super.onItemUseFirst(stack,context);
    }
    //TODO move to different item
    @Override
    public InteractionResult useOn(UseOnContext context) {
        Player entity = context.getPlayer();
        BlockPos pos = context.getClickedPos().relative(context.getClickedFace());
        ItemStack itemstack = context.getItemInHand();
        Level world = context.getLevel();
        if (!entity.mayUseItemAt(pos, context.getClickedFace(), itemstack)) {
            return InteractionResult.FAIL;
        } else {
            int x = pos.getX();
            int y = pos.getY();
            int z = pos.getZ();
            boolean success = false;
            if (world.isEmptyBlock(pos)) {
                SkyPortalBlock.portalSpawn(world, pos);
                itemstack.hurtAndBreak(1, entity, c -> c.broadcastBreakEvent(context.getHand()));
                success = true;
            }
            return success ? InteractionResult.SUCCESS : InteractionResult.FAIL;
        }
    }
}
