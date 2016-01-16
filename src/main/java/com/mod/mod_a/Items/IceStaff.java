package com.mod.mod_a.Items;

import net.minecraft.block.BlockDispenser;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.dispenser.IPosition;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class IceStaff extends Item{
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World worldIn, EntityPlayer playerIn)
	{
		playerIn.swingItem();
		stack.damageItem(1, playerIn);
		worldIn.playSoundAtEntity(playerIn, "random.bow", 1.0F, 1.0F);
		 if (!worldIn.isRemote)
	        {
	            worldIn.spawnEntityInWorld(new EntitySnowball(worldIn, playerIn));
	        }
		return stack;	
    }
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos0, EnumFacing side, float hitX, float hitY, float hitZ)
	{
		
		double x1 = playerIn.getPosition().north().getX();
		double y1 = playerIn.getPosition().north().getY();
		double z1 = playerIn.getPosition().north().getZ();
		
		double x2 = playerIn.getPosition().south().getX();
		double y2 = playerIn.getPosition().south().getY();
		double z2 = playerIn.getPosition().south().getZ();
		
		double x3 = playerIn.getPosition().west().getX();
		double y3 = playerIn.getPosition().west().getY();
		double z3 = playerIn.getPosition().west().getZ();
		
		double x4 = playerIn.getPosition().east().getX();
		double y4 = playerIn.getPosition().east().getY();
		double z4 = playerIn.getPosition().east().getZ();
		
		Entity entity1 = new EntitySnowman(worldIn);
		Entity entity2 = new EntitySnowman(worldIn);
		Entity entity3 = new EntitySnowman(worldIn);
		Entity entity4 = new EntitySnowman(worldIn);
		
		entity1.setPosition(x1, y1, z1);
		entity2.setPosition(x2, y2, z2);
		entity3.setPosition(x3, y3, z3);
		entity4.setPosition(x4, y4, z4);
		if (!worldIn.isRemote)
		{
		worldIn.spawnEntityInWorld(entity1);
		worldIn.spawnEntityInWorld(entity2);
		worldIn.spawnEntityInWorld(entity3);
		worldIn.spawnEntityInWorld(entity4);
		}
		stack.damageItem(5, playerIn);
		return false;
	}
}
