package com.fbigear.fbigear;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class titp extends ItemAxe {
    protected titp(ToolMaterial material) {
        super(material);
    }

    // --Commented out by Inspection START (1/20/2026 8:41 PM):
//    public titp(ToolMaterial material) {
//        super(material);
//        setUnlocalizedName("titp");
//        setRegistryName("titp");
//        setCreativeTab(CreativeTabs.COMBAT);
//    }
// --Commented out by Inspection STOP (1/20/2026 8:41 PM)
    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
    }

}
