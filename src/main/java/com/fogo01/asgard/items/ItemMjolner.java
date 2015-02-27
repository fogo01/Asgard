package com.fogo01.asgard.items;

import com.fogo01.asgard.utility.LogHelper;
import com.google.common.collect.Multimap;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ItemMjolner extends ItemAsgard {
	public ItemMjolner(){
		super();
		this.setUnlocalizedName("Mjolner");
		this.setMaxStackSize(1);
		this.setHarvestLevel("pickaxe", 4);
	}

    public Multimap getItemAttributeModifiers() {
        Multimap multimap = super.getItemAttributeModifiers();
        double weaponDamage=500;
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e , "Tool modifier", (double)weaponDamage, 0));
        return multimap;
    }

    @SideOnly(Side.CLIENT)
    public ItemStack onItemRightClick(ItemStack itemstack,World world,EntityPlayer player) {

         if(player.isSneaking() == true) {
            LogHelper.info("SneakingRClick");

             EntitySnowball snowball = new EntitySnowball(player.worldObj, player);
             player.worldObj.spawnEntityInWorld(snowball);

        }else {
            LogHelper.info("RClick");

            LogHelper.info(player.getLookVec());
            LogHelper.info(player.posX + " " + player.posY + " " + player.posZ);
            MovingObjectPosition lastPosition = player.rayTrace(100, 1.0F);

            EntityLightningBolt lightningbolt = new EntityLightningBolt(player.worldObj, lastPosition.blockX, lastPosition.blockY + 1, lastPosition.blockZ);
            player.worldObj.spawnEntityInWorld(lightningbolt);
        }

        return itemstack;
    }

    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack p_77636_1_) {
        return true;
    }
}
