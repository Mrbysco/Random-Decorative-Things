package com.Mrbysco.RDT.items;

import com.Mrbysco.RDT.RDTReference;

public class ItemFlintSaw extends ItemToolHammer{

	public ItemFlintSaw(ToolMaterial material) {
		super(material);
		setUnlocalizedName(RDTReference.RDTItems.FLINTSAW.getUnlocalisedName());
		setRegistryName(RDTReference.RDTItems.FLINTSAW.getRegistryName());
	}

}
