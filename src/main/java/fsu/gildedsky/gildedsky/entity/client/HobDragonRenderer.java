package fsu.gildedsky.gildedsky.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import fsu.gildedsky.gildedsky.GildedSky;
import fsu.gildedsky.gildedsky.entity.custom.HobDragonEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class HobDragonRenderer extends GeoEntityRenderer<HobDragonEntity> {

    public HobDragonRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new HobDragonModel());
    }

    @Override
    public ResourceLocation getTextureLocation(HobDragonEntity animatable) {
        return new ResourceLocation(GildedSky.MOD_ID, "textures/entity/hobdragon.png");
    }

    // If baby HobDragon is needed add here
    @Override
    public void render(HobDragonEntity entity, float entityYaw, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight) {
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
