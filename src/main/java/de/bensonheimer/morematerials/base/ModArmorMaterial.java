package de.bensonheimer.morematerials.base;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import static de.bensonheimer.morematerials.Morematerials.MODID;

public class ModArmorMaterial implements ArmorMaterial {
    private final int[] durabilityForType;
    private final int[] defenseForType;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final Ingredient repairMaterial;
    private final String name;
    private final float toughness;
    private final float knockbackResistance;

    public ModArmorMaterial(int[] durabilityForType, int[] defenseForType, int enchantability, SoundEvent equipSound,
							Ingredient repairMaterial, String name, float toughness, float knockbackResistance) {
        this.durabilityForType = durabilityForType;
        this.defenseForType = defenseForType;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.repairMaterial = repairMaterial;
        this.name = name;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
    }

    public int getDurabilityForType(ArmorItem.Type type) {
        return this.durabilityForType[type.ordinal()];
    }

    public int getDefenseForType(ArmorItem.Type type) {
        return this.defenseForType[type.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public @NotNull SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public @NotNull Ingredient getRepairIngredient() {
        return this.repairMaterial;
    }

    @Override
    public @NotNull String getName() {
        return MODID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
