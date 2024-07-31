package net.loosaz.tcustomitems.datagen;

import net.loosaz.tcustomitems.TCustomItems;
import net.loosaz.tcustomitems.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, TCustomItems.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.LOOSAZ_HELMET.get(),
                        ModItems.LOOSAZ_CHESTPLATE.get(),
                        ModItems.LOOSAZ_LEGGINGS.get(),
                        ModItems.LOOSAZ_BOOTS.get());
        this.tag(ItemTags.SWORDS)
                .add(ModItems.LOOSAZ_SWORD.get());
    }
}
