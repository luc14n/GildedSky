package fsu.gildedsky.gildedsky;

import com.mojang.logging.LogUtils;
import fsu.gildedsky.gildedsky.block.ModBlocks;
import fsu.gildedsky.gildedsky.item.ModCreativeModeTab;
import fsu.gildedsky.gildedsky.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

import java.util.Map;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(GildedSky.MOD_ID)
public class GildedSky {
	public static final String MOD_ID = "gildedsky";
	private static final Logger LOGGER = LogUtils.getLogger();


	public GildedSky() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		modEventBus.addListener(ModCreativeModeTab::registerCreativeModeTabs);

		ModItems.register(modEventBus);

		ModBlocks.register(modEventBus);

		modEventBus.addListener(this::addCreative);

		modEventBus.addListener(this::commonSetup);
		MinecraftForge.EVENT_BUS.register(this);

	}

	// This is a test to make sure everything works properly!

	private void commonSetup(final FMLCommonSetupEvent event) {

	}

	private void addCreative(CreativeModeTabEvent.BuildContents event) {
		if(event.getTab() == CreativeModeTabs.FOOD_AND_DRINKS){
			event.getEntries().putAfter(new ItemStack(Items.GOLDEN_CARROT),new ItemStack(ModItems.PURPLE_CARROT.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
		}
	}

	// You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
	@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientModEvents {
		@SubscribeEvent
		public static void onClientSetup(FMLClientSetupEvent event) {

		}
	}
}

