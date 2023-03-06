
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gildedsky.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.gildedsky.block.SkyStoneWallBlock;
import net.mcreator.gildedsky.block.SkyStoneStairBlock;
import net.mcreator.gildedsky.block.SkyStoneSlabBlock;
import net.mcreator.gildedsky.block.SkyStoneBricksBlock;
import net.mcreator.gildedsky.block.SkyStoneBrickWallBlock;
import net.mcreator.gildedsky.block.SkyStoneBrickStairBlock;
import net.mcreator.gildedsky.block.SkyStoneBrickSlabBlock;
import net.mcreator.gildedsky.block.SkyStoneBlock;
import net.mcreator.gildedsky.block.SkyMetalOreBlock;
import net.mcreator.gildedsky.block.SkyMetalBlockBlock;
import net.mcreator.gildedsky.block.SkyCobblestoneWallBlock;
import net.mcreator.gildedsky.block.SkyCobblestoneStairBlock;
import net.mcreator.gildedsky.block.SkyCobblestoneSlabBlock;
import net.mcreator.gildedsky.block.SkyCobblestoneBlock;
import net.mcreator.gildedsky.block.GildedStoneWallBlock;
import net.mcreator.gildedsky.block.GildedStoneStairBlock;
import net.mcreator.gildedsky.block.GildedStoneSlabBlock;
import net.mcreator.gildedsky.block.GildedStoneBricksBlock;
import net.mcreator.gildedsky.block.GildedStoneBrickWallBlock;
import net.mcreator.gildedsky.block.GildedStoneBrickStairBlock;
import net.mcreator.gildedsky.block.GildedStoneBrickSlabBlock;
import net.mcreator.gildedsky.block.GildedStoneBlock;
import net.mcreator.gildedsky.block.GildedDarkStoneWallBlock;
import net.mcreator.gildedsky.block.GildedDarkStoneStairBlock;
import net.mcreator.gildedsky.block.GildedDarkStoneSlabBlock;
import net.mcreator.gildedsky.block.GildedDarkStoneBricksBlock;
import net.mcreator.gildedsky.block.GildedDarkStoneBrickWallBlock;
import net.mcreator.gildedsky.block.GildedDarkStoneBrickStairBlock;
import net.mcreator.gildedsky.block.GildedDarkStoneBrickSlabBlock;
import net.mcreator.gildedsky.block.GildedDarkStoneBlock;
import net.mcreator.gildedsky.block.GildedDarkCobblestoneWallBlock;
import net.mcreator.gildedsky.block.GildedDarkCobblestoneStairBlock;
import net.mcreator.gildedsky.block.GildedDarkCobblestoneSlabBlock;
import net.mcreator.gildedsky.block.GildedDarkCobblestoneBlock;
import net.mcreator.gildedsky.block.GildedCobblestoneWallBlock;
import net.mcreator.gildedsky.block.GildedCobblestoneStairBlock;
import net.mcreator.gildedsky.block.GildedCobblestoneSlabBlock;
import net.mcreator.gildedsky.block.GildedCobblestoneBlock;
import net.mcreator.gildedsky.block.DarkSkyStoneWallBlock;
import net.mcreator.gildedsky.block.DarkSkyStoneStairBlock;
import net.mcreator.gildedsky.block.DarkSkyStoneSlabBlock;
import net.mcreator.gildedsky.block.DarkSkyStoneBricksBlock;
import net.mcreator.gildedsky.block.DarkSkyStoneBrickWallBlock;
import net.mcreator.gildedsky.block.DarkSkyStoneBrickStairBlock;
import net.mcreator.gildedsky.block.DarkSkyStoneBrickSlabBlock;
import net.mcreator.gildedsky.block.DarkSkyStoneBlock;
import net.mcreator.gildedsky.block.DarkSkyCobblestoneWallBlock;
import net.mcreator.gildedsky.block.DarkSkyCobblestoneStairBlock;
import net.mcreator.gildedsky.block.DarkSkyCobblestoneSlabBlock;
import net.mcreator.gildedsky.block.DarkSkyCobblestoneBlock;
import net.mcreator.gildedsky.GildedskyMod;

