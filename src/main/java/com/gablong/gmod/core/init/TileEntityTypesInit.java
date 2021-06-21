package com.gablong.gmod.core.init;

import com.gablong.gmod.TutorialMod;
import com.gablong.gmod.common.te.DisplayCaseTileEntity;
import com.gablong.gmod.common.te.QuarryTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityTypesInit {

    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPE = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, TutorialMod.MOD_ID);

    public static final RegistryObject<TileEntityType<QuarryTileEntity>> EXAMPLE_TILE_ENTITY_TYPE = TILE_ENTITY_TYPE
            .register("example_block", () -> TileEntityType.Builder.of(QuarryTileEntity::new, BlockInit.EXAMPLE_BLOCK.get()).build(null));

//    public static final RegistryObject<TileEntityType<DisplayCaseTileEntity>> DISPLAY_CASE_TILE_ENTITY_TYPE = TILE_ENTITY_TYPE
//            .register("display_case", () -> TileEntityType.Builder.of(DisplayCaseTileEntity::new, BlockInit.DISPLAY_CASE.get()).build(null));
}
