package com.Mrbysco.RDT.blocks;

import com.Mrbysco.RDT.RandomDecorativeThings;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockCrateBase extends Block /*implements ITileEntityProvider*/{
	
	//public static final int GUI_ID = 1;

	public BlockCrateBase() {
		super(Material.WOOD);
		this.setCreativeTab(RandomDecorativeThings.tabRDT);
		this.setLightOpacity(0);
		this.setHardness(3.0F);
		this.setSoundType(SoundType.WOOD);
	}

    /*
	@Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityCrate();
    }

    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, ItemStack heldItem, EnumFacing side,
                float hitX, float hitY, float hitZ) {
        // Only execute on the server
        if (world.isRemote) {
            return true;
        }
        TileEntity tileentity = world.getTileEntity(pos);
        if (!(tileentity instanceof TileEntityCrate)) {
            return false;
        }
        player.openGui(RDTReference.MOD_ID, GUI_ID, world, pos.getX(), pos.getY(), pos.getZ());
        return true;
    }
	*/
	
	@Override
	public boolean isFullCube(IBlockState state)
    {
        return false;
    }

	@Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
}
