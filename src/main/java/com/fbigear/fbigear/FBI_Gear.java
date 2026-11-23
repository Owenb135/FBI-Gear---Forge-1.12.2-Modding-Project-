
package com.fbigear.fbigear;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = FBI_Gear.MODID, name = FBI_Gear.NAME, version = FBI_Gear.VERSION)
public class FBI_Gear
{
    public static final String MODID = "fbigear";
    public static final String NAME = "FBI Gear";
    public static final String VERSION = "1.0";

    private static Logger logger;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
        logger.info("LOADING FBI GEAR ITEMS.....");}}



 ////TODO: Change MODID and make the base of FBI Gear✔
///TODO: Make Titanium Cutter