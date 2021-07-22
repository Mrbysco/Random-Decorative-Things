package com.mrbysco.rdt.blocks.villages;

import com.mrbysco.rdt.blocks.base.BaseRotatable;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class VillageHut2Block extends BaseRotatable {
	private static final VoxelShape SHAPE = Block.box(4, 0, 4, 12, 6, 12);
	
	public VillageHut2Block(Block.Properties builder) {
		super(builder);
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
		return SHAPE;
	}
}
