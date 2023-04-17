package fsu.gildedsky.gildedsky.mixin;

import fsu.gildedsky.gildedsky.block.impl.SkyPortalBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseFireBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.portal.PortalShape;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

import java.util.Optional;


@Mixin(BaseFireBlock.class)
public class BaseFireBlockMixin{
    @Shadow
    private static boolean inPortalDimension(Level p_49249_) {
        return p_49249_.dimension() == Level.OVERWORLD || p_49249_.dimension() == Level.NETHER;
    }
    /**
     * @author
     * @reason
     */
    @Overwrite
    public void onPlace(BlockState p_49279_, Level p_49280_, BlockPos p_49281_, BlockState p_49282_, boolean p_49283_) {
        if (!p_49282_.is(p_49279_.getBlock())) {

            if (inPortalDimension(p_49280_) || p_49280_.dimensionTypeId().location().toString().equals("gildedsky:sky")) {
                SkyPortalBlock.portalSpawn(p_49280_,p_49281_);
                Optional<PortalShape> optional = PortalShape.findEmptyPortalShape(p_49280_, p_49281_, Direction.Axis.X);
                optional = net.minecraftforge.event.ForgeEventFactory.onTrySpawnPortal(p_49280_, p_49281_, optional);
                if (optional.isPresent()) {
                    optional.get().createPortalBlocks();
                    return;
                }
            }

            if (!p_49279_.canSurvive(p_49280_, p_49281_)) {
                p_49280_.removeBlock(p_49281_, false);
            }

        }
    }
}
