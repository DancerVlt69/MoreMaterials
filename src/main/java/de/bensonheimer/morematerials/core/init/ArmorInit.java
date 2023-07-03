package de.bensonheimer.morematerials.core.init;

import de.bensonheimer.morematerials.Morematerials;
import de.bensonheimer.morematerials.base.CustomArmorMaterial;
import de.bensonheimer.morematerials.world.item.ModTab;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ArmorInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Morematerials.MODID);
    //Armor
    public static final RegistryObject<ArmorItem> PLATIN_HELMET = ITEMS.register("platin_helmet",
            () -> new ArmorItem(CustomArmorMaterial.PLATIN_ARMOR, EquipmentSlot.HEAD, new Item.Properties().tab(ModTab.TAB).stacksTo(1)));
    public static final RegistryObject<ArmorItem> PLATIN_CHESTPLATE = ITEMS.register("platin_chestplate",
            () -> new ArmorItem(CustomArmorMaterial.PLATIN_ARMOR,EquipmentSlot.CHEST, new Item.Properties().tab(ModTab.TAB).stacksTo(1)));
    public static final RegistryObject<ArmorItem> PLATIN_LEGGINGS = ITEMS.register("platin_leggings",
            () -> new ArmorItem(CustomArmorMaterial.PLATIN_ARMOR, EquipmentSlot.LEGS, new Item.Properties().tab(ModTab.TAB).stacksTo(1)));
    public static final RegistryObject<ArmorItem> PLATIN_BOOTS = ITEMS.register("platin_boots",
            () -> new ArmorItem(CustomArmorMaterial.PLATIN_ARMOR, EquipmentSlot.FEET, new Item.Properties().tab(ModTab.TAB).stacksTo(1)));

    public static void register(IEventBus eventBus){

        ITEMS.register(eventBus);

    }
}
