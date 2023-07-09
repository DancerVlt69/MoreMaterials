package de.bensonheimer.morematerials.core.init;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static de.bensonheimer.morematerials.Morematerials.MODID;
import static de.bensonheimer.morematerials.world.item.ModTab.addToTab;

public class ToolInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final RegistryObject<SwordItem> PLATIN_SWORD = addToTab(ITEMS.register("platin_sword",
            () -> new SwordItem(Tiers.NETHERITE, 10, 10f,
                    new Item.Properties().stacksTo(1))));

    public static final RegistryObject<PickaxeItem> PLATIN_PICKAXE = addToTab(ITEMS.register("platin_pickaxe",
            () -> new PickaxeItem(Tiers.NETHERITE, 2, 2f,
                    new Item.Properties().stacksTo(1))));

    public static final RegistryObject<ShovelItem> PLATIN_SHOVEL = addToTab(ITEMS.register("platin_shovel",
            () -> new ShovelItem(Tiers.NETHERITE,2,2f,
                    new Item.Properties().stacksTo(1))));

    public static final RegistryObject<AxeItem> PLATIN_AXE = addToTab(ITEMS.register("platin_axe",
            () -> new AxeItem(Tiers.NETHERITE,14,14f,
                    new Item.Properties().stacksTo(1))));

    public static final RegistryObject<HoeItem> PLATIN_HOE = addToTab(ITEMS.register("platin_hoe",
            () -> new HoeItem(Tiers.NETHERITE,1,1f,
                    new Item.Properties().stacksTo(1))));

    public static void register(IEventBus eventBus){

        ITEMS.register(eventBus);

    }


}
