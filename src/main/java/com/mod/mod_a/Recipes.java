package com.mod.mod_a;


import com.mod.mod_a.init.ModABlocks;
import com.mod.mod_a.init.ModAItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes {
	
	public static void registerShapedRecipes()
	{
		//Misc
		GameRegistry.addRecipe(new ItemStack(ModAItems.dark_item,1), new Object[]{
				" R ","RDR"," R ",'R',Items.redstone,'D',Items.coal,
				});
		GameRegistry.addRecipe(new ItemStack(ModAItems.dark_and_ender,1), new Object[]{
				"E","D","B",'E',Items.ender_pearl,'D',ModAItems.dark_item,'B',Items.bucket,
		});
		GameRegistry.addRecipe(new ItemStack(ModAItems.dark_and_ender,1), new Object[]{
				"D","E","B",'E',Items.ender_pearl,'D',ModAItems.dark_item,'B',Items.bucket,
		});
		GameRegistry.addRecipe(new ItemStack(ModAItems.dark_rod,1), new Object[]{
				" D","D ",'D',ModAItems.dark_ingot,
		});
		
		//Dark Tools
		GameRegistry.addRecipe(new ItemStack(ModAItems.dark_sword,1), new Object[]{
				"I","I","R",'I', ModAItems.dark_ingot,'R',ModAItems.dark_rod,
		});
		GameRegistry.addRecipe(new ItemStack(ModAItems.dark_shovel,1), new Object[]{
				"I","R","R",'I', ModAItems.dark_ingot,'R',ModAItems.dark_rod,
		});
		GameRegistry.addRecipe(new ItemStack(ModAItems.dark_pickaxe,1), new Object[]{
				"III"," R "," R ",'I', ModAItems.dark_ingot,'R',ModAItems.dark_rod,
		});
		GameRegistry.addRecipe(new ItemStack(ModAItems.dark_hoe,1), new Object[]{
				"II"," R"," R",'I', ModAItems.dark_ingot,'R',ModAItems.dark_rod,
		});
		GameRegistry.addRecipe(new ItemStack(ModAItems.dark_axe,1), new Object[]{
				"II","IR"," R",'I', ModAItems.dark_ingot,'R',ModAItems.dark_rod,
		});
		GameRegistry.addRecipe(new ItemStack(ModABlocks.dark_block), new Object[]{
				"III","III","III",'I',ModAItems.dark_ingot,
		});
		
		// Sandwich
		GameRegistry.addRecipe(new ItemStack(ModAItems.cheese_sandwich,1), new Object[]{
				"B","C","B",'B', ModAItems.sliced_bread,'C',ModAItems.cheese_slice,
		});
		GameRegistry.addRecipe(new ItemStack(ModAItems.toast_cheese_sandwich,1), new Object[]{
				"B","C","B",'B', ModAItems.toast,'C',ModAItems.cheese_slice,
		});
		
		//Dark Armour
		GameRegistry.addRecipe(new ItemStack(ModAItems.dark_helmet), new Object[]{
				"III","I I",'I', ModAItems.dark_ingot,
		});
		GameRegistry.addRecipe(new ItemStack(ModAItems.dark_chestplate), new Object[]{
				"I I","III", "III",'I', ModAItems.dark_ingot,
		});
		GameRegistry.addRecipe(new ItemStack(ModAItems.dark_leggings), new Object[]{
				"III","I I", "I I",'I', ModAItems.dark_ingot,
		});
		GameRegistry.addRecipe(new ItemStack(ModAItems.dark_boots), new Object[]{
				"I I","I I",'I', ModAItems.dark_ingot,
		});
		
		//DarkTable
		GameRegistry.addRecipe(new ItemStack(ModABlocks.dark_table), new Object[]{
				"III"," R ","RBR",'I',ModAItems.dark_ingot,'R',ModAItems.dark_rod,'B',ModABlocks.dark_block,
		});
		
		//Specials
		GameRegistry.addRecipe(new ItemStack(ModAItems.soul_sword,1), new Object[]{
				"I","I","R",'I', ModAItems.soul,'R',Items.stick,
		});
		GameRegistry.addRecipe(new ItemStack(ModAItems.soul_shovel,1), new Object[]{
				"I","R","R",'I', ModAItems.soul,'R',Items.stick,
		});
		GameRegistry.addRecipe(new ItemStack(ModAItems.soul_pickaxe,1), new Object[]{
				"III"," R "," R ",'I', ModAItems.soul,'R',Items.stick,
		});
		GameRegistry.addRecipe(new ItemStack(ModAItems.soul_hoe,1), new Object[]{
				"II"," R"," R",'I', ModAItems.soul,'R',Items.stick,
		});
		GameRegistry.addRecipe(new ItemStack(ModAItems.soul_axe,1), new Object[]{
				"II","IR"," R",'I', ModAItems.soul,'R',Items.stick,
		});
		
		GameRegistry.addRecipe(new ItemStack(ModAItems.soul_helmet), new Object[]{
				"III","I I",'I', ModAItems.soul,
		});
		GameRegistry.addRecipe(new ItemStack(ModAItems.soul_chestplate), new Object[]{
				"I I","III", "III",'I', ModAItems.soul,
		});
		GameRegistry.addRecipe(new ItemStack(ModAItems.soul_leggings), new Object[]{
				"III","I I", "I I",'I', ModAItems.soul,
		});
		GameRegistry.addRecipe(new ItemStack(ModAItems.soul_boots), new Object[]{
				"I I","I I",'I', ModAItems.soul,
		});
		
		GameRegistry.addRecipe(new ItemStack(ModABlocks.dragon_ingot_maker), new Object[]{
				"S","C","F",'S', ModAItems.dragon_soul,'C', ModAItems.core, 'F', Blocks.furnace,
		});
		GameRegistry.addRecipe(new ItemStack(ModABlocks.dragon_ingot_maker), new Object[]{
				"C","S","F",'S', ModAItems.dragon_soul,'C', ModAItems.core, 'F', Blocks.furnace,
		});
		
		GameRegistry.addRecipe(new ItemStack(ModABlocks.wither_ingot_maker), new Object[]{
				"S","C","F",'S', ModAItems.wither_soul,'C', ModAItems.core, 'F', Blocks.furnace,
		});
		GameRegistry.addRecipe(new ItemStack(ModABlocks.wither_ingot_maker), new Object[]{
				"C","S","F",'S', ModAItems.wither_soul,'C', ModAItems.core, 'F', Blocks.furnace,
		});
		
		GameRegistry.addRecipe(new ItemStack(ModAItems.dragon_sword,1), new Object[]{
				"I","I","R",'I', ModAItems.dragon_ingot,'R',Items.stick,
		});
		GameRegistry.addRecipe(new ItemStack(ModAItems.dragon_shovel,1), new Object[]{
				"I","R","R",'I', ModAItems.dragon_ingot,'R',Items.stick,
		});
		GameRegistry.addRecipe(new ItemStack(ModAItems.dragon_pickaxe,1), new Object[]{
				"III"," R "," R ",'I', ModAItems.dragon_ingot,'R',Items.stick,
		});
		GameRegistry.addRecipe(new ItemStack(ModAItems.dragon_hoe,1), new Object[]{
				"II"," R"," R",'I', ModAItems.dragon_ingot,'R',Items.stick,
		});
		GameRegistry.addRecipe(new ItemStack(ModAItems.dragon_axe,1), new Object[]{
				"II","IR"," R",'I', ModAItems.dragon_ingot,'R',Items.stick,
		});
		
		GameRegistry.addRecipe(new ItemStack(ModAItems.dragon_helmet), new Object[]{
				"III","I I",'I', ModAItems.dragon_ingot,
		});
		GameRegistry.addRecipe(new ItemStack(ModAItems.dragon_chestplate), new Object[]{
				"I I","III", "III",'I', ModAItems.dragon_ingot,
		});
		GameRegistry.addRecipe(new ItemStack(ModAItems.dragon_leggings), new Object[]{
				"III","I I", "I I",'I', ModAItems.dragon_ingot,
		});
		GameRegistry.addRecipe(new ItemStack(ModAItems.dragon_boots), new Object[]{
				"I I","I I",'I', ModAItems.dragon_ingot,
		});
		
		GameRegistry.addRecipe(new ItemStack(ModAItems.wither_sword,1), new Object[]{
				"I","I","R",'I', ModAItems.wither_ingot,'R',Items.stick,
		});
		GameRegistry.addRecipe(new ItemStack(ModAItems.wither_shovel,1), new Object[]{
				"I","R","R",'I', ModAItems.wither_ingot,'R',Items.stick,
		});
		GameRegistry.addRecipe(new ItemStack(ModAItems.wither_pickaxe,1), new Object[]{
				"III"," R "," R ",'I', ModAItems.wither_ingot,'R',Items.stick,
		});
		GameRegistry.addRecipe(new ItemStack(ModAItems.wither_hoe,1), new Object[]{
				"II"," R"," R",'I', ModAItems.wither_ingot,'R',Items.stick,
		});
		GameRegistry.addRecipe(new ItemStack(ModAItems.wither_axe,1), new Object[]{
				"II","IR"," R",'I', ModAItems.wither_ingot,'R',Items.stick,
		});
		
		GameRegistry.addRecipe(new ItemStack(ModAItems.wither_helmet), new Object[]{
				"III","I I",'I', ModAItems.wither_ingot,
		});
		GameRegistry.addRecipe(new ItemStack(ModAItems.wither_chestplate), new Object[]{
				"I I","III", "III",'I', ModAItems.wither_ingot,
		});
		GameRegistry.addRecipe(new ItemStack(ModAItems.wither_leggings), new Object[]{
				"III","I I", "I I",'I', ModAItems.wither_ingot,
		});
		GameRegistry.addRecipe(new ItemStack(ModAItems.wither_boots), new Object[]{
				"I I","I I",'I', ModAItems.wither_ingot,
		});
	}
	
	public static void registerShapelessRecipes()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(ModAItems.sliced_bread,4), new Object[]{
				Items.bread });
		GameRegistry.addShapelessRecipe(new ItemStack(ModAItems.dark_substance_bucket,1), new Object[]{
				ModAItems.dark_and_ender,Items.lava_bucket
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ModAItems.cheese,1), new Object[]{
				Items.milk_bucket,
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ModAItems.cheese_slice,4), new Object[]{
				ModAItems.cheese,Items.iron_sword,
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ModAItems.dark_ingot,1), new Object[]{
				ModAItems.dark_ingot_bucket,
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ModAItems.dark_ingot,9), new Object[]{
				ModABlocks.dark_block,
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ModAItems.dragon_soul,1), new Object[]{
				ModAItems.soul, Blocks.dragon_egg,
		});
		GameRegistry.addShapelessRecipe(new ItemStack(ModAItems.wither_soul,1), new Object[]{
				ModAItems.soul, Items.nether_star,
		});
	}
	
	public static void registerSmeltingRecipes()
	{
		GameRegistry.addSmelting(ModAItems.sliced_bread, new ItemStack(ModAItems.toast), 0.1F);
		GameRegistry.addSmelting(ModAItems.cheese_sandwich, new ItemStack(ModAItems.grilled_cheese), 0.3F);
		GameRegistry.addSmelting(ModAItems.dark_substance_bucket, new ItemStack(ModAItems.dark_ingot_bucket), 0.5F);
	}

}
