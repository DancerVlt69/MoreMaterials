package de.bensonheimer.morematerials.world.item;

import de.bensonheimer.morematerials.core.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTab {

    public static final CreativeModeTab TAB = new CreativeModeTab("morematerials") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.PLATIN.get());
        }
    };

}
