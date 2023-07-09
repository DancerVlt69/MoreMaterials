package de.bensonheimer.morematerials.core.init;

import de.bensonheimer.morematerials.itemtiers.FoodTiers;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static de.bensonheimer.morematerials.Morematerials.MODID;
import static de.bensonheimer.morematerials.world.item.ModTab.addToTab;

public class FoodInit {

     public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    //Food
    public static final RegistryObject<Item> PLATIN_APPEL = addToTab(ITEMS.register("platin_apple",
            () -> new Item(new Item.Properties().food(FoodTiers.PLATIN_APPLE))));

    public static final RegistryObject<Item> PLATIN_STEAK = addToTab(ITEMS.register("platin_steak",

            () -> new Item(new Item.Properties().food(FoodTiers.PLATIN_STEAK))));

    public static void register(IEventBus eventBus){

        ITEMS.register(eventBus);

    }

}
