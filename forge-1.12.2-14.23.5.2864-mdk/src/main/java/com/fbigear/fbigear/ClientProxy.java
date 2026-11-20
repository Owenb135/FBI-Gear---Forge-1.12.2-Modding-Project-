package com.fbigear.fbigear;

import com.fbigear.fbigear.CommonProxy;
import com.fbigear.fbigear.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(value = Side.CLIENT, modid = "fbigear")
public class ClientProxy extends CommonProxy {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        // This links the item to its JSON model file
        registerItemModel(ModItems.NIGHT_VISION_GLASSES, 0, "n.v.g");
        registerItemModel3(ModItems.Titanium,0,"tit");
        registerItemModel4(ModItems.titc,0,"titc");
        registerItemModel5(ModItems.titp,0,"titp");
        net.minecraftforge.common.MinecraftForge.EVENT_BUS.register(new ArmorHudHandler());

    }

    private static void registerItemModel(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
    public static void registerItemModel2(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(),"inventory"));
    }
    public static void registerItemModel3(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item,meta, new ModelResourceLocation(item.getRegistryName(),"inventory"));
    }
    public static void registerItemModel4(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item,meta,new ModelResourceLocation(item.getRegistryName(),"inventory"));
    }
    public static void registerItemModel5(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item,meta,new ModelResourceLocation(item.getRegistryName(),"inventory"));
    }


}

