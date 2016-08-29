package com.Mrbysco.RDT.items;

import com.Mrbysco.RDT.RDTReference;
import com.Mrbysco.RDT.RandomDecorativeThings;

import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemToolHammer extends Item{
	
	protected Item.ToolMaterial theToolMaterial;
	
	public ItemToolHammer(Item.ToolMaterial material) {
		this.setMaxDamage(material.getMaxUses());
		this.maxStackSize = 1;
		this.setNoRepair();
		this.setContainerItem(this);
	    this.setCreativeTab(RandomDecorativeThings.tabRDT);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public boolean isFull3D()
	{
	    return true;
	}
	
	 public String getMaterialName()
	    {
	        return this.theToolMaterial.toString();
	    }
	
}