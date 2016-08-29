package com.Mrbysco.RDT.items;

import com.Mrbysco.RDT.RDTReference;

public class ItemStoneHammer extends ItemToolHammer{

	public ItemStoneHammer(ToolMaterial material) {
		super(material);
		setUnlocalizedName(RDTReference.RDTItems.STONEHAMMER.getUnlocalisedName());
		setRegistryName(RDTReference.RDTItems.STONEHAMMER.getRegistryName());
	}

}
