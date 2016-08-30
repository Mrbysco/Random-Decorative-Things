package com.Mrbysco.RDT.items;

import com.Mrbysco.RDT.RDTReference;

public class ItemIronSaw extends ItemToolHammer{

	public ItemIronSaw(ToolMaterial material) {
		super(material);
		setUnlocalizedName(RDTReference.RDTItems.IRONSAW.getUnlocalisedName());
		setRegistryName(RDTReference.RDTItems.IRONSAW.getRegistryName());
	}

}
