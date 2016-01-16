package com.mod.mod_a.Items;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class FireStaff extends Item{
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World worldIn, EntityPlayer playerIn)
	{
		playerIn.swingItem();
		if (!worldIn.isRemote)
		{
		Vec3 playerLook = playerIn.getLookVec();
		double x = playerIn.posX + playerLook.xCoord * 2;
		double y = playerIn.posY + playerLook.yCoord * 2;
		double z = playerIn.posZ + playerLook.zCoord * 2;
		EntitySmallFireball fireBall = new EntitySmallFireball(worldIn, playerIn, 1, 1, 1);
		fireBall.setPosition( x, y + 1, z);
		fireBall.accelerationX = playerLook.xCoord * 0.1;
		fireBall.accelerationY = playerLook.yCoord * 0.1;
		fireBall.accelerationZ = playerLook.zCoord * 0.1;
		worldIn.playSoundAtEntity(playerIn, "item.fireCharge.use", 1.0F, 1.0F);
		worldIn.spawnEntityInWorld(fireBall);
		stack.damageItem(1, playerIn);
		}
		return stack;	
    }
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
		EntityPlayer playerIn = attacker.getEntityWorld().getPlayerEntityByName(attacker.getName());
		stack.damageItem(1, playerIn);
		target.setFire(5);
		return false;
    }
}
