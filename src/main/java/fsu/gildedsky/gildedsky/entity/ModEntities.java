package fsu.gildedsky.gildedsky.entity;

import fsu.gildedsky.gildedsky.GildedSky;
import fsu.gildedsky.gildedsky.entity.custom.HobDragonEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, GildedSky.MOD_ID);

    public static final RegistryObject<EntityType<HobDragonEntity>> HOBDRAGON =
            ENTITY_TYPES.register("hobdragon",
                    () -> EntityType.Builder.of(HobDragonEntity::new, MobCategory.MONSTER)
                            .sized(1.5f, 1.75f)
                            .build(new ResourceLocation(GildedSky.MOD_ID, "hobdragon").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register((eventBus));
    }
}
