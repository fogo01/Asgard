package com.fogo01.asgard.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipies {
	public static void init(){
        GameRegistry.addRecipe(new ItemStack(ModItems.Plate), "dd", "dd", 'd', new ItemStack(Items.diamond));
		GameRegistry.addRecipe(new ItemStack(ModItems.Handle), "pip", "pip", "pip", 'p', new ItemStack(ModItems.Plate), 'i', new ItemStack(Blocks.iron_block));
		GameRegistry.addRecipe(new ItemStack(ModItems.Star), "ddd","dsd", "ddd", 'd', new ItemStack(Items.diamond), 's', new ItemStack(Items.nether_star));
		GameRegistry.addRecipe(new ItemStack(ModItems.Mjolner), "sss","shs", " h ", 'h', new ItemStack(ModItems.Handle), 's', new ItemStack(ModItems.Star));

        GameRegistry.addRecipe(new ItemStack(ModItems.Horn), "b  ", "bb ", " bb", 'b', new ItemStack(Items.bone));
        GameRegistry.addRecipe(new ItemStack(ModItems.Helmet), "h h", " i ", 'h', new ItemStack(ModItems.Horn), 'i', new ItemStack(Items.iron_helmet));
	}
}
