package com.mod.mod_a.Items;

import com.mod.mod_a.Functions;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class InstaHouse extends Item {

	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos0, EnumFacing side,
			float hitX, float hitY, float hitZ) {
		// layer 1

		// row 1
		BlockPos pos1 = pos0.east();
		BlockPos pos2 = pos1.east();
		BlockPos pos3 = pos2.east();
		BlockPos pos4 = pos3.east();
		BlockPos pos5 = pos4.east();
		// row 2
		BlockPos pos6 = pos0.north();
		BlockPos pos7 = pos1.north();
		BlockPos pos8 = pos2.north();
		BlockPos pos9 = pos3.north();
		BlockPos pos10 = pos4.north();
		BlockPos pos11 = pos5.north();
		// row 3
		BlockPos pos12 = pos6.north();
		BlockPos pos13 = pos7.north();
		BlockPos pos14 = pos8.north();
		BlockPos pos15 = pos9.north();
		BlockPos pos16 = pos10.north();
		BlockPos pos17 = pos11.north();
		// row 4
		BlockPos pos18 = pos12.north();
		BlockPos pos19 = pos13.north();
		BlockPos pos20 = pos14.north();
		BlockPos pos21 = pos15.north();
		BlockPos pos22 = pos16.north();
		BlockPos pos23 = pos17.north();
		// row 5
		BlockPos pos24 = pos18.north();
		BlockPos pos25 = pos19.north();
		BlockPos pos26 = pos20.north();
		BlockPos pos27 = pos21.north();
		BlockPos pos28 = pos22.north();
		BlockPos pos29 = pos23.north();

		// layer 2

		// row 1
		BlockPos pos30 = pos0.up();
		BlockPos pos31 = pos1.up();
		BlockPos pos32 = pos2.up();
		BlockPos pos33 = pos3.up();
		BlockPos pos34 = pos4.up();
		BlockPos pos35 = pos5.up();
		// row 2
		BlockPos pos36 = pos6.up();
		BlockPos pos37 = pos7.up();
		BlockPos pos38 = pos8.up();
		BlockPos pos39 = pos9.up();
		BlockPos pos40 = pos10.up();
		BlockPos pos41 = pos11.up();
		// row 3
		BlockPos pos42 = pos12.up();
		BlockPos pos43 = pos13.up();
		BlockPos pos44 = pos14.up();
		BlockPos pos45 = pos15.up();
		BlockPos pos46 = pos16.up();
		BlockPos pos47 = pos17.up();
		// row 4
		BlockPos pos48 = pos18.up();
		BlockPos pos49 = pos19.up();
		BlockPos pos50 = pos20.up();
		BlockPos pos51 = pos21.up();
		BlockPos pos52 = pos22.up();
		BlockPos pos53 = pos23.up();
		// row 5
		BlockPos pos54 = pos24.up();
		BlockPos pos55 = pos25.up();
		BlockPos pos56 = pos26.up();
		BlockPos pos57 = pos27.up();
		BlockPos pos58 = pos28.up();
		BlockPos pos59 = pos29.up();

		// layer 3

		// row 1
		BlockPos pos60 = pos30.up();
		BlockPos pos61 = pos31.up();
		BlockPos pos62 = pos32.up();
		BlockPos pos63 = pos33.up();
		BlockPos pos64 = pos34.up();
		BlockPos pos65 = pos35.up();
		// row 2
		BlockPos pos66 = pos36.up();
		BlockPos pos67 = pos37.up();
		BlockPos pos68 = pos38.up();
		BlockPos pos69 = pos39.up();
		BlockPos pos70 = pos40.up();
		BlockPos pos71 = pos41.up();
		// row 3
		BlockPos pos72 = pos42.up();
		BlockPos pos73 = pos43.up();
		BlockPos pos74 = pos44.up();
		BlockPos pos75 = pos45.up();
		BlockPos pos76 = pos46.up();
		BlockPos pos77 = pos47.up();
		// row 4
		BlockPos pos78 = pos48.up();
		BlockPos pos79 = pos49.up();
		BlockPos pos80 = pos50.up();
		BlockPos pos81 = pos51.up();
		BlockPos pos82 = pos52.up();
		BlockPos pos83 = pos53.up();
		// row 5
		BlockPos pos84 = pos54.up();
		BlockPos pos85 = pos55.up();
		BlockPos pos86 = pos56.up();
		BlockPos pos87 = pos57.up();
		BlockPos pos88 = pos58.up();
		BlockPos pos89 = pos59.up();

		// layer 4

		// row 1
		BlockPos pos90 = pos60.up();
		BlockPos pos91 = pos61.up();
		BlockPos pos92 = pos62.up();
		BlockPos pos93 = pos63.up();
		BlockPos pos94 = pos64.up();
		BlockPos pos95 = pos65.up();
		// row 2
		BlockPos pos96 = pos66.up();
		BlockPos pos97 = pos67.up();
		BlockPos pos98 = pos68.up();
		BlockPos pos99 = pos69.up();
		BlockPos pos100 = pos70.up();
		BlockPos pos101 = pos71.up();
		// row 3
		BlockPos pos102 = pos72.up();
		BlockPos pos103 = pos73.up();
		BlockPos pos104 = pos74.up();
		BlockPos pos105 = pos75.up();
		BlockPos pos106 = pos76.up();
		BlockPos pos107 = pos77.up();
		// row 4
		BlockPos pos108 = pos78.up();
		BlockPos pos109 = pos79.up();
		BlockPos pos110 = pos80.up();
		BlockPos pos111 = pos81.up();
		BlockPos pos112 = pos82.up();
		BlockPos pos113 = pos83.up();
		// row 5
		BlockPos pos114 = pos84.up();
		BlockPos pos115 = pos85.up();
		BlockPos pos116 = pos86.up();
		BlockPos pos117 = pos87.up();
		BlockPos pos118 = pos88.up();
		BlockPos pos119 = pos89.up();

		// layer 5

		// row 1
		BlockPos pos120 = pos90.up();
		BlockPos pos121 = pos91.up();
		BlockPos pos122 = pos92.up();
		BlockPos pos123 = pos93.up();
		BlockPos pos124 = pos94.up();
		BlockPos pos125 = pos95.up();
		// row 2
		BlockPos pos126 = pos96.up();
		BlockPos pos127 = pos97.up();
		BlockPos pos128 = pos98.up();
		BlockPos pos129 = pos99.up();
		BlockPos pos130 = pos100.up();
		BlockPos pos131 = pos101.up();
		// row 3
		BlockPos pos132 = pos102.up();
		BlockPos pos133 = pos103.up();
		BlockPos pos134 = pos104.up();
		BlockPos pos135 = pos105.up();
		BlockPos pos136 = pos106.up();
		BlockPos pos137 = pos107.up();
		// row 4
		BlockPos pos138 = pos108.up();
		BlockPos pos139 = pos109.up();
		BlockPos pos140 = pos110.up();
		BlockPos pos141 = pos111.up();
		BlockPos pos142 = pos112.up();
		BlockPos pos143 = pos113.up();
		// row 5
		BlockPos pos144 = pos114.up();
		BlockPos pos145 = pos115.up();
		BlockPos pos146 = pos116.up();
		BlockPos pos147 = pos117.up();
		BlockPos pos148 = pos118.up();
		BlockPos pos149 = pos119.up();

		IProperty bedPart = BlockBed.PART;
		PropertyEnum HALF = PropertyEnum.create("half", BlockDoor.EnumDoorHalf.class);
		PropertyDirection facing = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
		IBlockState blockPlank = Blocks.planks.getDefaultState();
		IBlockState blockLog = Blocks.log.getDefaultState();
		IBlockState blockGlass = Blocks.glass.getDefaultState();
		IBlockState blockCraftingTable = Blocks.crafting_table.getDefaultState();
		IBlockState blockAir = Blocks.air.getDefaultState();
		IBlockState blockGlowstone = Blocks.glowstone.getDefaultState();
		IBlockState blockBedHead = Blocks.bed.getDefaultState().withProperty(bedPart, BlockBed.EnumPartType.HEAD);
		IBlockState blockBedFoot = Blocks.bed.getDefaultState().withProperty(bedPart, BlockBed.EnumPartType.FOOT);
		IBlockState blockChest = Blocks.chest.getDefaultState().withProperty(facing, EnumFacing.SOUTH);
		IBlockState blockFurnace = Blocks.furnace.getDefaultState().withProperty(facing, EnumFacing.SOUTH);
		IBlockState blockDoorDown = Blocks.oak_door.getDefaultState().withProperty(HALF, BlockDoor.EnumDoorHalf.LOWER);
		IBlockState blockDoorUp = Blocks.oak_door.getDefaultState().withProperty(HALF, BlockDoor.EnumDoorHalf.UPPER);

		// layer 1

		// row 1
		Functions.spawnBlock(worldIn, blockLog, pos0);
		Functions.spawnBlock(worldIn, blockPlank, pos1);
		Functions.spawnBlock(worldIn, blockPlank, pos2);
		Functions.spawnBlock(worldIn, blockPlank, pos3);
		Functions.spawnBlock(worldIn, blockPlank, pos4);
		Functions.spawnBlock(worldIn, blockLog, pos5);
		// row 2
		Functions.spawnBlock(worldIn, blockPlank, pos6);
		Functions.spawnBlock(worldIn, blockPlank, pos7);
		Functions.spawnBlock(worldIn, blockPlank, pos8);
		Functions.spawnBlock(worldIn, blockPlank, pos9);
		Functions.spawnBlock(worldIn, blockPlank, pos10);
		Functions.spawnBlock(worldIn, blockPlank, pos11);
		// row 3
		Functions.spawnBlock(worldIn, blockPlank, pos12);
		Functions.spawnBlock(worldIn, blockPlank, pos13);
		Functions.spawnBlock(worldIn, blockGlowstone, pos14);
		Functions.spawnBlock(worldIn, blockPlank, pos15);
		Functions.spawnBlock(worldIn, blockPlank, pos16);
		Functions.spawnBlock(worldIn, blockPlank, pos17);
		// row 4
		Functions.spawnBlock(worldIn, blockPlank, pos18);
		Functions.spawnBlock(worldIn, blockPlank, pos19);
		Functions.spawnBlock(worldIn, blockPlank, pos20);
		Functions.spawnBlock(worldIn, blockPlank, pos21);
		Functions.spawnBlock(worldIn, blockPlank, pos22);
		Functions.spawnBlock(worldIn, blockPlank, pos23);
		// row 5
		Functions.spawnBlock(worldIn, blockLog, pos24);
		Functions.spawnBlock(worldIn, blockPlank, pos25);
		Functions.spawnBlock(worldIn, blockPlank, pos26);
		Functions.spawnBlock(worldIn, blockPlank, pos27);
		Functions.spawnBlock(worldIn, blockPlank, pos28);
		Functions.spawnBlock(worldIn, blockLog, pos29);

		// layer 2

		// row 1
		Functions.spawnBlock(worldIn, blockLog, pos30);
		Functions.spawnBlock(worldIn, blockDoorDown, pos31);
		Functions.spawnBlock(worldIn, blockPlank, pos32);
		Functions.spawnBlock(worldIn, blockPlank, pos33);
		Functions.spawnBlock(worldIn, blockPlank, pos34);
		Functions.spawnBlock(worldIn, blockLog, pos35);
		// row 2
		Functions.spawnBlock(worldIn, blockPlank, pos36);
		Functions.spawnBlock(worldIn, blockAir, pos37);
		Functions.spawnBlock(worldIn, blockAir, pos38);
		Functions.spawnBlock(worldIn, blockAir, pos39);
		Functions.spawnBlock(worldIn, blockAir, pos40);
		Functions.spawnBlock(worldIn, blockPlank, pos41);
		// row 3
		Functions.spawnBlock(worldIn, blockPlank, pos42);
		Functions.spawnBlock(worldIn, blockAir, pos43);
		Functions.spawnBlock(worldIn, blockAir, pos44);
		Functions.spawnBlock(worldIn, blockAir, pos45);
		Functions.spawnBlock(worldIn, blockBedFoot, pos46);
		Functions.spawnBlock(worldIn, blockPlank, pos47);
		// row 4
		Functions.spawnBlock(worldIn, blockPlank, pos48);
		Functions.spawnBlock(worldIn, blockCraftingTable, pos49);
		Functions.spawnBlock(worldIn, blockFurnace, pos50);
		Functions.spawnBlock(worldIn, blockChest, pos51);
		Functions.spawnBlock(worldIn, blockBedHead, pos52);
		Functions.spawnBlock(worldIn, blockPlank, pos53);
		// row 5
		Functions.spawnBlock(worldIn, blockLog, pos54);
		Functions.spawnBlock(worldIn, blockPlank, pos55);
		Functions.spawnBlock(worldIn, blockPlank, pos56);
		Functions.spawnBlock(worldIn, blockPlank, pos57);
		Functions.spawnBlock(worldIn, blockPlank, pos58);
		Functions.spawnBlock(worldIn, blockLog, pos59);

		// layer 3

		// row 1
		Functions.spawnBlock(worldIn, blockLog, pos60);
		Functions.spawnBlock(worldIn, blockDoorUp, pos61);
		Functions.spawnBlock(worldIn, blockPlank, pos62);
		Functions.spawnBlock(worldIn, blockGlass, pos63);
		Functions.spawnBlock(worldIn, blockPlank, pos64);
		Functions.spawnBlock(worldIn, blockLog, pos65);
		// row 2
		Functions.spawnBlock(worldIn, blockPlank, pos66);
		Functions.spawnBlock(worldIn, blockAir, pos67);
		Functions.spawnBlock(worldIn, blockAir, pos68);
		Functions.spawnBlock(worldIn, blockAir, pos69);
		Functions.spawnBlock(worldIn, blockAir, pos70);
		Functions.spawnBlock(worldIn, blockPlank, pos71);
		// row 3
		Functions.spawnBlock(worldIn, blockGlass, pos72);
		Functions.spawnBlock(worldIn, blockAir, pos73);
		Functions.spawnBlock(worldIn, blockAir, pos74);
		Functions.spawnBlock(worldIn, blockAir, pos75);
		Functions.spawnBlock(worldIn, blockAir, pos76);
		Functions.spawnBlock(worldIn, blockPlank, pos77);
		// row 4
		Functions.spawnBlock(worldIn, blockPlank, pos78);
		Functions.spawnBlock(worldIn, blockAir, pos79);
		Functions.spawnBlock(worldIn, blockAir, pos80);
		Functions.spawnBlock(worldIn, blockAir, pos81);
		Functions.spawnBlock(worldIn, blockAir, pos82);
		Functions.spawnBlock(worldIn, blockPlank, pos83);
		// row 5
		Functions.spawnBlock(worldIn, blockLog, pos84);
		Functions.spawnBlock(worldIn, blockPlank, pos85);
		Functions.spawnBlock(worldIn, blockPlank, pos86);
		Functions.spawnBlock(worldIn, blockGlass, pos87);
		Functions.spawnBlock(worldIn, blockPlank, pos88);
		Functions.spawnBlock(worldIn, blockLog, pos89);

		// layer 4

		// row 1
		Functions.spawnBlock(worldIn, blockLog, pos90);
		Functions.spawnBlock(worldIn, blockPlank, pos91);
		Functions.spawnBlock(worldIn, blockPlank, pos92);
		Functions.spawnBlock(worldIn, blockPlank, pos93);
		Functions.spawnBlock(worldIn, blockPlank, pos94);
		Functions.spawnBlock(worldIn, blockLog, pos95);
		// row 2
		Functions.spawnBlock(worldIn, blockPlank, pos96);
		Functions.spawnBlock(worldIn, blockAir, pos97);
		Functions.spawnBlock(worldIn, blockAir, pos98);
		Functions.spawnBlock(worldIn, blockAir, pos99);
		Functions.spawnBlock(worldIn, blockAir, pos100);
		Functions.spawnBlock(worldIn, blockPlank, pos101);
		// row 3
		Functions.spawnBlock(worldIn, blockPlank, pos102);
		Functions.spawnBlock(worldIn, blockAir, pos103);
		Functions.spawnBlock(worldIn, blockAir, pos104);
		Functions.spawnBlock(worldIn, blockAir, pos105);
		Functions.spawnBlock(worldIn, blockAir, pos106);
		Functions.spawnBlock(worldIn, blockPlank, pos107);
		// row 4
		Functions.spawnBlock(worldIn, blockPlank, pos108);
		Functions.spawnBlock(worldIn, blockAir, pos109);
		Functions.spawnBlock(worldIn, blockAir, pos110);
		Functions.spawnBlock(worldIn, blockAir, pos111);
		Functions.spawnBlock(worldIn, blockAir, pos112);
		Functions.spawnBlock(worldIn, blockPlank, pos113);
		// row 5
		Functions.spawnBlock(worldIn, blockLog, pos114);
		Functions.spawnBlock(worldIn, blockPlank, pos115);
		Functions.spawnBlock(worldIn, blockPlank, pos116);
		Functions.spawnBlock(worldIn, blockPlank, pos117);
		Functions.spawnBlock(worldIn, blockPlank, pos118);
		Functions.spawnBlock(worldIn, blockLog, pos119);

		// layer 5

		// row 1
		Functions.spawnBlock(worldIn, blockLog, pos120);
		Functions.spawnBlock(worldIn, blockLog, pos121);
		Functions.spawnBlock(worldIn, blockLog, pos122);
		Functions.spawnBlock(worldIn, blockLog, pos123);
		Functions.spawnBlock(worldIn, blockLog, pos124);
		Functions.spawnBlock(worldIn, blockLog, pos125);
		// row 2
		Functions.spawnBlock(worldIn, blockLog, pos126);
		Functions.spawnBlock(worldIn, blockLog, pos127);
		Functions.spawnBlock(worldIn, blockLog, pos128);
		Functions.spawnBlock(worldIn, blockLog, pos129);
		Functions.spawnBlock(worldIn, blockLog, pos130);
		Functions.spawnBlock(worldIn, blockLog, pos131);
		// row 3
		Functions.spawnBlock(worldIn, blockLog, pos132);
		Functions.spawnBlock(worldIn, blockLog, pos133);
		Functions.spawnBlock(worldIn, blockLog, pos134);
		Functions.spawnBlock(worldIn, blockLog, pos135);
		Functions.spawnBlock(worldIn, blockLog, pos136);
		Functions.spawnBlock(worldIn, blockLog, pos137);
		// row 4
		Functions.spawnBlock(worldIn, blockLog, pos138);
		Functions.spawnBlock(worldIn, blockLog, pos139);
		Functions.spawnBlock(worldIn, blockLog, pos140);
		Functions.spawnBlock(worldIn, blockLog, pos141);
		Functions.spawnBlock(worldIn, blockLog, pos142);
		Functions.spawnBlock(worldIn, blockLog, pos143);
		// row 5
		Functions.spawnBlock(worldIn, blockLog, pos144);
		Functions.spawnBlock(worldIn, blockLog, pos145);
		Functions.spawnBlock(worldIn, blockLog, pos146);
		Functions.spawnBlock(worldIn, blockLog, pos147);
		Functions.spawnBlock(worldIn, blockLog, pos148);
		Functions.spawnBlock(worldIn, blockLog, pos149);

		if (!playerIn.capabilities.isCreativeMode) {
			--stack.stackSize;
		}
		return false;

	}

}
