package com.gablong.gmod.common.te;

import com.gablong.gmod.TutorialMod;
import com.gablong.gmod.common.containers.DisplayCaseContainer;
import com.gablong.gmod.core.init.TileEntityTypesInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.LockableLootTileEntity;
import net.minecraft.tileentity.LockableTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class DisplayCaseTileEntity extends LockableLootTileEntity {

    protected NonNullList<ItemStack> items = NonNullList.withSize(slot, ItemStack.EMPTY);
    private static int slot = 1;

    protected DisplayCaseTileEntity(TileEntityType<?> typeIn) {
        super(typeIn);
    }

    public DisplayCaseTileEntity() {
        super(TileEntityTypesInit.EXAMPLE_TILE_ENTITY_TYPE.get());
    }


    @Override
    protected ITextComponent getDefaultName() {
        return new TranslationTextComponent("container." + TutorialMod.MOD_ID + ".display_case");
    }


    @Override
    protected Container createMenu(int id, PlayerInventory player) {
        return new DisplayCaseContainer(id, player, this);
    }

    @Override
    protected NonNullList<ItemStack> getItems() {
        return this.items;
    }

    @Override
    protected void setItems(NonNullList<ItemStack> itensIn) {
        this.items = itensIn;
    }



    @Override
    public int getContainerSize() {
        return slot;
    }


}
