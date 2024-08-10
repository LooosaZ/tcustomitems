package net.loosaz.tcustomitems;

import com.mojang.logging.LogUtils;
import net.loosaz.tcustomitems.block.ModBlocks;
import net.loosaz.tcustomitems.item.ModCreativeModTabs;
import net.loosaz.tcustomitems.item.ModItems;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.ItemModelShaper;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ScreenEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TCustomItems.MOD_ID)
public class TCustomItems {
    public static final String MOD_ID = "tcustomitems";
    public static final Logger LOGGER = LogUtils.getLogger();

    public TCustomItems() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACE_EGG_BED.get(),RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ARCHELON_EGG_BED.get(),RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACKSTAR_EGG_BED.get(),RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARLING_EGG_BED.get(),RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DELILAH_EGG_BED.get(),RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.HAZEL_EGG_BED.get(),RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.IRIS_EGG_BED.get(),RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.KILLEE_EGG_BED.get(),RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LEIA_EGG_BED.get(),RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MADELINE_EGG_BED.get(),RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PASTEL_EGG_BED.get(),RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PARZIVAL_EGG_BED.get(),RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PIAU_EGG_BED.get(),RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PUCA_EGG_BED.get(),RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SONIA_EGG_BED.get(),RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TEXAS_EGG_BED.get(),RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.NICKI_EGG_BED.get(),RenderType.cutout());
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
