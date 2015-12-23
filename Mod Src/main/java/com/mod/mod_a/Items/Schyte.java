package com.mod.mod_a.Items;

import com.mod.mod_a.Functions;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class Schyte extends ItemSword{
	public Schyte(ToolMaterial material) {
		super(material);
	}
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
        stack.setItemDamage(this.getDamage(stack) - 1);
        Functions.addPotionEffectToTarget(target, Potion.confusion , 5, 1);
        Functions.addPotionEffectToTarget(target, Potion.moveSlowdown, 3, 0);
        return true;
    }
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World worldIn, EntityPlayer playerIn)
	{
		playerIn.swingItem();
		stack.damageItem(10, playerIn);
		Functions.addPotionEffectToPlayer(playerIn, Potion.damageBoost, 3, 0);
		Functions.addPotionEffectToPlayer(playerIn, Potion.jump, 3, 0);
		return stack;
	}
	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		EntityPlayer player = worldIn.getPlayerEntityByName(entityIn.getName());
		if (isSelected){
			Functions.addPotionEffectToPlayer(player, Potion.nightVision, 11, 0);
			}
		}
	}

