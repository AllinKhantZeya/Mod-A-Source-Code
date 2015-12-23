package com.mod.mod_a.Items;

import com.mod.mod_a.Functions;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

public class CandyCane extends ItemFood{

	public CandyCane(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
	}
	@Override
	 protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
		Functions.addPotionEffectToPlayer(player, Potion.moveSpeed, 10, 1);
		Functions.addPotionEffectToPlayer(player, Potion.jump, 8, 0);
		Functions.addPotionEffectToPlayer(player, Potion.digSpeed, 12, 2);
        return;
    }
}
