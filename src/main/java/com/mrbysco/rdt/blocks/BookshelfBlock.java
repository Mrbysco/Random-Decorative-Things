package com.mrbysco.rdt.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;

public class BookshelfBlock extends Block{

	public BookshelfBlock(AbstractBlock.Properties properties) {
		super(properties);
	}

	@Override
	public float getEnchantPowerBonus(BlockState state, IWorldReader world, BlockPos pos) {
		return 1;
	}

}
