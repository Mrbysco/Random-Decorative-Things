package com.Mrbysco.RDT.init;

import com.Mrbysco.RDT.RDTReference;
import com.Mrbysco.RDT.tileentity.TileEntityCrate;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class RDTTileEntities {

	public static void init(){
		GameRegistry.registerTileEntity(TileEntityCrate.class, RDTReference.MOD_ID + "_tileentitycrate");
	}
}
