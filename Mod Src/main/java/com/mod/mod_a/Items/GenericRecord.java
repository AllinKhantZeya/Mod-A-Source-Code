package com.mod.mod_a.Items;

import java.util.List;
import java.util.Map;

import com.google.common.collect.Maps;
import com.mod.mod_a.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GenericRecord extends ItemRecord {

	public GenericRecord(String name) {
		super(name);
	}
	@Override
    public net.minecraft.util.ResourceLocation getRecordResource(String name)
    {
        return new net.minecraft.util.ResourceLocation(Reference.MOD_ID + ":" + name);
    }
}
