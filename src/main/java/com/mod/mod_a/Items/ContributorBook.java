package com.mod.mod_a.Items;

import java.util.List;

import com.mod.mod_a.Functions;
import com.mod.mod_a.ModA;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ContributorBook extends Item{

	@Override
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn)
    {
		ModA.proxy.openGuiContributor();
        return itemStackIn;
    }
	@Override
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced) {
		tooltip.add(Functions.getItemDescription(this));
	}
}
