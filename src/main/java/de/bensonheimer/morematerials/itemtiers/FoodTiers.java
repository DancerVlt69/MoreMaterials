package de.bensonheimer.morematerials.itemtiers;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class FoodTiers {

    public static final FoodProperties PLATIN_APPLE = new FoodProperties.Builder()
            .nutrition(6)
            .saturationMod(0.8f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 300, 3), 1.0f)
            .build();
    public static final FoodProperties PLATIN_STEAK = new FoodProperties.Builder()
            .nutrition(6)
            .saturationMod(20)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 600,5), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 5), 1.0F)
            .meat()
            .fast()
            .build();

}

