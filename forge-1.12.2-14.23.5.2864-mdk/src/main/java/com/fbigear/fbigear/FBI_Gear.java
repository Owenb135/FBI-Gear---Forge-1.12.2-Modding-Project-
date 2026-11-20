package com.fbigear.fbigear;

import net.minecraft.init.Items;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.potion.PotionUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Logger;

@Mod(modid = FBI_Gear.MODID, name = FBI_Gear.NAME, version = FBI_Gear.VERSION)
public class FBI_Gear {
    public static final String MODID = "fbigear";
    public static final String NAME = "FBI Gear";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("LOADING FBI GEAR RECIPES.....");

        // 1. Create a specific stack for Potion of Night Vision (3:00)
        // PotionUtils.addPotionToItemStack applies the NBT data for the effect to a standard potion item
        ItemStack nightVisionPotion = PotionUtils.addPotionToItemStack(
                new ItemStack(Items.POTIONITEM), PotionTypes.NIGHT_VISION);

        // 2. Register the shaped recipe
        Object t;
        GameRegistry.addShapedRecipe(
                new ResourceLocation(MODID, "nvg_recipe"), // Unique name for the recipe
                new ResourceLocation(MODID, "nvg_group"),  // Optional group name
                new ItemStack(ModItems.NIGHT_VISION_GLASSES), // The item produced
                "DDD",
                "DID",
                "DDD",
                'D', t;
                'I', Ingredient.fromStacks(nightVisionPotion); // The potion with specific NBT
        );
    }
}

// OLD VERSION:
//package com.fbigear.fbigear;
//
//import net.minecraft.init.Blocks;
//import net.minecraftforge.fml.common.Mod;
//import net.minecraftforge.fml.common.Mod.EventHandler;
//import net.minecraftforge.fml.common.event.FMLInitializationEvent;
//import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
//import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
//import org.apache.logging.log4j.Logger;
//
//@Mod(modid = FBI_Gear.MODID, name = FBI_Gear.NAME, version = FBI_Gear.VERSION)
//public class FBI_Gear
//{
//    public static final String MODID = "fbigear";
//    public static final String NAME = "FBI Gear";
//    public static final String VERSION = "1.0";
//
//    private static Logger logger;
//
//
//    @EventHandler
//    public void preInit(FMLPreInitializationEvent event)
//    {
//        logger = event.getModLog();
//    }
//
//    @EventHandler
//    public void init(FMLInitializationEvent event)
//    {
//        // some example code
//        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
//        logger.info("LOADING FBI GEAR ITEMS.....");}}
//
//
//
//// TODO: Change MODID and make the base of FBI Gear✔
// TODO: Make Titanium Cutter