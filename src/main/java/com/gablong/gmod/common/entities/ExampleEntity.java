package com.gablong.gmod.common.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class ExampleEntity extends WitherEntity {
    public ExampleEntity(EntityType<? extends WitherEntity> p_i50226_1_, World p_i50226_2_) {
        super(p_i50226_1_, p_i50226_2_);
    }
//    public ExampleEntity(EntityType<? extends MobEntity> type, World worldIn) {
//        super(type, worldIn);
//    }

    public static AttributeModifierMap.MutableAttribute setAttributes() {
        return MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 20.0f)
                .add(Attributes.ATTACK_DAMAGE, 5.0f)
                .add(Attributes.ATTACK_SPEED, 1.4f)
                .add(Attributes.MOVEMENT_SPEED, 1.4f);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();

        this.goalSelector.addGoal(1, new LookRandomlyGoal(this));
        this.goalSelector.addGoal(1, new LookAtGoal(this, PlayerEntity.class, 8.0f));
        this.goalSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
    }

    @Override
    protected int getExperienceReward(PlayerEntity p_70693_1_) {
        return 5;
    }

}
