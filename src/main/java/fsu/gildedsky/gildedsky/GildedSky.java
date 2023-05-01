package fsu.gildedsky.gildedsky;

import com.mojang.logging.LogUtils;
import fsu.gildedsky.gildedsky.block.ModBlocks;
//import fsu.gildedsky.gildedsky.entity.ExampleEntity;
//import fsu.gildedsky.gildedsky.entity.ExampleEntityModel;
//import fsu.gildedsky.gildedsky.entity.ExampleEntityRenderer;
// import fsu.gildedsky.gildedsky.entity.ModEntities;
import fsu.gildedsky.gildedsky.item.ModCreativeModeTab;
import fsu.gildedsky.gildedsky.item.ModItems;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;

import java.awt.*;
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

//		ModEntities.register(modEventBus);
//

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

		@SubscribeEvent
		public static void onBlockColors(RegisterColorHandlersEvent.Block event) {
			event.register(new BlockColor() {
				@Override
				public int getColor(BlockState p_92567_, @Nullable BlockAndTintGetter p_92568_, @Nullable BlockPos p_92569_, int p_92570_) {
					return new Color(0, 239, 255).getRGB();
				}
			},ModBlocks.SKY_PORTAL_BLOCK.get());
		}
//		@SubscribeEvent
//		public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event) {
//			event.registerEntityRenderer(ModEntities.EXAMPLE.get(), ExampleEntityRenderer::new);
//		}
//
//		@SubscribeEvent
//		public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
//			event.registerLayerDefinition(ExampleEntityModel.LAYER_LOCATION, ExampleEntityModel::createBodyLayer);
//		}
//		@SubscribeEvent
//		public static void entityAttributes(EntityAttributeCreationEvent event) {
//			event.put(ModEntities.EXAMPLE.get(), ExampleEntity.getExampleAttributes().build());
//		}
	}
}

