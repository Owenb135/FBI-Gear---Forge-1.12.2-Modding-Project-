package com.fbigear.fbigear;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class titc extends ItemSword {
    public titc(ToolMaterial material) {
        super(material);
        setUnlocalizedName("titc");
        setRegistryName("titc");
        setCreativeTab(CreativeTabs.COMBAT);
    }

}
