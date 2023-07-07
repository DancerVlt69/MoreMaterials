package de.bensonheimer.morematerials;

import com.mojang.logging.LogUtils;
import de.bensonheimer.morematerials.core.init.*;
import de.bensonheimer.morematerials.world.item.ModTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
@Mod(Morematerials.MODID)
public class Morematerials {

    public static final String MODID = "morematerials";

    private static final Logger LOGGER = LogUtils.getLogger();

    public Morematerials() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.register(modEventBus);
        BlockInit.register(modEventBus);
        FoodInit.register(modEventBus);
        ArmorInit.register(modEventBus);
        ToolInit.register(modEventBus);
        ModTab.TABS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
