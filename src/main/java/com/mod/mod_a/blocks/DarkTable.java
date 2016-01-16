package com.mod.mod_a.blocks;

import java.util.Random;

import com.mod.mod_a.Functions;
import com.mod.mod_a.init.ModABlocks;
import com.mod.mod_a.init.ModAItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.World;

public class DarkTable extends Block {

	public DarkTable(Material materialIn) {
		super(materialIn);
		this.setStepSound(soundTypeAnvil);
		this.setHardness(4);
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public boolean isFullCube() {
		return false;
	}

	@Override
	public EnumWorldBlockLayer getBlockLayer() {
		return EnumWorldBlockLayer.CUTOUT;

	}

	private static void darkTableGenerateItem(World world, Item item, int amount, BlockPos pos,
			EntityLivingBase playerIn) {
		String playername = playerIn.getName();
		EntityPlayer player = world.getPlayerEntityByName(playername);
		EnumChatFormatting colouritem = EnumChatFormatting.GOLD;
		Functions.spawnItemOnBlock(world, item, amount, pos);

		if (amount == 1) {
			Functions.tellPlayer(player, playername + ", " + Functions.getMessage("dark.table.generate") + " " + amount
					+ " " + colouritem + item.getItemStackDisplayName(new ItemStack(item)) + ".", world);
			return;
		} else {
			if (1 < amount) {
				Functions.tellPlayer(player,
						playername + ", " + Functions.getMessage("dark.table.generate") + " " + amount + " "
								+ colouritem + item.getItemStackDisplayName(new ItemStack(item))
								+ Functions.getMessage("plural.grammar") + ".",
						world);
			}
			return;
		}
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumFacing side, float hitX, float hitY, float hitZ) {
		BlockPos pos1 = pos.up();
		Block block = worldIn.getBlockState(pos1).getBlock();
		int id = block.getIdFromBlock(block);
		EnumChatFormatting colour = EnumChatFormatting.DARK_RED;

		if (id != 0) {
			Functions.sendPlayerColouredMessage(playerIn, Functions.getMessage("dark.table.warning.1"), colour,
					worldIn);
			return false;
		} else {
			ItemStack stack = playerIn.getCurrentEquippedItem();
			if (stack != null) {
				Item item = stack.getItem();
				if (item.getIdFromItem(item) != 264) {
					Functions.tellPlayer(playerIn, colour + Functions.getMessage("warning.need") + " "
							+ Items.diamond.getItemStackDisplayName(new ItemStack(Items.diamond)), worldIn);
					return false;
				} else {
					Random rand = new Random();
					int i = rand.nextInt(92);
					EnumParticleTypes particle = EnumParticleTypes.SMOKE_LARGE;
					--stack.stackSize;
					Functions.spawnParticles(worldIn, pos, particle);
					switch (i) {
					case 0:
						darkTableGenerateItem(worldIn, ModAItems.dark_ingot, 3, pos, playerIn);
						break;
					case 1:
						darkTableGenerateItem(worldIn, ModAItems.dark_item, 5, pos, playerIn);
						break;
					case 2:
						darkTableGenerateItem(worldIn, Items.skull, 1, pos, playerIn);
						break;
					case 3:
						darkTableGenerateItem(worldIn, ModAItems.smiley_face, 1, pos, playerIn);
						break;
					case 4:
						darkTableGenerateItem(worldIn, Items.chainmail_helmet, 1, pos, playerIn);
						break;
					case 5:
						darkTableGenerateItem(worldIn, Items.chainmail_chestplate, 1, pos, playerIn);
						break;
					case 6:
						darkTableGenerateItem(worldIn, Items.chainmail_leggings, 1, pos, playerIn);
						break;
					case 7:
						darkTableGenerateItem(worldIn, Items.chainmail_boots, 1, pos, playerIn);
						break;
					case 8:
						darkTableGenerateItem(worldIn, ModAItems.vampiric_sword, 1, pos, playerIn);
						break;
					case 9:
						darkTableGenerateItem(worldIn, ModAItems.fedora, 1, pos, playerIn);
						break;
					case 10:
						darkTableGenerateItem(worldIn, ModAItems.heart, 1, pos, playerIn);
						break;
					case 11:
						darkTableGenerateItem(worldIn, ModAItems.lightning_rod, 1, pos, playerIn);
						break;
					case 12:
						darkTableGenerateItem(worldIn, ModAItems.information_retriever, 1, pos, playerIn);
						break;
					case 13:
						darkTableGenerateItem(worldIn, ModAItems.insta_house, 1, pos, playerIn);
						break;
					case 14:
						darkTableGenerateItem(worldIn, ModAItems.ice_boots, 1, pos, playerIn);
						break;
					case 15:
						darkTableGenerateBlock(worldIn, ModABlocks.herobrine_figure, 1, pos, playerIn);
						break;
					case 16:
						darkTableGenerateBlock(worldIn, Blocks.bedrock, 1, pos, playerIn);
						break;
					case 17:
						darkTableGenerateItem(worldIn, ModAItems.ice_staff, 1, pos, playerIn);
						break;
					case 18:
						darkTableGenerateItem(worldIn, Items.gunpowder, 5, pos, playerIn);
						break;
					case 19:
						darkTableGenerateItem(worldIn, ModAItems.chat_box, 1, pos, playerIn);
						break;
					case 20:
						darkTableGenerateItem(worldIn, ModAItems.invisibility_cloak, 1, pos, playerIn);
						break;
					case 21:
						darkTableGenerateItem(worldIn, ModAItems.fire_staff, 1, pos, playerIn);
						break;
					case 22:
						darkTableGenerateItem(worldIn, ModAItems.knight_sword, 1, pos, playerIn);
						break;
					case 23:
						darkTableGenerateItem(worldIn, ModAItems.knight_helmet, 1, pos, playerIn);
						break;
					case 24:
						darkTableGenerateItem(worldIn, ModAItems.knight_chestplate, 1, pos, playerIn);
						break;
					case 25:
						darkTableGenerateItem(worldIn, ModAItems.knight_leggings, 1, pos, playerIn);
						break;
					case 26:
						darkTableGenerateItem(worldIn, ModAItems.knight_boots, 1, pos, playerIn);
						break;
					case 27:
						darkTableGenerateItem(worldIn, ModAItems.fire_jacket, 1, pos, playerIn);
						break;
					case 28:
						darkTableGenerateItem(worldIn, ModAItems.speed_boots, 1, pos, playerIn);
						break;
					case 29:
						darkTableGenerateItem(worldIn, ModAItems.candy_cane, 3, pos, playerIn);
						break;
					case 30:
						darkTableGenerateItem(worldIn, ModAItems.ginger_bread, 5, pos, playerIn);
						break;
					case 31:
						darkTableGenerateBlock(worldIn, ModABlocks.santa_figure, 1, pos, playerIn);
						break;
					case 32:
						darkTableGenerateBlock(worldIn, ModABlocks.present, 1, pos, playerIn);
						break;
					case 33:
						darkTableGenerateItem(worldIn, ModAItems.password_2, 1, pos, playerIn);
						break;
					case 34:
						darkTableGenerateItem(worldIn, ModAItems.deck, 1, pos, playerIn);
						break;
					case 35:
						darkTableGenerateItem(worldIn, ModAItems.wish, 1, pos, playerIn);
						break;
					case 36:
						darkTableGenerateItem(worldIn, ModAItems.jingle_bells, 1, pos, playerIn);
						break;
					case 37:
						darkTableGenerateItem(worldIn, ModAItems.festive_coat, 1, pos, playerIn);
						break;
					case 38:
						darkTableGenerateItem(worldIn, ModAItems.festive_pants, 1, pos, playerIn);
						break;
					case 39:
						darkTableGenerateItem(worldIn, ModAItems.festive_boots, 1, pos, playerIn);
						break;
					case 40:
						darkTableGenerateItem(worldIn, ModAItems.automatic_bolt_blaster, 1, pos, playerIn);
						break;
					case 41:
						darkTableGenerateItem(worldIn, ModAItems.encrypted_message, 1, pos, playerIn);
						break;
					case 42:
						darkTableGenerateItem(worldIn, ModAItems.dark_bane, 1, pos, playerIn);
						break;
					case 43:
						darkTableGenerateBlock(worldIn, ModABlocks.steve_figure, 1, pos, playerIn);
						break;
					case 44:
						darkTableGenerateBlock(worldIn, ModABlocks.notch_figure, 1, pos, playerIn);
						break;
					case 45:
						darkTableGenerateBlock(worldIn, ModABlocks.alex_figure, 1, pos, playerIn);
						break;
					case 46:
						darkTableGenerateItem(worldIn, ModAItems.venom_sword, 1, pos, playerIn);
						break;
					case 47:
						darkTableGenerateItem(worldIn, ModAItems.hand_cannon, 1, pos, playerIn);
						break;
					case 48:
						darkTableGenerateItem(worldIn, ModAItems.undeads_bane, 1, pos, playerIn);
						break;
					case 49:
						darkTableGenerateItem(worldIn, ModAItems.teleportation_rod, 1, pos, playerIn);
						break;
					case 50:
						darkTableGenerateItem(worldIn, ModAItems.cutlass, 1, pos, playerIn);
						break;
					case 51:
						darkTableGenerateItem(worldIn, ModAItems.aquatic_helmet, 1, pos, playerIn);
						break;
					case 52:
						darkTableGenerateItem(worldIn, ModAItems.schyte, 1, pos, playerIn);
						break;
					case 53:
						darkTableGenerateItem(worldIn, ModAItems.reaper_hood, 1, pos, playerIn);
						break;
					case 54:
						darkTableGenerateItem(worldIn, ModAItems.reaper_robes_up, 1, pos, playerIn);
						break;
					case 55:
						darkTableGenerateItem(worldIn, ModAItems.reaper_robes_down, 1, pos, playerIn);
						break;
					case 56:
						darkTableGenerateItem(worldIn, ModAItems.reaper_boots, 1, pos, playerIn);
						break;
					case 57:
						darkTableGenerateItem(worldIn, ModAItems.soul, 5, pos, playerIn);
						break;
					case 58:
						darkTableGenerateItem(worldIn, ModAItems.soul_sword, 1, pos, playerIn);
						break;
					case 59:
						darkTableGenerateItem(worldIn, ModAItems.soul_pickaxe, 1, pos, playerIn);
						break;
					case 60:
						darkTableGenerateItem(worldIn, ModAItems.soul_shovel, 1, pos, playerIn);
						break;
					case 61:
						darkTableGenerateItem(worldIn, ModAItems.soul_axe, 1, pos, playerIn);
						break;
					case 62:
						darkTableGenerateItem(worldIn, ModAItems.soul_hoe, 1, pos, playerIn);
						break;
					case 63:
						darkTableGenerateItem(worldIn, ModAItems.soul_helmet, 1, pos, playerIn);
						break;
					case 64:
						darkTableGenerateItem(worldIn, ModAItems.soul_chestplate, 1, pos, playerIn);
						break;
					case 65:
						darkTableGenerateItem(worldIn, ModAItems.soul_leggings, 1, pos, playerIn);
						break;
					case 66:
						darkTableGenerateItem(worldIn, ModAItems.soul_boots, 1, pos, playerIn);
						break;
					case 67:
						darkTableGenerateItem(worldIn, ModAItems.turkey_leg, 1, pos, playerIn);
						break;
					case 68:
						darkTableGenerateBlock(worldIn, ModABlocks.zombie_figure, 1, pos, playerIn);
						break;
					case 69:
						darkTableGenerateBlock(worldIn, ModABlocks.present_toy, 1, pos, playerIn);
						break;
					case 70:
						darkTableGenerateItem(worldIn, ModAItems.cola, 1, pos, playerIn);
						break;
					case 71:
						darkTableGenerateItem(worldIn, ModAItems.ender_punch, 1, pos, playerIn);
						break;
					case 72:
						darkTableGenerateItem(worldIn, ModAItems.core, 1, pos, playerIn);
						break;
					case 73:
						darkTableGenerateItem(worldIn, Items.writable_book, 1, pos, playerIn);
						break;
					case 74:
						darkTableGenerateItem(worldIn, Items.apple, 1, pos, playerIn);
						break;
					case 75:
						int v = 256 + rand.nextInt(431 - 255);
						darkTableGenerateItem(worldIn, Item.getItemById(v), 1, pos, playerIn);
						break;
					case 76:
						darkTableGenerateItem(worldIn, ModAItems.dark_axe, 1, pos, playerIn);
						break;
					case 77:
						darkTableGenerateItem(worldIn, ModAItems.dark_pickaxe, 1, pos, playerIn);
						break;
					case 78:
						darkTableGenerateItem(worldIn, ModAItems.dark_hoe, 1, pos, playerIn);
						break;
					case 79:
						darkTableGenerateItem(worldIn, ModAItems.dark_sword, 1, pos, playerIn);
						break;
					case 80:
						darkTableGenerateItem(worldIn, ModAItems.glasses, 1, pos, playerIn);
						break;
					case 81:
						darkTableGenerateItem(worldIn, ModAItems.shades, 1, pos, playerIn);
						break;
					case 82:
						darkTableGenerateItem(worldIn, ModAItems.mob_lifter, 1, pos, playerIn);
						break;
					case 83:
						darkTableGenerateItem(worldIn, Item.getItemById(rand.nextInt(198)), 1, pos, playerIn);
						break;
					case 84:
						darkTableGenerateItem(worldIn, ModAItems.insta_house_2, 1, pos, playerIn);
						break;
					case 85:
						darkTableGenerateBlock(worldIn, ModABlocks.cave_game_cobblestone, 5, pos, playerIn);
						break;
					case 86:
						darkTableGenerateBlock(worldIn, ModABlocks.cave_game_dirt, 10, pos, playerIn);
						break;
					case 87:
						darkTableGenerateItem(worldIn, ModAItems.insta_house_3, 1, pos, playerIn);
						break;
					case 88:
						darkTableGenerateBlock(worldIn, ModABlocks.creeper_figure, 1, pos, playerIn);
						break;
					case 89:
						darkTableGenerateItem(worldIn, ModAItems.top_hat, 1, pos, playerIn);
						break;
					case 90:
						darkTableGenerateItem(worldIn, ModAItems.flashlight_off, 1, pos, playerIn);
						break;
					case 91:
						darkTableGenerateBlock(worldIn, ModABlocks.jeb_figure, 1, pos, playerIn);
						break;
					}

				}
			} else {
				Functions
						.sendPlayerColouredMessage(playerIn,
								Functions.getMessage("warning.need") + " "
										+ Items.diamond.getItemStackDisplayName(new ItemStack(Items.diamond)),
								colour, worldIn);
			}
		}
		return true;

	}

	private static void darkTableGenerateBlock(World world, Block block, int amount, BlockPos pos,
			EntityPlayer playerIn) {
		Item item = Item.getItemFromBlock(block);
		darkTableGenerateItem(world, item, amount, pos, playerIn);
	}
}