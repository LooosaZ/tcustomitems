package net.loosaz.tcustomitems.item;

import net.loosaz.tcustomitems.TCustomItems;
import net.loosaz.tcustomitems.item.custom.LadiizKarambit;
import net.loosaz.tcustomitems.item.custom.LoosaZSword;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TCustomItems.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> QUEST_TOKEN = ITEMS.register("quest_token",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> LOOSAZ_SWORD = ITEMS.register("loosaz_sword_1",
            () -> new LoosaZSword(ModToolTiers.SAPPHIRE, 661, -2, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> LADIIZ_KARAMBIT = ITEMS.register("ladiiz_karambit",
            () -> new LadiizKarambit(ModToolTiers.SAPPHIRE, 9, -2, new Item.Properties()));

    public static final RegistryObject<Item> LOOSAZ_HELMET = ITEMS.register("loosaz_helmet",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> LOOSAZ_CHESTPLATE = ITEMS.register("loosaz_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> LOOSAZ_LEGGINGS = ITEMS.register("loosaz_leggings",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> LOOSAZ_BOOTS = ITEMS.register("loosaz_boots",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
