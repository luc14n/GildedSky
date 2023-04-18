package fsu.gildedsky.gildedsky.item;

import fsu.gildedsky.gildedsky.GildedSky;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ModCreativeModeTab {

    //@Mod.EventBusSubscriber(modid = GildedSky.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static CreativeModeTab GILDEDSKY_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        ModCreativeModeTab.GILDEDSKY_TAB = event.registerCreativeModeTab(new ResourceLocation(GildedSky.MOD_ID, "gildedsky_tab"),
                builder -> builder.title(Component.literal("GildedSky Tab")).icon(
                        () -> new ItemStack(ModItems.SKY_METAL_INGOT.get())).displayItems((params, output, foo) -> {
                    output.accept(ModItems.SKY_STONE.get());
                    output.accept(ModItems.SKY_STONE_SLAB.get());
                    output.accept(ModItems.SKY_STONE_STAIR.get());
                    output.accept(ModItems.SKY_STONE_WALL.get());
                    output.accept(ModItems.SKY_COBBLESTONE.get());
                    output.accept(ModItems.SKY_COBBLESTONE_SLAB.get());
                    output.accept(ModItems.SKY_COBBLESTONE_STAIR.get());
                    output.accept(ModItems.SKY_COBBLESTONE_WALL.get());
                    output.accept(ModItems.SKY_STONE_BRICKS.get());
                    output.accept(ModItems.SKY_STONE_BRICK_SLAB.get());
                    output.accept(ModItems.SKY_STONE_BRICK_STAIR.get());
                    output.accept(ModItems.SKY_STONE_BRICK_WALL.get());
                    output.accept(ModItems.DARK_SKY_STONE.get());
                    output.accept(ModItems.DARK_SKY_STONE_SLAB.get());
                    output.accept(ModItems.DARK_SKY_STONE_STAIR.get());
                    output.accept(ModItems.DARK_SKY_STONE_WALL.get());
                    output.accept(ModItems.DARK_SKY_COBBLESTONE.get());
                    output.accept(ModItems.DARK_SKY_COBBLESTONE_SLAB.get());
                    output.accept(ModItems.DARK_SKY_COBBLESTONE_STAIR.get());
                    output.accept(ModItems.DARK_SKY_COBBLESTONE_WALL.get());
                    output.accept(ModItems.DARK_SKY_STONE_BRICKS.get());
                    output.accept(ModItems.DARK_SKY_STONE_BRICK_SLAB.get());
                    output.accept(ModItems.DARK_SKY_STONE_BRICK_STAIR.get());
                    output.accept(ModItems.DARK_SKY_STONE_BRICK_WALL.get());
                    output.accept(ModItems.GILDED_STONE.get());
                    output.accept(ModItems.GILDED_STONE_SLAB.get());
                    output.accept(ModItems.GILDED_STONE_STAIR.get());
                    output.accept(ModItems.GILDED_STONE_WALL.get());
                    output.accept(ModItems.GILDED_COBBLESTONE.get());
                    output.accept(ModItems.GILDED_COBBLESTONE_SLAB.get());
                    output.accept(ModItems.GILDED_COBBLESTONE_WALL.get());
                    output.accept(ModItems.GILDED_COBBLESTONE_STAIR.get());
                    output.accept(ModItems.GILDED_STONE_BRICKS.get());
                    output.accept(ModItems.GILDED_STONE_BRICK_SLAB.get());
                    output.accept(ModItems.GILDED_STONE_BRICK_STAIR.get());
                    output.accept(ModItems.GILDED_STONE_BRICK_WALL.get());
                    output.accept(ModItems.GILDED_DARK_STONE.get());
                    output.accept(ModItems.GILDED_DARK_STONE_SLAB.get());
                    output.accept(ModItems.GILDED_DARK_STONE_STAIR.get());
                    output.accept(ModItems.GILDED_DARK_STONE_WALL.get());
                    output.accept(ModItems.GILDED_DARK_COBBLESTONE.get());
                    output.accept(ModItems.GILDED_DARK_COBBLESTONE_SLAB.get());
                    output.accept(ModItems.GILDED_DARK_COBBLESTONE_STAIR.get());
                    output.accept(ModItems.GILDED_DARK_COBBLESTONE_WALL.get());
                    output.accept(ModItems.GILDED_DARK_STONE_BRICKS.get());
                    output.accept(ModItems.GILDED_DARK_STONE_BRICK_SLAB.get());
                    output.accept(ModItems.GILDED_DARK_STONE_BRICK_STAIR.get());
                    output.accept(ModItems.GILDED_DARK_STONE_BRICK_WALL.get());
                    output.accept(ModItems.GRAND_OAK_WOOD.get());
                    output.accept(ModItems.GRAND_OAK_LOG.get());
                    output.accept(ModItems.GRAND_OAK_PLANKS.get());
                    output.accept(ModItems.GRAND_OAK_LEAVES.get());
                    output.accept(ModItems.GRAND_OAK_STAIRS.get());
                    output.accept(ModItems.GRAND_OAK_SLAB.get());
                    output.accept(ModItems.GRAND_OAK_FENCE.get());
                    output.accept(ModItems.GRAND_OAK_FENCE_GATE.get());
                    output.accept(ModItems.GRAND_OAK_PRESSURE_PLATE.get());
                    output.accept(ModItems.GRAND_OAK_BUTTON.get());
                    output.accept(ModItems.SKY_METAL_ORE.get());
                    output.accept(ModItems.SKY_METAL_BLOCK.get());
                    output.accept(ModItems.SKY_METAL_AXE.get());
                    output.accept(ModItems.SKY_METAL_PICKAXE.get());
                    output.accept(ModItems.SKY_METAL_SWORD.get());
                    output.accept(ModItems.SKY_METAL_SHOVEL.get());
                    output.accept(ModItems.SKY_METAL_HOE.get());
                    output.accept(ModItems.SKY_METAL_ARMOR_HELMET.get());
                    output.accept(ModItems.SKY_METAL_ARMOR_CHESTPLATE.get());
                    output.accept(ModItems.SKY_METAL_ARMOR_LEGGINGS.get());
                    output.accept(ModItems.SKY_METAL_ARMOR_BOOTS.get());
                    output.accept(ModItems.SHIMMERING_DUST_ORE.get());
                    output.accept(ModItems.SHIMMERING_DUST_BLOCK.get());
                    output.accept(ModItems.SHIMMERING_DUST_DUST.get());
                }));
    }

}
