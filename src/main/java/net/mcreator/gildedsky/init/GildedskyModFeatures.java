
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gildedsky.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.gildedsky.world.features.ores.SkyStoneFeature;
import net.mcreator.gildedsky.world.features.ores.SkyMetalOreFeature;
import net.mcreator.gildedsky.world.features.ores.GildedStoneFeature;
import net.mcreator.gildedsky.world.features.ores.GildedDarkStoneFeature;
import net.mcreator.gildedsky.world.features.ores.DarkSkyStoneFeature;
import net.mcreator.gildedsky.GildedskyMod;

@Mod.EventBusSubscriber
public class GildedskyModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, GildedskyMod.MODID);
	public static final RegistryObject<Feature<?>> SKY_STONE = REGISTRY.register("sky_stone", SkyStoneFeature::feature);
	public static final RegistryObject<Feature<?>> DARK_SKY_STONE = REGISTRY.register("dark_sky_stone", DarkSkyStoneFeature::feature);
	public static final RegistryObject<Feature<?>> GILDED_STONE = REGISTRY.register("gilded_stone", GildedStoneFeature::feature);
	public static final RegistryObject<Feature<?>> GILDED_DARK_STONE = REGISTRY.register("gilded_dark_stone", GildedDarkStoneFeature::feature);
	public static final RegistryObject<Feature<?>> SKY_METAL_ORE = REGISTRY.register("sky_metal_ore", SkyMetalOreFeature::feature);
}
