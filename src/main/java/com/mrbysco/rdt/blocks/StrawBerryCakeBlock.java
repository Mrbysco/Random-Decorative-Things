package com.mrbysco.rdt.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class StrawBerryCakeBlock extends Block {

	private static final VoxelShape CAKE_SHAPE = Block.box(1, 0, 1, 15, 6, 15);

	public StrawBerryCakeBlock(Block.Properties properties) {
		super(properties);
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
		return CAKE_SHAPE;
	}
}
