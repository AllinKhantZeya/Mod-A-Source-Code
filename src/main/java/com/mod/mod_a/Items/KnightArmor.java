package com.mod.mod_a.Items;

import com.mod.mod_a.Functions;
import com.mod.mod_a.init.ModAItems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;

public class KnightArmor extends ItemArmor{

	public KnightArmor(ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (this.armorType == 2)
		{
			return "mod_a:textures/models/armor/knight_armor_layer_2.png";
		}
		return "mod_a:textures/models/armor/knight_armor_layer_1.png";
	}
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
    {
		Potion potion = Potion.jump;
		Potion potion2 = Potion.resistance;
		if (player.getCurrentArmor(3) != null && player.getCurrentArmor(2) != null && player.getCurrentArmor(1) != null && player.getCurrentArmor(0) != null)
		{
			ItemStack helmetStack = player.getCurrentArmor(3);
			ItemStack chestplateStack = player.getCurrentArmor(2);
			ItemStack leggingsStack = player.getCurrentArmor(1);
			ItemStack bootsStack = player.getCurrentArmor(0);
			
			Item helmet = helmetStack.getItem();
			Item chestplate = chestplateStack.getItem();
			Item leggings = leggingsStack.getItem();
			Item boots = bootsStack.getItem();
			if (helmet == ModAItems.knight_helmet && chestplate == ModAItems.knight_chestplate && leggings == ModAItems.knight_leggings && boots == ModAItems.knight_boots){
				Functions.addPotionEffectToPlayer(player, potion, 1, 1);
				Functions.addPotionEffectToPlayer(player, potion2, 1, 0);
			}
			else{
				return;
			}
		}
		else
		{
			return;
		}
    }
}
