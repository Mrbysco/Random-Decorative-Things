package com.mrbysco.rdt.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class StrawBerryCakeBlock extends Block{

	private static final VoxelShape CAKE_SHAPE = Block.makeCuboidShape(1, 0, 1, 15, 6, 15);
	
	public StrawBerryCakeBlock(AbstractBlock.Properties properties) {
		super(properties);
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return CAKE_SHAPE;
	}
}
