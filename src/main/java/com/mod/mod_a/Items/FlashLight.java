package com.mod.mod_a.Items;

import java.util.List;

import com.mod.mod_a.Functions;
import com.mod.mod_a.init.ModABlocks;
import com.mod.mod_a.init.ModAItems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class FlashLight extends Item {

	@Override
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {
		Item item = playerIn.getCurrentEquippedItem().getItem();
		if (item == ModAItems.flashlight_off) {
			itemStackIn.setItem(ModAItems.flashlight_on);
		} else if (item == ModAItems.flashlight_on) {
			itemStackIn.setItem(ModAItems.flashlight_off);
		}
		worldIn.playSoundAtEntity(playerIn, "random.click", 0.3F, 0.3F);
		return itemStackIn;
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		if (isSelected && stack.getItem() == ModAItems.flashlight_on) {
			Vec3 look = entityIn.getLookVec();
			BlockPos posx = new BlockPos(entityIn.prevPosX, entityIn.prevPosY -0.2D - entityIn.getYOffset(), entityIn.prevPosZ);
			BlockPos pos = new BlockPos (posx.getX() + look.xCoord, posx.getY() + look.yCoord, posx.getZ() + look.zCoord);
			if (worldIn.getBlockState(posx).getBlock() == Blocks.air){
			Functions.spawnBlock(worldIn, ModABlocks.light_source.getDefaultState(), posx);
			}
			else if (worldIn.getBlockState(new BlockPos(look)) == Blocks.air){
			Functions.spawnBlock(worldIn, ModABlocks.light_source.getDefaultState(), pos);
			}
	}
	}
	@Override
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced) {
		if (stack.getItem() == ModAItems.flashlight_off){
			tooltip.add(Functions.getItemDescription(ModAItems.flashlight_off));
		}
		else if (stack.getItem() == ModAItems.flashlight_on){
			tooltip.add(EnumChatFormatting.AQUA + Functions.getItemDescription(ModAItems.flashlight_on));
		}
	}
}
