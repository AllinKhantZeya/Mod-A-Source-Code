package com.mod.mod_a.Items;

import com.mod.mod_a.Functions;
import com.mod.mod_a.model.TopHatModel;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TopHat extends ItemArmor {

	public TopHat(ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return "mod_a:textures/models/armor/top_hat.png";
	}

	@Override
	@SideOnly(Side.CLIENT)
	public net.minecraft.client.model.ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack,
			int armorSlot) {
		return new TopHatModel();
	}
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
	{
         Potion potion = Potion.digSpeed;
         Functions.addPotionEffectToPlayer(player, potion, 1, 2);
	}
}
