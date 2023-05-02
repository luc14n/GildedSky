package fsu.gildedsky.gildedsky.datagen;

import fsu.gildedsky.gildedsky.GildedSky;
import fsu.gildedsky.gildedsky.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, GildedSky.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(ModItems.HOBDRAGON_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
    }
}
