package com.fbigear.fbigear;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistryHandler {
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(ModItems.titc);
        event.getRegistry().register(ModItems.Titanium);
        event.getRegistry().register(ModItems.titp);
        event.getRegistry().register(ModItems.NIGHT_VISION_GLASSES);
        ;
    }
}
