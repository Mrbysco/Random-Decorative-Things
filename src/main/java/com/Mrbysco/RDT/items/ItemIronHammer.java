package com.Mrbysco.RDT.items;

import com.Mrbysco.RDT.RDTReference;

public class ItemIronHammer extends ItemToolHammer{

	public ItemIronHammer(ToolMaterial material) {
		super(material);
		setUnlocalizedName(RDTReference.RDTItems.IRONHAMMER.getUnlocalisedName());
		setRegistryName(RDTReference.RDTItems.IRONHAMMER.getRegistryName());
	}
}
