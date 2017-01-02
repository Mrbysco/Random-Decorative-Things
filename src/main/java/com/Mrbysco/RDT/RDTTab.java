package com.Mrbysco.RDT;

import com.Mrbysco.RDT.init.RDTItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class RDTTab extends CreativeTabs{


	public RDTTab(String label) {
		super(label);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(RDTItems.woolbit);
	}
	
	public RDTTab setCreativeTab(RDTTab tabRDT) {
		return null;
}

}