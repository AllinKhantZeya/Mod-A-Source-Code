package com.mod.mod_a.Items;

import java.util.Random;
import java.util.UUID;

import com.mod.mod_a.Functions;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class InformationRetriever extends Item{
	

	@Override
	public ItemStack onItemRightClick(ItemStack stack, World worldIn, EntityPlayer playerIn)
	{
		String worldName = worldIn.getWorldInfo().getWorldName();
		String difficulty = worldIn.getDifficulty().name();
		String playerName = playerIn.getName();
		BlockPos pos = playerIn.getPosition();
		double x = pos.getX();
		double y = pos.getY();
		double z = pos.getZ();
		long seed = worldIn.getSeed();
		String biomeName = worldIn.getBiomeGenForCoords(pos).biomeName;
		Functions.tellPlayer(playerIn, playerName + ", you are in the world " + worldName + ", which is on the difficulty " + difficulty.toLowerCase() +" and has the seed " + seed + ", at the coordinates " + x + ", " + y + ", " + z + " inside the biome " + biomeName + ".", worldIn);
		return stack;
	}

}
