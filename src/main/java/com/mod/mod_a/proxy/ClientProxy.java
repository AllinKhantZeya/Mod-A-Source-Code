package com.mod.mod_a.proxy;

import com.mod.mod_a.gui.GuiBlackBook;
import com.mod.mod_a.gui.GuiContributorBook;
import com.mod.mod_a.init.ModABlocks;
import com.mod.mod_a.init.ModAItems;

import net.minecraft.client.Minecraft;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void registerRenders() {
		ModAItems.registerRenders();
		ModABlocks.registerRenders();
	}
	@Override
	public void openGuiContributor(){
		Minecraft.getMinecraft().displayGuiScreen(new GuiContributorBook());
	}
	@Override
	public void openGuiGuide(){
		Minecraft.getMinecraft().displayGuiScreen(new GuiBlackBook());
	}
}
