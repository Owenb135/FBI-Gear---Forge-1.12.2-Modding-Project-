package com.fbigear.fbigear;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ArmorHudHandler {

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void onRenderGui(RenderGameOverlayEvent.Post event) {
        // We only want to draw when the game is drawing text (hotbar, etc)
        if (event.getType() != RenderGameOverlayEvent.ElementType.HOTBAR) return;

        Minecraft mc = Minecraft.getMinecraft();
        // Check if the player is wearing your glasses in the head slot
        ItemStack helmet = mc.player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);

        // Replace 'YourModItems.night_vision_glasses' with your actual item variable
        if (!helmet.isEmpty() && helmet.getItem() instanceof NightVisionGlasses) {
            FontRenderer fr = mc.fontRenderer;
            // Draw "p" in white (0xFFFFFF) at coordinates X:5, Y:5
            fr.drawStringWithShadow("NIGHT VISON GLASSES V.1.0", 5, 5, 0xFFFFFF);
        }
    }
}
