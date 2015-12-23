package com.mod.mod_a.Items;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class FestiveSuit extends ItemArmor{

	public FestiveSuit(ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (this.armorType == 2)
		{
			return "mod_a:textures/models/armor/festive_suit_layer_2.png";
		}
		return "mod_a:textures/models/armor/festive_suit_layer_1.png";
	}
}
