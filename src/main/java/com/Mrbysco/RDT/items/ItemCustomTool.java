package com.Mrbysco.RDT.items;

import javax.annotation.Nonnull;

import net.minecraft.item.ItemStack;

public class ItemCustomTool extends ItemToolHammer{

	public ItemCustomTool(ToolMaterial material, String unlocalised, String registry) {
		super(material);
		setMaxStackSize(1);
		
		setUnlocalizedName(unlocalised);
		setRegistryName(registry);
	}

	@Override
	public boolean hasContainerItem() {
		return true;
	}
	
	@Nonnull
	@Override
	public ItemStack getContainerItem(@Nonnull ItemStack itemStack) {
		ItemStack item = itemStack;
		System.out.println("damaging item");
		item.setItemDamage(item.getMaxDamage() + 1);
		System.out.println(item.getItemDamage());
		return item;
	}
}
