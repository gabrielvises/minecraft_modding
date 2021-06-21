package com.gablong.gmod.core.init;

import com.gablong.gmod.TutorialMod;
import com.gablong.gmod.common.blocks.CustomBlock;
import com.gablong.gmod.common.blocks.DisplayCaseBlock;
import com.gablong.gmod.common.blocks.QuarryBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MOD_ID);

    public static final RegistryObject<Block> GAY_BLOCK = BLOCKS.register("gay_block", () ->
            new Block(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_PINK)
                    .strength(15f, 30f)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(2)
                    .sound(SoundType.SAND)
            ));


    public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block", () ->
            new QuarryBlock());

    public static final RegistryObject<Block> DISPLAY_CASE = BLOCKS.register("display_case", () ->
            new DisplayCaseBlock());

//    public static final RegistryObject<CustomBlock> CUSTOM_BLOCK = BLOCKS.register("custom_block", () -> new CustomBlock(AbstractBlock.Properties.of(Material.WOOD)
//    .harvestTool(ToolType.AXE).harvestLevel(1).sound(SoundType.WOOD).requiresCorrectToolForDrops()));

//    public static final RegistryObject<Block> QUARRY = BLOCKS.register("quarry", () -> new QuarryBlock());
}
