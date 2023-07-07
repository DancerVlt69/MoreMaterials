package de.bensonheimer.morematerials.core.init;

import de.bensonheimer.morematerials.Morematerials;
import de.bensonheimer.morematerials.items.FoodTiers;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FoodInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Morematerials.MODID);
    //Food
    public static final RegistryObject<Item> PLATIN_APPEL = ITEMS.register("platin_apple",
            () -> new Item(new Item.Properties().food(FoodTiers.PLATIN_APPLE)));
    public static final RegistryObject<Item> PLATIN_STEAK = ITEMS.register("platin_steak",
            () -> new Item(new Item.Properties().food(FoodTiers.PLATIN_STEAK)));

    public static void register(IEventBus eventBus){

        ITEMS.register(eventBus);

    }

}
