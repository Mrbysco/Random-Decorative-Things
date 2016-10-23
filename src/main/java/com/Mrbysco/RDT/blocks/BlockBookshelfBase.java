package com.Mrbysco.RDT.blocks;

import com.Mrbysco.RDT.RandomDecorativeThings;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockBookshelfBase extends Block{

	public BlockBookshelfBase() {
		super(Material.WOOD);
		this.setCreativeTab(RandomDecorativeThings.tabRDT);
		this.setLightOpacity(0);
		this.setHardness(3.0F);
		this.setSoundType(SoundType.WOOD);
	}
	
	@Override
	public float getEnchantPowerBonus(World world, BlockPos pos) {
		return 1;
	}
	
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
