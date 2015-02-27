package com.fogo01.asgard.init;

import com.fogo01.asgard.block.BlockAsgard;
import com.fogo01.asgard.block.BlockObelisk;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
    public static final BlockAsgard Obelisk = new BlockObelisk();

    public static void init(){
        GameRegistry.registerBlock(Obelisk, "Obelisk");
    }
}
