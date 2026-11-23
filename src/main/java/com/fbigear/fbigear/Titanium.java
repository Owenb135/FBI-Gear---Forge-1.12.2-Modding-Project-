package com.fbigear.fbigear;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Titanium extends Item {
    public Titanium() {
        setUnlocalizedName("tit");
        setRegistryName("tit");
        setCreativeTab(CreativeTabs.MISC);
    }
    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
    }

}
