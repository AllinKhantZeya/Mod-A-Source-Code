package com.mod.mod_a;

import com.mod.mod_a.init.ModABlocks;
import com.mod.mod_a.init.ModAItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModATab extends CreativeTabs {

	public ModATab(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		Item item = Item.getItemFromBlock(ModABlocks.dark_table);
		return item;
	}

}
