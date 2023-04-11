package fsu.gildedsky.gildedsky.item;

import fsu.gildedsky.gildedsky.GildedSky;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GildedSky.MOD_ID);

    // Test Items
    public static final RegistryObject<Item> TESTITEM = ITEMS.register("testitem", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TESTITEM2 = ITEMS.register("testitem2", () -> new Item(new Item.Properties()));

    // Sky Metal
    public static final RegistryObject<Item> SKYMETAL_INGOT = ITEMS.register("skymetal_ingot", () -> new Item(new Item.Properties()));
        // Tools && Weapons
    public static final RegistryObject<Item> SKYMETAL_PICKAXE = ITEMS.register("skymetal_pickaxe", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SKYMETAL_AXE = ITEMS.register("skymetal_axe", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SKYMETAL_SHOVEL = ITEMS.register("skymetal_shovel", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SKYMETAL_HOE = ITEMS.register("skymetal_hoe", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SKYMETAL_SWROD = ITEMS.register("skymetal_sword", () -> new Item(new Item.Properties()));
        // Armor
    public static final RegistryObject<Item> SKYMETAL_ARMOR_HELMET = ITEMS.register("skymetal_armor_helmet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SKYMETAL_ARMOR_CHESTPLATE = ITEMS.register("skymetal_armor_chestplate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SKYMETAL_ARMOR_LEGGINGS = ITEMS.register("skymetal_armor_leggings", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SKYMETAL_ARMOR_BOOTS = ITEMS.register("skymetal_armor_boots", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
