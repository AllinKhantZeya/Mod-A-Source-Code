package com.mod.mod_a.blocks;

import com.mod.mod_a.Functions;
import com.mod.mod_a.init.ModAItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.World;

public class WitherIngotMaker extends Block{

	public WitherIngotMaker(Material materialIn) {
		super(materialIn);
		this.setStepSound(soundTypeAnvil);
		this.maxX = 0.8;
		this.minX = 0.2;
		this.maxZ = 1;
		this.minZ = 0.1;
		this.maxY = 0.8;
		this.minY = 0;
	}
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}
	@Override
	public boolean isFullCube() {
		return false;
	}
	@Override
	public EnumWorldBlockLayer getBlockLayer()
	{
		return EnumWorldBlockLayer.CUTOUT;
	}
	@Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ)
    {
		if (playerIn.inventory.getCurrentItem() != null){
		Item item = playerIn.inventory.getCurrentItem().getItem();
		if (item == Items.iron_ingot || item == Items.gold_ingot || item == ModAItems.dark_ingot || item == ModAItems.dragon_ingot){
			playerIn.inventory.consumeInventoryItem(item);
			Functions.spawnItemOnBlock(worldIn, ModAItems.wither_ingot, 1, pos);
			return false;
		}
		else{
			Functions.sendPlayerColouredMessage(playerIn, Functions.getMessage("item.not_working"), EnumChatFormatting.DARK_RED, worldIn);
			return false;
		}
		}
		else{
			Functions.sendPlayerColouredMessage(playerIn, Functions.getMessage("warning.need.vowel") + " "
					+ Functions.getMessage("ingot") + ".", EnumChatFormatting.DARK_RED, worldIn);
			return false;
		}
    }
}