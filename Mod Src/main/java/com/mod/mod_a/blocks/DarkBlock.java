package com.mod.mod_a.blocks;

import java.util.Random;

import com.mod.mod_a.Functions;
import com.mod.mod_a.init.ModABlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DarkBlock extends Block{

	public DarkBlock(Material materialIn) {
		super(materialIn);
		this.setStepSound(soundTypeMetal);
	}
	 @Override
	 @SideOnly(Side.CLIENT)
	    public void randomDisplayTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
	    {
		 EnumParticleTypes particle = EnumParticleTypes.PORTAL;
	     Functions.spawnParticles(worldIn, pos, particle);
	    }

}

