package de.bensonheimer.morematerials.world.item;

import de.bensonheimer.morematerials.core.init.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import static de.bensonheimer.morematerials.Morematerials.MODID;

@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModTab {

    public static final DeferredRegister<CreativeModeTab> MOD_TABS =
			DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

	public static final List<Supplier<? extends ItemLike>> MOREMATERIALS_TAB_ITEMS = new ArrayList<>();
	private static final String TAB_KEY1 = MODID + ".tab1"; private static final String TAB_KEY2 = MODID + ".tab2";
    private static final ResourceLocation TAB_ID1 = new ResourceLocation(TAB_KEY1);
	private static final ResourceLocation TAB_ID2 = new ResourceLocation(TAB_KEY2);


	public static final RegistryObject<CreativeModeTab> MOREMATERIALS_TAB1 = MOD_TABS.register("tab1",
			() -> CreativeModeTab.builder()
					.title(Component.translatable("itemGroup." + TAB_KEY1))
					.icon(ItemInit.PLATIN_INGOT.get()::getDefaultInstance)
					.displayItems((displayParams, output) ->
							MOREMATERIALS_TAB_ITEMS.forEach(itemLike -> output.accept(itemLike.get())))
					.build());

//    public static final RegistryObject<CreativeModeTab> MOREMATERIALS_TAB2 = MOD_TABS.register(TAB_KEY2,
//            () -> CreativeModeTab.builder()
//                    .title(Component.translatable("itemGroup." + TAB_KEY2))
//					  .icon(ToolInit.PLATIN_SWORD.get()::getDefaultInstance)
//					  .displayItems((displayParams, output) ->
//                            ItemsRegister.MOD_ITEMS.getEntries().stream().map(RegistryObject::get)
//									.forEach(output::accept))
//
//					.withSearchBar().build());

    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemLike) {
        MOREMATERIALS_TAB_ITEMS.add(itemLike);
		return itemLike;
	}

//
//    @SubscribeEvent
//    public static void buildContents(BuildCreativeModeTabContentsEvent event) {
//        if(event.getTab() == MOREMATERIALS_TAB.get()) {
//            event.accept(ToolInit.PLATIN_SWORD);
//            event.accept(ToolInit.PLATIN_PICKAXE);
//            event.accept(ToolInit.PLATIN_SHOVEL);
//            event.accept(ToolInit.PLATIN_HOE);
//            event.accept(BlockInit.DEEPSLATE_PLATIN_ORE);
//            event.accept(BlockInit.PLATIN_ORE);
//            event.accept(BlockInit.PLATIN_BLOCK);
//            event.accept(ArmorInit.PLATIN_HELMET);
//            event.accept(ArmorInit.PLATIN_CHESTPLATE);
//            event.accept(ArmorInit.PLATIN_LEGGINGS);
//            event.accept(ArmorInit.PLATIN_BOOTS);
//            event.accept(FoodInit.PLATIN_APPEL);
//            event.accept(FoodInit.PLATIN_STEAK);
//            event.accept(ItemInit.PLATIN_INGOT);
//            event.accept(ItemInit.PLATIN_NUGGET);
//            event.accept(ItemInit.RAW_PLATIN);
//
//        }
//    }
}
