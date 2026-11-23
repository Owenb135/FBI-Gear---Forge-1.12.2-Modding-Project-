package com.fbigear.fbigear;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<Item>();
    public static final Item Titanium = new Titanium();
    public static final Item.ToolMaterial TITANIUM_MATERIAL = EnumHelper.addToolMaterial(
            "titanium", 10, 4000, 8.0F, 30.0F, 20
    );
    public static final Item.ToolMaterial TITPM = EnumHelper.addToolMaterial("titp",45,5000,75.0F,35.0F,25);
    public static final Item titc = new titc(TITANIUM_MATERIAL);
    public static final Item titp = new titp(TITPM);
    public static final Item NIGHT_VISION_GLASSES = new NightVisionGlasses(ItemArmor.ArmorMaterial.DIAMOND, 1, EntityEquipmentSlot.HEAD);
    public static final Item DRIED_IRON = new DiedIron();
}
