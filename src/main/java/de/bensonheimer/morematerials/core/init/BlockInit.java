package de.bensonheimer.morematerials.core.init;

import de.bensonheimer.morematerials.Morematerials;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockInit {


    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Morematerials.MODID);

    public static final RegistryObject<Block> DEEPSLATE_PLATIN_ORE = BLOCKS.register("deepslate_platin_ore",
            () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.STONE)
                    .strength(50.0F, 1200.0F)
                    .sound(SoundType.DEEPSLATE)));

    public static final RegistryObject<Block> PLATIN_BLOCK = BLOCKS.register("platin_block",
            () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.STONE)
                    .strength(100.0F, 2400.0F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.NETHERITE_BLOCK))
                    );


    public static final RegistryObject<Block> PLATIN_ORE = BLOCKS.register("platin_ore",
            () -> new Block(BlockBehaviour.Properties
                    .copy(Blocks.STONE)
                    .strength(25.0F, 600.0F)
                    .sound(SoundType.STONE)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab ){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));

    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
