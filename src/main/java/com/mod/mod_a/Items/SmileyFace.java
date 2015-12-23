package com.mod.mod_a.Items;

import com.mod.mod_a.Functions;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class SmileyFace extends Item{
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
	{
		
		//layer 1 8 blocks
		BlockPos pos0 = pos.up();
		BlockPos pos1 = pos0.east();
		BlockPos pos2 = pos1.east();
		BlockPos pos3 = pos2.east();
		BlockPos pos4 = pos3.east();
		BlockPos pos5 = pos4.east();
		BlockPos pos6 = pos5.east();
		BlockPos pos7 = pos6.east();
		//layer 2 10 blocks
		BlockPos pos8 = pos0.up().west();
		BlockPos pos9 = pos8.east();
		BlockPos pos10 = pos9.east();
		BlockPos pos11 = pos10.east();
		BlockPos pos12 = pos11.east();
		BlockPos pos13 = pos12.east();
		BlockPos pos14 = pos13.east();
		BlockPos pos15 = pos14.east();
		BlockPos pos16 = pos15.east();
		BlockPos pos17 = pos16.east();
		//layer3 12 blocks
		BlockPos pos18 = pos8.up().west();
		BlockPos pos19 = pos18.east();
		BlockPos pos20 = pos19.east();
		BlockPos pos21 = pos20.east();
		BlockPos pos22 = pos21.east();
		BlockPos pos23 = pos22.east();
		BlockPos pos24 = pos23.east();
		BlockPos pos25 = pos24.east();
		BlockPos pos26 = pos25.east();
		BlockPos pos27 = pos26.east();
		BlockPos pos28 = pos27.east();
		BlockPos pos29 = pos28.east();
		//layer 4 14 blocks
		BlockPos pos30 = pos18.up().west();
		BlockPos pos31 = pos30.east();
		BlockPos pos32 = pos31.east();
		BlockPos pos33 = pos32.east();
		BlockPos pos34 = pos33.east();
		BlockPos pos35 = pos34.east();
		BlockPos pos36 = pos35.east();
		BlockPos pos37 = pos36.east();
		BlockPos pos38 = pos37.east();
		BlockPos pos39 = pos38.east();
		BlockPos pos40 = pos39.east();
		BlockPos pos41 = pos40.east();
		BlockPos pos42 = pos41.east();
		BlockPos pos43 = pos42.east();
		//layer 5 14 blocks
		BlockPos pos44 = pos30.up();
		BlockPos pos45 = pos44.east();
		BlockPos pos46 = pos45.east();
		BlockPos pos47 = pos46.east();
		BlockPos pos48 = pos47.east();
		BlockPos pos49 = pos48.east();
		BlockPos pos50 = pos49.east();
		BlockPos pos51 = pos50.east();
		BlockPos pos52 = pos51.east();
		BlockPos pos53 = pos52.east();
		BlockPos pos54 = pos53.east();
		BlockPos pos55 = pos54.east();
		BlockPos pos56 = pos55.east();
		BlockPos pos57 = pos56.east();
		//layer 6 15 blocks
		BlockPos pos58 = pos44.up();
		BlockPos pos59 = pos58.east();
		BlockPos pos60 = pos59.east();
		BlockPos pos61 = pos60.east();
		BlockPos pos62 = pos61.east();
		BlockPos pos63 = pos62.east();
		BlockPos pos64 = pos63.east();
		BlockPos pos65 = pos64.east();
		BlockPos pos66 = pos65.east();
		BlockPos pos67 = pos66.east();
		BlockPos pos68 = pos67.east();
		BlockPos pos69 = pos68.east();
		BlockPos pos70 = pos69.east();
		BlockPos pos71 = pos70.east();
		BlockPos pos72 = pos71.east();
		//layer 7 16 blocks
		BlockPos pos73 = pos58.up().west();
		BlockPos pos74 = pos73.east();
		BlockPos pos75 = pos74.east();
		BlockPos pos76 = pos75.east();
		BlockPos pos77 = pos76.east();
		BlockPos pos78 = pos77.east();
		BlockPos pos79 = pos78.east();
		BlockPos pos80 = pos79.east();
		BlockPos pos81 = pos80.east();
		BlockPos pos82 = pos81.east();
		BlockPos pos83 = pos82.east();
		BlockPos pos84 = pos83.east();
		BlockPos pos85 = pos84.east();
		BlockPos pos86 = pos85.east();
		BlockPos pos87 = pos86.east();
		BlockPos pos88 = pos87.east();
		//layer 8 16 blocks
		BlockPos pos89 = pos73.up();
		BlockPos pos90 = pos89.east();
		BlockPos pos91 = pos90.east();
		BlockPos pos92 = pos91.east();
		BlockPos pos93 = pos92.east();
		BlockPos pos94 = pos93.east();
		BlockPos pos95 = pos94.east();
		BlockPos pos96 = pos95.east();
		BlockPos pos97 = pos96.east();
		BlockPos pos98 = pos97.east();
		BlockPos pos99 = pos98.east();
		BlockPos pos100 = pos99.east();
		BlockPos pos101 = pos100.east();
		BlockPos pos102 = pos101.east();
		BlockPos pos103 = pos102.east();
		BlockPos pos104 = pos103.east();
		//layer 9 16 blocks
		BlockPos pos105 = pos89.up();
		BlockPos pos106 = pos105.east();
		BlockPos pos107 = pos106.east();
		BlockPos pos108 = pos107.east();
		BlockPos pos109 = pos108.east();
		BlockPos pos110 = pos109.east();
		BlockPos pos111 = pos110.east();
		BlockPos pos112 = pos111.east();
		BlockPos pos113 = pos112.east();
		BlockPos pos114 = pos113.east();
		BlockPos pos115 = pos114.east();
		BlockPos pos116 = pos115.east();
		BlockPos pos117 = pos116.east();
		BlockPos pos118 = pos117.east();
		BlockPos pos119 = pos118.east();
		BlockPos pos120 = pos119.east();
		//layer 10 15 blocks
		BlockPos pos121 = pos105.up().east();
		BlockPos pos122 = pos121.east();
		BlockPos pos123 = pos122.east();
		BlockPos pos124 = pos123.east();
		BlockPos pos125 = pos124.east();
		BlockPos pos126 = pos125.east();
		BlockPos pos127 = pos126.east();
		BlockPos pos128 = pos127.east();
		BlockPos pos129 = pos128.east();
		BlockPos pos130 = pos129.east();
		BlockPos pos131 = pos130.east();
		BlockPos pos132 = pos131.east();
		BlockPos pos133 = pos132.east();
		BlockPos pos134 = pos133.east();
		BlockPos pos135 = pos134.east();
		//layer 11 14 blocks
		BlockPos pos136 = pos121.up();
		BlockPos pos137 = pos136.east();
		BlockPos pos138 = pos137.east();
		BlockPos pos139 = pos138.east();
		BlockPos pos140 = pos139.east();
		BlockPos pos141 = pos140.east();
		BlockPos pos142 = pos141.east();
		BlockPos pos143 = pos142.east();
		BlockPos pos144 = pos143.east();
		BlockPos pos145 = pos144.east();
		BlockPos pos146 = pos145.east();
		BlockPos pos147 = pos146.east();
		BlockPos pos148 = pos147.east();
		BlockPos pos149 = pos148.east();
		//layer 12 14 blocks
		BlockPos pos150 = pos136.up();
		BlockPos pos151 = pos150.east();
		BlockPos pos152 = pos151.east();
		BlockPos pos153 = pos152.east();
		BlockPos pos154 = pos153.east();
		BlockPos pos155 = pos154.east();
		BlockPos pos156 = pos155.east();
		BlockPos pos157 = pos156.east();
		BlockPos pos158 = pos157.east();
		BlockPos pos159 = pos158.east();
		BlockPos pos160 = pos159.east();
		BlockPos pos161 = pos160.east();
		BlockPos pos162 = pos161.east();
		BlockPos pos163 = pos162.east();
		//layer 13 12 blocks
		BlockPos pos164 = pos150.up().east();
		BlockPos pos165 = pos164.east();
		BlockPos pos166 = pos165.east();
		BlockPos pos167 = pos166.east();
		BlockPos pos168 = pos167.east();
		BlockPos pos169 = pos168.east();
		BlockPos pos170 = pos169.east();
		BlockPos pos171 = pos170.east();
		BlockPos pos172 = pos171.east();
		BlockPos pos173 = pos172.east();
		BlockPos pos174 = pos173.east();
		BlockPos pos175 = pos174.east();
		//layer 14 12 blocks
		BlockPos pos176 = pos164.up();
		BlockPos pos177 = pos176.east();
		BlockPos pos178 = pos177.east();
		BlockPos pos179 = pos178.east();
		BlockPos pos180 = pos179.east();
		BlockPos pos181 = pos180.east();
		BlockPos pos182 = pos181.east();
		BlockPos pos183 = pos182.east();
		BlockPos pos184 = pos183.east();
		BlockPos pos185 = pos184.east();
		BlockPos pos186 = pos185.east();
		BlockPos pos187 = pos186.east();
		//layer 15 8 blocks
		BlockPos pos188 = pos176.up().east(2);
		BlockPos pos189 = pos188.east();
		BlockPos pos190 = pos189.east();
		BlockPos pos191 = pos190.east();
		BlockPos pos192 = pos191.east();
		BlockPos pos193 = pos192.east();
		BlockPos pos194 = pos193.east();
		BlockPos pos195 = pos194.east();
		//layer 16 4 blocks
		BlockPos pos196 = pos188.up().east(2);
		BlockPos pos197 = pos196.east();
		BlockPos pos198 = pos197.east();
		BlockPos pos199 = pos198.east();
		
		IBlockState block1 = Blocks.wool.getStateFromMeta(15);
		IBlockState block2 = Blocks.wool.getStateFromMeta(4);
		
		//layer 1 8 block spawning
		Functions.spawnBlock(worldIn, block1, pos0);
		Functions.spawnBlock(worldIn, block1, pos1);
		Functions.spawnBlock(worldIn, block1, pos2);
		Functions.spawnBlock(worldIn, block1, pos3);
		Functions.spawnBlock(worldIn, block1, pos4);
		Functions.spawnBlock(worldIn, block1, pos5);
		Functions.spawnBlock(worldIn, block1, pos6);
		Functions.spawnBlock(worldIn, block1, pos7);
		//layer 2  10 block spawning
		Functions.spawnBlock(worldIn, block1, pos8);
		Functions.spawnBlock(worldIn, block2, pos9);
		Functions.spawnBlock(worldIn, block2, pos10);
		Functions.spawnBlock(worldIn, block2, pos11);
		Functions.spawnBlock(worldIn, block2, pos12);
		Functions.spawnBlock(worldIn, block2, pos13);
		Functions.spawnBlock(worldIn, block2, pos14);
		Functions.spawnBlock(worldIn, block2, pos15);
		Functions.spawnBlock(worldIn, block2, pos16);
		Functions.spawnBlock(worldIn, block1, pos17);
		//layer 3 12 blocks spawning
		Functions.spawnBlock(worldIn, block1, pos18);
		Functions.spawnBlock(worldIn, block2, pos19);
		Functions.spawnBlock(worldIn, block2, pos20);
		Functions.spawnBlock(worldIn, block2, pos21);
		Functions.spawnBlock(worldIn, block2, pos22);
		Functions.spawnBlock(worldIn, block2, pos23);
		Functions.spawnBlock(worldIn, block1, pos24);
		Functions.spawnBlock(worldIn, block1, pos25);
		Functions.spawnBlock(worldIn, block1, pos26);
		Functions.spawnBlock(worldIn, block2, pos27);
		Functions.spawnBlock(worldIn, block2, pos28);
		Functions.spawnBlock(worldIn, block1, pos29);
		//layer 4 14 blocks spawning
		Functions.spawnBlock(worldIn, block1, pos30);
		Functions.spawnBlock(worldIn, block2, pos31);
		Functions.spawnBlock(worldIn, block2, pos32);
		Functions.spawnBlock(worldIn, block2, pos33);
		Functions.spawnBlock(worldIn, block2, pos34);
		Functions.spawnBlock(worldIn, block1, pos35);
		Functions.spawnBlock(worldIn, block1, pos36);
		Functions.spawnBlock(worldIn, block2, pos37);
		Functions.spawnBlock(worldIn, block2, pos38);
		Functions.spawnBlock(worldIn, block1, pos39);
		Functions.spawnBlock(worldIn, block2, pos40);
		Functions.spawnBlock(worldIn, block2, pos41);
		Functions.spawnBlock(worldIn, block2, pos42);
		Functions.spawnBlock(worldIn, block1, pos43);
		//layer 5  14 blocks spawning
		Functions.spawnBlock(worldIn, block1, pos44);
		Functions.spawnBlock(worldIn, block2, pos45);
		Functions.spawnBlock(worldIn, block2, pos46);
		Functions.spawnBlock(worldIn, block2, pos47);
		Functions.spawnBlock(worldIn, block1, pos48);
		Functions.spawnBlock(worldIn, block2, pos49);
		Functions.spawnBlock(worldIn, block2, pos50);
		Functions.spawnBlock(worldIn, block2, pos51);
		Functions.spawnBlock(worldIn, block2, pos52);
		Functions.spawnBlock(worldIn, block2, pos53);
		Functions.spawnBlock(worldIn, block1, pos54);
		Functions.spawnBlock(worldIn, block2, pos55);
		Functions.spawnBlock(worldIn, block2, pos56);
		Functions.spawnBlock(worldIn, block1, pos57);
		//layer 6 15 blocks spawning
		Functions.spawnBlock(worldIn, block1, pos58);
		Functions.spawnBlock(worldIn, block2, pos59);
		Functions.spawnBlock(worldIn, block2, pos60);
		Functions.spawnBlock(worldIn, block1, pos61);
		Functions.spawnBlock(worldIn, block2, pos62);
		Functions.spawnBlock(worldIn, block2, pos63);
		Functions.spawnBlock(worldIn, block2, pos64);
		Functions.spawnBlock(worldIn, block2, pos65);
		Functions.spawnBlock(worldIn, block2, pos66);
		Functions.spawnBlock(worldIn, block2, pos67);
		Functions.spawnBlock(worldIn, block1, pos68);
		Functions.spawnBlock(worldIn, block2, pos69);
		Functions.spawnBlock(worldIn, block2, pos70);
		Functions.spawnBlock(worldIn, block2, pos71);
		Functions.spawnBlock(worldIn, block1, pos72);
		//layer 7 16 blocks spawning
		Functions.spawnBlock(worldIn, block1, pos73);
		Functions.spawnBlock(worldIn, block2, pos74);
		Functions.spawnBlock(worldIn, block2, pos75);
		Functions.spawnBlock(worldIn, block1, pos76);
		Functions.spawnBlock(worldIn, block2, pos77);
		Functions.spawnBlock(worldIn, block2, pos78);
		Functions.spawnBlock(worldIn, block2, pos79);
		Functions.spawnBlock(worldIn, block2, pos80);
		Functions.spawnBlock(worldIn, block2, pos81);
		Functions.spawnBlock(worldIn, block2, pos82);
		Functions.spawnBlock(worldIn, block2, pos83);
		Functions.spawnBlock(worldIn, block1, pos84);
		Functions.spawnBlock(worldIn, block2, pos85);
		Functions.spawnBlock(worldIn, block2, pos86);
		Functions.spawnBlock(worldIn, block2, pos87);
		Functions.spawnBlock(worldIn, block1, pos88);
		//layer 8 16 blocks spawning
		Functions.spawnBlock(worldIn, block1, pos89);
		Functions.spawnBlock(worldIn, block2, pos90);
		Functions.spawnBlock(worldIn, block2, pos91);
		Functions.spawnBlock(worldIn, block1, pos92);
		Functions.spawnBlock(worldIn, block2, pos93);
		Functions.spawnBlock(worldIn, block2, pos94);
		Functions.spawnBlock(worldIn, block2, pos95);
		Functions.spawnBlock(worldIn, block2, pos96);
		Functions.spawnBlock(worldIn, block2, pos97);
		Functions.spawnBlock(worldIn, block2, pos98);
		Functions.spawnBlock(worldIn, block2, pos99);
		Functions.spawnBlock(worldIn, block1, pos100);
		Functions.spawnBlock(worldIn, block2, pos101);
		Functions.spawnBlock(worldIn, block2, pos102);
		Functions.spawnBlock(worldIn, block2, pos103);
		Functions.spawnBlock(worldIn, block1, pos104);
		//layer 9 16 blocks spawning
		Functions.spawnBlock(worldIn, block1, pos105);
		Functions.spawnBlock(worldIn, block2, pos106);
		Functions.spawnBlock(worldIn, block2, pos107);
		Functions.spawnBlock(worldIn, block2, pos108);
		Functions.spawnBlock(worldIn, block2, pos109);
		Functions.spawnBlock(worldIn, block2, pos110);
		Functions.spawnBlock(worldIn, block2, pos111);
		Functions.spawnBlock(worldIn, block2, pos112);
		Functions.spawnBlock(worldIn, block2, pos113);
		Functions.spawnBlock(worldIn, block2, pos114);
		Functions.spawnBlock(worldIn, block2, pos115);
		Functions.spawnBlock(worldIn, block2, pos116);
		Functions.spawnBlock(worldIn, block2, pos117);
		Functions.spawnBlock(worldIn, block2, pos118);
		Functions.spawnBlock(worldIn, block2, pos119);
		Functions.spawnBlock(worldIn, block1, pos120);
		//layer 10 15 blocks spawning
		Functions.spawnBlock(worldIn, block1, pos121);
		Functions.spawnBlock(worldIn, block2, pos122);
		Functions.spawnBlock(worldIn, block2, pos123);
		Functions.spawnBlock(worldIn, block2, pos124);
		Functions.spawnBlock(worldIn, block2, pos125);
		Functions.spawnBlock(worldIn, block2, pos126);
		Functions.spawnBlock(worldIn, block2, pos127);
		Functions.spawnBlock(worldIn, block2, pos128);
		Functions.spawnBlock(worldIn, block2, pos129);
		Functions.spawnBlock(worldIn, block2, pos130);
		Functions.spawnBlock(worldIn, block2, pos131);
		Functions.spawnBlock(worldIn, block2, pos132);
		Functions.spawnBlock(worldIn, block2, pos133);
		Functions.spawnBlock(worldIn, block2, pos134);
		Functions.spawnBlock(worldIn, block1, pos135);
		//layer 11 14 blocks spawning
		Functions.spawnBlock(worldIn, block1, pos136);
		Functions.spawnBlock(worldIn, block2, pos137);
		Functions.spawnBlock(worldIn, block2, pos138);
		Functions.spawnBlock(worldIn, block2, pos139);
		Functions.spawnBlock(worldIn, block1, pos140);
		Functions.spawnBlock(worldIn, block2, pos141);
		Functions.spawnBlock(worldIn, block2, pos142);
		Functions.spawnBlock(worldIn, block2, pos143);
		Functions.spawnBlock(worldIn, block2, pos144);
		Functions.spawnBlock(worldIn, block1, pos145);
		Functions.spawnBlock(worldIn, block2, pos146);
		Functions.spawnBlock(worldIn, block2, pos147);
		Functions.spawnBlock(worldIn, block2, pos148);
		Functions.spawnBlock(worldIn, block1, pos149);
		//layer 12 14 blocks spawning
		Functions.spawnBlock(worldIn, block1, pos150);
		Functions.spawnBlock(worldIn, block2, pos151);
		Functions.spawnBlock(worldIn, block2, pos152);
		Functions.spawnBlock(worldIn, block2, pos153);
		Functions.spawnBlock(worldIn, block2, pos154);
		Functions.spawnBlock(worldIn, block2, pos155);
		Functions.spawnBlock(worldIn, block2, pos156);
		Functions.spawnBlock(worldIn, block2, pos157);
		Functions.spawnBlock(worldIn, block2, pos158);
		Functions.spawnBlock(worldIn, block2, pos159);
		Functions.spawnBlock(worldIn, block2, pos160);
		Functions.spawnBlock(worldIn, block2, pos161);
		Functions.spawnBlock(worldIn, block2, pos162);
		Functions.spawnBlock(worldIn, block1, pos163);
		//layer 13 12 blocks spawning
		Functions.spawnBlock(worldIn, block1, pos164);
		Functions.spawnBlock(worldIn, block2, pos165);
		Functions.spawnBlock(worldIn, block2, pos166);
		Functions.spawnBlock(worldIn, block2, pos167);
		Functions.spawnBlock(worldIn, block2, pos168);
		Functions.spawnBlock(worldIn, block2, pos169);
		Functions.spawnBlock(worldIn, block2, pos170);
		Functions.spawnBlock(worldIn, block2, pos171);
		Functions.spawnBlock(worldIn, block2, pos172);
		Functions.spawnBlock(worldIn, block2, pos173);
		Functions.spawnBlock(worldIn, block2, pos174);
		Functions.spawnBlock(worldIn, block1, pos175);
		//layer 14 12 blocks spawning
		Functions.spawnBlock(worldIn, block1, pos176);
		Functions.spawnBlock(worldIn, block1, pos177);
		Functions.spawnBlock(worldIn, block2, pos178);
		Functions.spawnBlock(worldIn, block2, pos179);
		Functions.spawnBlock(worldIn, block2, pos180);
		Functions.spawnBlock(worldIn, block2, pos181);
		Functions.spawnBlock(worldIn, block2, pos182);
		Functions.spawnBlock(worldIn, block2, pos183);
		Functions.spawnBlock(worldIn, block2, pos184);
		Functions.spawnBlock(worldIn, block2, pos185);
		Functions.spawnBlock(worldIn, block1, pos186);
		Functions.spawnBlock(worldIn, block1, pos187);
		//layer 15 8 blocks spawning
		Functions.spawnBlock(worldIn, block1, pos188);
		Functions.spawnBlock(worldIn, block1, pos189);
		Functions.spawnBlock(worldIn, block2, pos190);
		Functions.spawnBlock(worldIn, block2, pos191);
		Functions.spawnBlock(worldIn, block2, pos192);
		Functions.spawnBlock(worldIn, block2, pos193);
		Functions.spawnBlock(worldIn, block1, pos194);
		Functions.spawnBlock(worldIn, block1, pos195);
		//layer 16 4 blocks
		Functions.spawnBlock(worldIn, block1, pos196);
		Functions.spawnBlock(worldIn, block1, pos197);
		Functions.spawnBlock(worldIn, block1, pos198);
		Functions.spawnBlock(worldIn, block1, pos199);
		if (!playerIn.capabilities.isCreativeMode)
		{
		--stack.stackSize;
		}
		return true;
	}
}
