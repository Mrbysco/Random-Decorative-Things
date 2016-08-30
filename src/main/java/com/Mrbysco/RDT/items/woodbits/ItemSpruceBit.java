package com.Mrbysco.RDT.items.woodbits;

import com.Mrbysco.RDT.RDTReference;
import com.Mrbysco.RDT.RandomDecorativeThings;

import net.minecraft.item.Item;

public class ItemSpruceBit extends Item{
	public ItemSpruceBit() {
		setUnlocalizedName(RDTReference.RDTItems.SPRUCEBIT.getUnlocalisedName());
		setRegistryName(RDTReference.RDTItems.SPRUCEBIT.getRegistryName());
		this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setCreativeTab(RandomDecorativeThings.tabRDT);
	}
}
