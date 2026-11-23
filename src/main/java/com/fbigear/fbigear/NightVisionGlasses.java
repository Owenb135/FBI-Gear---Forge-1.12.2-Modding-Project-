package com.fbigear.fbigear;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.creativetab.CreativeTabs;

public class NightVisionGlasses extends ItemArmor {

    public NightVisionGlasses(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName("night_vision_glasses");
        setRegistryName("night_vision_glasses");
        setCreativeTab(CreativeTabs.COMBAT);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        // Apply night vision potion effect
        // 200 ticks = 10 seconds, amplifier 0 = Night Vision I
        // "true" hides potion particles
        int infinite;
        infinite = 250;
        player.addPotionEffect(new PotionEffect(Potion.getPotionById(16), infinite, 0, false, false));
    }


}

