package com.mrbysco.rdt.blocks.villages;

import com.mrbysco.rdt.blocks.base.BaseRotatable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class VillageButcherBlock extends BaseRotatable {
	private static final VoxelShape SHAPE = Block.box(2, 0, 2, 14, 8, 14);
	
	public VillageButcherBlock(Block.Properties builder) {
		super(builder);
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return SHAPE;
	}
}
