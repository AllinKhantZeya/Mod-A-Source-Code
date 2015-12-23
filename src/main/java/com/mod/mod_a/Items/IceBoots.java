package com.mod.mod_a.Items;

import com.mod.mod_a.Functions;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class IceBoots extends ItemArmor{

	public IceBoots(ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) 
	{
		return "mod_a:textures/models/armor/ice_boots_layer_1.png";
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{
		BlockPos pos0 = new BlockPos(player.prevPosX, player.prevPosY, player.prevPosZ);
		BlockPos pos = pos0.down();
		Block block = world.getBlockState(pos).getBlock();
		IBlockState blockIce = Blocks.ice.getDefaultState();
		int id = block.getIdFromBlock(block);
		 
		if(id == 8 || id == 9)
		{
			Functions.spawnBlock(world, blockIce, pos);
		}
		if(player.isBurning())
		{
			player.extinguish();
			itemStack.damageItem(5, player);
		}
	}
}
