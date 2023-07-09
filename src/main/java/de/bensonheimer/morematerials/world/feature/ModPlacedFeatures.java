package de.bensonheimer.morematerials.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

import static de.bensonheimer.morematerials.Morematerials.MODID;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> DEEPSLATE_PLATIN_ORE_PLAYCED_KEY = createKey("deepslate_platin_ore_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, DEEPSLATE_PLATIN_ORE_PLAYCED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DEEPSLATE_PLATIN_ORE_KEY),
                commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64),
                        VerticalAnchor.absolute(320))));
    }

    public static List<PlacementModifier> orePlacement(PlacementModifier p195347, PlacementModifier p195348) {
        return List.of(p195347, InSquarePlacement.spread(), p195348, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int p195344, PlacementModifier p195345) {
        return orePlacement(CountPlacement.of(p195344), p195345);
    }

    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(MODID, name));
    }

    public static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key,
                                Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    public static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key,
                                Holder<ConfiguredFeature<?, ? >> configuration, PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
