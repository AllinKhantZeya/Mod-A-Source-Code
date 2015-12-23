package com.mod.mod_a.Items;

import java.io.Serializable;

import com.mod.mod_a.Functions;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class DarkSpade extends ItemSpade{

	public DarkSpade(ToolMaterial material) {
		super(material);
	}

	@Override
	 public boolean onBlockDestroyed(ItemStack stack, World worldIn, Block blockIn, BlockPos pos, EntityLivingBase playerIn)
	{
		 EntityPlayer player = worldIn.getPlayerEntityByName(playerIn.getName());
		{
			if (blockIn == blockIn.getBlockById(13))
			{
				Functions.spawnItem(worldIn, Items.flint, 1, pos);
				}

		}

		return true;
	}

}


