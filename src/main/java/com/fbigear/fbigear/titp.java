package com.fbigear.fbigear;

import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.creativetab.CreativeTabs;

import java.util.Collections;
import java.util.Set;

public class titp extends ItemTool {
    private static final Set<Block> EFFECTIVE_BLOCKS = Sets.newHashSet(
            Blocks.PLANKS,
            Blocks.BOOKSHELF,
            Blocks.LOG,
            Blocks.LOG2,
            Blocks.CHEST,
            Blocks.PUMPKIN,
            Blocks.LIT_PUMPKIN,
            Blocks.MELON_BLOCK,
            Blocks.LADDER,
            Blocks.WOODEN_BUTTON,
            Blocks.WOODEN_PRESSURE_PLATE,
            Blocks.LEAVES,
            Blocks.LEAVES2
    );

    public titp(Item.ToolMaterial material) {
        super(6.0F, -3.2F, material, EFFECTIVE_BLOCKS);
        setUnlocalizedName("titp");
        setRegistryName("titp");
        setCreativeTab(CreativeTabs.COMBAT);
        setHarvestLevel("axe", material.getHarvestLevel());
    }

    @Override
    public Set<String> getToolClasses(ItemStack stack) {
        return Collections.singleton("axe");
    }
}
