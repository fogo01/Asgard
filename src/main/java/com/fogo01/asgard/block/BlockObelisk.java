package com.fogo01.asgard.block;

public class BlockObelisk extends BlockAsgard {
    public BlockObelisk(){
        super();
        this.setBlockName("Obelisk");
        this.setHardness(5);
        this.setHarvestLevel("pickaxe",3);
    }
}
