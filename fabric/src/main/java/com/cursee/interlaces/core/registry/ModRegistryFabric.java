package com.cursee.interlaces.core.registry;

import com.cursee.interlaces.Constants;
import com.cursee.interlaces.core.block.ModBlocksFabric;
import com.cursee.interlaces.core.item.ModItemsFabric;
import com.cursee.interlaces.core.tab.ModCreativeModeTabsFabric;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModRegistryFabric {

    public static void register() {

        ModBlocksFabric.register();
        ModItemsFabric.register();
        ModCreativeModeTabsFabric.register();
    }

    public static <T extends Block> T registerBlock(String name, T block) {
        return Registry.register(BuiltInRegistries.BLOCK,
                new ResourceLocation(Constants.MOD_ID, name), block);
    }

    public static <T extends Item> T registerItem(String name, T item) {
        return Registry.register(BuiltInRegistries.ITEM,
                new ResourceLocation(Constants.MOD_ID, name), item);
    }

    public static <T extends Block> T registerBlockAndBlockItem(String name, T block) {
        registerItem(name, new BlockItem(block, new Item.Properties()));
        return registerBlock(name, block);
    }

    public static <T extends CreativeModeTab> T registerCreativeModeTab(String tabID, T tab) {
        return Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(Constants.MOD_ID, tabID), tab);
    }
}
