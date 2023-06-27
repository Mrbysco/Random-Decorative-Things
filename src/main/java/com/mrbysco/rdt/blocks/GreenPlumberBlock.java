package com.mrbysco.rdt.blocks;

import com.mrbysco.rdt.blocks.base.BaseRotatable;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class GreenPlumberBlock extends BaseRotatable {
	private static final VoxelShape SHAPE = Block.box(3, 0, 3, 13, 16, 13);

	public GreenPlumberBlock(Block.Properties builder) {
		super(builder);
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
		return SHAPE;
	}
}
