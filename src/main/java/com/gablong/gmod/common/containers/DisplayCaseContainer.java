package com.gablong.gmod.common.containers;

import com.gablong.gmod.common.te.DisplayCaseTileEntity;
import com.gablong.gmod.core.init.ContainerTypesInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.inventory.container.Slot;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IWorldPosCallable;

import javax.annotation.Nullable;
import java.util.Objects;

public class DisplayCaseContainer extends Container {

    public final DisplayCaseTileEntity te;
    private final IWorldPosCallable canInteractWithCallable;


    public DisplayCaseContainer (final int windowId, final PlayerInventory playerInventory, final DisplayCaseTileEntity te) {
        super(ContainerTypesInit.DISPLAY_CASE_CONTAINER_TYPE.get(), windowId);
        this.te = te;
        this.canInteractWithCallable = IWorldPosCallable.create(te.getLevel(), te.getBlockPos());

//Tile Entity
        this.addSlot(new Slot((IInventory) te, 0, 80, 35));
        
        // Main Player Inventory
        for ( int row= 0 ; row< 3; row ++) {
            for (int col  = 0; col  < 9; col ++) {
this.addSlot(new Slot(playerInventory, col*row *9+9,8+col*18, 166 - (4 - row) * 18 - 10));
            }
        }

        // Player Hotbar
        for (int col = 0; col < 9; col++) {
            this.addSlot(new Slot(playerInventory, col, 8 + col*18, 142));
        }
    }





    public DisplayCaseContainer (final int windowId, final PlayerInventory playerInventory, final PacketBuffer data) {
        this(windowId, playerInventory, getTileEntity(playerInventory, data));
    }

    private static DisplayCaseTileEntity getTileEntity(final PlayerInventory playerInv, final PacketBuffer data) {
        Objects.requireNonNull(playerInv, "Player Inventory cannot be null.");
        Objects.requireNonNull(data, "Packet Buffer cannot be null.");
        final TileEntity te = playerInv.player.level.getBlockEntity(data.readBlockPos());
        if (te instanceof DisplayCaseTileEntity) {
            return (DisplayCaseTileEntity) te;
        }
        throw new IllegalStateException("Tile Entity is not correct");
    }


    @Override
    public boolean stillValid(PlayerEntity p_75145_1_) {
        return false;
    }
}
