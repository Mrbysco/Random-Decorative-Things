package com.Mrbysco.RDT.items.woodbits;

import com.Mrbysco.RDT.RDTReference;
import com.Mrbysco.RDT.RandomDecorativeThings;

import net.minecraft.item.Item;

public class ItemOakBit extends Item{
	public ItemOakBit() {
		setUnlocalizedName(RDTReference.RDTItems.OAKBIT.getUnlocalisedName());
		setRegistryName(RDTReference.RDTItems.OAKBIT.getRegistryName());
		this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setCreativeTab(RandomDecorativeThings.tabRDT);
	}
}
