package com.Mrbysco.RDT.blocks;

import java.util.List;

import com.Mrbysco.RDT.RDTReference;
import com.Mrbysco.RDT.RandomDecorativeThings;
import com.Mrbysco.RDT.blocks.base.BaseRotatable;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockToyCastle extends BaseRotatable{

	private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0.0625 * 3, 0, 0, 0.0625 * 14, 0.0625 * 16, 0.0625 * 16);
	
	public BlockToyCastle() {
		super(Material.CLAY);
		setUnlocalizedName(RDTReference.RDTBlocks.TOYCASTLE.getUnlocalisedName());
		setRegistryName(RDTReference.RDTBlocks.TOYCASTLE.getRegistryName());
		this.setCreativeTab(RandomDecorativeThings.tabRDT);
		this.setLightOpacity(0);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		this.setHardness(1.0F);
		this.setSoundType(SoundType.STONE);
	}
    
	@Override
	public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox,
			List<AxisAlignedBB> collidingBoxes, Entity entityIn, boolean p_185477_7_) {
		// TODO Auto-generated method stub
        addCollisionBoxToList(pos, entityBox, collidingBoxes, BOUNDING_BOX);
	}
}
