package com.mod.mod_a.gui;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import com.mod.mod_a.Functions;
import com.mod.mod_a.Reference;
import com.mod.mod_a.gui.GuiContributorBook.PageButton;
import com.mod.mod_a.init.ModABlocks;
import com.mod.mod_a.init.ModAItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GuiBlackBook extends GuiScreen {

	private static final int BOOK_HEIGHT = 192, BOOK_WIDTH = 192, TOTAL_PAGES = 49;
	private static int currentPage = 0;
	private static ResourceLocation[] bookTextures = new ResourceLocation[TOTAL_PAGES];
	private static String[] text = new String[TOTAL_PAGES];
	private GuiButton done;
	private PageButton next;
	private PageButton previous;

	public GuiBlackBook() {
		bookTextures[0] = new ResourceLocation(Reference.MOD_ID + ":" + "textures/gui/black_book_cover.png");
		bookTextures[1] = new ResourceLocation(Reference.MOD_ID + ":" + "textures/gui/black_book.png");
		bookTextures[2] = new ResourceLocation(Reference.MOD_ID + ":" + "textures/gui/black_book_2.png");
		bookTextures[24] = new ResourceLocation(Reference.MOD_ID + ":" + "textures/gui/black_book_figures.png");
		bookTextures[43] = new ResourceLocation(Reference.MOD_ID + ":" + "textures/gui/black_book_reaper.png");
		bookTextures[46] = new ResourceLocation(Reference.MOD_ID + ":" + "textures/gui/black_book_46.png");

		text[0] = "\n" + ModAItems.black_book.getItemStackDisplayName(new ItemStack(ModAItems.black_book))
				+ "\n\n§4" + Functions.getItemDescription(ModAItems.black_book) + "\n\n§0§kGuide to Dark Table";
		text[1] = this.blackBookPage(Item.getItemFromBlock(ModABlocks.dark_table), Functions.getMessage("book.black_1"));
		text[2] = "\n\n\n\n\n\n" + Functions.getMessage("book.black_2");
		text[3] = this.blackBookPage(ModAItems.smiley_face, Functions.getMessage("book.black_3"));
		text[4] = this.blackBookPage(ModAItems.vampiric_sword, Functions.getMessage("book.black_4"));
		text[5] = this.blackBookPage(ModAItems.fedora, Functions.getMessage("book.black_5"));
		text[6] = this.blackBookPage(ModAItems.heart, Functions.getMessage("book.black_6"));
		text[7] = this.blackBookPage(ModAItems.lightning_rod, Functions.getMessage("book.black_7"));
		text[8] = this.blackBookPage(ModAItems.information_retriever, Functions.getMessage("book.black_8"));
		text[9] = this.blackBookPage(ModAItems.insta_house, Functions.getMessage("book.black_9"));
		text[10] = this.blackBookPage(ModAItems.ice_boots, Functions.getMessage("book.black_10"));
		text[11] = this.blackBookPage(ModAItems.ice_staff, Functions.getMessage("book.black_11"));
		text[12] = this.blackBookPage(ModAItems.chat_box, Functions.getMessage("book.black_12"));
		text[13] = this.blackBookPage(ModAItems.invisibility_cloak, Functions.getMessage("book.black_13"));
		text[14] = this.blackBookPage(ModAItems.fire_staff, Functions.getMessage("book.black_14"));
		text[15] = this.blackBookPage(ModAItems.knight_sword, Functions.getMessage("book.black_15"));
		text[16] = this.blackBookPage(Functions.getMessage("book.black_16.header"), Functions.getMessage("book.black_16"));
		text[17] = this.blackBookPage(ModAItems.fire_jacket, Functions.getMessage("book.black_17"));
		text[18] = this.blackBookPage(ModAItems.speed_boots, Functions.getMessage("book.black_18"));
		text[19] = this.blackBookPage(ModAItems.candy_cane, Functions.getMessage("book.black_19"));
		text[20] = this.blackBookPage(ModAItems.ginger_bread, Functions.getMessage("book.black_20"));
		text[21] = this.blackBookPage(ModAItems.deck, Functions.getMessage("book.black_21"));
		text[22] = this.blackBookPage(Functions.getMessage("book.black_22.header"), Functions.getMessage("book.black_22"));
		text[23] = this.blackBookPage(Item.getItemFromBlock(ModABlocks.present), Functions.getMessage("book.black_23"));
		text[24] = this.blackBookPage(Functions.getMessage("book.black_24.header"), Functions.getMessage("book.black_24"));
		text[25] = this.blackBookPage(ModAItems.automatic_bolt_blaster, Functions.getMessage("book.black_25"));
		text[26] = this.blackBookPage(ModAItems.dark_bane, Functions.getMessage("book.black_26"));
		text[27] = this.blackBookPage(ModAItems.venom_sword, Functions.getMessage("book.black_27"));
		text[28] = this.blackBookPage(ModAItems.hand_cannon, Functions.getMessage("book.black_28"));
		text[29] = this.blackBookPage(ModAItems.undeads_bane, Functions.getMessage("book.black_29"));
		text[30] = this.blackBookPage(ModAItems.teleportation_rod, Functions.getMessage("book.black_30"));
		text[31] = this.blackBookPage(ModAItems.cutlass, Functions.getMessage("book.black_31"));
		text[32] = this.blackBookPage(ModAItems.aquatic_helmet, Functions.getMessage("book.black_32"));
		text[33] = this.blackBookPage(ModAItems.turkey_leg, Functions.getMessage("book.black_33"));
		text[34] = this.blackBookPage(this.itemDisplay(ModAItems.cola) + "/" + this.itemDisplay(ModAItems.ender_punch), Functions.getMessage("book.black_34"));
		text[35] = this.blackBookPage(ModAItems.glasses, Functions.getMessage("book.black_35"));
		text[36] = this.blackBookPage(ModAItems.shades, Functions.getMessage("book.black_36"));
		text[37] = this.blackBookPage(ModAItems.mob_lifter, Functions.getMessage("book.black_37"));
		text[38] = this.blackBookPage(ModAItems.top_hat, Functions.getMessage("book.black_38"));
		text[39] = this.blackBookPage(ModAItems.flashlight_off, Functions.getMessage("book.black_39"));
		text[40] = this.blackBookPage(ModAItems.schyte, Functions.getMessage("book.black_40"));
		text[41] = Functions.getMessage("book.black_41");
		text[42] = this.blackBookPage(Functions.getMessage("book.black_42.header"), Functions.getMessage("book.black_42"));
		text[43] = Functions.getMessage("book.black_43");
		text[44] = this.blackBookPage(Functions.getMessage("book.black_44.header"), Functions.getMessage("book.black_44"));
		text[45] = this.blackBookPage(Functions.getMessage("book.black_45.header"), Functions.getMessage("book.black_45"));
		text[46] = Functions.getMessage("book.black_46");
		text[47] = this.blackBookPage(Functions.getMessage("book.black_47.header"), Functions.getMessage("book.black_47"));
		text[48] = this.blackBookPage(Functions.getMessage("book.black_48.header"), Functions.getMessage("book.black_48"));
	}
	
	private String blackBookPage(Item item, String string){
		return "§n" + item.getItemStackDisplayName(new ItemStack(item)) + "\n\n§0" + string;
	}
	private String itemDisplay(Item item){
		return item.getItemStackDisplayName(new ItemStack(item));
	}
	private String blackBookPage(String header, String text){
		return "§n" + header + "\n\n§0" + text;
	}

	@Override
	public void onGuiClosed() {
		Keyboard.enableRepeatEvents(false);
	}

	@Override
	public boolean doesGuiPauseGame() {
		return true;
	}

	@Override
	public void actionPerformed(GuiButton button) {
		if (button == done) {
			mc.displayGuiScreen((GuiScreen) null);
		}
		if (button == next) {
			if (currentPage < TOTAL_PAGES - 1) {
				++currentPage;
			}
		}
		if (button == previous) {
			if (currentPage > 0) {
				--currentPage;
			}
		}
	}

	@Override
	public void initGui() {
		buttonList.clear();
		Keyboard.enableRepeatEvents(true);

		int bookLeft = (width - BOOK_WIDTH) / 2;
		done = new GuiButton(0, this.width / 2 - 100, 4 + this.BOOK_HEIGHT, 200, 20, I18n.format("gui.done", new Object[0]));
		next = new PageButton(1, bookLeft + 120, 156, true);
		previous = new PageButton(2, bookLeft + 38, 156, false);
		buttonList.add(done);
		buttonList.add(next);
		buttonList.add(previous);
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		switch (currentPage) {
		case 0:
			mc.getTextureManager().bindTexture(bookTextures[0]);
			break;
		default:
			mc.getTextureManager().bindTexture(bookTextures[1]);
			break;
		case 2:
			mc.getTextureManager().bindTexture(bookTextures[2]);
			break;
		case 24:
			mc.getTextureManager().bindTexture(bookTextures[24]);
			break;
		case 43:
			mc.getTextureManager().bindTexture(bookTextures[43]);
			break;
		case 46:
			mc.getTextureManager().bindTexture(bookTextures[46]);
			break;
		}
		int bookLeft = (width - BOOK_WIDTH) / 2;
		this.drawTexturedModalRect(bookLeft, 2, 0, 0, BOOK_WIDTH, BOOK_HEIGHT);
		String pageIndicator = I18n.format("book.pageIndicator",
				new Object[] { Integer.valueOf(currentPage + 1), TOTAL_PAGES });
		int stringWidth = fontRendererObj.getStringWidth(pageIndicator);
		fontRendererObj.drawString(pageIndicator, bookLeft - stringWidth + BOOK_WIDTH - 44, 18, 0);
		fontRendererObj.drawSplitString(text[currentPage], bookLeft + 36, 34, 116, 0);
		super.drawScreen(mouseX, mouseY, partialTicks);
	}

	@SideOnly(Side.CLIENT)
	static class PageButton extends GuiButton {
		private final boolean isNext;

		public PageButton(int buttonId, int x, int y, boolean isNext) {
			super(buttonId, x, y, 23, 13, "");
			this.isNext = isNext;
		}

		@Override
		public void drawButton(Minecraft mc, int mouseX, int mouseY) {
			if (this.visible) {
				boolean isHovered = (mouseX >= this.xPosition && mouseY >= this.yPosition
						&& mouseX < this.xPosition + width && mouseY < this.yPosition + height);
				GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
				mc.getTextureManager().bindTexture(bookTextures[1]);
				int x = 0;
				int y = 192;

				if (isHovered) {
					x += 23;
				}
				if (!isNext) {
					y += 13;
				}
				this.drawTexturedModalRect(this.xPosition, this.yPosition, x, y, 23, 13);
			}
		}
	}
}
