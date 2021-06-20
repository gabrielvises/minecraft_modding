package com.gablong.gmod.common.te;

import com.gablong.gmod.core.init.TileEntityTypesInit;
import net.minecraft.block.Blocks;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class QuarryTileEntity extends TileEntity implements ITickableTileEntity {

    public QuarryTileEntity(TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }

    public QuarryTileEntity() {
        this(TileEntityTypesInit.EXAMPLE_TILE_ENTITY_TYPE.get());
    }

    @Override
    public void tick() {
        World worldIn = getLevel();
//        ZombieEntity zombie = new ZombieEntity(worldIn);
//        zombie.setPos(getBlockPos().getX(), getBlockPos().getY(), getBlockPos().getZ());
//        worldIn.addFreshEntity(zombie);
        worldIn.setBlock(this.worldPosition.below(), Blocks.AIR.getBlock().defaultBlockState(), 1);
    }

    @Nullable
    @Override
    public World getLevel() {
        return super.getLevel();
    }
}