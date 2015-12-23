package com.mod.mod_a.Items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class Heart extends Item{
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World worldIn, EntityPlayer playerIn)
	{
		playerIn.swingItem();
		double newHealth = playerIn.getMaxHealth() + 2;
		playerIn.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(newHealth);
		if (!playerIn.capabilities.isCreativeMode)
		{
			--stack.stackSize;
		}
		return stack;
	}

}
