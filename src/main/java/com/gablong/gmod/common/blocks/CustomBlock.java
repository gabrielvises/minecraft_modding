package com.gablong.gmod.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import java.util.HashMap;
import java.util.Map;

public class CustomBlock extends Block {

    protected static final Map<Direction, VoxelShape> SHAPE = new HashMap<Direction, VoxelShape>();

    public CustomBlock(Properties properties) {
        super(properties);
    }




}
