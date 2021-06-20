package com.gablong.gmod.client.event;

import com.gablong.gmod.TutorialMod;
import com.gablong.gmod.core.init.ItemInit;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientEvents {

    @SubscribeEvent
    public static void renderHand(final RenderHandEvent event) {
        MatrixStack matrixStack = event.getMatrixStack();

        if(event.getItemStack().getItem().equals(ItemInit.GAY_DUST.get())) {
        event.setCanceled(true);
//            matrixStack.pushPose();
//            matrixStack.scale(1.5f, 1.5f, 1.5f);
//            matrixStack.popPose();
        }
    }

}
