package net.loosaz.tcustomitems.datagen;

import net.loosaz.tcustomitems.TCustomItems;
import net.loosaz.tcustomitems.block.ModBlocks;
import net.loosaz.tcustomitems.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TCustomItems.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {


        this.tag(ModTags.Blocks.NEEDS_WEAPONS)
                .add(ModBlocks.BLACKSTAR_EGG_BED.get());
    }
}
