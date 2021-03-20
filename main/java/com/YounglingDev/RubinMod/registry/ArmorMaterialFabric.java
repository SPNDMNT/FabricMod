package com.YounglingDev.RubinMod.registry;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;

public class ArmorMaterialFabric implements ArmorMaterial {

    private static final int[] BASE_DURABILITY = new int[] {507,585,624,429};
    private static final int[] PROTECTION_AMOUNTS = new int[] {4,7,9,4};

    @Override
    public int getDurability(EquipmentSlot arg0) {
        return BASE_DURABILITY[arg0.getEntitySlotId()];
    }

    @Override
    public int getProtectionAmount(EquipmentSlot arg0) {
        return PROTECTION_AMOUNTS[arg0.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public SoundEvent getEquipSound() {
        return null;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.WHIMERALD);
    }

    @Override
    public String getName() {
        return "whimerald";
    }

    @Override
    public float getToughness() {
        return 3.2f;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
