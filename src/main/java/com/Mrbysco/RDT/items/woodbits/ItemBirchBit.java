package com.Mrbysco.RDT.items.woodbits;

import com.Mrbysco.RDT.RDTReference;
import com.Mrbysco.RDT.RandomDecorativeThings;

import net.minecraft.item.Item;

public class ItemBirchBit extends Item{
	public ItemBirchBit() {
		setUnlocalizedName(RDTReference.RDTItems.BIRCHBIT.getUnlocalisedName());
		setRegistryName(RDTReference.RDTItems.BIRCHBIT.getRegistryName());
		this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setCreativeTab(RandomDecorativeThings.tabRDT);
	}
}
