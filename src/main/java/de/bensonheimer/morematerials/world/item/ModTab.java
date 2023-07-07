package de.bensonheimer.morematerials.world.item;

import de.bensonheimer.morematerials.Morematerials;
import de.bensonheimer.morematerials.core.init.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = Morematerials.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModTab {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Morematerials.MODID);

    public static final List<Supplier<? extends ItemLike>> MOREMATERIALS_TAB_ITEMS = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> MOREMATERIALS_TAB = TABS.register("example_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.morematerials"))
                    .icon(ItemInit.PLATIN.get()::getDefaultInstance)
                    .displayItems((displayParams, output) ->
                            MOREMATERIALS_TAB_ITEMS.forEach(itemLike -> output.accept(itemLike.get())))
                    .withSearchBar()
                    .build()
    );

    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemLike) {
        MOREMATERIALS_TAB_ITEMS.add(itemLike);
        return itemLike;
    }

    @SubscribeEvent
    public static void buildContents(BuildCreativeModeTabContentsEvent event) {
        if(event.getTab() == MOREMATERIALS_TAB.get()) {
            event.accept(ToolInit.PLATIN_SWORD);
            event.accept(ToolInit.PLATIN_PICKAXE);
            event.accept(ToolInit.PLATIN_SHOVEL);
            event.accept(ToolInit.PLATIN_HOE);
            event.accept(BlockInit.DEEPSLATE_PLATIN_ORE);
            event.accept(BlockInit.PLATIN_ORE);
            event.accept(BlockInit.PLATIN_BLOCK);
            event.accept(ArmorInit.PLATIN_HELMET);
            event.accept(ArmorInit.PLATIN_CHESTPLATE);
            event.accept(ArmorInit.PLATIN_LEGGINGS);
            event.accept(ArmorInit.PLATIN_BOOTS);
            event.accept(FoodInit.PLATIN_APPEL);
            event.accept(FoodInit.PLATIN_STEAK);
            event.accept(ItemInit.PLATIN);
            event.accept(ItemInit.PLATIN_NUGGET);
            event.accept(ItemInit.RAW_PLATIN);

        }
    }
}
