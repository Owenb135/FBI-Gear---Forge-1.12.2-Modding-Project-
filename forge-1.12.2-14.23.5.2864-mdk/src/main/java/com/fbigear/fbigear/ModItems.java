package com.fbigear.fbigear;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    // This list helps keep track of all items for registration
    public static final List<Item> ITEMS = new ArrayList<Item>();

    // This is the specific instance your ClientProxy needs to set



    public static final Item Titanium = new Titanium();
    public static final Item.ToolMaterial TITANIUM_MATERIAL = EnumHelper.addToolMaterial(
            "titanium", 10, 4000, 8.0F, 30.0F, 20
    );
    public static final Item.ToolMaterial TITPM = EnumHelper.addToolMaterial("titp",15,10000,25.0F,40.0F,30);
    public static final Item titc = new titc(TITANIUM_MATERIAL);
    public static final Item titp = new titc(TITPM);
    public static final Item NIGHT_VISION_GLASSES = new NightVisionGlasses(ItemArmor.ArmorMaterial.DIAMOND, 1, EntityEquipmentSlot.HEAD);
}
