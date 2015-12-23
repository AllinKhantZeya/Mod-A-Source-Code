package com.mod.mod_a.Items;

import com.mod.mod_a.Functions;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

public class AquaticHelmet  extends ItemArmor{

	public AquaticHelmet(ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return "mod_a:textures/models/armor/aquatic_helmet_layer_1.png";
	}
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{
         Potion potion = Potion.waterBreathing;
         Functions.addPotionEffectToPlayer(player, potion, 1, 2);
	}
}
