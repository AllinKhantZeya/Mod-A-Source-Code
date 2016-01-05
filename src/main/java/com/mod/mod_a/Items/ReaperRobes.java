package com.mod.mod_a.Items;

import com.mod.mod_a.Functions;
import com.mod.mod_a.init.ModAItems;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;

public class ReaperRobes extends ItemArmor {

	public ReaperRobes(ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (entity instanceof EntityPlayer && entity.isSneaking()) {
			EntityPlayer player = (EntityPlayer) entity;
			if (player.getCurrentArmor(3) != null && player.getCurrentArmor(2) != null
					&& player.getCurrentArmor(1) != null && player.getCurrentArmor(0) != null) {
				ItemStack helmetStack = player.getCurrentArmor(3);
				ItemStack chestplateStack = player.getCurrentArmor(2);
				ItemStack leggingsStack = player.getCurrentArmor(1);
				ItemStack bootsStack = player.getCurrentArmor(0);

				Item helmet = helmetStack.getItem();
				Item chestplate = chestplateStack.getItem();
				Item leggings = leggingsStack.getItem();
				Item boots = bootsStack.getItem();
				if (helmet == ModAItems.reaper_hood && chestplate == ModAItems.reaper_robes_up
						&& leggings == ModAItems.reaper_robes_down && boots == ModAItems.reaper_boots) {
				return "mod_a:textures/models/armor/invisibility_cloak_layer_1.png";
			}
		}
		}
		if (this.armorType == 2) {
			return "mod_a:textures/models/armor/reaper_layer_2.png";
		}
		return "mod_a:textures/models/armor/reaper_layer_1.png";
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		Potion potion = Potion.digSpeed;
		Potion potion2 = Potion.moveSpeed;
		if (player.getCurrentArmor(3) != null && player.getCurrentArmor(2) != null && player.getCurrentArmor(1) != null
				&& player.getCurrentArmor(0) != null) {
			ItemStack helmetStack = player.getCurrentArmor(3);
			ItemStack chestplateStack = player.getCurrentArmor(2);
			ItemStack leggingsStack = player.getCurrentArmor(1);
			ItemStack bootsStack = player.getCurrentArmor(0);

			Item helmet = helmetStack.getItem();
			Item chestplate = chestplateStack.getItem();
			Item leggings = leggingsStack.getItem();
			Item boots = bootsStack.getItem();
			if (helmet == ModAItems.reaper_hood && chestplate == ModAItems.reaper_robes_up
					&& leggings == ModAItems.reaper_robes_down && boots == ModAItems.reaper_boots) {
				Functions.addPotionEffectToPlayer(player, potion, 1, 0);
				Functions.addPotionEffectToPlayer(player, potion2, 1, 0);
				if (player.isSneaking()) {
					Functions.addPotionEffectToPlayer(player, Potion.invisibility, 1, 0);
				}
			}
		} else {
			return;
		}
		return;
	}
}
