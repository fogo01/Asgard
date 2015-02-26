package com.fogo01.asgard.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipies {
	public static void init(){
		GameRegistry.addRecipe(new ItemStack(ModItems.Handle), "did", "did", "did", 'd', new ItemStack(Items.diamond), 'i', new ItemStack(Blocks.iron_block));
		GameRegistry.addRecipe(new ItemStack(ModItems.Star), "ddd","dsd", "ddd", 'd', new ItemStack(Items.diamond), 's', new ItemStack(Items.nether_star));
		GameRegistry.addRecipe(new ItemStack(ModItems.Mjolner), "sss"," h ", " h ", 'h', new ItemStack(ModItems.Handle), 's', new ItemStack(ModItems.Star));
	}
}
