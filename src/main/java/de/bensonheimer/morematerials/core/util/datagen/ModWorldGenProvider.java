package de.bensonheimer.morematerials.core.util.datagen;

import de.bensonheimer.morematerials.world.feature.ModConfiguredFeatures;
import de.bensonheimer.morematerials.world.feature.ModPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;

import java.util.Collections;
import java.util.concurrent.CompletableFuture;

import static de.bensonheimer.morematerials.Morematerials.MODID;

public class ModWorldGenProvider  extends DatapackBuiltinEntriesProvider {

        private static final RegistrySetBuilder MOD_BUILDER = new RegistrySetBuilder()
                .add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap)
                .add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap);


        public ModWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {

            super(output, registries, MOD_BUILDER, Collections.singleton(MODID));
        }
}
