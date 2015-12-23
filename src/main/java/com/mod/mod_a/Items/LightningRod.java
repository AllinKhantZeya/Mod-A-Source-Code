package com.mod.mod_a.Items;

import com.mod.mod_a.Functions;

import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class LightningRod extends Item{
	
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
	{
		double X = pos.getX();
		double Y = pos.getY();
		double Z = pos.getZ();
		worldIn.addWeatherEffect(new EntityLightningBolt(worldIn, X, Y, Z));
		Potion potion = Potion.resistance;
		Functions.addPotionEffectToPlayer(playerIn, potion, 1, 10);
		playerIn.swingItem();
		stack.damageItem(1, playerIn);
		return false;
	}
}	

