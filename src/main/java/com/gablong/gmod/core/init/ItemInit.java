package com.gablong.gmod.core.init;

import com.gablong.gmod.TutorialMod;
import com.gablong.gmod.common.items.SpecialItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> GAY_DUST = ITEMS.register("gay_dust",
            () -> new Item(new Item.Properties().tab(TutorialMod.GMOD_GROUP)));

    public static final RegistryObject<Item> GAY_INGOT = ITEMS.register("gay_ingot",
            () -> new Item(new Item.Properties().tab(TutorialMod.GMOD_GROUP)));

    public static final RegistryObject<Item> PINK_MONEY = ITEMS.register("pink_money",
            () -> new Item(new Item.Properties().tab(TutorialMod.GMOD_GROUP)));

    public static final RegistryObject<Item> ESPADA_GAY = ITEMS.register("gay_sword",
            () -> new Item(new Item.Properties().tab(TutorialMod.GMOD_GROUP)));

    public static final RegistryObject<Item> PICARETA_GAY = ITEMS.register("gay_pickaxe",
            () -> new Item(new Item.Properties().tab(TutorialMod.GMOD_GROUP).addToolType(ToolType.PICKAXE, 2)));

    public static final RegistryObject<SpecialItem> SPECIAL_ITEM = ITEMS.register("special_item",
            () -> new SpecialItem(new Item.Properties().tab(TutorialMod.GMOD_GROUP).addToolType(ToolType.SHOVEL, 5)
            .durability(200)
            .fireResistant()
            .rarity(Rarity.EPIC)
            ));

    public static final RegistryObject<Item> FADA_EROTICA = ITEMS.register("fada_erotica", () -> new Item(new Item.Properties().tab(TutorialMod.GMOD_GROUP).food(FoodInit.FADA_EROTICA)));

    //BLock Items
    public static final RegistryObject<BlockItem> GAY_BLOCK = ITEMS.register("gay_block",
            () -> new BlockItem(BlockInit.GAY_BLOCK.get(), new Item.Properties().tab(TutorialMod.GMOD_GROUP)));


    public static final RegistryObject<BlockItem> EXAMPLE_BLOCK = ITEMS.register("example_block",
            () -> new BlockItem(BlockInit.EXAMPLE_BLOCK.get(), new Item.Properties().tab(TutorialMod.GMOD_GROUP)));
}
