package com.mod.mod_a.Items;

import com.mod.mod_a.Functions;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class AutomaticBoltBlaster extends Item {

	@Override
	public ItemStack onItemRightClick(ItemStack stack, World worldIn, EntityPlayer playerIn) {
		if (playerIn.inventory.hasItem(Items.arrow)) {
			stack.damageItem(1, playerIn);
			if (!worldIn.isRemote) {
				double x = playerIn.posX + playerIn.getLookVec().xCoord * 2.0,
					   y = playerIn.posY + playerIn.getLookVec().yCoord * 2.0,
					   z = playerIn.posZ + playerIn.getLookVec().zCoord * 2.0;
				EntityArrow arrow = new EntityArrow(worldIn, x, y + 1, z);
				arrow.motionX = playerIn.getLookVec().xCoord * 2.0;
				arrow.motionY = playerIn.getLookVec().yCoord * 2.0;
				arrow.motionZ = playerIn.getLookVec().zCoord * 2.0;
				arrow.canBePickedUp = (!playerIn.capabilities.isCreativeMode) ? 1 : 2;
				worldIn.playSoundAtEntity(playerIn, "random.bow", 1.0F, 1.0F);
				worldIn.spawnEntityInWorld(arrow);
				if (!playerIn.capabilities.isCreativeMode) {
					playerIn.inventory.consumeInventoryItem(Items.arrow);
				}
			}
			return stack;
		} else {
			Functions.tellPlayer(playerIn, EnumChatFormatting.DARK_RED + Functions.getMessage("warning.need.vowel")
					+ " " + Items.arrow.getItemStackDisplayName(new ItemStack(Items.arrow)), worldIn);
		}
		return stack;
	}

}
