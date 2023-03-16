package com.mrbysco.rdt.blocks;

import net.minecraft.world.level.block.Block;

public class CrateBlock extends Block {

	//public static final int GUI_ID = 1;

	public CrateBlock(Block.Properties properties) {
		super(properties);
//		super(Material.WOOD);
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
}
