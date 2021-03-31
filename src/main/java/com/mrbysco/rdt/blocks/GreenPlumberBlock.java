package com.mrbysco.rdt.blocks;

import com.mrbysco.rdt.blocks.base.BaseRotatable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class GreenPlumberBlock extends BaseRotatable{
	private static final VoxelShape SHAPE = Block.makeCuboidShape(3, 0, 3, 13, 16, 13);

	public GreenPlumberBlock(Block.Properties builder) {
		super(builder);
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return SHAPE;
	}
}
