package com.YounglingDev.RubinMod.registry;

import com.YounglingDev.RubinMod.RubinMod;
import net.minecraft.item.*;

import java.util.function.Predicate;

class SwordBase extends SwordItem {
    public SwordBase(ToolMaterial toolMaterial_1) {
        super(toolMaterial_1, +13, -3, new Item.Settings().group(RubinMod.ITEM_GROUP));
    }
}

class SwordBase2 extends SwordItem {
    public SwordBase2(ToolMaterial toolMaterial_1) {
        super(toolMaterial_1, +4, 0, new Item.Settings().group(RubinMod.ITEM_GROUP));
    }
}

class PickaxeBase extends PickaxeItem {
    public PickaxeBase(ToolMaterial toolMaterial_1) {
        super(toolMaterial_1, 6, -2.8f, new Item.Settings().group(RubinMod.ITEM_GROUP));
    }
}

class AxeBase extends AxeItem {
    public AxeBase(ToolMaterial toolMaterial_1) {
        super(toolMaterial_1, 10, -3f, new Item.Settings().group(RubinMod.ITEM_GROUP));
    }
}

class ShovelBase extends ShovelItem {
    public ShovelBase(ToolMaterial toolMaterial_1) {
        super(toolMaterial_1, 6.5f, -3, new Item.Settings().group(RubinMod.ITEM_GROUP));
    }
}

class HoeBase extends HoeItem {
    public HoeBase(ToolMaterial toolMaterial_1) {
        super(toolMaterial_1, 1, 0, new Item.Settings().group(RubinMod.ITEM_GROUP));
    }
}
