package com.mod.mod_a.Items;

import com.mod.mod_a.Functions;

import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class InstaHouse2 extends Item {

	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side,
			float hitX, float hitY, float hitZ) {
		// Layer 1
		// Row 1
		BlockPos pos0 = pos.east();
		BlockPos pos1 = pos.north();
		BlockPos pos2 = pos1.east();
		BlockPos pos3 = pos2.east();
		// Row 2
		BlockPos pos4 = pos1.north();
		BlockPos pos5 = pos2.north();
		BlockPos pos6 = pos3.north();
		// Row 3
		BlockPos pos7 = pos4.north();
		BlockPos pos8 = pos5.north();
		BlockPos pos9 = pos6.north();

		// Layer 2
		// Row 1
		BlockPos pos10 = pos.up();
		BlockPos pos11 = pos10.east();
		BlockPos pos12 = pos11.east();
		// Row 2
		BlockPos pos13 = pos10.west().north();
		BlockPos pos14 = pos13.east();
		BlockPos pos15 = pos14.east();
		BlockPos pos16 = pos15.east();
		BlockPos pos17 = pos16.east();
		// Row 3
		BlockPos pos18 = pos13.north();
		BlockPos pos19 = pos14.north();
		BlockPos pos20 = pos15.north();
		BlockPos pos21 = pos16.north();
		BlockPos pos22 = pos17.north();
		// Row 4
		BlockPos pos23 = pos18.north();
		BlockPos pos24 = pos19.north();
		BlockPos pos25 = pos20.north();
		BlockPos pos26 = pos21.north();
		BlockPos pos27 = pos22.north();
		// Row 5
		BlockPos pos28 = pos10.north(4);
		BlockPos pos29 = pos11.north(4);
		BlockPos pos30 = pos12.north(4);

		// Layer 3
		// Row 1
		BlockPos pos31 = pos10.up();
		BlockPos pos32 = pos11.up();
		BlockPos pos33 = pos12.up();
		// Row 2
		BlockPos pos34 = pos13.up();
		BlockPos pos35 = pos14.up();
		BlockPos pos36 = pos15.up();
		BlockPos pos37 = pos16.up();
		BlockPos pos38 = pos17.up();
		// Row 3
		BlockPos pos39 = pos18.up();
		BlockPos pos40 = pos19.up();
		BlockPos pos41 = pos20.up();
		BlockPos pos42 = pos21.up();
		BlockPos pos43 = pos22.up();
		// Row 4
		BlockPos pos44 = pos23.up();
		BlockPos pos45 = pos24.up();
		BlockPos pos46 = pos25.up();
		BlockPos pos47 = pos26.up();
		BlockPos pos48 = pos27.up();
		// Row 5
		BlockPos pos49 = pos28.up();
		BlockPos pos50 = pos29.up();
		BlockPos pos51 = pos30.up();

		// Layer 4
		// Row 1
		BlockPos pos52 = pos31.up();
		BlockPos pos53 = pos32.up();
		BlockPos pos54 = pos33.up();
		// Row 2
		BlockPos pos55 = pos34.up();
		BlockPos pos56 = pos35.up();
		BlockPos pos57 = pos36.up();
		BlockPos pos58 = pos37.up();
		BlockPos pos59 = pos38.up();
		// Row 3
		BlockPos pos60 = pos39.up();
		BlockPos pos61 = pos40.up();
		BlockPos pos62 = pos41.up();
		BlockPos pos63 = pos42.up();
		BlockPos pos64 = pos43.up();
		// Row 4
		BlockPos pos65 = pos44.up();
		BlockPos pos66 = pos45.up();
		BlockPos pos67 = pos46.up();
		BlockPos pos68 = pos47.up();
		BlockPos pos69 = pos48.up();
		// Row 5
		BlockPos pos70 = pos49.up();
		BlockPos pos71 = pos50.up();
		BlockPos pos72 = pos51.up();
		
		//Layer 5
		// Row 1
		BlockPos pos73 = pos52.up();
		BlockPos pos74 = pos53.up();
		BlockPos pos75 = pos54.up();
		// Row 2
		BlockPos pos76 = pos55.up();
		BlockPos pos77 = pos56.up();
		BlockPos pos78 = pos57.up();
		BlockPos pos79 = pos58.up();
		BlockPos pos80 = pos59.up();
		// Row 3
		BlockPos pos81 = pos60.up();
		BlockPos pos82 = pos61.up();
		BlockPos pos83 = pos62.up();
		BlockPos pos84 = pos63.up();
		BlockPos pos85 = pos64.up();
		// Row 4
		BlockPos pos86 = pos65.up();
		BlockPos pos87 = pos66.up();
		BlockPos pos88 = pos67.up();
		BlockPos pos89 = pos68.up();
		BlockPos pos90 = pos69.up();
		// Row 5
		BlockPos pos91 = pos70.up();
		BlockPos pos92 = pos71.up();
		BlockPos pos93 = pos72.up();
		
		//Layer 6
		// Row 1
		BlockPos pos94 = pos73.up();
		BlockPos pos95 = pos74.up();
		BlockPos pos96 = pos75.up();
		// Row 2
		BlockPos pos97 = pos76.up();
		BlockPos pos98 = pos77.up();
		BlockPos pos99 = pos78.up();
		BlockPos pos100 = pos79.up();
		BlockPos pos101 = pos80.up();
		// Row 3
		BlockPos pos102 = pos81.up();
		BlockPos pos103 = pos82.up();
		BlockPos pos104 = pos83.up();
		BlockPos pos105 = pos84.up();
		BlockPos pos106 = pos85.up();
		// Row 4
		BlockPos pos107 = pos86.up();
		BlockPos pos108 = pos87.up();
		BlockPos pos109 = pos88.up();
		BlockPos pos110 = pos89.up();
		BlockPos pos111 = pos90.up();
		// Row 5
		BlockPos pos112 = pos91.up();
		BlockPos pos113 = pos92.up();
		BlockPos pos114 = pos93.up();
		
		// Layer 7
		// Row 1
		BlockPos pos115 = pos1.up(6);
		BlockPos pos116 = pos2.up(6);
		BlockPos pos117 = pos3.up(6);
		// Row 2
		BlockPos pos118 = pos4.up(6);
		BlockPos pos119 = pos5.up(6);
		BlockPos pos120 = pos6.up(6);
		// Row 3
		BlockPos pos121 = pos7.up(6);
		BlockPos pos122 = pos8.up(6);
		BlockPos pos123 = pos9.up(6);
		
		// Spawning
		IProperty bedPart = BlockBed.PART;
		PropertyEnum HALF = PropertyEnum.create("half", BlockDoor.EnumDoorHalf.class);
		PropertyDirection facing = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
		// Layer 1
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos0);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos1);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos2);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos3);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos4);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos5);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos6);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos7);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos8);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos9);

		// Layer 2
		// Row 1
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos10);
		Functions.spawnBlock(worldIn,
				Blocks.oak_door.getDefaultState().withProperty(HALF, BlockDoor.EnumDoorHalf.LOWER), pos11);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos12);
		// Row 2
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos13);
		Functions.spawnBlock(worldIn, Blocks.air.getDefaultState(), pos14);
		Functions.spawnBlock(worldIn, Blocks.air.getDefaultState(), pos15);
		Functions.spawnBlock(worldIn, Blocks.bed.getDefaultState().withProperty(bedPart, BlockBed.EnumPartType.FOOT),
				pos16);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos17);
		// Row 3
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos18);
		Functions.spawnBlock(worldIn, Blocks.air.getDefaultState(), pos19);
		Functions.spawnBlock(worldIn, Blocks.air.getDefaultState(), pos20);
		Functions.spawnBlock(worldIn, Blocks.bed.getDefaultState().withProperty(bedPart, BlockBed.EnumPartType.HEAD),
				pos21);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos22);
		// Row 4
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos23);
		Functions.spawnBlock(worldIn, Blocks.chest.getDefaultState().withProperty(facing, EnumFacing.SOUTH), pos24);
		Functions.spawnBlock(worldIn, Blocks.furnace.getDefaultState().withProperty(facing, EnumFacing.SOUTH), pos25);
		Functions.spawnBlock(worldIn, Blocks.crafting_table.getDefaultState(), pos26);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos27);
		// Row 5
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos28);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos29);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos30);

		// Layer 3
		// Row 1
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos31);
		Functions.spawnBlock(worldIn,
				Blocks.oak_door.getDefaultState().withProperty(HALF, BlockDoor.EnumDoorHalf.UPPER), pos32);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos33);
		// Row 2
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos34);
		Functions.spawnBlock(worldIn, Blocks.air.getDefaultState(), pos35);
		Functions.spawnBlock(worldIn, Blocks.air.getDefaultState(), pos36);
		Functions.spawnBlock(worldIn, Blocks.air.getDefaultState(), pos37);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos38);
		// Row 3
		Functions.spawnBlock(worldIn, Blocks.glass.getDefaultState(), pos39);
		Functions.spawnBlock(worldIn, Blocks.air.getDefaultState(), pos40);
		Functions.spawnBlock(worldIn, Blocks.air.getDefaultState(), pos41);
		Functions.spawnBlock(worldIn, Blocks.air.getDefaultState(), pos42);
		Functions.spawnBlock(worldIn, Blocks.glass.getDefaultState(), pos43);
		// Row 4
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos44);
		Functions.spawnBlock(worldIn, Blocks.air.getDefaultState(), pos45);
		Functions.spawnBlock(worldIn, Blocks.air.getDefaultState(), pos46);
		Functions.spawnBlock(worldIn, Blocks.air.getDefaultState(), pos47);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos48);
		// Row 5
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos49);
		Functions.spawnBlock(worldIn, Blocks.glass.getDefaultState(), pos50);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos51);

		// Layer 4
		// Row 1
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos52);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos53);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos54);
		// Row 2
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos55);
		Functions.spawnBlock(worldIn, Blocks.air.getDefaultState(), pos56);
		Functions.spawnBlock(worldIn, Blocks.air.getDefaultState(), pos57);
		Functions.spawnBlock(worldIn, Blocks.air.getDefaultState(), pos58);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos59);
		// Row 3
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos60);
		Functions.spawnBlock(worldIn, Blocks.air.getDefaultState(), pos61);
		Functions.spawnBlock(worldIn, Blocks.air.getDefaultState(), pos62);
		Functions.spawnBlock(worldIn, Blocks.air.getDefaultState(), pos63);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos64);
		// Row 4
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos65);
		Functions.spawnBlock(worldIn, Blocks.air.getDefaultState(), pos66);
		Functions.spawnBlock(worldIn, Blocks.air.getDefaultState(), pos67);
		Functions.spawnBlock(worldIn, Blocks.air.getDefaultState(), pos68);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos69);
		// Row 5
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos70);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos71);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos72);
		
		//Layer 5
		// Row 1
		Functions.spawnBlock(worldIn, Blocks.glowstone.getDefaultState(), pos73);
		Functions.spawnBlock(worldIn, Blocks.glowstone.getDefaultState(), pos74);
		Functions.spawnBlock(worldIn, Blocks.glowstone.getDefaultState(), pos75);
		// Row 2
		Functions.spawnBlock(worldIn, Blocks.glowstone.getDefaultState(), pos76);
		Functions.spawnBlock(worldIn, Blocks.glass.getDefaultState(), pos77);
		Functions.spawnBlock(worldIn, Blocks.glass.getDefaultState(), pos78);
		Functions.spawnBlock(worldIn, Blocks.glass.getDefaultState(), pos79);
		Functions.spawnBlock(worldIn, Blocks.glowstone.getDefaultState(), pos80);
		// Row 3
		Functions.spawnBlock(worldIn, Blocks.glowstone.getDefaultState(), pos81);
		Functions.spawnBlock(worldIn, Blocks.glass.getDefaultState(), pos82);
		Functions.spawnBlock(worldIn, Blocks.glass.getDefaultState(), pos83);
		Functions.spawnBlock(worldIn, Blocks.glass.getDefaultState(), pos84);
		Functions.spawnBlock(worldIn, Blocks.glowstone.getDefaultState(), pos85);
		// Row 4
		Functions.spawnBlock(worldIn, Blocks.glowstone.getDefaultState(), pos86);
		Functions.spawnBlock(worldIn, Blocks.glass.getDefaultState(), pos87);
		Functions.spawnBlock(worldIn, Blocks.glass.getDefaultState(), pos88);
		Functions.spawnBlock(worldIn, Blocks.glass.getDefaultState(), pos89);
		Functions.spawnBlock(worldIn, Blocks.glowstone.getDefaultState(), pos90);
		// Row 5
		Functions.spawnBlock(worldIn, Blocks.glowstone.getDefaultState(), pos91);
		Functions.spawnBlock(worldIn, Blocks.glowstone.getDefaultState(), pos92);
		Functions.spawnBlock(worldIn, Blocks.glowstone.getDefaultState(), pos93);
		
		//Layer 6
		// Row 1
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos94);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos95);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos96);
		// Row 2
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos97);
		Functions.spawnBlock(worldIn, Blocks.lava.getDefaultState(), pos98);
		Functions.spawnBlock(worldIn, Blocks.lava.getDefaultState(), pos99);
		Functions.spawnBlock(worldIn, Blocks.lava.getDefaultState(), pos100);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos101);
		// Row 3
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos102);
		Functions.spawnBlock(worldIn, Blocks.lava.getDefaultState(), pos103);
		Functions.spawnBlock(worldIn, Blocks.lava.getDefaultState(), pos104);
		Functions.spawnBlock(worldIn, Blocks.lava.getDefaultState(), pos105);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos106);
		// Row 4
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos107);
		Functions.spawnBlock(worldIn, Blocks.lava.getDefaultState(), pos108);
		Functions.spawnBlock(worldIn, Blocks.lava.getDefaultState(), pos109);
		Functions.spawnBlock(worldIn, Blocks.lava.getDefaultState(), pos110);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos111);
		// Row 5
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos112);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos113);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos114);
		
		// Layer 7
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos115);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos116);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos117);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos118);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos119);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos120);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos121);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos122);
		Functions.spawnBlock(worldIn, Blocks.cobblestone.getDefaultState(), pos123);
		if(!playerIn.capabilities.isCreativeMode){
			--stack.stackSize;
		}
		return false;
	}
}
