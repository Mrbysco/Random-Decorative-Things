package com.Mrbysco.RDT.init;

import com.Mrbysco.RDT.RDTReference;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class RDTBlocks {
	
	
	
	public static void init()
	{
		
	}
	
	public static void register()
	{

	}
	
	public static void registerRenders()
	{

	}
	
	public static void registerRender(Block block)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(RDTReference.MOD_ID + ":" + block.getRegistryName(), "inventory"));
	}
}
