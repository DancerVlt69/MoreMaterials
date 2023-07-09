package de.bensonheimer.morematerials.core.init;

import de.bensonheimer.morematerials.base.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static de.bensonheimer.morematerials.Morematerials.MODID;
import static de.bensonheimer.morematerials.world.item.ModTab.addToTab;

public class ArmorInit {

     public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final RegistryObject<ArmorItem> PLATIN_HELMET = addToTab(ITEMS.register("platin_helmet",
            () -> new ArmorItem(ArmorMaterial.PLATIN_ARMOR,ArmorItem.Type.HELMET,new Item.Properties())));

    public static final RegistryObject<ArmorItem> PLATIN_CHESTPLATE = addToTab(ITEMS.register("platin_chestplate",
            () -> new ArmorItem(ArmorMaterial.PLATIN_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties())));

    public static final RegistryObject<ArmorItem> PLATIN_LEGGINGS = addToTab(ITEMS.register("platin_leggings",
            () -> new ArmorItem(ArmorMaterial.PLATIN_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties())));

    public static final RegistryObject<ArmorItem> PLATIN_BOOTS = addToTab(ITEMS.register("platin_boots",
            () -> new ArmorItem(ArmorMaterial.PLATIN_ARMOR,ArmorItem.Type.BOOTS, new Item.Properties())));

    public static void register(IEventBus eventBus){

		ITEMS.register(eventBus);

    }
}
