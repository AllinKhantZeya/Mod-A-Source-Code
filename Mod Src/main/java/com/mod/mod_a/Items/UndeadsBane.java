package com.mod.mod_a.Items;

import com.mod.mod_a.Functions;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;

public class UndeadsBane extends ItemSword{

	public UndeadsBane(ToolMaterial material) {
		super(material);
	}
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
        stack.damageItem(1, attacker);
        if (target.isEntityUndead()){
        Functions.addPotionEffectToTarget(target, Potion.heal, 1, 0);
        }
        return true;
    }
}
