package com.gablong.gmod.core.event;

import com.gablong.gmod.TutorialMod;
import com.gablong.gmod.core.init.BlockInit;
import net.minecraft.block.AnvilBlock;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.item.ArmorStandEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.math.BlockPos;

import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;


@EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = EventBusSubscriber.Bus.FORGE)
public class EventHandler {

    @SubscribeEvent
    public static void onBlockBreak(final BlockEvent.BreakEvent event) {
        IWorld world = event.getWorld();
        BlockPos pos = event.getPos();
        if(event.getState().getBlock() instanceof AnvilBlock) {
            EventHandler.setBlocks(world, pos);
        } else if (event.getPlayer().hasItemInSlot(EquipmentSlotType.HEAD) && world instanceof World) {
            ArmorStandEntity armorStand = new ArmorStandEntity(EntityType.ARMOR_STAND, (World) world);
            armorStand.setPos(pos.getX(), pos.getY(), pos.getZ());
            world.addFreshEntity(armorStand);
        }
    }

    private static void setBlocks(IWorld world, BlockPos pos) {
        for (int i = -5; i < 5; i++) {
            for (int j = -5; j < 5; j++) {
                for (int k = -5; k < 5; k++) {
                    world.setBlock(pos.offset(i, j, k), BlockInit.GAY_BLOCK.get().defaultBlockState(), Constants.BlockFlags.BLOCK_UPDATE);

                }
            }
        }
    }

    @SubscribeEvent
    public static void onRightClick(final PlayerInteractEvent.RightClickBlock event) {

//        if(event.getState().getBlock().equals(BlockInit.GAY_BLOCK.get().getBlock())) {
//
//        }
    }
}
