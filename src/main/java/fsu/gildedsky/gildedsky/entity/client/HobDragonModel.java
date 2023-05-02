package fsu.gildedsky.gildedsky.entity.client;

import fsu.gildedsky.gildedsky.GildedSky;
import fsu.gildedsky.gildedsky.entity.custom.HobDragonEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.object.DataTicket;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class HobDragonModel extends GeoModel<HobDragonEntity> {
    @Override
    public ResourceLocation getModelResource(HobDragonEntity animatable) {
        return new ResourceLocation(GildedSky.MOD_ID, "geo/hobdragon.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(HobDragonEntity animatable) {
        return new ResourceLocation(GildedSky.MOD_ID, "textures/entity/hobdragon.png");
    }

    @Override
    public ResourceLocation getAnimationResource(HobDragonEntity animatable) {
        return new ResourceLocation(GildedSky.MOD_ID, "animations/hobdragon.json");
    }

    @Override
    public void setCustomAnimations(HobDragonEntity animatable, long instanceId, AnimationState<HobDragonEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("main/head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}
