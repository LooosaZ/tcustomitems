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

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tsmp_custom_items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.tsmp_custom_items"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModBlocks.ARCHELON_EGG_BED.get());
                        pOutput.accept(ModBlocks.BLACKSTAR_EGG_BED.get());
                        pOutput.accept(ModBlocks.HAZEL_EGG_BED.get());
                        pOutput.accept(ModBlocks.PIAU_EGG_BED.get());
                        pOutput.accept(ModBlocks.SONIA_EGG_BED.get());
                        pOutput.accept(ModBlocks.TEXAS_EGG_BED.get());

                        pOutput.accept(ModItems.SAPPHIRE.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
