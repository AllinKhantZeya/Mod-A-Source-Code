package com.mod.mod_a.init;

import com.mod.mod_a.tileentity.TileEntityLightSource;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModATileEntities {
	public static void register(){
		GameRegistry.registerTileEntity(TileEntityLightSource.class, "mod_aLightSource");
	}

}
