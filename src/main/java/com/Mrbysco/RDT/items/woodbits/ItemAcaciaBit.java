package com.Mrbysco.RDT.items.woodbits;

import com.Mrbysco.RDT.RDTReference;
import com.Mrbysco.RDT.RandomDecorativeThings;

import net.minecraft.item.Item;

public class ItemAcaciaBit extends Item{
	public ItemAcaciaBit() {
		setUnlocalizedName(RDTReference.RDTItems.ACACIABIT.getUnlocalisedName());
		setRegistryName(RDTReference.RDTItems.ACACIABIT.getRegistryName());
		this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setCreativeTab(RandomDecorativeThings.tabRDT);
	}
}
