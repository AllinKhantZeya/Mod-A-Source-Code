package com.mod.mod_a.Items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MobLifter extends Item{
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
		stack.damageItem(1, attacker);
		target.motionY = 1;
		return false;
    }
}
