package com.mod.mod_a;

import com.mod.mod_a.init.ModAItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class ModAFuelHandler implements IFuelHandler{
	//1200 per minute
	@Override
	public int getBurnTime(ItemStack fuel) {
	if (fuel.getItem() == ModAItems.dark_item){
		return 2000;
	}
		return 0;
	}
	

}
