package net.loosaz.tcustomitems.block;

import net.loosaz.tcustomitems.TCustomItems;
import net.loosaz.tcustomitems.block.custom.PiauEggBed;
import net.loosaz.tcustomitems.block.custom.SoniaEggBed;
import net.loosaz.tcustomitems.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TCustomItems.MOD_ID);

    public static final RegistryObject<Block> PIAU_EGG_BED = registerBlock("piau_egg_bed",
            () -> new PiauEggBed(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.DECORATED_POT_CRACKED).noOcclusion().dynamicShape().noParticlesOnBreak()));
    public static final RegistryObject<Block> SONIA_EGG_BED = registerBlock("sonia_egg_bed",
            () -> new SoniaEggBed(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.DECORATED_POT_CRACKED).noOcclusion().dynamicShape().noParticlesOnBreak()));
    public static final RegistryObject<Block> TEXAS_EGG_BED = registerBlock("texas_egg_bed",
            () -> new SoniaEggBed(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.DECORATED_POT_CRACKED).noOcclusion().dynamicShape().noParticlesOnBreak()));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
