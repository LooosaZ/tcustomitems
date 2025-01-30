package net.loosaz.tcustomitems.datagen.loot;

import net.loosaz.tcustomitems.block.ModBlocks;
import net.loosaz.tcustomitems.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.ARCHELON_EGG_BED.get());
        this.dropSelf(ModBlocks.BLACKSTAR_EGG_BED.get());
        this.dropSelf(ModBlocks.HAZEL_EGG_BED.get());
        this.dropSelf(ModBlocks.PIAU_EGG_BED.get());
        this.dropSelf(ModBlocks.MADELINE_EGG_BED.get());
        this.dropSelf(ModBlocks.SONIA_EGG_BED.get());
        this.dropSelf(ModBlocks.TEXAS_EGG_BED.get());
        this.dropSelf(ModBlocks.DARLING_EGG_BED.get());
        this.dropSelf(ModBlocks.KILLEE_EGG_BED.get());
        this.dropSelf(ModBlocks.LEIA_EGG_BED.get());
        this.dropSelf(ModBlocks.NICKI_EGG_BED.get());
        this.dropSelf(ModBlocks.PUCA_EGG_BED.get());
        this.dropSelf(ModBlocks.PASTEL_EGG_BED.get());
        this.dropSelf(ModBlocks.IRIS_EGG_BED.get());
        this.dropSelf(ModBlocks.DELILAH_EGG_BED.get());
        this.dropSelf(ModBlocks.ACE_EGG_BED.get());
        this.dropSelf(ModBlocks.APPLE_EGG_BED.get());
        this.dropSelf(ModBlocks.PARZIVAL_EGG_BED.get());

//        this.add(ModBlocks.SAPPHIRE_ORE.get(),
//                block -> createCopperLikeOreDrops(ModBlocks.SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
//        this.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
//                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
//        this.add(ModBlocks.NETHER_SAPPHIRE_ORE.get(),
//                block -> createCopperLikeOreDrops(ModBlocks.NETHER_SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
//        this.add(ModBlocks.END_STONE_SAPPHIRE_ORE.get(),
//                block -> createCopperLikeOreDrops(ModBlocks.END_STONE_SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));

    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
