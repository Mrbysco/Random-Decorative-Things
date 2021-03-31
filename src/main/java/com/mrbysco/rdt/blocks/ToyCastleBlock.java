package com.mrbysco.rdt.blocks;

import com.mrbysco.rdt.blocks.base.BaseRotatable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import java.util.stream.Stream;

public class ToyCastleBlock extends BaseRotatable{
	private static final VoxelShape X_AXIS_SHAPE = Stream.of(
			Block.makeCuboidShape(0, 0, 2, 16, 5, 14),
			Block.makeCuboidShape(5, 5, 5.5, 11, 10, 10.5),
			Block.makeCuboidShape(6, 10, 6.5, 10, 15, 9.5)
	).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();
	private static final VoxelShape Z_AXIS_SHAPE = Stream.of(
			Block.makeCuboidShape(2, 0, 0, 14, 5, 16),
			Block.makeCuboidShape(5.5, 5, 5, 10.5, 10, 11),
			Block.makeCuboidShape(6.5, 10, 6, 9.5, 15, 10)
	).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();
	
	public ToyCastleBlock(Block.Properties builder) {
		super(builder);
	}

	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		Direction direction = state.get(HORIZONTAL_FACING);
		return direction.getAxis() == Direction.Axis.X ? Z_AXIS_SHAPE : X_AXIS_SHAPE;
	}
}
