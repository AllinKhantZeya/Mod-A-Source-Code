package com.mod.mod_a.Items;

import com.mod.mod_a.Functions;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class DarkItem extends Item{
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World worldIn, EntityPlayer playerIn)
	{
		Potion potion = Potion.damageBoost;
		EnumChatFormatting colour = EnumChatFormatting.DARK_AQUA;
	    Functions.addPotionEffectToPlayer(playerIn, potion, 10, 1);
	    Functions.sendPlayerColouredMessage(playerIn, "You are now stronger.", colour, worldIn);
	    if (!playerIn.capabilities.isCreativeMode)
        {
            --stack.stackSize;
        }

        return stack;
	}
    }
