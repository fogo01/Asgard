package com.fogo01.asgard.crativetab;

import com.fogo01.asgard.init.ModItems;
import com.fogo01.asgard.reference.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabAsgard {
	public static final CreativeTabs Asgard_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
		@Override
		public Item getTabIconItem() {
			return ModItems.Mjolner;
		}
	};
}
