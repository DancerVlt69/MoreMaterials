package de.bensonheimer.morematerials.items;

import de.bensonheimer.morematerials.core.init.ItemInit;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ToolTiers {
    public static final ForgeTier PLATIN_SWORD = new ForgeTier(
            3,
            1400,
            1.5f,
            3f,
            22,
            BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ItemInit.PLATIN.get()));
    public static final ForgeTier PLATIN_PICKAXE = new ForgeTier(
            3,
            2800,
            7f,
            1.5f,
            22,
            BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ItemInit.PLATIN.get()));
    public static final ForgeTier PLATIN_SCHOVEL = new ForgeTier(
            3,
            2800,
            7f,
            1.5f,
            22,
            BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ItemInit.PLATIN.get()));
    public static final ForgeTier PLATIN_AXE = new ForgeTier(
            1,
            2800,
            7f,
            1.5f,
            22,
            BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ItemInit.PLATIN.get()));
    public static final ForgeTier PLATIN_HOE = new ForgeTier(
            1,
            2800,
            7f,
            1.5f,
            22,
            BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ItemInit.PLATIN.get()));
}