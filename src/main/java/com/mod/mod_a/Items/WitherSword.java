package com.mod.mod_a.Items;

import com.mod.mod_a.Functions;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;

public class WitherSword extends ItemSword {

	public WitherSword(ToolMaterial material) {
		super(material);
	}
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
		Potion potion = Potion.wither;
		Functions.addPotionEffectToTarget(target, potion, 5, 1);
		EntityPlayer playerIn = attacker.getEntityWorld().getPlayerEntityByName(attacker.getName());
		stack.damageItem(1, playerIn);
        return true;
    }
}
