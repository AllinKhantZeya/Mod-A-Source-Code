package com.mod.mod_a;

import com.mod.mod_a.init.ModABlocks;
import com.mod.mod_a.init.ModAItems;
import com.mod.mod_a.init.ModATileEntities;
import com.mod.mod_a.ModATab;
import com.mod.mod_a.proxy.CommonProxy;
import com.mod.mod_a.tileentity.TileEntityLightSource;

import net.minecraft.client.resources.Language;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class ModA {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final ModATab tabModA = new ModATab("tabModA");
	ModAEventHandler eventHandler = new ModAEventHandler();

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModAItems.init();
		ModAItems.register();
		ModABlocks.init();
		ModABlocks.register();
		ModABlocks.registerOreDictionary();
		FMLCommonHandler.instance().bus().register(eventHandler);
		MinecraftForge.EVENT_BUS.register(eventHandler);
		GameRegistry.registerFuelHandler(new ModAFuelHandler());
		ModATileEntities.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerRenders();
		Recipes.registerShapedRecipes();
		Recipes.registerShapelessRecipes();
		Recipes.registerSmeltingRecipes();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
	
	}

}

