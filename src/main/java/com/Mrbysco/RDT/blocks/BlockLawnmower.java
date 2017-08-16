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
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockLawnmower extends BaseRotatable{

	private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0.0625 * 1, 0, 0.0625 * 2, 0.0625 * 15, 0.0625 * 6, 0.0625 * 14);
	
	public BlockLawnmower() {
		super(Material.CLOTH);
		setUnlocalizedName(RDTReference.RDTBlocks.LAWNMOWER.getUnlocalisedName());
		setRegistryName(RDTReference.RDTBlocks.LAWNMOWER.getRegistryName());
		this.setCreativeTab(RandomDecorativeThings.tabRDT);
		this.setLightOpacity(0);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		this.setHardness(1.0F);
		this.setSoundType(SoundType.CLOTH);
	}
    
    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return BOUNDING_BOX;
    }
    
	@Override
	public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox,
			List<AxisAlignedBB> collidingBoxes, Entity entityIn, boolean p_185477_7_) {
		// TODO Auto-generated method stub
        addCollisionBoxToList(pos, entityBox, collidingBoxes, BOUNDING_BOX);
	}
}
