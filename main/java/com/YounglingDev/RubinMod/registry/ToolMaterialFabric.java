package com.YounglingDev.RubinMod.registry;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;



public class ToolMaterialFabric implements ToolMaterial {
    @Override
    public int getDurability() {
        return 1400;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 40;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.WHIMERALD);
    }
}