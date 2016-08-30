package com.Mrbysco.RDT.items.woodbits;

import com.Mrbysco.RDT.RDTReference;
import com.Mrbysco.RDT.RandomDecorativeThings;

import net.minecraft.item.Item;

public class ItemBigOakBit extends Item{
	public ItemBigOakBit() {
		setUnlocalizedName(RDTReference.RDTItems.BIGOAKBIT.getUnlocalisedName());
		setRegistryName(RDTReference.RDTItems.BIGOAKBIT.getRegistryName());
		this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setCreativeTab(RandomDecorativeThings.tabRDT);
	}
}
