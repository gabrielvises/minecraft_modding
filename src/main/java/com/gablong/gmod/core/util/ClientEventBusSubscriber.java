package com.gablong.gmod.core.util;

import com.gablong.gmod.TutorialMod;
import com.gablong.gmod.client.render.entity.ExampleEntityRenderer;
import com.gablong.gmod.core.init.EntityTypesInit;
import com.gablong.gmod.core.init.KeybindsInit;
import com.gablong.gmod.core.network.TutorialNetwork;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        KeybindsInit.register(event);
        RenderingRegistry.registerEntityRenderingHandler(EntityTypesInit.EXAMPLE.get(), ExampleEntityRenderer::new);
    }


}
