package net.loosaz.tcustomitems.item;

import net.loosaz.tcustomitems.TCustomItems;
import net.loosaz.tcustomitems.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TCustomItems.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BEDS_TAB = CREATIVE_MODE_TABS.register("tsmp_custom_beds",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BLACKSTAR_EGG_BED.get()))
                    .title(Component.translatable("creativetab.tsmp_custom_beds"))
                    .displayItems((pParameters, pOutput) -> {

                        //items that will show up on the creative BEDS_TAB tab
                        pOutput.accept(ModBlocks.ARCHELON_EGG_BED.get());
                        pOutput.accept(ModBlocks.BLACKSTAR_EGG_BED.get());
                        pOutput.accept(ModBlocks.HAZEL_EGG_BED.get());
                        pOutput.accept(ModBlocks.PIAU_EGG_BED.get());
                        pOutput.accept(ModBlocks.SONIA_EGG_BED.get());
                        pOutput.accept(ModBlocks.TEXAS_EGG_BED.get());
                        pOutput.accept(ModBlocks.DARLING_EGG_BED.get());
                        pOutput.accept(ModBlocks.KILLEE_EGG_BED.get());
                        pOutput.accept(ModBlocks.LEIA_EGG_BED.get());

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> ITEMS_TAB = CREATIVE_MODE_TABS.register("tsmp_custom_items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.LOOSAZ_SWORD.get()))
                    .title(Component.translatable("creativetab.tsmp_custom_items"))
                    .displayItems((pParameters, pOutput) -> {

                        //items that will show up on the creative ITEMS_TAB tab
                        pOutput.accept(ModItems.LOOSAZ_SWORD.get());
                        pOutput.accept(ModItems.LOOSAZ_HELMET.get());
                        pOutput.accept(ModItems.LOOSAZ_CHESTPLATE.get());
                        pOutput.accept(ModItems.LOOSAZ_LEGGINGS.get());
                        pOutput.accept(ModItems.LOOSAZ_BOOTS.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
