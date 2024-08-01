package net.loosaz.tcustomitems.item;

import net.loosaz.tcustomitems.TCustomItems;
import net.loosaz.tcustomitems.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier SAPPHIRE = TierSortingRegistry.registerTier(
            new ForgeTier(5, -1, 5f, 4f, 25,
                    ModTags.Blocks.NEEDS_WEAPONS, () -> Ingredient.of(ModItems.SAPPHIRE.get())),
            new ResourceLocation(TCustomItems.MOD_ID, "sapphire"), List.of(Tiers.NETHERITE), List.of());

}
