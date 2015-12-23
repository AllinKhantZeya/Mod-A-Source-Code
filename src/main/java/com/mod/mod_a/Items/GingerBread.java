package com.mod.mod_a.Items;

import com.mod.mod_a.Functions;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

public class GingerBread extends ItemFood{

	public GingerBread(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
	}
	@Override
	 protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
   {
		Functions.addPotionEffectToPlayer(player, Potion.resistance, 6, 0);
		Functions.addPotionEffectToPlayer(player, Potion.damageBoost, 5, 1);
       return;
   }
}
