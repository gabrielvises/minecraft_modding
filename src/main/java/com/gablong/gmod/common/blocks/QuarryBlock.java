package com.gablong.gmod.common.blocks;

import com.gablong.gmod.core.init.TileEntityTypesInit;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

public class QuarryBlock extends Block {
    public QuarryBlock() {
        super(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_GRAY).sound(SoundType.METAL));
    }


    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return TileEntityTypesInit.EXAMPLE_TILE_ENTITY_TYPE.get().create();
    }
}
