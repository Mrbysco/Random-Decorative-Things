package com.Mrbysco.RDT.blocks.villages;

import java.util.List;

import com.Mrbysco.RDT.RDTReference;
import com.Mrbysco.RDT.RandomDecorativeThings;
import com.Mrbysco.RDT.blocks.BlockVillageBasic;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockVillageBlacksmith extends BlockVillageBasic{

	private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0.0625 * 3, 0, 0.0625 * 3, 0.0625 * 13, 0.0625 * 6, 0.0625 * 13);
	
	public BlockVillageBlacksmith() {
		super(Material.WOOD);
		setUnlocalizedName(RDTReference.RDTBlocks.VILLAGEBLACKSMITH.getUnlocalisedName());
		setRegistryName(RDTReference.RDTBlocks.VILLAGEBLACKSMITH.getRegistryName());
		this.setCreativeTab(RandomDecorativeThings.tabRDT);
		this.setLightOpacity(0);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		this.setHardness(1.0F);
		this.setSoundType(SoundType.WOOD);
	}
    
    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return BOUNDING_BOX;
    }
    
    @Override
    public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox,
    		List<AxisAlignedBB> collidingBoxes, Entity entityIn) {
    	super.addCollisionBoxToList(state, worldIn, pos, entityBox, collidingBoxes, entityIn);
    }
  
}
