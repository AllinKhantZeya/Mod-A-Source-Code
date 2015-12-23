package com.mod.mod_a.proxy;

import com.mod.mod_a.init.ModABlocks;
import com.mod.mod_a.init.ModAItems;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void registerRenders() {
		ModAItems.registerRenders();
		ModABlocks.registerRenders();
	}

}
