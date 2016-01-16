package com.mod.mod_a.init;

import com.mod.mod_a.Functions;
import com.mod.mod_a.ModA;
import com.mod.mod_a.Reference;
import com.mod.mod_a.blocks.DarkBlock;
import com.mod.mod_a.blocks.DarkTable;
import com.mod.mod_a.blocks.DragonIngotMaker;
import com.mod.mod_a.blocks.Figure;
import com.mod.mod_a.blocks.GenericBlock;
import com.mod.mod_a.blocks.LightSource;
import com.mod.mod_a.blocks.Present;
import com.mod.mod_a.blocks.PresentToy;
import com.mod.mod_a.blocks.WitherIngotMaker;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ModABlocks {

	public static Block dark_block;
	public static Block dark_table;
	public static Block herobrine_figure;
	public static Block santa_figure;
	public static Block steve_figure;
	public static Block notch_figure;
	public static Block alex_figure;
	public static Block zombie_figure;
	public static Block creeper_figure;
	public static Block jeb_figure;
	public static Block present;
	public static Block present_toy;
	public static Block dragon_ingot_maker;
	public static Block wither_ingot_maker;
	public static Block cave_game_cobblestone;
	public static Block cave_game_dirt;
	public static Block light_source;

	public static void init() {
		dark_block = new DarkBlock(Material.rock).setUnlocalizedName("dark_block").setHardness(4.0F);
		dark_table = new DarkTable(Material.wood).setUnlocalizedName("dark_table");
		herobrine_figure = new Figure(Material.cloth).setUnlocalizedName("herobrine_figure");
		santa_figure = new Figure(Material.cloth).setUnlocalizedName("santa_figure");
		steve_figure = new Figure(Material.cloth).setUnlocalizedName("steve_figure");
		notch_figure = new Figure(Material.cloth).setUnlocalizedName("notch_figure");
		alex_figure = new Figure(Material.cloth).setUnlocalizedName("alex_figure");
		zombie_figure = new Figure(Material.cloth).setUnlocalizedName("zombie_figure");
		creeper_figure = new Figure(Material.cloth).setUnlocalizedName("creeper_figure");
		jeb_figure = new Figure(Material.cloth).setUnlocalizedName("jeb_figure");
		present = new Present(Material.cloth).setUnlocalizedName("present").setHardness(0.5F);
		present_toy = new PresentToy(Material.cloth).setUnlocalizedName("present_toy").setHardness(0.5F);
		dragon_ingot_maker = new DragonIngotMaker(Material.rock).setUnlocalizedName("dragon_ingot_maker")
				.setHardness(4.0F);
		wither_ingot_maker = new WitherIngotMaker(Material.rock).setUnlocalizedName("wither_ingot_maker")
				.setHardness(4.0F);
		cave_game_cobblestone = new GenericBlock(Material.rock).setUnlocalizedName("cave_game_cobblestone")
				.setHardness(2.0F).setStepSound(Block.soundTypeStone);
		cave_game_dirt = new GenericBlock(Material.ground).setUnlocalizedName("cave_game_dirt")
				.setHardness(0.5F).setStepSound(Block.soundTypeGrass);
		light_source = new LightSource(Material.air).setUnlocalizedName("light_source");
	}

	public static void register() {
		registerBlock(dark_block);
		registerBlock(dark_table);
		registerBlock(herobrine_figure);
		registerBlock(santa_figure);
		registerBlock(steve_figure);
		registerBlock(notch_figure);
		registerBlock(alex_figure);
		registerBlock(zombie_figure);
		registerBlock(creeper_figure);
		registerBlock(jeb_figure);
		registerBlock(present);
		registerBlock(present_toy);
		registerBlock(dragon_ingot_maker);
		registerBlock(wither_ingot_maker);
		registerBlock(cave_game_cobblestone);
		registerBlock(cave_game_dirt);
		Functions.registerBlockX(light_source);
	}

	public static void registerRenders() {
		registerRender(dark_block);
		registerRender(dark_table);
		registerRender(herobrine_figure);
		registerRender(santa_figure);
		registerRender(steve_figure);
		registerRender(notch_figure);
		registerRender(alex_figure);
		registerRender(zombie_figure);
		registerRender(creeper_figure);
		registerRender(jeb_figure);
		registerRender(present);
		registerRender(present_toy);
		registerRender(dragon_ingot_maker);
		registerRender(wither_ingot_maker);
		registerRender(cave_game_cobblestone);
		registerRender(cave_game_dirt);
	}
	public static void registerOreDictionary(){
		OreDictionary.registerOre("cobblestone", cave_game_cobblestone);
		OreDictionary.registerOre("dirt", cave_game_dirt);
	}

	public static void registerRender(Block block) {
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(
				Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

	public static void registerBlock(Block block) {
		GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(5)).setCreativeTab(ModA.tabModA);
	}

}
