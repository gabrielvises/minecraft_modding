package com.gablong.gmod.core.init;

import com.gablong.gmod.TutorialMod;
import com.gablong.gmod.common.items.SpecialItem;
import com.gablong.gmod.common.materials.CustomArmorMaterial;
import com.gablong.gmod.common.materials.CustomToolMaterial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
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

    public static final RegistryObject<SpecialItem> SPECIAL_ITEM = ITEMS.register("special_item",
            () -> new SpecialItem(new Item.Properties().tab(TutorialMod.GMOD_GROUP).addToolType(ToolType.SHOVEL, 5)
            .durability(200)
            .fireResistant()
            .rarity(Rarity.EPIC)
            ));

    public static final RegistryObject<Item> ESPADA_GAY = ITEMS.register("gay_sword", () -> new SwordItem(CustomToolMaterial.EXAMPLE_TOOL, 5, -1,
            new Item.Properties().tab(TutorialMod.GMOD_GROUP)));

    public static final RegistryObject<Item> EXAMPLE_AXE = ITEMS.register("example_axe", () -> new AxeItem(CustomToolMaterial.EXAMPLE_TOOL, 5, -1,
            new Item.Properties().tab(TutorialMod.GMOD_GROUP)));

    public static final RegistryObject<Item> PICARETA_GAY = ITEMS.register("gay_pickaxe", () -> new PickaxeItem(CustomToolMaterial.EXAMPLE_TOOL, 5, -1,
            new Item.Properties().tab(TutorialMod.GMOD_GROUP)));

    public static final RegistryObject<Item> EXAMPLE_SHOVEL = ITEMS.register("example_shovel", () -> new ShovelItem(CustomToolMaterial.EXAMPLE_TOOL, 5, -1,
            new Item.Properties().tab(TutorialMod.GMOD_GROUP)));

    public static final RegistryObject<Item> EXAMPLE_HOE = ITEMS.register("example_hoe", () -> new HoeItem(CustomToolMaterial.EXAMPLE_TOOL, 5, -1,
            new Item.Properties().tab(TutorialMod.GMOD_GROUP)));

    public static final RegistryObject<Item> EXAMPLE_PICKAXE = ITEMS.register("example_pickaxe", () -> new PickaxeItem(CustomToolMaterial.EXAMPLE_TOOL, 5, -1,
            new Item.Properties().tab(TutorialMod.GMOD_GROUP)));


    public static final RegistryObject<Item> EXAMPLE_HELMET = ITEMS.register("example_helmet",
            () -> new ArmorItem(CustomArmorMaterial.EXAMPLE_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().tab(TutorialMod.GMOD_GROUP)));

    public static final RegistryObject<Item> EXAMPLE_CHESTPLATE = ITEMS.register("example_chestplate",
            () -> new ArmorItem(CustomArmorMaterial.EXAMPLE_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().tab(TutorialMod.GMOD_GROUP)));

    public static final RegistryObject<Item> EXAMPLE_LEGGINGS = ITEMS.register("example_leggings",
            () -> new ArmorItem(CustomArmorMaterial.EXAMPLE_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().tab(TutorialMod.GMOD_GROUP)));

    public static final RegistryObject<Item> EXAMPLE_BOOTS = ITEMS.register("example_boots",
            () -> new ArmorItem(CustomArmorMaterial.EXAMPLE_ARMOR, EquipmentSlotType.FEET, new Item.Properties().tab(TutorialMod.GMOD_GROUP)));



    public static final RegistryObject<Item> FADA_EROTICA = ITEMS.register("fada_erotica", () -> new Item(new Item.Properties().tab(TutorialMod.GMOD_GROUP).food(FoodInit.FADA_EROTICA)));

    //BLock Items
    public static final RegistryObject<BlockItem> GAY_BLOCK = ITEMS.register("gay_block",
            () -> new BlockItem(BlockInit.GAY_BLOCK.get(), new Item.Properties().tab(TutorialMod.GMOD_GROUP)));


    public static final RegistryObject<BlockItem> EXAMPLE_BLOCK = ITEMS.register("example_block",
            () -> new BlockItem(BlockInit.EXAMPLE_BLOCK.get(), new Item.Properties().tab(TutorialMod.GMOD_GROUP)));
}
