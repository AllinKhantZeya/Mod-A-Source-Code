package com.mod.mod_a.Items;

import com.mod.mod_a.Functions;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class DarkPickaxe extends ItemPickaxe{

	public DarkPickaxe(ToolMaterial material) {
		super(material);
	}
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
	{
		double x = pos.getX();
		double y = pos.getY();
		double z = pos.getZ();
		if (!worldIn.isRemote){
		worldIn.createExplosion(playerIn, x, y, z, 5.0F, true);
		}
		Potion potion = Potion.resistance;
		Functions.addPotionEffectToPlayer(playerIn, potion, 1, 20);
			stack.damageItem(1, playerIn);
		return true;
	}
}

