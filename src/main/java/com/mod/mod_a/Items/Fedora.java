package com.mod.mod_a.Items;

import com.mod.mod_a.Functions;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

public class Fedora extends ItemArmor{
	
	public Fedora(ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) 
	{
		return "mod_a:textures/models/armor/fedora_layer_1.png";
	}
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{
         Potion potion = Potion.damageBoost;
         Functions.addPotionEffectToPlayer(player, potion, 1, 2);
	}
}
