package com.mod.mod_a.Items;

import com.mod.mod_a.Functions;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;

public class KnightSword extends ItemSword{

	public KnightSword(ToolMaterial material) {
		super(material);
	}
	
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
		Potion potionStrength = Potion.damageBoost;
		Potion potionSpeed = Potion.moveSpeed;
		Functions.addPotionEffectToTarget(attacker, potionStrength, 3, 1);
		Functions.addPotionEffectToTarget(attacker, potionSpeed, 5, 1);
		EntityPlayer playerIn = attacker.getEntityWorld().getPlayerEntityByName(attacker.getName());
		if(!playerIn.capabilities.isCreativeMode)
		{
			stack.damageItem(1, playerIn);
		}
		return false;
    }
}
