
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fsu.gildedsky.gildedsky.world.features;

import fsu.gildedsky.gildedsky.GildedSky;
import fsu.gildedsky.gildedsky.world.features.ores.*;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber
public class ModFeatures {
	public static final DeferredRegister<Feature<?>> FEATURE = DeferredRegister.create(ForgeRegistries.FEATURES, GildedSky.MOD_ID);
	public static final RegistryObject<Feature<?>> SKY_STONE = FEATURE.register("sky_stone", SkyStoneFeature::feature);
	public static final RegistryObject<Feature<?>> DARK_SKY_STONE = FEATURE.register("dark_sky_stone", DarkSkyStoneFeature::feature);
	public static final RegistryObject<Feature<?>> SHIMMERING_DUST_ORE = FEATURE.register("shimmering_dust_ore", ShimmeringDustOreFeature::feature);
	public static final RegistryObject<Feature<?>> SKY_METAL_ORE = FEATURE.register("sky_metal_ore", SkyMetalOreFeature::feature);
}
