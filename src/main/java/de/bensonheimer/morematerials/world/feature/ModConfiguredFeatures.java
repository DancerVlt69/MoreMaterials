package de.bensonheimer.morematerials.world.feature;

import com.google.common.base.Suppliers;
import de.bensonheimer.morematerials.Morematerials;
import de.bensonheimer.morematerials.core.init.BlockInit;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class ModConfiguredFeatures {

    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, Morematerials.MODID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_PLATIN_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.PLATIN_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.DEEPSLATE_PLATIN_ORE.get().defaultBlockState())));


    public static final RegistryObject<ConfiguredFeature<?, ?>> DEEPSLATE_PLATIN_ORE = CONFIGURED_FEATURES.register("deepslate_platin_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_PLATIN_ORES.get(),3)));

    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);


    }

}
