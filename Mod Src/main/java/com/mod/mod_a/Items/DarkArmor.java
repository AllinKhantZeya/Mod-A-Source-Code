package com.mod.mod_a.Items;

import java.util.Random;

import com.mod.mod_a.Functions;
import com.mod.mod_a.init.ModAItems;

import ibxm.Player;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DarkArmor extends ItemArmor{

	public DarkArmor(ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (this.armorType == 2)
		{
			return "mod_a:textures/models/armor/dark_armor_layer_2.png";
		}
		return "mod_a:textures/models/armor/dark_armor_layer_1.png";
	}
	    @Override
    	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	    {
	    	Potion potion = Potion.resistance;
	    	if (player.getCurrentArmor(3) != null && player.getCurrentArmor(2) != null && player.getCurrentArmor(1) != null && player.getCurrentArmor(0) != null)
	    	{
	    	 ItemStack helmeti = player.getCurrentArmor(3);
	    	 ItemStack chestplatei = player.getCurrentArmor(2);
	    	 ItemStack leggingsi = player.getCurrentArmor(1);
	    	 ItemStack bootsi = player.getCurrentArmor(0);
	    	 Item helmet = helmeti.getItem();
	    	 Item chestplate = chestplatei.getItem();
	    	 Item leggings = leggingsi.getItem();
	    	 Item boots = bootsi.getItem();
	    	 if (boots == ModAItems.dark_boots && leggings == ModAItems.dark_leggings && chestplate == ModAItems.dark_chestplate && helmet == ModAItems.dark_helmet)
	    	 {
	    		 Functions.addPotionEffectToPlayer(player, potion, 1, 2);
	    		 Functions.spawnParticles(world, new BlockPos(player.prevPosX, player.prevPosY, player.prevPosZ), EnumParticleTypes.SMOKE_NORMAL);
	    	 }
	    	 else
	    	 {
	    		 return;
	    	 }
	    	}
	    	else
	    	{
	    		return;
	    	}
		}
	    	}


