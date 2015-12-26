package com.mod.mod_a;

import java.util.Random;

import com.mod.mod_a.init.ModABlocks;
import com.mod.mod_a.init.ModAItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.potion.Potion;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.UseHoeEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModAEventHandler {

	public static final PropertyEnum VARIANT = PropertyEnum.create("variant", BlockDirt.DirtType.class);
	Random rand = new Random();

	@SubscribeEvent
	public void playerKill(LivingDeathEvent event) {
		if (event.source.getEntity() != null) {
			double x = event.entity.posX;
			double y = event.entity.posY;
			double z = event.entity.posZ;
			World world = event.entity.getEntityWorld();
			if (event.source.getEntity() instanceof EntityPlayer) {
				EntityPlayer player = (EntityPlayer) event.source.getEntity();
				if (player.inventory.getCurrentItem().getItem() == ModAItems.schyte) {
					Functions.spawnItem(world, ModAItems.soul, 1, new BlockPos(x, y, z));
				}
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
							&& leggings == ModAItems.reaper_robes_down && boots == ModAItems.reaper_boots
							&& player.inventory.getCurrentItem().getItem() == ModAItems.schyte) {
						Functions.addPotionEffectToPlayer(player, Potion.regeneration, 3, 0);
						Functions.addPotionEffectToPlayer(player, Potion.saturation, 3, 0);
					}
				}
			}
		}
	}

	@SubscribeEvent
	public void playerJoinEvent(EntityJoinWorldEvent event) {
		String message = "§4§ki" + EnumChatFormatting.DARK_AQUA + Functions.getMessage("welcome") + "§4§ki";
		if (!event.world.isRemote){
			event.entity.addChatMessage(new ChatComponentTranslation(EnumChatFormatting.BOLD + message));
		}
		if (event.entity instanceof EntityPlayer){
			EntityPlayer player = (EntityPlayer) event.entity;
			if (!player.inventory.hasItem(ModAItems.contributor_book)){
			player.inventory.addItemStackToInventory(new ItemStack(ModAItems.contributor_book));
			}
		}
	}
	@SubscribeEvent
	public void playerAttackEvent(AttackEntityEvent event) {
		if (event.target instanceof EntityLivingBase) {
			EntityPlayer player = event.entityPlayer;
			EntityLivingBase target = (EntityLivingBase) event.target;
			if (player.getCurrentArmor(3) != null && player.getCurrentArmor(2) != null
					&& player.getCurrentArmor(1) != null && player.getCurrentArmor(0) != null) {
				Item helmet = player.getCurrentArmor(3).getItem();
				Item chestplate = player.getCurrentArmor(2).getItem();
				Item leggings = player.getCurrentArmor(1).getItem();
				Item boots = player.getCurrentArmor(0).getItem();
				if (helmet == ModAItems.wither_helmet && chestplate == ModAItems.wither_chestplate
						&& leggings == ModAItems.wither_leggings && boots == ModAItems.wither_boots) {
					Functions.addPotionEffectToTarget(target, Potion.wither, 3, 1);
				}
				if (player.inventory.getCurrentItem() != null) {
					if (helmet == ModAItems.wither_helmet && chestplate == ModAItems.wither_chestplate
							&& leggings == ModAItems.wither_leggings && boots == ModAItems.wither_boots
							&& player.inventory.getCurrentItem().getItem() == ModAItems.wither_sword) {
						Functions.addPotionEffectToTarget(target, Potion.wither, 4, 2);
					}
				}
			}
		}
	}

	@SubscribeEvent
	public void livingAttackEvent(LivingAttackEvent event) {
		if (event.source.getEntity() instanceof EntityLivingBase && event.entityLiving instanceof EntityPlayer
				&& !event.source.isProjectile()) {
			EntityLivingBase attacker = (EntityLivingBase) event.source.getEntity();
			EntityPlayer player = (EntityPlayer) event.entityLiving;
			if (player.getCurrentArmor(3) != null && player.getCurrentArmor(2) != null
					&& player.getCurrentArmor(1) != null && player.getCurrentArmor(0) != null) {
				Item helmet = player.getCurrentArmor(3).getItem();
				Item chestplate = player.getCurrentArmor(2).getItem();
				Item leggings = player.getCurrentArmor(1).getItem();
				Item boots = player.getCurrentArmor(0).getItem();
				if (helmet == ModAItems.wither_helmet && chestplate == ModAItems.wither_chestplate
						&& leggings == ModAItems.wither_leggings && boots == ModAItems.wither_boots) {
					Functions.addPotionEffectToTarget(attacker, Potion.wither, 3, 1);
				}
			}
		}
	}

	@SubscribeEvent
	public void useHoe(UseHoeEvent event) {
		World worldIn = event.world;
		int number = rand.nextInt(5);
		BlockPos pos = event.pos;
		EntityPlayer player = event.entityPlayer;
		if (player.getCurrentEquippedItem() != null
				&& player.getCurrentEquippedItem().getItem() == ModAItems.dark_hoe) {
			if (worldIn.getBlockState(pos) == Blocks.dirt.getDefaultState().withProperty(VARIANT,
					BlockDirt.DirtType.DIRT) || worldIn.getBlockState(pos).getBlock() == Blocks.grass) {
				if (worldIn.getBlockState(pos.up()).getBlock().getMaterial() == Material.air){
				switch (number) {
				case 0:
					Functions.spawnItemOnBlock(worldIn, Items.wheat_seeds, 1, pos);
					break;
				case 1:
					Functions.spawnItemOnBlock(worldIn, Items.melon_seeds, 1, pos);
					break;
				case 2:
					Functions.spawnItemOnBlock(worldIn, Items.pumpkin_seeds, 1, pos);
					break;
				case 3:
					Functions.spawnItemOnBlock(worldIn, Items.potato, 1, pos);
					break;
				case 4:
					Functions.spawnItemOnBlock(worldIn, Items.carrot, 1, pos);
					break;
				}
			}
			}
		}
	}
}