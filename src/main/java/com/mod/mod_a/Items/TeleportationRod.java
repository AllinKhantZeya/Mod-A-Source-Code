package com.mod.mod_a.Items;

import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class TeleportationRod extends Item{
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World worldIn, EntityPlayer playerIn)
	{
		playerIn.swingItem();
		if (!worldIn.isRemote)
		{
			worldIn.spawnEntityInWorld(new EntityEnderPearl(worldIn, playerIn));
				stack.damageItem(1, playerIn);
		}
		return stack;	
    }
}
