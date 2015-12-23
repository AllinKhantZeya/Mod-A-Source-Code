package com.mod.mod_a.blocks;

import java.util.Random;

import com.mod.mod_a.Functions;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Present extends Block{

	public Present(Material materialIn) {
		super(materialIn);
	}
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
		Block blockIn = Block.getBlockById(84);
		Item item = Item.getItemFromBlock(blockIn);
		int v = 1 + rand.nextInt(13);
		if (v != 13)
		{
			int id = 2255 + v;
        	return Item.getItemById(id);
		}
		else 
		return item;
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
