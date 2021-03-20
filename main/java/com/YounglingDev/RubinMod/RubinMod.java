package com.YounglingDev.RubinMod;

import com.YounglingDev.RubinMod.registry.ModBlocks;
import com.YounglingDev.RubinMod.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class RubinMod implements ModInitializer {

    public static final String MOD_ID = "whimerald";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "addons"),
            () -> new ItemStack(ModItems.WHIMERALD));

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }


}