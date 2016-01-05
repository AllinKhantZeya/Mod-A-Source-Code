package com.mod.mod_a.Items;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

import com.mod.mod_a.Functions;

import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class ChatBox extends Item{
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World worldIn, EntityPlayer playerIn)
	{
		Random rand = new Random();
		int i = 1 + rand.nextInt(35);
		UUID playerId = playerIn.getUniqueID();
		double x = worldIn.getSpawnPoint().getX();
		double y = worldIn.getSpawnPoint().getY();
		double z = worldIn.getSpawnPoint().getZ();
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		switch (i)
		{
		case 1: Functions.tellPlayer(playerIn, "Hello " + playerIn.getName(), worldIn);
				break;
		case 2: Functions.tellPlayer(playerIn, "You know I once saw this guy, his eyes were like white.", worldIn);
				break;
		case 3: Functions.tellPlayer(playerIn, "You heard that new record, record 11, *huhh music this generation.", worldIn);
				break;
		case 4: Functions.tellPlayer(playerIn, "So you like the " + worldIn.getBiomeGenForCoords(playerIn.getPosition()).biomeName.toLowerCase() + " biome.", worldIn);
				break;
		case 5: Functions.tellPlayer(playerIn, "Sup?", worldIn);
				break;
		case 6: Functions.tellPlayer(playerIn, "Here is a fun fact, did you know that your spawn point is at " + x + ", " + y + ", " + z, worldIn);
				break;
		case 7: Functions.tellPlayer(playerIn, worldIn.getWorldInfo().getWorldName() + ", what kind of a name is that?", worldIn);
				break;
		case 8: Functions.tellPlayer(playerIn, "I was once used by Notch you know, but then he got sued.", worldIn);
				break;
		case 9: Functions.tellPlayer(playerIn, "Yesterday is history, tommorow is a mystery, and today is a gift thats why they call it present.", worldIn);
				break;
		case 10: Functions.tellPlayer(playerIn, "It's " + (dateFormat.format(date)) + " in case you don't look at the clock :).", worldIn);
				break;
		case 11: Functions.tellPlayer(playerIn, "I used to be an adventurer like you, but then I took an arrow to the knee.", worldIn);
				break;
		case 12: Functions.tellPlayer(playerIn, "Vec3 Pool Size: ~~ERROR~~ NullPointerException: null. Ha got ya.", worldIn);
				break;
		case 13: Functions.tellPlayer(playerIn, "A house divided against itself cannot stand.", worldIn);
				break;
		case 14: Functions.tellPlayer(playerIn, "War, war never changes.", worldIn);
				break;
		case 15: Functions.tellPlayer(playerIn, "I once saw this TV show where if you are 10 years old you can enslave creatures. Gotta catch em all.", worldIn);
				break;
		case 16: Functions.tellPlayer(playerIn, "You should really check the song 'Sweet Craft of Mine.'", worldIn);
				break;
		case 17: Functions.tellPlayer(playerIn, "You don't find the Enderman, the Enderman finds you.", worldIn);
				break;
		case 18: Functions.tellPlayer(playerIn, "Psst I heard a rumor ... that Alex is going out with Steve. Shhh..", worldIn);
				break;
		case 19: Functions.tellPlayer(playerIn, "You know your id is " + playerId + " right?", worldIn);
				break;
		case 20: Functions.tellPlayer(playerIn, "Good thing villagers don't ask for tax.", worldIn);
				break;
		case 21: Functions.tellPlayer(playerIn, "Listen to this nice tune.", worldIn);
				worldIn.playRecord(playerIn.getPosition(), "records.blocks");
				break;
		case 22: if(playerIn.getHealth() < 2)
				{
					Functions.tellPlayer(playerIn, "Death is the solution to all problems. No man- no problem.", worldIn);
				}
				else
				{
					Functions.tellPlayer(playerIn, "Good thing you ain't dead yet", worldIn);
				}
			    break;
		case 23: Functions.tellPlayer(playerIn, "I think a lot, but I don’t say much.", worldIn);
				break;
		case 24: Functions.tellPlayer(playerIn, "Age is an issue of mind over matter. If you don’t mind, it doesn’t matter.", worldIn);
				break;
		case 25: Functions.tellPlayer(playerIn, "You either die a hero or live long enough to see yourself become a villian.", worldIn);
				break;
		case 26: Functions.tellPlayer(playerIn, "Would you kindly.", worldIn);
				break;
		case 27: Functions.tellPlayer(playerIn, "Wait a minute, I just realized something there are three heads on the Wither, and the Wither is in the Nether which is the opposite of the Aether, AETHER 3 CONFIRMED!!", worldIn);
				break;
		case 28: Functions.tellPlayer(playerIn, "Future is black.", worldIn);
				break;
		case 29: Functions.tellPlayer(playerIn, "Power is everything.", worldIn);
				break;
		case 30: Functions.tellPlayer(playerIn, "What a lovely day.", worldIn);
				break;
		case 31: Functions.tellPlayer(playerIn, "Join me and the power of the dark side.", worldIn);
				break;
		case 32: Functions.tellPlayer(playerIn, "I don't know who you are but I will find you and I will kill you. JK", worldIn);
				break;
		case 33: Functions.tellPlayer(playerIn, "Oh, bother.", worldIn);
				break;
		case 34: Functions.tellPlayer(playerIn, "The wonderful thing about chatboxes, is chatboxes are wonderful things! Their tops are made of metal. Their bottoms are made out of plastic! They're talky, hardy, noisy, ouncy, fun, fun, fun, fun, fun. But the most wonderful thing about chatboxes is I'm the only one, I'm the only one.", worldIn);
				break;
		case 35: Functions.tellPlayer(playerIn, "01010000 01100001 01110011 01110011 01110111 01101111 01110010 01100100 00100000 01101001 01110011 00100000 10101111", worldIn);
				break;
		}
		return stack;
	}
}
