package com.YounglingDev.RubinMod.registry;

import com.YounglingDev.RubinMod.RubinMod;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;

public class BaseArmor extends ArmorItem {

    public BaseArmor(ArmorMaterial material, EquipmentSlot slot) {
        super(material, slot, new Item.Settings().group(RubinMod.ITEM_GROUP));
    }

}