public class GildedskyModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GildedskyMod.MODID);
	public static final RegistryObject<Block> SKY_STONE = REGISTRY.register("sky_stone", () -> new SkyStoneBlock());
	public static final RegistryObject<Block> SKY_STONE_SLAB = REGISTRY.register("sky_stone_slab", () -> new SkyStoneSlabBlock());
	public static final RegistryObject<Block> SKY_STONE_STAIR = REGISTRY.register("sky_stone_stair", () -> new SkyStoneStairBlock());
	public static final RegistryObject<Block> SKY_STONE_WALL = REGISTRY.register("sky_stone_wall", () -> new SkyStoneWallBlock());
	public static final RegistryObject<Block> SKY_COBBLESTONE = REGISTRY.register("sky_cobblestone", () -> new SkyCobblestoneBlock());
	public static final RegistryObject<Block> SKY_COBBLESTONE_SLAB = REGISTRY.register("sky_cobblestone_slab", () -> new SkyCobblestoneSlabBlock());
	public static final RegistryObject<Block> SKY_COBBLESTONE_STAIR = REGISTRY.register("sky_cobblestone_stair",
			() -> new SkyCobblestoneStairBlock());
	public static final RegistryObject<Block> SKY_COBBLESTONE_WALL = REGISTRY.register("sky_cobblestone_wall", () -> new SkyCobblestoneWallBlock());
	public static final RegistryObject<Block> SKY_STONE_BRICKS = REGISTRY.register("sky_stone_bricks", () -> new SkyStoneBricksBlock());
	public static final RegistryObject<Block> SKY_STONE_BRICK_SLAB = REGISTRY.register("sky_stone_brick_slab", () -> new SkyStoneBrickSlabBlock());
	public static final RegistryObject<Block> SKY_STONE_BRICK_STAIR = REGISTRY.register("sky_stone_brick_stair", () -> new SkyStoneBrickStairBlock());
	public static final RegistryObject<Block> SKY_STONE_BRICK_WALL = REGISTRY.register("sky_stone_brick_wall", () -> new SkyStoneBrickWallBlock());
	public static final RegistryObject<Block> DARK_SKY_STONE = REGISTRY.register("dark_sky_stone", () -> new DarkSkyStoneBlock());
	public static final RegistryObject<Block> DARK_SKY_STONE_SLAB = REGISTRY.register("dark_sky_stone_slab", () -> new DarkSkyStoneSlabBlock());
	public static final RegistryObject<Block> DARK_SKY_STONE_STAIR = REGISTRY.register("dark_sky_stone_stair", () -> new DarkSkyStoneStairBlock());
	public static final RegistryObject<Block> DARK_SKY_STONE_WALL = REGISTRY.register("dark_sky_stone_wall", () -> new DarkSkyStoneWallBlock());
	public static final RegistryObject<Block> DARK_SKY_COBBLESTONE = REGISTRY.register("dark_sky_cobblestone", () -> new DarkSkyCobblestoneBlock());
	public static final RegistryObject<Block> DARK_SKY_COBBLESTONE_SLAB = REGISTRY.register("dark_sky_cobblestone_slab",
			() -> new DarkSkyCobblestoneSlabBlock());
	public static final RegistryObject<Block> DARK_SKY_COBBLESTONE_STAIR = REGISTRY.register("dark_sky_cobblestone_stair",
			() -> new DarkSkyCobblestoneStairBlock());
	public static final RegistryObject<Block> DARK_SKY_COBBLESTONE_WALL = REGISTRY.register("dark_sky_cobblestone_wall",
			() -> new DarkSkyCobblestoneWallBlock());
	public static final RegistryObject<Block> DARK_SKY_STONE_BRICKS = REGISTRY.register("dark_sky_stone_bricks", () -> new DarkSkyStoneBricksBlock());
	public static final RegistryObject<Block> DARK_SKY_STONE_BRICK_SLAB = REGISTRY.register("dark_sky_stone_brick_slab",
			() -> new DarkSkyStoneBrickSlabBlock());
	public static final RegistryObject<Block> DARK_SKY_STONE_BRICK_STAIR = REGISTRY.register("dark_sky_stone_brick_stair",
			() -> new DarkSkyStoneBrickStairBlock());
	public static final RegistryObject<Block> DARK_SKY_STONE_BRICK_WALL = REGISTRY.register("dark_sky_stone_brick_wall",
			() -> new DarkSkyStoneBrickWallBlock());
	public static final RegistryObject<Block> GILDED_STONE = REGISTRY.register("gilded_stone", () -> new GildedStoneBlock());
	public static final RegistryObject<Block> GILDED_STONE_SLAB = REGISTRY.register("gilded_stone_slab", () -> new GildedStoneSlabBlock());
	public static final RegistryObject<Block> GILDED_STONE_STAIR = REGISTRY.register("gilded_stone_stair", () -> new GildedStoneStairBlock());
	public static final RegistryObject<Block> GILDED_STONE_WALL = REGISTRY.register("gilded_stone_wall", () -> new GildedStoneWallBlock());
	public static final RegistryObject<Block> GILDED_COBBLESTONE = REGISTRY.register("gilded_cobblestone", () -> new GildedCobblestoneBlock());
	public static final RegistryObject<Block> GILDED_COBBLESTONE_SLAB = REGISTRY.register("gilded_cobblestone_slab",
			() -> new GildedCobblestoneSlabBlock());
	public static final RegistryObject<Block> GILDED_COBBLESTONE_WALL = REGISTRY.register("gilded_cobblestone_wall",
			() -> new GildedCobblestoneWallBlock());
	public static final RegistryObject<Block> GILDED_COBBLESTONE_STAIR = REGISTRY.register("gilded_cobblestone_stair",
			() -> new GildedCobblestoneStairBlock());
	public static final RegistryObject<Block> GILDED_STONE_BRICKS = REGISTRY.register("gilded_stone_bricks", () -> new GildedStoneBricksBlock());
	public static final RegistryObject<Block> GILDED_STONE_BRICK_SLAB = REGISTRY.register("gilded_stone_brick_slab",
			() -> new GildedStoneBrickSlabBlock());
	public static final RegistryObject<Block> GILDED_STONE_BRICK_STAIR = REGISTRY.register("gilded_stone_brick_stair",
			() -> new GildedStoneBrickStairBlock());
	public static final RegistryObject<Block> GILDED_STONE_BRICK_WALL = REGISTRY.register("gilded_stone_brick_wall",
			() -> new GildedStoneBrickWallBlock());
	public static final RegistryObject<Block> GILDED_DARK_STONE = REGISTRY.register("gilded_dark_stone", () -> new GildedDarkStoneBlock());
	public static final RegistryObject<Block> GILDED_DARK_STONE_SLAB = REGISTRY.register("gilded_dark_stone_slab",
			() -> new GildedDarkStoneSlabBlock());
	public static final RegistryObject<Block> GILDED_DARK_STONE_STAIR = REGISTRY.register("gilded_dark_stone_stair",
			() -> new GildedDarkStoneStairBlock());
	public static final RegistryObject<Block> GILDED_DARK_STONE_WALL = REGISTRY.register("gilded_dark_stone_wall",
			() -> new GildedDarkStoneWallBlock());
	public static final RegistryObject<Block> GILDED_DARK_COBBLESTONE = REGISTRY.register("gilded_dark_cobblestone",
			() -> new GildedDarkCobblestoneBlock());
	public static final RegistryObject<Block> GILDED_DARK_COBBLESTONE_SLAB = REGISTRY.register("gilded_dark_cobblestone_slab",
			() -> new GildedDarkCobblestoneSlabBlock());
	public static final RegistryObject<Block> GILDED_DARK_COBBLESTONE_STAIR = REGISTRY.register("gilded_dark_cobblestone_stair",
			() -> new GildedDarkCobblestoneStairBlock());
	public static final RegistryObject<Block> GILDED_DARK_COBBLESTONE_WALL = REGISTRY.register("gilded_dark_cobblestone_wall",
			() -> new GildedDarkCobblestoneWallBlock());
	public static final RegistryObject<Block> GILDED_DARK_STONE_BRICKS = REGISTRY.register("gilded_dark_stone_bricks",
			() -> new GildedDarkStoneBricksBlock());
	public static final RegistryObject<Block> GILDED_DARK_STONE_BRICK_SLAB = REGISTRY.register("gilded_dark_stone_brick_slab",
			() -> new GildedDarkStoneBrickSlabBlock());
	public static final RegistryObject<Block> GILDED_DARK_STONE_BRICK_STAIR = REGISTRY.register("gilded_dark_stone_brick_stair",
			() -> new GildedDarkStoneBrickStairBlock());
	public static final RegistryObject<Block> GILDED_DARK_STONE_BRICK_WALL = REGISTRY.register("gilded_dark_stone_brick_wall",
			() -> new GildedDarkStoneBrickWallBlock());
	public static final RegistryObject<Block> SKY_METAL_ORE = REGISTRY.register("sky_metal_ore", () -> new SkyMetalOreBlock());
	public static final RegistryObject<Block> SKY_METAL_BLOCK = REGISTRY.register("sky_metal_block", () -> new SkyMetalBlockBlock());
}
