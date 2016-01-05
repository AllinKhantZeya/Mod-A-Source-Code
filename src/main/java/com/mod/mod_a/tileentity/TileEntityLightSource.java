package com.mod.mod_a.tileentity;

import com.mod.mod_a.Functions;
import com.mod.mod_a.init.ModABlocks;
import com.mod.mod_a.init.ModAItems;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.server.gui.IUpdatePlayerListBox;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class TileEntityLightSource extends TileEntity implements IUpdatePlayerListBox {

	@Override
	public boolean shouldRefresh(World world, BlockPos pos, IBlockState oldState, IBlockState newSate) {
		return (oldState.getBlock() != newSate.getBlock());
	}

	@Override
	public void update() {
		BlockPos pos = this.getPos();
		EntityPlayer player = worldObj.getClosestPlayer(pos.getX(), pos.getY(), pos.getZ(), 2.0);
		if (player == null && worldObj.getBlockState(pos).getBlock() == ModABlocks.light_source) {
			worldObj.setBlockToAir(pos);
		} else if (player != null && player.getCurrentEquippedItem() != null) {
			if (player.getCurrentEquippedItem().getItem() != ModAItems.flashlight_on
					&& worldObj.getBlockState(pos).getBlock() == ModABlocks.light_source) {
				worldObj.setBlockToAir(pos);
			}
		} else if (player != null && player.getCurrentEquippedItem() == null) {
			worldObj.setBlockToAir(pos);
		}
	}
}
