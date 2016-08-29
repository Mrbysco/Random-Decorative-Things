package com.Mrbysco.RDT.items;

import com.Mrbysco.RDT.RDTReference;
import com.Mrbysco.RDT.RandomDecorativeThings;

import net.minecraft.item.Item;

public class ItemStonebit extends Item{
	public ItemStonebit() {
		setUnlocalizedName(RDTReference.RDTItems.STONEBIT.getUnlocalisedName());
		setRegistryName(RDTReference.RDTItems.STONEBIT.getRegistryName());
        this.setMaxDamage(0);
        this.setCreativeTab(RandomDecorativeThings.tabRDT);
	}
}
