package com.mod.mod_a;

import java.util.Random;

import ibxm.Player;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Functions {
	
	public static void spawnParticles(World worldIn, BlockPos pos , EnumParticleTypes particle)
    {
        Random random = worldIn.rand;
        double d0 = 0.0625D;

        for (int i = 0; i < 6; ++i)
        {
            double d1 = (double)((float)pos.getX() + random.nextFloat());
            double d2 = (double)((float)pos.getY() + random.nextFloat());
            double d3 = (double)((float)pos.getZ() + random.nextFloat());

            if (i == 0 && !worldIn.getBlockState(pos.up()).getBlock().isOpaqueCube())
            {
                d2 = (double)pos.getY() + d0 + 1.0D;
            }

            if (i == 1 && !worldIn.getBlockState(pos.down()).getBlock().isOpaqueCube())
            {
                d2 = (double)pos.getY() - d0;
            }

            if (i == 2 && !worldIn.getBlockState(pos.south()).getBlock().isOpaqueCube())
            {
                d3 = (double)pos.getZ() + d0 + 1.0D;
            }

            if (i == 3 && !worldIn.getBlockState(pos.north()).getBlock().isOpaqueCube())
            {
                d3 = (double)pos.getZ() - d0;
            }

            if (i == 4 && !worldIn.getBlockState(pos.east()).getBlock().isOpaqueCube())
            {
                d1 = (double)pos.getX() + d0 + 1.0D;
            }

            if (i == 5 && !worldIn.getBlockState(pos.west()).getBlock().isOpaqueCube())
            {
                d1 = (double)pos.getX() - d0;
            }

            if (d1 < (double)pos.getX() || d1 > (double)(pos.getX() + 1) || d2 < 0.0D || d2 > (double)(pos.getY() + 1) || d3 < (double)pos.getZ() || d3 > (double)(pos.getZ() + 1))
            {
                worldIn.spawnParticle(particle, d1, d2, d3, 0.0D, 0.0D, 0.0D, new int[0]);
            }
        }
    }
	public static void spawnItem(World world, Item item, int amount, BlockPos pos)
	{
		if (!world.isRemote)
		{
		double x = pos.getX();
		double y = pos.getY();
		double z = pos.getZ();
		world.spawnEntityInWorld(new EntityItem(world, x, y, z, new ItemStack(item, amount)));
		}
	}
	public static void spawnBlock(World world, IBlockState state, BlockPos pos)
	{ 
		world.setBlockState(pos, state);
	}
	public static void spawnItemOnBlock(World world, Item item, int amount, BlockPos pos)
	{
		if(!world.isRemote)
		{
		BlockPos posBlockUp = pos.up();
		double x = posBlockUp.getX();
		double y = posBlockUp.getY();
		double z = posBlockUp.getZ();
		world.spawnEntityInWorld(new EntityItem(world, x, y, z, new ItemStack(item, amount)));
		}
	}
	public static void addPotionEffectToPlayer(EntityPlayer player, Potion potion , int seconds, int strength)
	{
		int a = 20 * seconds;
		player.addPotionEffect(new PotionEffect(potion.getId(), a, strength));
	}
	public static void addPotionEffectToTarget(EntityLivingBase target, Potion potion , int seconds, int strength)
	{
		int a = 20 * seconds;
		target.addPotionEffect(new PotionEffect(potion.getId(), a, strength));
	}
	public static void tellPlayer(EntityPlayer player, String message, World world)
	{
		if(!world.isRemote)
		{
		player.addChatComponentMessage(new ChatComponentTranslation(message));
		}
	}
	public static void sendPlayerColouredMessage(EntityPlayer player, String message, EnumChatFormatting colour, World world)
	{
		if(!world.isRemote)
		{
		player.addChatComponentMessage(new ChatComponentTranslation(colour + message));
		}
	}
    @SideOnly(Side.CLIENT)
    public static String getItemDescription(Item item)
    {
        return StatCollector.translateToLocal("item." + item.getUnlocalizedName().substring(5) + ".desc");
    }
	 @SideOnly(Side.CLIENT)
	    public static String getMessage(String messageType)
	    {
	        return StatCollector.translateToLocal("mod_a.message." + messageType);
	    }
}


