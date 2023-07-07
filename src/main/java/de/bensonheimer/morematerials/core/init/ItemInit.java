package de.bensonheimer.morematerials.core.init;

import de.bensonheimer.morematerials.Morematerials;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Morematerials.MODID);

    public static final RegistryObject<Item> PLATIN = ITEMS.register("platin", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PLATIN = ITEMS.register("raw_platin", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATIN_NUGGET = ITEMS.register("platin_nugget", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){

        ITEMS.register(eventBus);

    }

}
