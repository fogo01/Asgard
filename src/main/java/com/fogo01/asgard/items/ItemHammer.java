package com.fogo01.asgard.items;

public class ItemHammer extends ItemAsgard {
    public ItemHammer(){
        super();
        this.setUnlocalizedName("Hammer");
        this.setMaxStackSize(1);
        this.setHarvestLevel("pickaxe", 2);
    }
}
