package com.mod.mod_a.init;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModAMaterials {
	/* 	Vanilla Armour Materials
	 	LEATHER("leather", 5, new int[]{1, 3, 2, 1}, 15),
        CHAIN("chainmail", 15, new int[]{2, 5, 4, 1}, 12),
        IRON("iron", 15, new int[]{2, 6, 5, 2}, 9),
        GOLD("gold", 7, new int[]{2, 5, 3, 1}, 25),
        DIAMOND("diamond", 33, new int[]{3, 8, 6, 3}, 10);
        
        Vanilla Tool Materials
        WOOD(0, 59, 2.0F, 0.0F, 15),
        STONE(1, 131, 4.0F, 1.0F, 5),
        IRON(2, 250, 6.0F, 2.0F, 14),
        EMERALD(3, 1561, 8.0F, 3.0F, 10),
        GOLD(0, 32, 12.0F, 0.0F, 22);
    */
	
	//Mod A Tool Materials
	public static final ToolMaterial DARK = EnumHelper.addToolMaterial("DARK", 3, 800, 3.0F, 2.0F, 18);
	public static final ToolMaterial CROSS_SWORD = EnumHelper.addToolMaterial("CROSS_SWORD", 3, 1000, 2.0F, 4.0F, 3);
	public static final ToolMaterial SOUL = EnumHelper.addToolMaterial("SOUL", 2, 400, 10.0F, 1.0F, 30);
	public static final ToolMaterial DRAGON = EnumHelper.addToolMaterial("DRAGON", 3, 1800, 6.0F, 5.0F, 10);
	public static final ToolMaterial WITHER = EnumHelper.addToolMaterial("WITHER", 3, 1600, 13.0F, 3.0F, 15);
	
	//Mod A Armour Materials
	public static final ArmorMaterial DARK_ARMOR = EnumHelper.addArmorMaterial("DARK_ARMOR", "dark_armor", 20, new int[]{2, 7, 5, 2}, 20);
	public static final ArmorMaterial KNIGHT = EnumHelper.addArmorMaterial("KNIGHT", "knight", 18, new int[]{3, 8, 4, 1}, 23);
	public static final ArmorMaterial FESTIVE = EnumHelper.addArmorMaterial("FESTIVE", "festive", 10, new int[]{2, 4, 4, 1}, 30);
	public static final ArmorMaterial REAPER = EnumHelper.addArmorMaterial("REAPER", "reaper", 25, new int[]{2, 9, 7, 2}, 12);
	public static final ArmorMaterial SOUL_ARMOR = EnumHelper.addArmorMaterial("SOUL_ARMOR", "soul_armor", 10, new int[]{2, 6, 4, 2}, 35);
	public static final ArmorMaterial DRAGON_ARMOR = EnumHelper.addArmorMaterial("DRAGON_ARMOR", "dragon_armor", 38, new int[]{4, 9, 8, 4}, 9);
	public static final ArmorMaterial WITHER_ARMOR =EnumHelper.addArmorMaterial("WITHER_ARMOR", "wither_armor", 35, new int[]{4, 8, 5, 4}, 27);
}
