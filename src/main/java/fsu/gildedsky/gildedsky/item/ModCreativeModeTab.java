package fsu.gildedsky.gildedsky.item;

import fsu.gildedsky.gildedsky.GildedSky;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ModCreativeModeTab {

    //@Mod.EventBusSubscriber(modid = GildedSky.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static CreativeModeTab GILDEDSKY_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        GILDEDSKY_TAB = event.registerCreativeModeTab(new ResourceLocation(GildedSky.MOD_ID, "gildedsky_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.TESTITEM.get())).title(Component.literal("GildedSky Tab")).build());
    }
}
