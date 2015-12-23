package com.mod.mod_a.Items;

import com.mod.mod_a.Functions;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class HandCannon extends Item {
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World worldIn, EntityPlayer playerIn) {
		if (playerIn.inventory.hasItem(Items.fire_charge)) {
			stack.damageItem(1, playerIn);
			if (!worldIn.isRemote) {
				Vec3 playerLook = playerIn.getLookVec();
				double x = playerIn.posX + playerLook.xCoord * 2;
				double y = playerIn.posY + playerLook.yCoord * 2;
				double z = playerIn.posZ + playerLook.zCoord * 2;
				EntityLargeFireball fireBall = new EntityLargeFireball(worldIn, playerIn, 1, 1, 1);
				fireBall.setPosition(x, y + 1, z);
				fireBall.accelerationX = playerLook.xCoord * 0.1;
				fireBall.accelerationY = playerLook.yCoord * 0.1;
				fireBall.accelerationZ = playerLook.zCoord * 0.1;
				worldIn.spawnEntityInWorld(fireBall);
				if (!playerIn.capabilities.isCreativeMode) {
					playerIn.inventory.consumeInventoryItem(Items.fire_charge);
				}
			}
		} else {
			Functions.sendPlayerColouredMessage(playerIn,
					Functions.getMessage("warning.need") + " "
							+ Items.fire_charge.getItemStackDisplayName(new ItemStack(Items.fire_charge)),
					EnumChatFormatting.DARK_RED, worldIn);
		}
		return stack;
	}

}
