package fsu.gildedsky.gildedsky.item;

import fsu.gildedsky.gildedsky.GildedSky;
import fsu.gildedsky.gildedsky.block.ModBlocks;
import fsu.gildedsky.gildedsky.entity.ModEntities;
import fsu.gildedsky.gildedsky.item.impl.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GildedSky.MOD_ID);
    public static final RegistryObject<Item> SKY_STONE = block(ModBlocks.SKY_STONE);
    public static final RegistryObject<Item> SKY_STONE_SLAB = block(ModBlocks.SKY_STONE_SLAB);
    public static final RegistryObject<Item> SKY_STONE_STAIR = block(ModBlocks.SKY_STONE_STAIR);
    public static final RegistryObject<Item> SKY_STONE_WALL = block(ModBlocks.SKY_STONE_WALL);
    public static final RegistryObject<Item> SKY_COBBLESTONE = block(ModBlocks.SKY_COBBLESTONE);
    public static final RegistryObject<Item> SKY_COBBLESTONE_SLAB = block(ModBlocks.SKY_COBBLESTONE_SLAB);
    public static final RegistryObject<Item> SKY_COBBLESTONE_STAIR = block(ModBlocks.SKY_COBBLESTONE_STAIR);
    public static final RegistryObject<Item> SKY_COBBLESTONE_WALL = block(ModBlocks.SKY_COBBLESTONE_WALL);
    public static final RegistryObject<Item> SKY_STONE_BRICKS = block(ModBlocks.SKY_STONE_BRICKS);
    public static final RegistryObject<Item> SKY_STONE_BRICK_SLAB = block(ModBlocks.SKY_STONE_BRICK_SLAB);
    public static final RegistryObject<Item> SKY_STONE_BRICK_STAIR = block(ModBlocks.SKY_STONE_BRICK_STAIR);
    public static final RegistryObject<Item> SKY_STONE_BRICK_WALL = block(ModBlocks.SKY_STONE_BRICK_WALL);
    public static final RegistryObject<Item> DARK_SKY_STONE = block(ModBlocks.DARK_SKY_STONE);
    public static final RegistryObject<Item> DARK_SKY_STONE_SLAB = block(ModBlocks.DARK_SKY_STONE_SLAB);
    public static final RegistryObject<Item> DARK_SKY_STONE_STAIR = block(ModBlocks.DARK_SKY_STONE_STAIR);
    public static final RegistryObject<Item> DARK_SKY_STONE_WALL = block(ModBlocks.DARK_SKY_STONE_WALL);
    public static final RegistryObject<Item> DARK_SKY_COBBLESTONE = block(ModBlocks.DARK_SKY_COBBLESTONE);
    public static final RegistryObject<Item> DARK_SKY_COBBLESTONE_SLAB = block(ModBlocks.DARK_SKY_COBBLESTONE_SLAB);
    public static final RegistryObject<Item> DARK_SKY_COBBLESTONE_STAIR = block(ModBlocks.DARK_SKY_COBBLESTONE_STAIR);
    public static final RegistryObject<Item> DARK_SKY_COBBLESTONE_WALL = block(ModBlocks.DARK_SKY_COBBLESTONE_WALL);
    public static final RegistryObject<Item> DARK_SKY_STONE_BRICKS = block(ModBlocks.DARK_SKY_STONE_BRICKS);
    public static final RegistryObject<Item> DARK_SKY_STONE_BRICK_SLAB = block(ModBlocks.DARK_SKY_STONE_BRICK_SLAB);
    public static final RegistryObject<Item> DARK_SKY_STONE_BRICK_STAIR = block(ModBlocks.DARK_SKY_STONE_BRICK_STAIR);
    public static final RegistryObject<Item> DARK_SKY_STONE_BRICK_WALL = block(ModBlocks.DARK_SKY_STONE_BRICK_WALL);
    public static final RegistryObject<Item> GILDED_STONE = block(ModBlocks.GILDED_STONE);
    public static final RegistryObject<Item> GILDED_STONE_SLAB = block(ModBlocks.GILDED_STONE_SLAB);
    public static final RegistryObject<Item> GILDED_STONE_STAIR = block(ModBlocks.GILDED_STONE_STAIR);
    public static final RegistryObject<Item> GILDED_STONE_WALL = block(ModBlocks.GILDED_STONE_WALL);
    public static final RegistryObject<Item> GILDED_COBBLESTONE = block(ModBlocks.GILDED_COBBLESTONE);
    public static final RegistryObject<Item> GILDED_COBBLESTONE_SLAB = block(ModBlocks.GILDED_COBBLESTONE_SLAB);
    public static final RegistryObject<Item> GILDED_COBBLESTONE_WALL = block(ModBlocks.GILDED_COBBLESTONE_WALL);
    public static final RegistryObject<Item> GILDED_COBBLESTONE_STAIR = block(ModBlocks.GILDED_COBBLESTONE_STAIR);
    public static final RegistryObject<Item> GILDED_STONE_BRICKS = block(ModBlocks.GILDED_STONE_BRICKS);
    public static final RegistryObject<Item> GILDED_STONE_BRICK_SLAB = block(ModBlocks.GILDED_STONE_BRICK_SLAB);
    public static final RegistryObject<Item> GILDED_STONE_BRICK_STAIR = block(ModBlocks.GILDED_STONE_BRICK_STAIR);
    public static final RegistryObject<Item> GILDED_STONE_BRICK_WALL = block(ModBlocks.GILDED_STONE_BRICK_WALL);
    public static final RegistryObject<Item> GILDED_DARK_STONE = block(ModBlocks.GILDED_DARK_STONE);
    public static final RegistryObject<Item> GILDED_DARK_STONE_SLAB = block(ModBlocks.GILDED_DARK_STONE_SLAB);
    public static final RegistryObject<Item> GILDED_DARK_STONE_STAIR = block(ModBlocks.GILDED_DARK_STONE_STAIR);
    public static final RegistryObject<Item> GILDED_DARK_STONE_WALL = block(ModBlocks.GILDED_DARK_STONE_WALL);
    public static final RegistryObject<Item> GILDED_DARK_COBBLESTONE = block(ModBlocks.GILDED_DARK_COBBLESTONE);
    public static final RegistryObject<Item> GILDED_DARK_COBBLESTONE_SLAB = block(ModBlocks.GILDED_DARK_COBBLESTONE_SLAB);
    public static final RegistryObject<Item> GILDED_DARK_COBBLESTONE_STAIR = block(ModBlocks.GILDED_DARK_COBBLESTONE_STAIR);
    public static final RegistryObject<Item> GILDED_DARK_COBBLESTONE_WALL = block(ModBlocks.GILDED_DARK_COBBLESTONE_WALL);
    public static final RegistryObject<Item> GILDED_DARK_STONE_BRICKS = block(ModBlocks.GILDED_DARK_STONE_BRICKS);
    public static final RegistryObject<Item> GILDED_DARK_STONE_BRICK_SLAB = block(ModBlocks.GILDED_DARK_STONE_BRICK_SLAB);
    public static final RegistryObject<Item> GILDED_DARK_STONE_BRICK_STAIR = block(ModBlocks.GILDED_DARK_STONE_BRICK_STAIR);
    public static final RegistryObject<Item> GILDED_DARK_STONE_BRICK_WALL = block(ModBlocks.GILDED_DARK_STONE_BRICK_WALL);
    public static final RegistryObject<Item> GRAND_OAK_WOOD = block(ModBlocks.GRAND_OAK_WOOD);
    public static final RegistryObject<Item> GRAND_OAK_LOG = block(ModBlocks.GRAND_OAK_LOG);
    public static final RegistryObject<Item> GRAND_OAK_PLANKS = block(ModBlocks.GRAND_OAK_PLANKS);
    public static final RegistryObject<Item> GRAND_OAK_LEAVES = block(ModBlocks.GRAND_OAK_LEAVES);
    public static final RegistryObject<Item> GRAND_OAK_STAIRS = block(ModBlocks.GRAND_OAK_STAIRS);
    public static final RegistryObject<Item> GRAND_OAK_SLAB = block(ModBlocks.GRAND_OAK_SLAB);
    public static final RegistryObject<Item> GRAND_OAK_FENCE = block(ModBlocks.GRAND_OAK_FENCE);
    public static final RegistryObject<Item> GRAND_OAK_FENCE_GATE = block(ModBlocks.GRAND_OAK_FENCE_GATE);
    public static final RegistryObject<Item> GRAND_OAK_PRESSURE_PLATE = block(ModBlocks.GRAND_OAK_PRESSURE_PLATE);
    public static final RegistryObject<Item> GRAND_OAK_BUTTON = block(ModBlocks.GRAND_OAK_BUTTON);
    public static final RegistryObject<Item> SKY_METAL_ORE = block(ModBlocks.SKY_METAL_ORE);
    public static final RegistryObject<Item> SKY_METAL_BLOCK = block(ModBlocks.SKY_METAL_BLOCK);
    public static final RegistryObject<Item> SKY_METAL_AXE = ITEMS.register("sky_metal_axe", () -> new SkyMetalAxeItem());
    public static final RegistryObject<Item> SKY_METAL_PICKAXE = ITEMS.register("sky_metal_pickaxe", () -> new SkyMetalPickaxeItem());
    public static final RegistryObject<Item> SKY_METAL_SWORD = ITEMS.register("sky_metal_sword", () -> new SkyMetalSwordItem());
    public static final RegistryObject<Item> SKY_METAL_SHOVEL = ITEMS.register("sky_metal_shovel", () -> new SkyMetalShovelItem());
    public static final RegistryObject<Item> SKY_METAL_HOE = ITEMS.register("sky_metal_hoe", () -> new SkyMetalHoeItem());
    public static final RegistryObject<Item> SKY_METAL_ARMOR_HELMET = ITEMS.register("sky_metal_armor_helmet", () -> new SkyMetalArmorItem.Helmet());
    public static final RegistryObject<Item> SKY_METAL_ARMOR_CHESTPLATE = ITEMS.register("sky_metal_armor_chestplate", () -> new SkyMetalArmorItem.Chestplate());
    public static final RegistryObject<Item> SKY_METAL_ARMOR_LEGGINGS = ITEMS.register("sky_metal_armor_leggings", () -> new SkyMetalArmorItem.Leggings());
    public static final RegistryObject<Item> SKY_METAL_ARMOR_BOOTS = ITEMS.register("sky_metal_armor_boots", () -> new SkyMetalArmorItem.Boots());
    public static final RegistryObject<Item> SKY_METAL_INGOT = ITEMS.register("sky_metal_ingot", () -> new SkyMetalIngotItem());
    public static final RegistryObject<Item> SHIMMERING_DUST_ORE = block(ModBlocks.SHIMMERING_DUST_ORE);
    public static final RegistryObject<Item> SHIMMERING_DUST_BLOCK = block(ModBlocks.SHIMMERING_DUST_BLOCK);
    public static final RegistryObject<Item> SHIMMERING_DUST_DUST = ITEMS.register("shimmering_dust_dust", () -> new ShimmeringDustDustItem());
    public static final RegistryObject<Item> PURPLE_CARROT = ITEMS.register("purple_carrot", () -> new PurpleCarrotItem());
    public static final RegistryObject<Item> SKY_DIRT = block(ModBlocks.SKY_DIRT);
    public static final RegistryObject<Item> SKY_GRASS_BLOCK = block(ModBlocks.SKY_GRASS_BLOCK);
    public static final RegistryObject<Item> HOBDRAGON_SPAWN_EGG = ITEMS.register("hobdragon_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.HOBDRAGON, 0xC65640, 0x101010, new Item.Properties()));
//
//
//    public static final RegistryObject<ForgeSpawnEggItem> EXAMPLE_ENTITY_SPAWN_EGG = ITEMS.register("example_entity_spawn_egg",
//            () -> new ForgeSpawnEggItem(ModEntities.EXAMPLE, 0xFF55AA, 0x27DA9F, new Item.Properties().stacksTo(16)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
    private static RegistryObject<Item> block(RegistryObject<Block> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
    }
}
