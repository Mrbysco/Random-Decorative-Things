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

public class LawnMowerBlock extends BaseRotatable {
	private static final VoxelShape SHAPE_NORTH = Stream.of(
			Block.makeCuboidShape(13.5, 2.5, 12.5, 14, 3, 14.5),
			Block.makeCuboidShape(13.5, 0.5, 12, 14, 2.5, 12.5),
			Block.makeCuboidShape(13.5, 0.5, 14.5, 14, 2.5, 15),
			Block.makeCuboidShape(2, 0, 12.5, 2.5, 0.5, 14.5),
			Block.makeCuboidShape(2, 2.5, 12.5, 2.5, 3, 14.5),
			Block.makeCuboidShape(2, 0.5, 12, 2.5, 2.5, 12.5),
			Block.makeCuboidShape(2, 0.5, 14.5, 2.5, 2.5, 15),
			Block.makeCuboidShape(2.5, 0.8125, 1.5, 13.5, 1.8125, 3),
			Block.makeCuboidShape(2.5, 0.8125, 12.5, 13.5, 1.8125, 14.5),
			Block.makeCuboidShape(4, 0.8125, 3, 12, 1.8125, 12.5),
			Block.makeCuboidShape(3.5, 0.8125, 5, 4, 1.8125, 10),
			Block.makeCuboidShape(12, 0.8125, 5, 12.5, 1.8125, 10),
			Block.makeCuboidShape(5, 1.8125, 4.5, 11, 2.8125, 11),
			Block.makeCuboidShape(6.5, 1.8125, 3.5, 9.5, 2.8125, 4.5),
			Block.makeCuboidShape(6.5, 1.8125, 11, 9.5, 2.8125, 12.5),
			Block.makeCuboidShape(6.5, 2.8125, 5.5, 9.5, 3.625, 9.5)
	).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();
	private static final VoxelShape SHAPE_EAST = Stream.of(
			Block.makeCuboidShape(1.3275862068965516, 2.5, 13.327586206896552, 3.3275862068965516, 3, 13.827586206896552),
			Block.makeCuboidShape(3.3275862068965516, 0.5, 13.327586206896552, 3.8275862068965516, 2.5, 13.827586206896552),
			Block.makeCuboidShape(0.8275862068965516, 0.5, 13.327586206896552, 1.3275862068965516, 2.5, 13.827586206896552),
			Block.makeCuboidShape(1.3275862068965516, 0, 1.8275862068965516, 3.3275862068965516, 0.5, 2.3275862068965516),
			Block.makeCuboidShape(1.3275862068965516, 2.5, 1.8275862068965516, 3.3275862068965516, 3, 2.3275862068965516),
			Block.makeCuboidShape(3.3275862068965516, 0.5, 1.8275862068965516, 3.8275862068965516, 2.5, 2.3275862068965516),
			Block.makeCuboidShape(0.8275862068965516, 0.5, 1.8275862068965516, 1.3275862068965516, 2.5, 2.3275862068965516),
			Block.makeCuboidShape(12.827586206896552, 0.8125, 2.3275862068965516, 14.327586206896552, 1.8125, 13.327586206896552),
			Block.makeCuboidShape(1.3275862068965516, 0.8125, 2.3275862068965516, 3.3275862068965516, 1.8125, 13.327586206896552),
			Block.makeCuboidShape(3.3275862068965516, 0.8125, 3.8275862068965516, 12.827586206896552, 1.8125, 11.827586206896552),
			Block.makeCuboidShape(5.827586206896552, 0.8125, 3.3275862068965516, 10.827586206896552, 1.8125, 3.8275862068965516),
			Block.makeCuboidShape(5.827586206896552, 0.8125, 11.827586206896552, 10.827586206896552, 1.8125, 12.327586206896552),
			Block.makeCuboidShape(4.827586206896552, 1.8125, 4.827586206896552, 11.327586206896552, 2.8125, 10.827586206896552),
			Block.makeCuboidShape(11.327586206896552, 1.8125, 6.327586206896552, 12.327586206896552, 2.8125, 9.327586206896552),
			Block.makeCuboidShape(3.3275862068965516, 1.8125, 6.327586206896552, 4.827586206896552, 2.8125, 9.327586206896552),
			Block.makeCuboidShape(6.327586206896552, 2.8125, 6.327586206896552, 10.327586206896552, 3.625, 9.327586206896552)
	).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();
	private static final VoxelShape SHAPE_SOUTH = Stream.of(
			Block.makeCuboidShape(2, 2.5, 1.1551724137931032, 2.5, 3, 3.155172413793103),
			Block.makeCuboidShape(2, 0.5, 3.155172413793103, 2.5, 2.5, 3.655172413793103),
			Block.makeCuboidShape(2, 0.5, 0.6551724137931032, 2.5, 2.5, 1.1551724137931032),
			Block.makeCuboidShape(13.5, 0, 1.1551724137931032, 14, 0.5, 3.155172413793103),
			Block.makeCuboidShape(13.5, 2.5, 1.1551724137931032, 14, 3, 3.155172413793103),
			Block.makeCuboidShape(13.5, 0.5, 3.155172413793103, 14, 2.5, 3.655172413793103),
			Block.makeCuboidShape(13.5, 0.5, 0.6551724137931032, 14, 2.5, 1.1551724137931032),
			Block.makeCuboidShape(2.5, 0.8125, 12.655172413793103, 13.5, 1.8125, 14.155172413793103),
			Block.makeCuboidShape(2.5, 0.8125, 1.1551724137931032, 13.5, 1.8125, 3.155172413793103),
			Block.makeCuboidShape(4, 0.8125, 3.155172413793103, 12, 1.8125, 12.655172413793103),
			Block.makeCuboidShape(12, 0.8125, 5.655172413793103, 12.5, 1.8125, 10.655172413793103),
			Block.makeCuboidShape(3.5, 0.8125, 5.655172413793103, 4, 1.8125, 10.655172413793103),
			Block.makeCuboidShape(5, 1.8125, 4.655172413793103, 11, 2.8125, 11.155172413793103),
			Block.makeCuboidShape(6.5, 1.8125, 11.155172413793103, 9.5, 2.8125, 12.155172413793103),
			Block.makeCuboidShape(6.5, 1.8125, 3.155172413793103, 9.5, 2.8125, 4.655172413793103),
			Block.makeCuboidShape(6.5, 2.8125, 6.155172413793103, 9.5, 3.625, 10.155172413793103)
	).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();
	private static final VoxelShape SHAPE_WEST = Stream.of(
			Block.makeCuboidShape(12.672413793103448, 2.5, 1.8275862068965516, 14.672413793103448, 3, 2.3275862068965516),
			Block.makeCuboidShape(12.172413793103448, 0.5, 1.8275862068965516, 12.672413793103448, 2.5, 2.3275862068965516),
			Block.makeCuboidShape(14.672413793103448, 0.5, 1.8275862068965516, 15.172413793103448, 2.5, 2.3275862068965516),
			Block.makeCuboidShape(12.672413793103448, 0, 13.327586206896552, 14.672413793103448, 0.5, 13.827586206896552),
			Block.makeCuboidShape(12.672413793103448, 2.5, 13.327586206896552, 14.672413793103448, 3, 13.827586206896552),
			Block.makeCuboidShape(12.172413793103448, 0.5, 13.327586206896552, 12.672413793103448, 2.5, 13.827586206896552),
			Block.makeCuboidShape(14.672413793103448, 0.5, 13.327586206896552, 15.172413793103448, 2.5, 13.827586206896552),
			Block.makeCuboidShape(1.6724137931034484, 0.8125, 2.3275862068965516, 3.1724137931034484, 1.8125, 13.327586206896552),
			Block.makeCuboidShape(12.672413793103448, 0.8125, 2.3275862068965516, 14.672413793103448, 1.8125, 13.327586206896552),
			Block.makeCuboidShape(3.1724137931034484, 0.8125, 3.8275862068965516, 12.672413793103448, 1.8125, 11.827586206896552),
			Block.makeCuboidShape(5.172413793103448, 0.8125, 11.827586206896552, 10.172413793103448, 1.8125, 12.327586206896552),
			Block.makeCuboidShape(5.172413793103448, 0.8125, 3.3275862068965516, 10.172413793103448, 1.8125, 3.8275862068965516),
			Block.makeCuboidShape(4.672413793103448, 1.8125, 4.827586206896552, 11.172413793103448, 2.8125, 10.827586206896552),
			Block.makeCuboidShape(3.6724137931034484, 1.8125, 6.327586206896552, 4.672413793103448, 2.8125, 9.327586206896552),
			Block.makeCuboidShape(11.172413793103448, 1.8125, 6.327586206896552, 12.672413793103448, 2.8125, 9.327586206896552),
			Block.makeCuboidShape(5.672413793103448, 2.8125, 6.327586206896552, 9.672413793103448, 3.625, 9.327586206896552)
	).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();

	public LawnMowerBlock(Block.Properties builder) {
		super(builder);
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		Direction direction = state.get(HORIZONTAL_FACING);
		switch (direction) {
			default:
				return SHAPE_NORTH;
			case EAST:
				return SHAPE_EAST;
			case SOUTH:
				return SHAPE_SOUTH;
			case WEST:
				return SHAPE_WEST;
		}
	}
}
