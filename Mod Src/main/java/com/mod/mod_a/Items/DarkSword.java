package com.mod.mod_a.Items;

import com.mod.mod_a.Functions;
import com.mod.mod_a.blocks.DarkTable;
import com.mod.mod_a.init.ModAItems;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class DarkSword extends ItemSword{

	public DarkSword(ToolMaterial material) {
		super(material);
	}
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
		Potion potion = Potion.moveSlowdown;
		Potion potion2 = Potion.weakness;
		Functions.addPotionEffectToTarget(target, potion, 5, 1);
		Functions.addPotionEffectToTarget(target, potion2, 6, 1);
		EntityPlayer playerIn = attacker.getEntityWorld().getPlayerEntityByName(attacker.getName());
		stack.damageItem(1, playerIn);
        return true;
    }
	}


