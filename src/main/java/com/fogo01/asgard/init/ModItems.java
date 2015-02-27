package com.fogo01.asgard.init;

import com.fogo01.asgard.items.*;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	public static final ItemAsgard Mjolner = new ItemMjolner();
	public static final ItemAsgard Handle = new ItemHandle();
	public static final ItemAsgard Star = new ItemStar();
    public static final ItemAsgard Plate = new ItemPlate();
    public static final ItemAsgard Horn = new ItemHorn();
    public static final ItemAsgard Helmet = new ItemHelmet();
    public static final ItemHammer Hammer = new ItemHammer();
	
	public static void init(){
		GameRegistry.registerItem(Mjolner, "Mjolner");
		GameRegistry.registerItem(Handle, "Handle");
		GameRegistry.registerItem(Star, "Star");
        GameRegistry.registerItem(Plate, "Plate");
        GameRegistry.registerItem(Horn, "Horn");
        GameRegistry.registerItem(Helmet, "Helmet");
        GameRegistry.registerItem(Hammer, "Hammer");
	}
}
