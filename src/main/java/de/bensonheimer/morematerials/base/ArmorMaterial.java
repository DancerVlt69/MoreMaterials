package de.bensonheimer.morematerials.base;

import de.bensonheimer.morematerials.core.init.ItemInit;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public class ArmorMaterial {
    public static final ModArmorMaterial PLATIN_ARMOR = new ModArmorMaterial(
            new int[] { 500, 1200, 600, 400 },
            new int[] { 11, 16, 15, 13 },
            20,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.of(ItemInit.PLATIN::get),
            "platin",
            0.25f,
            0.15f
    );
}
