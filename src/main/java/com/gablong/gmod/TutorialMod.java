package com.gablong.gmod;

import com.gablong.gmod.common.entities.ExampleEntity;
import com.gablong.gmod.core.init.BlockInit;
import com.gablong.gmod.core.init.EntityTypesInit;
import com.gablong.gmod.core.init.ItemInit;
import com.gablong.gmod.core.init.TileEntityTypesInit;
import com.gablong.gmod.world.OreGeneration;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.NonNullList;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TutorialMod.MOD_ID)
@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class TutorialMod
{
    public static final String MOD_ID = "gmod";
    public static final Logger LOGGER = LogManager.getLogger();
    public static final ItemGroup GMOD_GROUP = new GmodGroup("gmodtab");

    public TutorialMod() {

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);

        EntityTypesInit.ENTITY_TYPES.register(bus);
        ItemInit.ITEMS.register(bus);
        TileEntityTypesInit.TILE_ENTITY_TYPE.register(bus);
        BlockInit.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
    }

    private void setup(final FMLCommonSetupEvent event) {

        DeferredWorkQueue.runLater(() -> {
            GlobalEntityTypeAttributes.put(EntityTypesInit.EXAMPLE.get(), ExampleEntity.setAttributes().build());
        });
    }

    public static class GmodGroup extends ItemGroup {

        public GmodGroup(String label) {
            super(label);
        }

        @Override
        public ItemStack makeIcon() {
            return ItemInit.PINK_MONEY.get().getDefaultInstance();
        }

        @Override
        public void fillItemList(NonNullList<ItemStack> items) {
            items.add(Items.STICK.getDefaultInstance());
            super.fillItemList(items);
        }
    }



}
