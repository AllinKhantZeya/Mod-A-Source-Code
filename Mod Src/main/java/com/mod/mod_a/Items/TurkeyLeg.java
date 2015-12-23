package com.mod.mod_a.Items;

import com.mod.mod_a.Functions;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

public class TurkeyLeg extends ItemFood{

	public TurkeyLeg(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
	}
	@Override
	 protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
   {
		Functions.addPotionEffectToPlayer(player, Potion.healthBoost, 10, 2);
		Functions.addPotionEffectToPlayer(player, Potion.regeneration, 12, 1);
		Functions.addPotionEffectToPlayer(player, Potion.damageBoost, 12, 0);
       return;
   }
}
