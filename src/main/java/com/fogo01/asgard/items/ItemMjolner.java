package com.fogo01.asgard.items;

import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemMjolner extends ItemAsgard {
	public ItemMjolner(){
		super();
		this.setUnlocalizedName("Mjolner");
		this.maxStackSize = 1;
		this.setHarvestLevel("pickaxe", 4);
	}

	@SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack p_77636_1_) {
        return true;
    }
}
