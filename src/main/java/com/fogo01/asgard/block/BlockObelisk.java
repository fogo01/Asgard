package com.fogo01.asgard.block;

import com.fogo01.asgard.init.ModItems;
import com.fogo01.asgard.items.ItemAsgard;
import com.fogo01.asgard.items.ItemHammer;
import com.fogo01.asgard.items.ItemMjolner;
import com.fogo01.asgard.utility.LogHelper;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.world.World;

public class BlockObelisk extends BlockAsgard {
    public BlockObelisk(){
        super();
        this.setBlockName("Obelisk");
        this.setHardness(5);
        this.setHarvestLevel("pickaxe",3);
    }

    public boolean onBlockActivated(World world, int blockX, int blockY, int blockZ, EntityPlayer player, int par6, float par7, float par8, float par9) {
        LogHelper.info("BlockClick");
        Item equipped = player.getCurrentEquippedItem() != null ? player.getCurrentEquippedItem().getItem() : null;
        if (equipped instanceof ItemHammer) {
            if (world.getBlock(blockX, blockY-1, blockZ) == this &&
                world.getBlock(blockX+1, blockY-1, blockZ) == Blocks.diamond_block &&
                world.getBlock(blockX-1, blockY-1, blockZ) == Blocks.diamond_block &&
                world.getBlock(blockX, blockY-1, blockZ+1) == Blocks.diamond_block &&
                world.getBlock(blockX, blockY-1, blockZ-1) == Blocks.diamond_block &&
                world.getBlock(blockX+1, blockY-1, blockZ+1) == Blocks.diamond_block &&
                world.getBlock(blockX+1, blockY-1, blockZ-1) == Blocks.diamond_block &&
                world.getBlock(blockX-1, blockY-1, blockZ+1) == Blocks.diamond_block &&
                world.getBlock(blockX-1, blockY-1, blockZ-1) == Blocks.diamond_block) {
                EntityLightningBolt lightningBolt = new EntityLightningBolt(world, blockX, blockY + 1, blockZ);
                player.worldObj.spawnEntityInWorld(lightningBolt);

                world.setBlockToAir(blockX + 1, blockY - 1, blockZ);
                world.setBlockToAir(blockX - 1, blockY - 1, blockZ);
                world.setBlockToAir(blockX, blockY - 1, blockZ + 1);
                world.setBlockToAir(blockX, blockY - 1, blockZ - 1);
                world.setBlockToAir(blockX + 1, blockY - 1, blockZ + 1);
                world.setBlockToAir(blockX + 1, blockY - 1, blockZ - 1);
                world.setBlockToAir(blockX - 1, blockY - 1, blockZ + 1);
                world.setBlockToAir(blockX - 1, blockY - 1, blockZ - 1);

                player.destroyCurrentEquippedItem();

                //player.inventory.addItemStackToInventory();

                player.dropItem(ModItems.Mjolner, 1);

            }
        }
        return true;
    }
}
