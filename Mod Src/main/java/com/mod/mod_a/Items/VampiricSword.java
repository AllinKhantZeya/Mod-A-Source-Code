package com.mod.mod_a.Items;

import java.util.Random;

import com.mod.mod_a.Functions;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;

public class VampiricSword extends ItemSword{

	public VampiricSword(ToolMaterial material) {
		super(material);
	}
	
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
			Random rand = new Random();
			int i = rand.nextInt(4) + 1;
			attacker.heal(i);
			
			EntityPlayer playerIn = attacker.getEntityWorld().getPlayerEntityByName(attacker.getName());
			if(!playerIn.capabilities.isCreativeMode)
			{
				stack.damageItem(1, playerIn);
			}
			return false;
		}
    }
