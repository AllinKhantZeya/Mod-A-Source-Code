package com.mod.mod_a.Items;

import com.mod.mod_a.Functions;
import com.mod.mod_a.init.ModAItems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

public class Cutlass extends ItemSword{

	public Cutlass(ToolMaterial material) {
		super(material);
	}
	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		EntityPlayer player = worldIn.getPlayerEntityByName(entityIn.getName());
		if (isSelected){
		Functions.addPotionEffectToPlayer(player, Potion.moveSpeed, 1, 1);
		Functions.addPotionEffectToPlayer(player, Potion.damageBoost, 1, 0);
		}
	}
}
