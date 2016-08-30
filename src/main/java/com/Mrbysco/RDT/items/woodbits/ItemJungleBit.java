package com.Mrbysco.RDT.items.woodbits;

import com.Mrbysco.RDT.RDTReference;
import com.Mrbysco.RDT.RandomDecorativeThings;

import net.minecraft.item.Item;

public class ItemJungleBit extends Item{
	public ItemJungleBit() {
		setUnlocalizedName(RDTReference.RDTItems.JUNGLEBIT.getUnlocalisedName());
		setRegistryName(RDTReference.RDTItems.JUNGLEBIT.getRegistryName());
		this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setCreativeTab(RandomDecorativeThings.tabRDT);
	}
}
