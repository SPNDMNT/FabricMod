package com.YounglingDev.RubinMod.registry;

import com.YounglingDev.RubinMod.RubinMod;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //Items
    public static final Item WHIMERALD = new Item(new Item.Settings().group(RubinMod.ITEM_GROUP));

    public static final Item WHIMERALD_NUGGET = new Item(new Item.Settings().group(RubinMod.ITEM_GROUP));

    public static final Item WHIMERALD_SCRAP = new Item(new Item.Settings().group(RubinMod.ITEM_GROUP));

    public static final Item WHIMERALD_BERRIES = new Item(new Item.Settings().group(RubinMod.ITEM_GROUP).food(new FoodComponent.Builder().hunger(20).saturationModifier(25f).build()));



    //Block Items

    public static final BlockItem WHIMERALD_BLOCK = new BlockItem(ModBlocks.WHIMERALD_BLOCK, new Item.Settings().group(RubinMod.ITEM_GROUP));

    public static final ArmorMaterial FABRIC_ARMOR = new ArmorMaterialFabric();

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(RubinMod.MOD_ID, "whimerald_block"), WHIMERALD_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(RubinMod.MOD_ID, "whimerald"), WHIMERALD);
        Registry.register(Registry.ITEM, new Identifier(RubinMod.MOD_ID, "whimerald_scrap"), WHIMERALD_SCRAP);
        Registry.register(Registry.ITEM, new Identifier(RubinMod.MOD_ID, "whimerald_nugget"), WHIMERALD_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(RubinMod.MOD_ID, "whimerald_sword"), new SwordBase(new ToolMaterialFabric()));
        Registry.register(Registry.ITEM, new Identifier(RubinMod.MOD_ID, "whimerald_knife"), new SwordBase2(new ToolMaterialFabric()));
        Registry.register(Registry.ITEM, new Identifier(RubinMod.MOD_ID, "whimerald_bow"), new BowBase(new Item.Settings()));
        Registry.register(Registry.ITEM, new Identifier(RubinMod.MOD_ID, "whimerald_pickaxe"), new PickaxeBase(new ToolMaterialFabric()));
        Registry.register(Registry.ITEM, new Identifier(RubinMod.MOD_ID, "whimerald_axe"), new AxeBase(new ToolMaterialFabric()));
        Registry.register(Registry.ITEM, new Identifier(RubinMod.MOD_ID, "whimerald_shovel"), new ShovelBase(new ToolMaterialFabric()));
        Registry.register(Registry.ITEM, new Identifier(RubinMod.MOD_ID, "whimerald_hoe"), new HoeBase(new ToolMaterialFabric()));
        Registry.register(Registry.ITEM, new Identifier(RubinMod.MOD_ID, "whimerald_helmet"), new BaseArmor(FABRIC_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(RubinMod.MOD_ID, "whimerald_chestplate"), new BaseArmor(FABRIC_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(RubinMod.MOD_ID, "whimerald_leggings"), new BaseArmor(FABRIC_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(RubinMod.MOD_ID, "whimerald_boots"), new BaseArmor(FABRIC_ARMOR, EquipmentSlot.FEET));
        Registry.register(Registry.ITEM, new Identifier(RubinMod.MOD_ID, "whimerald_berries"), WHIMERALD_BERRIES);
    }

}