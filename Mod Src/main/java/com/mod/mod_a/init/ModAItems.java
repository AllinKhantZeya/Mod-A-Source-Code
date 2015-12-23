package com.mod.mod_a.init;

import com.mod.mod_a.ModA;
import com.mod.mod_a.Reference;
import com.mod.mod_a.Items.AquaticHelmet;
import com.mod.mod_a.Items.AutomaticBoltBlaster;
import com.mod.mod_a.Items.CandyCane;
import com.mod.mod_a.Items.ChatBox;
import com.mod.mod_a.Items.Cutlass;
import com.mod.mod_a.Items.DarkArmor;
import com.mod.mod_a.Items.DarkAxe;
import com.mod.mod_a.Items.DarkItem;
import com.mod.mod_a.Items.DarkPickaxe;
import com.mod.mod_a.Items.DarkSpade;
import com.mod.mod_a.Items.DarkSword;
import com.mod.mod_a.Items.DragonArmor;
import com.mod.mod_a.Items.Fedora;
import com.mod.mod_a.Items.FestiveSuit;
import com.mod.mod_a.Items.FireJacket;
import com.mod.mod_a.Items.FireStaff;
import com.mod.mod_a.Items.GenericRecord;
import com.mod.mod_a.Items.GingerBread;
import com.mod.mod_a.Items.Glasses;
import com.mod.mod_a.Items.HandCannon;
import com.mod.mod_a.Items.Heart;
import com.mod.mod_a.Items.IceBoots;
import com.mod.mod_a.Items.IceStaff;
import com.mod.mod_a.Items.InformationRetriever;
import com.mod.mod_a.Items.InstaHouse;
import com.mod.mod_a.Items.InstaHouse2;
import com.mod.mod_a.Items.InstaHouse3;
import com.mod.mod_a.Items.InvisibilityCloak;
import com.mod.mod_a.Items.KnightArmor;
import com.mod.mod_a.Items.KnightSword;
import com.mod.mod_a.Items.LightningRod;
import com.mod.mod_a.Items.MobLifter;
import com.mod.mod_a.Items.ReaperRobes;
import com.mod.mod_a.Items.RegularAxe;
import com.mod.mod_a.Items.RegularHoe;
import com.mod.mod_a.Items.RegularPickaxe;
import com.mod.mod_a.Items.RegularShovel;
import com.mod.mod_a.Items.RegularSword;
import com.mod.mod_a.Items.Schyte;
import com.mod.mod_a.Items.Shades;
import com.mod.mod_a.Items.SmileyFace;
import com.mod.mod_a.Items.SoulArmor;
import com.mod.mod_a.Items.SpeedBoots;
import com.mod.mod_a.Items.TeleportationRod;
import com.mod.mod_a.Items.TurkeyLeg;
import com.mod.mod_a.Items.UndeadsBane;
import com.mod.mod_a.Items.VampiricSword;
import com.mod.mod_a.Items.VenomSword;
import com.mod.mod_a.Items.WitherArmor;
import com.mod.mod_a.Items.WitherSword;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModAItems {

	// Generic Items
	public static Item dark_item;
	public static Item dark_and_ender;
	public static Item dark_ingot;
	public static Item dark_rod;
	public static Item dark_substance_bucket;
	public static Item dark_ingot_bucket;

	// Sandwich Items
	public static Item sliced_bread;
	public static Item toast;
	public static Item cheese;
	public static Item cheese_sandwich;
	public static Item toast_cheese_sandwich;
	public static Item grilled_cheese;
	public static Item cheese_slice;

	// Dark Tools
	public static Item dark_sword;
	public static Item dark_hoe;
	public static Item dark_shovel;
	public static Item dark_axe;
	public static Item dark_pickaxe;

	// Dark Armor
	public static Item dark_helmet;
	public static Item dark_chestplate;
	public static Item dark_leggings;
	public static Item dark_boots;

	// Special Items
	public static Item smiley_face;
	public static Item vampiric_sword;
	public static Item fedora;
	public static Item heart;
	public static Item lightning_rod;
	public static Item information_retriever;
	public static Item insta_house;
	public static Item ice_boots;
	public static Item ice_staff;
	public static Item chat_box;
	public static Item invisibility_cloak;
	public static Item fire_staff;
	public static Item knight_sword;
	public static Item knight_helmet;
	public static Item knight_chestplate;
	public static Item knight_leggings;
	public static Item knight_boots;
	public static Item fire_jacket;
	public static Item speed_boots;
	public static Item candy_cane;
	public static Item ginger_bread;
	public static Item password_2;
	public static Item deck;
	public static Item jingle_bells;
	public static Item wish;
	public static Item festive_coat;
	public static Item festive_pants;
	public static Item festive_boots;
	public static Item automatic_bolt_blaster;
	public static Item encrypted_message;
	public static Item dark_bane;
	public static Item venom_sword;
	public static Item hand_cannon;
	public static Item undeads_bane;
	public static Item teleportation_rod;
	public static Item cutlass;
	public static Item aquatic_helmet;
	public static Item schyte;
	public static Item reaper_hood;
	public static Item reaper_robes_up;
	public static Item reaper_robes_down;
	public static Item reaper_boots;
	public static Item soul;
	public static Item soul_sword;
	public static Item soul_pickaxe;
	public static Item soul_shovel;
	public static Item soul_axe;
	public static Item soul_hoe;
	public static Item soul_helmet;
	public static Item soul_chestplate;
	public static Item soul_leggings;
	public static Item soul_boots;
	public static Item turkey_leg;
	public static Item cola;
	public static Item ender_punch;
	public static Item core;
	public static Item dragon_soul;
	public static Item wither_soul;
	public static Item dragon_ingot;
	public static Item glasses;
	public static Item shades;
	public static Item mob_lifter;
	public static Item dragon_sword;
	public static Item dragon_pickaxe;
	public static Item dragon_axe;
	public static Item dragon_shovel;
	public static Item dragon_hoe;
	public static Item dragon_helmet;
	public static Item dragon_chestplate;
	public static Item dragon_leggings;
	public static Item dragon_boots;
	public static Item wither_ingot;
	public static Item wither_sword;
	public static Item wither_pickaxe;
	public static Item wither_axe;
	public static Item wither_shovel;
	public static Item wither_hoe;
	public static Item wither_helmet;
	public static Item wither_chestplate;
	public static Item wither_leggings;
	public static Item wither_boots;
	public static Item insta_house_2;
	public static Item insta_house_3;

	public static void init() {
		// Generic Items
		dark_item = new DarkItem().setUnlocalizedName("dark_item");
		dark_and_ender = new Item().setUnlocalizedName("dark_and_ender").setMaxStackSize(1);
		dark_ingot = new Item().setUnlocalizedName("dark_ingot");
		dark_rod = new Item().setUnlocalizedName("dark_rod").setFull3D();
		dark_substance_bucket = new Item().setUnlocalizedName("dark_substance_bucket").setMaxStackSize(1);
		dark_ingot_bucket = new Item().setUnlocalizedName("dark_ingot_bucket").setMaxStackSize(1)
				.setContainerItem(Items.bucket);

		// Sandwich Items
		sliced_bread = new ItemFood(3, 0.3F, false).setUnlocalizedName("sliced_bread");
		toast = new ItemFood(6, 0.6F, false).setUnlocalizedName("toast");
		cheese = new ItemFood(5, 0.4F, false).setUnlocalizedName("cheese").setContainerItem(Items.iron_sword);
		cheese_sandwich = new ItemFood(5, 0.5F, false).setUnlocalizedName("cheese_sandwich");
		toast_cheese_sandwich = new ItemFood(7, 0.7F, false).setUnlocalizedName("toast_cheese_sandwich");
		grilled_cheese = new ItemFood(8, 0.9F, false).setUnlocalizedName("grilled_cheese");
		cheese_slice = new ItemFood(1, 0.1F, false).setUnlocalizedName("cheese_slice");

		// Dark Tools
		dark_sword = new DarkSword(ModAMaterials.DARK).setUnlocalizedName("dark_sword");
		dark_shovel = new DarkSpade(ModAMaterials.DARK).setUnlocalizedName("dark_shovel");
		dark_pickaxe = new DarkPickaxe(ModAMaterials.DARK).setUnlocalizedName("dark_pickaxe");
		dark_axe = new DarkAxe(ModAMaterials.DARK).setUnlocalizedName("dark_axe");
		dark_hoe = new RegularHoe(ModAMaterials.DARK).setUnlocalizedName("dark_hoe");

		// Dark Armor
		dark_helmet = new DarkArmor(ModAMaterials.DARK_ARMOR, 0, 0).setUnlocalizedName("dark_helmet");
		dark_chestplate = new DarkArmor(ModAMaterials.DARK_ARMOR, 0, 1).setUnlocalizedName("dark_chestplate");
		dark_leggings = new DarkArmor(ModAMaterials.DARK_ARMOR, 0, 2).setUnlocalizedName("dark_leggings");
		dark_boots = new DarkArmor(ModAMaterials.DARK_ARMOR, 0, 3).setUnlocalizedName("dark_boots");

		// Special Items
		smiley_face = new SmileyFace().setUnlocalizedName("smiley_face");
		vampiric_sword = new VampiricSword(ModAMaterials.CROSS_SWORD).setUnlocalizedName("vampiric_sword");
		fedora = new Fedora(ArmorMaterial.LEATHER, 0, 0).setUnlocalizedName("fedora");
		heart = new Heart().setUnlocalizedName("heart");
		lightning_rod = new LightningRod().setUnlocalizedName("lightning_rod").setFull3D().setMaxDamage(100)
				.setMaxStackSize(1);
		information_retriever = new InformationRetriever().setUnlocalizedName("information_retriever")
				.setMaxStackSize(1);
		insta_house = new InstaHouse().setUnlocalizedName("insta_house").setMaxStackSize(1);
		ice_boots = new IceBoots(ArmorMaterial.GOLD, 0, 3).setUnlocalizedName("ice_boots");
		ice_staff = new IceStaff().setUnlocalizedName("ice_staff").setMaxDamage(200).setMaxStackSize(1);
		chat_box = new ChatBox().setMaxStackSize(1).setUnlocalizedName("chat_box");
		invisibility_cloak = new InvisibilityCloak(ArmorMaterial.LEATHER, 0, 1)
				.setUnlocalizedName("invisibility_cloak");
		fire_staff = new FireStaff().setUnlocalizedName("fire_staff").setMaxDamage(200).setMaxStackSize(1);
		knight_sword = new KnightSword(ModAMaterials.CROSS_SWORD).setUnlocalizedName("knight_sword");
		knight_helmet = new KnightArmor(ModAMaterials.KNIGHT, 0, 0).setUnlocalizedName("knight_helmet");
		knight_chestplate = new KnightArmor(ModAMaterials.KNIGHT, 0, 1).setUnlocalizedName("knight_chestplate");
		knight_leggings = new KnightArmor(ModAMaterials.KNIGHT, 0, 2).setUnlocalizedName("knight_leggings");
		knight_boots = new KnightArmor(ModAMaterials.KNIGHT, 0, 3).setUnlocalizedName("knight_boots");
		fire_jacket = new FireJacket(ArmorMaterial.LEATHER, 0, 1).setUnlocalizedName("fire_jacket");
		speed_boots = new SpeedBoots(ArmorMaterial.GOLD, 0, 3).setUnlocalizedName("speed_boots");
		candy_cane = new CandyCane(3, 0.2F, false).setUnlocalizedName("candy_cane");
		ginger_bread = new GingerBread(2, 0.3f, false).setUnlocalizedName("ginger_bread");
		password_2 = new Item().setUnlocalizedName("password_2");
		deck = new GenericRecord("deck").setUnlocalizedName("deck");
		jingle_bells = new GenericRecord("jingle_bells").setUnlocalizedName("jingle_bells");
		wish = new GenericRecord("wish").setUnlocalizedName("wish");
		festive_coat = new FestiveSuit(ModAMaterials.FESTIVE, 0, 1).setUnlocalizedName("festive_coat");
		festive_pants = new FestiveSuit(ModAMaterials.FESTIVE, 0, 2).setUnlocalizedName("festive_pants");
		festive_boots = new FestiveSuit(ModAMaterials.FESTIVE, 0, 3).setUnlocalizedName("festive_boots");
		automatic_bolt_blaster = new AutomaticBoltBlaster().setUnlocalizedName("automatic_bolt_blaster")
				.setMaxDamage(150).setMaxStackSize(1);
		encrypted_message = new Item().setUnlocalizedName("encrypted_message");
		dark_bane = new DarkSword(ModAMaterials.CROSS_SWORD).setUnlocalizedName("dark_bane");
		venom_sword = new VenomSword(ToolMaterial.IRON).setUnlocalizedName("venom_sword");
		hand_cannon = new HandCannon().setUnlocalizedName("hand_cannon").setMaxDamage(250).setMaxStackSize(1);
		undeads_bane = new UndeadsBane(ToolMaterial.GOLD).setUnlocalizedName("undeads_bane");
		teleportation_rod = new TeleportationRod().setUnlocalizedName("teleportation_rod").setFull3D().setMaxDamage(300)
				.setMaxStackSize(1);
		cutlass = new Cutlass(ToolMaterial.IRON).setUnlocalizedName("cutlass");
		aquatic_helmet = new AquaticHelmet(ArmorMaterial.CHAIN, 0, 0).setUnlocalizedName("aquatic_helmet");
		schyte = new Schyte(ToolMaterial.IRON).setUnlocalizedName("schyte").setMaxDamage(100).setMaxStackSize(1);
		reaper_hood = new ReaperRobes(ModAMaterials.REAPER, 0, 0).setUnlocalizedName("reaper_hood");
		reaper_robes_up = new ReaperRobes(ModAMaterials.REAPER, 0, 1).setUnlocalizedName("reaper_robes_up");
		reaper_robes_down = new ReaperRobes(ModAMaterials.REAPER, 0, 2).setUnlocalizedName("reaper_robes_down");
		reaper_boots = new ReaperRobes(ModAMaterials.REAPER, 0, 3).setUnlocalizedName("reaper_boots");
		soul = new Item().setUnlocalizedName("soul");
		soul_sword = new RegularSword(ModAMaterials.SOUL).setUnlocalizedName("soul_sword");
		soul_pickaxe = new RegularPickaxe(ModAMaterials.SOUL).setUnlocalizedName("soul_pickaxe");
		soul_shovel = new RegularShovel(ModAMaterials.SOUL).setUnlocalizedName("soul_shovel");
		soul_axe = new RegularAxe(ModAMaterials.SOUL).setUnlocalizedName("soul_axe");
		soul_hoe = new RegularHoe(ModAMaterials.SOUL).setUnlocalizedName("soul_hoe");
		soul_helmet = new SoulArmor(ModAMaterials.SOUL_ARMOR, 0, 0).setUnlocalizedName("soul_helmet");
		soul_chestplate = new SoulArmor(ModAMaterials.SOUL_ARMOR, 0, 1).setUnlocalizedName("soul_chestplate");
		soul_leggings = new SoulArmor(ModAMaterials.SOUL_ARMOR, 0, 2).setUnlocalizedName("soul_leggings");
		soul_boots = new SoulArmor(ModAMaterials.SOUL_ARMOR, 0, 3).setUnlocalizedName("soul_boots");
		turkey_leg = new TurkeyLeg(12, 1.0F, true).setUnlocalizedName("turkey_leg");
		cola = new ItemFood(1, 0.1F, false).setUnlocalizedName("cola");
		ender_punch = new ItemFood(1, 0.1F, false).setUnlocalizedName("ender_punch");
		core = new Item().setUnlocalizedName("core");
		dragon_soul = new Item().setUnlocalizedName("dragon_soul");
		wither_soul = new Item().setUnlocalizedName("wither_soul");
		dragon_ingot = new Item().setUnlocalizedName("dragon_ingot");
		glasses = new Glasses(ArmorMaterial.LEATHER, 0, 0).setUnlocalizedName("glasses");
		shades = new Shades(ArmorMaterial.LEATHER, 0, 0).setUnlocalizedName("shades");
		mob_lifter = new MobLifter().setUnlocalizedName("mob_lifter").setMaxDamage(150);
		dragon_sword = new RegularSword(ModAMaterials.DRAGON).setUnlocalizedName("dragon_sword");
		dragon_pickaxe = new RegularPickaxe(ModAMaterials.DRAGON).setUnlocalizedName("dragon_pickaxe");
		dragon_shovel = new RegularShovel(ModAMaterials.DRAGON).setUnlocalizedName("dragon_shovel");
		dragon_hoe = new RegularHoe(ModAMaterials.DRAGON).setUnlocalizedName("dragon_hoe");
		dragon_axe = new RegularAxe(ModAMaterials.DRAGON).setUnlocalizedName("dragon_axe");
		dragon_helmet = new DragonArmor(ModAMaterials.DRAGON_ARMOR, 0, 0).setUnlocalizedName("dragon_helmet");
		dragon_chestplate = new DragonArmor(ModAMaterials.DRAGON_ARMOR, 0, 1).setUnlocalizedName("dragon_chestplate");
		dragon_leggings = new DragonArmor(ModAMaterials.DRAGON_ARMOR, 0, 2).setUnlocalizedName("dragon_leggings");
		dragon_boots = new DragonArmor(ModAMaterials.DRAGON_ARMOR, 0, 3).setUnlocalizedName("dragon_boots");
		wither_ingot = new Item().setUnlocalizedName("wither_ingot");
		wither_sword = new WitherSword(ModAMaterials.WITHER).setUnlocalizedName("wither_sword");
		wither_pickaxe = new RegularPickaxe(ModAMaterials.WITHER).setUnlocalizedName("wither_pickaxe");
		wither_shovel = new RegularShovel(ModAMaterials.WITHER).setUnlocalizedName("wither_shovel");
		wither_hoe = new RegularHoe(ModAMaterials.WITHER).setUnlocalizedName("wither_hoe");
		wither_axe = new RegularAxe(ModAMaterials.WITHER).setUnlocalizedName("wither_axe");
		wither_helmet = new WitherArmor(ModAMaterials.WITHER_ARMOR, 0, 0).setUnlocalizedName("wither_helmet");
		wither_chestplate = new WitherArmor(ModAMaterials.WITHER_ARMOR, 0, 1).setUnlocalizedName("wither_chestplate");
		wither_leggings = new WitherArmor(ModAMaterials.WITHER_ARMOR, 0, 2).setUnlocalizedName("wither_leggings");
		wither_boots = new WitherArmor(ModAMaterials.WITHER_ARMOR, 0, 3).setUnlocalizedName("wither_boots");
		insta_house_2 = new InstaHouse2().setUnlocalizedName("insta_house_2").setUnlocalizedName("insta_house_2");
		insta_house_3 = new InstaHouse3().setUnlocalizedName("insta_house_3").setUnlocalizedName("insta_house_3");
	}

	public static void register() {
		// Dark Items
		registerItem(dark_item);
		registerItem(dark_and_ender);
		registerItem(dark_ingot);
		registerItem(dark_rod);
		registerItem(dark_substance_bucket);
		registerItem(dark_ingot_bucket);

		// Sandwich
		registerItem(sliced_bread);
		registerItem(toast);
		registerItem(cheese);
		registerItem(cheese_sandwich);
		registerItem(toast_cheese_sandwich);
		registerItem(grilled_cheese);
		registerItem(cheese_slice);

		// Dark Tools
		registerItem(dark_sword);
		registerItem(dark_shovel);
		registerItem(dark_pickaxe);
		registerItem(dark_axe);
		registerItem(dark_hoe);

		// Dark Armour
		registerItem(dark_helmet);
		registerItem(dark_chestplate);
		registerItem(dark_leggings);
		registerItem(dark_boots);

		// Specials
		registerItem(smiley_face);
		registerItem(vampiric_sword);
		registerItem(fedora);
		registerItem(heart);
		registerItem(lightning_rod);
		registerItem(information_retriever);
		registerItem(insta_house);
		registerItem(ice_boots);
		registerItem(ice_staff);
		registerItem(chat_box);
		registerItem(invisibility_cloak);
		registerItem(fire_staff);
		registerItem(knight_sword);
		registerItem(knight_helmet);
		registerItem(knight_chestplate);
		registerItem(knight_leggings);
		registerItem(knight_boots);
		registerItem(fire_jacket);
		registerItem(speed_boots);
		registerItem(candy_cane);
		registerItem(ginger_bread);
		registerItem(password_2);
		registerItem(deck);
		registerItem(jingle_bells);
		registerItem(wish);
		registerItem(festive_coat);
		registerItem(festive_pants);
		registerItem(festive_boots);
		registerItem(automatic_bolt_blaster);
		registerItem(encrypted_message);
		registerItem(dark_bane);
		registerItem(venom_sword);
		registerItem(hand_cannon);
		registerItem(undeads_bane);
		registerItem(teleportation_rod);
		registerItem(cutlass);
		registerItem(aquatic_helmet);
		registerItem(schyte);
		registerItem(reaper_hood);
		registerItem(reaper_robes_up);
		registerItem(reaper_robes_down);
		registerItem(reaper_boots);
		registerItem(soul);
		registerItem(soul_sword);
		registerItem(soul_pickaxe);
		registerItem(soul_shovel);
		registerItem(soul_axe);
		registerItem(soul_hoe);
		registerItem(soul_helmet);
		registerItem(soul_chestplate);
		registerItem(soul_leggings);
		registerItem(soul_boots);
		registerItem(turkey_leg);
		registerItem(cola);
		registerItem(ender_punch);
		registerItem(core);
		registerItem(dragon_soul);
		registerItem(wither_soul);
		registerItem(dragon_ingot);
		registerItem(glasses);
		registerItem(shades);
		registerItem(mob_lifter);
		registerItem(dragon_sword);
		registerItem(dragon_pickaxe);
		registerItem(dragon_shovel);
		registerItem(dragon_hoe);
		registerItem(dragon_axe);
		registerItem(dragon_helmet);
		registerItem(dragon_chestplate);
		registerItem(dragon_leggings);
		registerItem(dragon_boots);
		registerItem(wither_ingot);
		registerItem(wither_sword);
		registerItem(wither_pickaxe);
		registerItem(wither_shovel);
		registerItem(wither_hoe);
		registerItem(wither_axe);
		registerItem(wither_helmet);
		registerItem(wither_chestplate);
		registerItem(wither_leggings);
		registerItem(wither_boots);
		registerItem(insta_house_2);
		registerItem(insta_house_3);
	}

	public static void registerRenders() {
		// Dark Items
		registerRender(dark_item);
		registerRender(dark_and_ender);
		registerRender(dark_ingot);
		registerRender(dark_rod);
		registerRender(dark_substance_bucket);
		registerRender(dark_ingot_bucket);

		// Sandwich
		registerRender(sliced_bread);
		registerRender(toast);
		registerRender(cheese);
		registerRender(cheese_sandwich);
		registerRender(toast_cheese_sandwich);
		registerRender(grilled_cheese);
		registerRender(cheese_slice);

		// Dark Tools
		registerRender(dark_axe);
		registerRender(dark_sword);
		registerRender(dark_shovel);
		registerRender(dark_pickaxe);
		registerRender(dark_hoe);

		// Dark Armour
		registerRender(dark_helmet);
		registerRender(dark_chestplate);
		registerRender(dark_leggings);
		registerRender(dark_boots);

		// Specials
		registerRender(smiley_face);
		registerRender(vampiric_sword);
		registerRender(fedora);
		registerRender(heart);
		registerRender(lightning_rod);
		registerRender(information_retriever);
		registerRender(insta_house);
		registerRender(ice_boots);
		registerRender(ice_staff);
		registerRender(chat_box);
		registerRender(invisibility_cloak);
		registerRender(fire_staff);
		registerRender(knight_sword);
		registerRender(knight_helmet);
		registerRender(knight_chestplate);
		registerRender(knight_leggings);
		registerRender(knight_boots);
		registerRender(fire_jacket);
		registerRender(speed_boots);
		registerRender(candy_cane);
		registerRender(ginger_bread);
		registerRender(password_2);
		registerRender(deck);
		registerRender(jingle_bells);
		registerRender(wish);
		registerRender(festive_coat);
		registerRender(festive_pants);
		registerRender(festive_boots);
		registerRender(automatic_bolt_blaster);
		registerRender(encrypted_message);
		registerRender(dark_bane);
		registerRender(venom_sword);
		registerRender(hand_cannon);
		registerRender(undeads_bane);
		registerRender(teleportation_rod);
		registerRender(cutlass);
		registerRender(aquatic_helmet);
		registerRender(schyte);
		registerRender(reaper_hood);
		registerRender(reaper_robes_up);
		registerRender(reaper_robes_down);
		registerRender(reaper_boots);
		registerRender(soul);
		registerRender(soul_sword);
		registerRender(soul_pickaxe);
		registerRender(soul_shovel);
		registerRender(soul_axe);
		registerRender(soul_hoe);
		registerRender(soul_helmet);
		registerRender(soul_chestplate);
		registerRender(soul_leggings);
		registerRender(soul_boots);
		registerRender(turkey_leg);
		registerRender(cola);
		registerRender(ender_punch);
		registerRender(core);
		registerRender(dragon_soul);
		registerRender(wither_soul);
		registerRender(dragon_ingot);
		registerRender(glasses);
		registerRender(shades);
		registerRender(mob_lifter);
		registerRender(dragon_sword);
		registerRender(dragon_pickaxe);
		registerRender(dragon_axe);
		registerRender(dragon_shovel);
		registerRender(dragon_hoe);
		registerRender(dragon_helmet);
		registerRender(dragon_chestplate);
		registerRender(dragon_leggings);
		registerRender(dragon_boots);
		registerRender(wither_ingot);
		registerRender(wither_sword);
		registerRender(wither_pickaxe);
		registerRender(wither_axe);
		registerRender(wither_shovel);
		registerRender(wither_hoe);
		registerRender(wither_helmet);
		registerRender(wither_chestplate);
		registerRender(wither_leggings);
		registerRender(wither_boots);
		registerRender(insta_house_2);
		registerRender(insta_house_3);
	}

	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(
				Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

	public static void registerItem(Item item) {
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
		item.setCreativeTab(ModA.tabModA);
	}
}
