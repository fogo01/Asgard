/*package com.fogo01.asgard.block.model;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class ModelObelisk extends BlockContainer {
    protected ModelObelisk(Material material){
        super(material);
        this.setBlockName("ModelObelisk");
        this.setLightLevel(15.0F);
        this.setBlockTextureName("");
    }

    @Override
    public int getRenderType() {
        return -1;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int var1) {
        return new TileEntityModelObelisk();
    }

}
*/