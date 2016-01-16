package com.mod.mod_a.blocks;

import java.util.Random;

import com.mod.mod_a.Functions;
import com.mod.mod_a.init.ModABlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PresentToy extends Block{

	public PresentToy(Material materialIn) {
		super(materialIn);
	}
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
		int v = rand.nextInt(8);
		switch (v){
		case 0: return Item.getItemFromBlock(ModABlocks.herobrine_figure);
		case 1: return Item.getItemFromBlock(ModABlocks.notch_figure);
		case 2: return Item.getItemFromBlock(ModABlocks.steve_figure);
		case 3: return Item.getItemFromBlock(ModABlocks.alex_figure);
		case 4: return Item.getItemFromBlock(ModABlocks.zombie_figure);
		case 5: return Item.getItemFromBlock(ModABlocks.santa_figure);
		case 6: return Item.getItemFromBlock(ModABlocks.creeper_figure);
		case 7: return Item.getItemFromBlock(ModABlocks.jeb_figure);
		}
		return null;
}
	@Override
    public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face)
    {
        return 300;
    }
	@Override
	public boolean isFlammable(IBlockAccess world, BlockPos pos, EnumFacing face){
		return true;
	}
	 @Override
	 @SideOnly(Side.CLIENT)
	    public void randomDisplayTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
	    {
		 EnumParticleTypes particle = EnumParticleTypes.FIREWORKS_SPARK;
	     Functions.spawnParticles(worldIn, pos, particle);
	    }
}

