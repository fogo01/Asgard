package com.fogo01.asgard.init;

import com.fogo01.asgard.items.ItemHandle;
import com.fogo01.asgard.items.ItemAsgard;
import com.fogo01.asgard.items.ItemMjolner;
import com.fogo01.asgard.items.ItemStar;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	public static final ItemAsgard Mjolner = new ItemMjolner();
	public static final ItemAsgard Handle = new ItemHandle();
	public static final ItemAsgard Star = new ItemStar();
	
	public static void init(){
		GameRegistry.registerItem(Mjolner, "Mjolner");
		GameRegistry.registerItem(Handle, "Handle");
		GameRegistry.registerItem(Star, "Star");
	}
}
