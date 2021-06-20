package com.gablong.gmod.core.init;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FoodInit {
    public static final Food FADA_EROTICA = new Food.Builder()
            .effect(() -> new EffectInstance(Effects.MOVEMENT_SPEED, 100, 2), 0.5f)
            .fast()
            .saturationMod(1.0f)
            .effect(() -> new EffectInstance(Effects.POISON, 60), 0.05f)
            .meat()
            .build();
}
