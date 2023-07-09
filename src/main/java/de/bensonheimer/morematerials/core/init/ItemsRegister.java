package de.bensonheimer.morematerials.core.init;

import de.bensonheimer.morematerials.world.item.ModTab;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static de.bensonheimer.morematerials.Morematerials.MODID;

public class ItemsRegister {

	public static final DeferredRegister<Item> MOD_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
	/** Register the Items */
	public static void registerModItems(IEventBus eventBus) { MOD_ITEMS.register(eventBus); }

	public static RegistryObject<Item> registerModItem(String itemName) {
		return (ModTab.addToTab(MOD_ITEMS.register(itemName, () -> new Item(new Item.Properties()))));
	}
}
