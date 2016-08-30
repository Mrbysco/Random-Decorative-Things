package com.Mrbysco.RDT.gui;

import com.Mrbysco.RDT.container.CrateContainer;
import com.Mrbysco.RDT.tileentity.TileEntityCrate;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiProxy implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		BlockPos pos = new BlockPos(x, y, z);
        TileEntity te = world.getTileEntity(pos);
        if (te instanceof TileEntityCrate) {
            return new CrateContainer(player.inventory, (TileEntityCrate) te);
        }
        return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
	        BlockPos pos = new BlockPos(x, y, z);
	        TileEntity te = world.getTileEntity(pos);
	        if (te instanceof TileEntityCrate) {
	        	TileEntityCrate TileEntityCrate = (TileEntityCrate) te;
	            return new CrateGui(TileEntityCrate, new CrateContainer(player.inventory, TileEntityCrate));
	        }
	        return null;
	    }
}
