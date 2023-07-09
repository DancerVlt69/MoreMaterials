package de.bensonheimer.morematerials.core.init;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static de.bensonheimer.morematerials.Morematerials.MODID;
import static de.bensonheimer.morematerials.world.item.ModTab.addToTab;

public class ItemInit {

     public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final RegistryObject<Item> PLATIN_INGOT = addToTab(ITEMS.register("platin_ingot",
			() -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> RAW_PLATIN = addToTab(ITEMS.register("raw_platin",
			() -> new Item(new Item.Properties())));

    public static final RegistryObject<Item> PLATIN_NUGGET = addToTab(ITEMS.register("platin_nugget",
			() -> new Item(new Item.Properties())));

    public static void register(IEventBus eventBus){

        ITEMS.register(eventBus);

    }

}
