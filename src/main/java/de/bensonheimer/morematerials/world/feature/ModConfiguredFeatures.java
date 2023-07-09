package de.bensonheimer.morematerials.world.feature;

import com.google.common.base.Suppliers;
import de.bensonheimer.morematerials.core.init.BlockInit;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

import static de.bensonheimer.morematerials.Morematerials.MODID;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_PLATIN_ORE_KEY = registerKey("deepslate_platin_ore_key");

    private static final RuleTest stoneRuleTest = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
    private static final RuleTest deepslateRuleTest = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_PLATIN_ORES = Suppliers.memoize(
            () -> List.of(
                    //OreConfiguration.target(stoneRuleTest, BlockInit.CITRINE_ORE.get().defaultBlockState()),
                    OreConfiguration.target(deepslateRuleTest, BlockInit.DEEPSLATE_PLATIN_ORE.get().defaultBlockState())));

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        HolderGetter<PlacedFeature> placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        register(context, DEEPSLATE_PLATIN_ORE_KEY, Feature.ORE, new OreConfiguration(OVERWORLD_PLATIN_ORES.get(), 4));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register
            (BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature,
             FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
