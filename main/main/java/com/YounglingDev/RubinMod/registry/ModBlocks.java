package com.YounglingDev.RubinMod.registry;

import com.YounglingDev.RubinMod.RubinMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block WHIMERALD_BLOCK = new Block (FabricBlockSettings
            .of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 3).requiresTool().strength(5.0f, 30.0f )
            .sounds(BlockSoundGroup.METAL));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(RubinMod.MOD_ID,"whimerald_block"), WHIMERALD_BLOCK);
    }

}
