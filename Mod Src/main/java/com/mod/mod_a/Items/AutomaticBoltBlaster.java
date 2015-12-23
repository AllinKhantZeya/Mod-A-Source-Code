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
				EntityArrow arrow = new EntityArrow(worldIn,
						playerIn.getPosition().getX() + 0.5 + playerIn.getLookVec().xCoord,
						playerIn.getPosition().getY() + 0.5 + 1 + playerIn.getLookVec().yCoord,
						playerIn.getPosition().getZ() + playerIn.getLookVec().zCoord);
				arrow.motionX = playerIn.getLookVec().xCoord * 1.40;
				arrow.motionY = playerIn.getLookVec().yCoord * 1.40;
				arrow.motionZ = playerIn.getLookVec().zCoord * 1.40;
				worldIn.spawnEntityInWorld(arrow);
				if (!playerIn.capabilities.isCreativeMode) {
					playerIn.inventory.consumeInventoryItem(Items.arrow);
				}
			}
			return stack;
		} else {
			Functions.tellPlayer(playerIn, EnumChatFormatting.DARK_RED + Functions.getMessage("warning.need.vowel") + " "
					+ Items.arrow.getItemStackDisplayName(new ItemStack(Items.arrow)), worldIn);
		}
		return stack;
	}

}
