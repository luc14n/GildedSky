package fsu.gildedsky.gildedsky.block;

import fsu.gildedsky.gildedsky.GildedSky;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import fsu.gildedsky.gildedsky.block.impl.*;

public class ModBlocks {
    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GildedSky.MOD_ID);
    public static final RegistryObject<Block> SKY_STONE = REGISTRY.register("sky_stone", () -> new SkyStoneBlock());
    public static final RegistryObject<Block> SKY_STONE_SLAB = REGISTRY.register("sky_stone_slab", () -> new SkyStoneSlabBlock());
    public static final RegistryObject<Block> SKY_STONE_STAIR = REGISTRY.register("sky_stone_stair", () -> new SkyStoneStairBlock());
    public static final RegistryObject<Block> SKY_STONE_WALL = REGISTRY.register("sky_stone_wall", () -> wallBlock());
    public static final RegistryObject<Block> SKY_COBBLESTONE = REGISTRY.register("sky_cobblestone", () -> new SkyCobblestoneBlock());
    public static final RegistryObject<Block> SKY_COBBLESTONE_SLAB = REGISTRY.register("sky_cobblestone_slab", () -> new SkyCobblestoneSlabBlock());
    public static final RegistryObject<Block> SKY_COBBLESTONE_STAIR = REGISTRY.register("sky_cobblestone_stair", () -> new SkyCobblestoneStairBlock());
    public static final RegistryObject<Block> SKY_COBBLESTONE_WALL = REGISTRY.register("sky_cobblestone_wall", () -> wallBlock());
    public static final RegistryObject<Block> SKY_STONE_BRICKS = REGISTRY.register("sky_stone_bricks", () -> new SkyStoneBricksBlock());
    public static final RegistryObject<Block> SKY_STONE_BRICK_SLAB = REGISTRY.register("sky_stone_brick_slab", () -> new SkyStoneBrickSlabBlock());
    public static final RegistryObject<Block> SKY_STONE_BRICK_STAIR = REGISTRY.register("sky_stone_brick_stair", () -> new SkyStoneBrickStairBlock());
    public static final RegistryObject<Block> SKY_STONE_BRICK_WALL = REGISTRY.register("sky_stone_brick_wall", () -> wallBlock());
    public static final RegistryObject<Block> DARK_SKY_STONE = REGISTRY.register("dark_sky_stone", () -> new DarkSkyStoneBlock());
    public static final RegistryObject<Block> DARK_SKY_STONE_SLAB = REGISTRY.register("dark_sky_stone_slab", () -> new DarkSkyStoneSlabBlock());
    public static final RegistryObject<Block> DARK_SKY_STONE_STAIR = REGISTRY.register("dark_sky_stone_stair", () -> new DarkSkyStoneStairBlock());
    public static final RegistryObject<Block> DARK_SKY_STONE_WALL = REGISTRY.register("dark_sky_stone_wall", () -> wallBlock());
    public static final RegistryObject<Block> DARK_SKY_COBBLESTONE = REGISTRY.register("dark_sky_cobblestone", () -> new DarkSkyCobblestoneBlock());
    public static final RegistryObject<Block> DARK_SKY_COBBLESTONE_SLAB = REGISTRY.register("dark_sky_cobblestone_slab", () -> new DarkSkyCobblestoneSlabBlock());
    public static final RegistryObject<Block> DARK_SKY_COBBLESTONE_STAIR = REGISTRY.register("dark_sky_cobblestone_stair", () -> new DarkSkyCobblestoneStairBlock());
    public static final RegistryObject<Block> DARK_SKY_COBBLESTONE_WALL = REGISTRY.register("dark_sky_cobblestone_wall", () -> wallBlock());
    public static final RegistryObject<Block> DARK_SKY_STONE_BRICKS = REGISTRY.register("dark_sky_stone_bricks", () -> new DarkSkyStoneBricksBlock());
    public static final RegistryObject<Block> DARK_SKY_STONE_BRICK_SLAB = REGISTRY.register("dark_sky_stone_brick_slab", () -> new DarkSkyStoneBrickSlabBlock());
    public static final RegistryObject<Block> DARK_SKY_STONE_BRICK_STAIR = REGISTRY.register("dark_sky_stone_brick_stair", () -> new DarkSkyStoneBrickStairBlock());
    public static final RegistryObject<Block> DARK_SKY_STONE_BRICK_WALL = REGISTRY.register("dark_sky_stone_brick_wall", () -> wallBlock());
    public static final RegistryObject<Block> GILDED_STONE = REGISTRY.register("gilded_stone", () -> new GildedStoneBlock());
    public static final RegistryObject<Block> GILDED_STONE_SLAB = REGISTRY.register("gilded_stone_slab", () -> new GildedStoneSlabBlock());
    public static final RegistryObject<Block> GILDED_STONE_STAIR = REGISTRY.register("gilded_stone_stair", () -> new GildedStoneStairBlock());
    public static final RegistryObject<Block> GILDED_STONE_WALL = REGISTRY.register("gilded_stone_wall", () -> wallBlock());
    public static final RegistryObject<Block> GILDED_COBBLESTONE = REGISTRY.register("gilded_cobblestone", () -> new GildedCobblestoneBlock());
    public static final RegistryObject<Block> GILDED_COBBLESTONE_SLAB = REGISTRY.register("gilded_cobblestone_slab", () -> new GildedCobblestoneSlabBlock());
    public static final RegistryObject<Block> GILDED_COBBLESTONE_WALL = REGISTRY.register("gilded_cobblestone_wall", () -> wallBlock());
    public static final RegistryObject<Block> GILDED_COBBLESTONE_STAIR = REGISTRY.register("gilded_cobblestone_stair", () -> new GildedCobblestoneStairBlock());
    public static final RegistryObject<Block> GILDED_STONE_BRICKS = REGISTRY.register("gilded_stone_bricks", () -> new GildedStoneBricksBlock());
    public static final RegistryObject<Block> GILDED_STONE_BRICK_SLAB = REGISTRY.register("gilded_stone_brick_slab", () -> new GildedStoneBrickSlabBlock());
    public static final RegistryObject<Block> GILDED_STONE_BRICK_STAIR = REGISTRY.register("gilded_stone_brick_stair", () -> new GildedStoneBrickStairBlock());
    public static final RegistryObject<Block> GILDED_STONE_BRICK_WALL = REGISTRY.register("gilded_stone_brick_wall", () -> wallBlock());
    public static final RegistryObject<Block> GILDED_DARK_STONE = REGISTRY.register("gilded_dark_stone", () -> new GildedDarkStoneBlock());
    public static final RegistryObject<Block> GILDED_DARK_STONE_SLAB = REGISTRY.register("gilded_dark_stone_slab", () -> new GildedDarkStoneSlabBlock());
    public static final RegistryObject<Block> GILDED_DARK_STONE_STAIR = REGISTRY.register("gilded_dark_stone_stair", () -> new GildedDarkStoneStairBlock());
    public static final RegistryObject<Block> GILDED_DARK_STONE_WALL = REGISTRY.register("gilded_dark_stone_wall", () -> wallBlock());
    public static final RegistryObject<Block> GILDED_DARK_COBBLESTONE = REGISTRY.register("gilded_dark_cobblestone", () -> new GildedDarkCobblestoneBlock());
    public static final RegistryObject<Block> GILDED_DARK_COBBLESTONE_SLAB = REGISTRY.register("gilded_dark_cobblestone_slab", () -> new GildedDarkCobblestoneSlabBlock());
    public static final RegistryObject<Block> GILDED_DARK_COBBLESTONE_STAIR = REGISTRY.register("gilded_dark_cobblestone_stair", () -> new GildedDarkCobblestoneStairBlock());
    public static final RegistryObject<Block> GILDED_DARK_COBBLESTONE_WALL = REGISTRY.register("gilded_dark_cobblestone_wall", () -> new GildedDarkCobblestoneWallBlock());
    public static final RegistryObject<Block> GILDED_DARK_STONE_BRICKS = REGISTRY.register("gilded_dark_stone_bricks", () -> new GildedDarkStoneBricksBlock());
    public static final RegistryObject<Block> GILDED_DARK_STONE_BRICK_SLAB = REGISTRY.register("gilded_dark_stone_brick_slab", () -> new GildedDarkStoneBrickSlabBlock());
    public static final RegistryObject<Block> GILDED_DARK_STONE_BRICK_STAIR = REGISTRY.register("gilded_dark_stone_brick_stair", () -> new GildedDarkStoneBrickStairBlock());
    public static final RegistryObject<Block> GILDED_DARK_STONE_BRICK_WALL = REGISTRY.register("gilded_dark_stone_brick_wall", () -> wallBlock());
    public static final RegistryObject<Block> GRAND_OAK_WOOD = REGISTRY.register("grand_oak_wood", () -> new GrandOakWoodBlock());
    public static final RegistryObject<Block> GRAND_OAK_LOG = REGISTRY.register("grand_oak_log", () -> new GrandOakLogBlock());
    public static final RegistryObject<Block> GRAND_OAK_PLANKS = REGISTRY.register("grand_oak_planks", () -> new GrandOakPlanksBlock());
    public static final RegistryObject<Block> GRAND_OAK_LEAVES = REGISTRY.register("grand_oak_leaves", () -> new GrandOakLeavesBlock());
    public static final RegistryObject<Block> GRAND_OAK_STAIRS = REGISTRY.register("grand_oak_stairs", () -> new GrandOakStairsBlock());
    public static final RegistryObject<Block> GRAND_OAK_SLAB = REGISTRY.register("grand_oak_slab", () -> new GrandOakSlabBlock());
    public static final RegistryObject<Block> GRAND_OAK_FENCE = REGISTRY.register("grand_oak_fence", () -> new GrandOakFenceBlock());
    public static final RegistryObject<Block> GRAND_OAK_FENCE_GATE = REGISTRY.register("grand_oak_fence_gate", () -> new GrandOakFenceGateBlock());
    public static final RegistryObject<Block> GRAND_OAK_PRESSURE_PLATE = REGISTRY.register("grand_oak_pressure_plate", () -> new GrandOakPressurePlateBlock());
    public static final RegistryObject<Block> GRAND_OAK_BUTTON = REGISTRY.register("grand_oak_button", () -> new GrandOakButtonBlock());
    public static final RegistryObject<Block> SKY_METAL_ORE = REGISTRY.register("sky_metal_ore", () -> new SkyMetalOreBlock());
    public static final RegistryObject<Block> SKY_METAL_BLOCK = REGISTRY.register("sky_metal_block", () -> new SkyMetalBlockBlock());
    public static final RegistryObject<Block> SHIMMERING_DUST_ORE = REGISTRY.register("shimmering_dust_ore", () -> new ShimmeringDustOreBlock());
    public static final RegistryObject<Block> SHIMMERING_DUST_BLOCK = REGISTRY.register("shimmering_dust_block", () -> new ShimmeringDustBlockBlock());
    public static final RegistryObject<Block> PURPLE_CARROT_BLOCK = REGISTRY.register("purple_carrot_block", () -> new PurpleCarrotBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS)));

    public static final RegistryObject<Block> SKY_PORTAL_BLOCK = REGISTRY.register("sky_portal_block", () -> new SkyPortalBlock());;

    public static final RegistryObject<Block> SKY_DIRT = REGISTRY.register("sky_dirt", () -> new SkyDirtBlock());;
    public static final RegistryObject<Block> SKY_GRASS_BLOCK = REGISTRY.register("sky_grass_block", () -> new SkyGrassBlockBlock());;

    public static void register(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }

    public static WallBlock wallBlock(){
        return new WallBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.5f,6f).requiresCorrectToolForDrops().dynamicShape());
    }
}

