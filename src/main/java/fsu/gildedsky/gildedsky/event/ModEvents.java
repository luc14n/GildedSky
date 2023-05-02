package fsu.gildedsky.gildedsky.event;

import fsu.gildedsky.gildedsky.GildedSky;
import fsu.gildedsky.gildedsky.entity.ModEntities;
import fsu.gildedsky.gildedsky.entity.custom.HobDragonEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GildedSky.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntities.HOBDRAGON.get(), HobDragonEntity.setAttributes());
    }
}
