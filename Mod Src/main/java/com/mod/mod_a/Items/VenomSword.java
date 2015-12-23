package com.mod.mod_a.Items;

import com.mod.mod_a.Functions;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;

public class VenomSword extends ItemSword{

	public VenomSword(ToolMaterial material) {
		super(material);
	}
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
        stack.damageItem(1, attacker);
        if (!target.isEntityUndead()){
        Functions.addPotionEffectToTarget(target, Potion.poison, 5, 1);
        }
        return true;
    }
}
