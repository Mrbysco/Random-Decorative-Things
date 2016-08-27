package com.Mrbysco.RDT.init;

import com.Mrbysco.RDT.RDTReference;
import com.Mrbysco.RDT.items.ItemWoolbit;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RDTItems {
	
	public static Item woolbit;
	
	public static void init()
	{
		woolbit = new ItemWoolbit();
	}
	
	public static void register()
	{
		GameRegistry.register(woolbit);
	}
	
	public static void registerRenders()
	{
		
	}
	
	public static void registerRender(Item item)
	{		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(RDTReference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
	public static void registerRenderMetadata()
	{
		ModelLoader.setCustomModelResourceLocation(woolbit, 0, new ModelResourceLocation(RDTReference.MOD_ID +  ":" + "ItemWoolbit_black", "inventory"));
		ModelLoader.setCustomModelResourceLocation(woolbit, 1, new ModelResourceLocation(RDTReference.MOD_ID + ":" + "ItemWoolbit_red", "inventory"));
		ModelLoader.setCustomModelResourceLocation(woolbit, 2, new ModelResourceLocation(RDTReference.MOD_ID + ":" + "ItemWoolbit_green", "inventory"));
		ModelLoader.setCustomModelResourceLocation(woolbit, 3, new ModelResourceLocation(RDTReference.MOD_ID + ":" + "ItemWoolbit_brown", "inventory"));
		ModelLoader.setCustomModelResourceLocation(woolbit, 4, new ModelResourceLocation(RDTReference.MOD_ID + ":" + "ItemWoolbit_blue", "inventory"));
		ModelLoader.setCustomModelResourceLocation(woolbit, 5, new ModelResourceLocation(RDTReference.MOD_ID + ":" + "ItemWoolbit_purple", "inventory"));
		ModelLoader.setCustomModelResourceLocation(woolbit, 6, new ModelResourceLocation(RDTReference.MOD_ID + ":" + "ItemWoolbit_cyan", "inventory"));
		ModelLoader.setCustomModelResourceLocation(woolbit, 7, new ModelResourceLocation(RDTReference.MOD_ID + ":" + "ItemWoolbit_lightGray", "inventory"));
		ModelLoader.setCustomModelResourceLocation(woolbit, 8, new ModelResourceLocation(RDTReference.MOD_ID + ":" + "ItemWoolbit_gray", "inventory"));
		ModelLoader.setCustomModelResourceLocation(woolbit, 9, new ModelResourceLocation(RDTReference.MOD_ID + ":" + "ItemWoolbit_pink", "inventory"));
		ModelLoader.setCustomModelResourceLocation(woolbit, 10, new ModelResourceLocation(RDTReference.MOD_ID + ":" + "ItemWoolbit_lime", "inventory"));
		ModelLoader.setCustomModelResourceLocation(woolbit, 11, new ModelResourceLocation(RDTReference.MOD_ID + ":" + "ItemWoolbit_yellow", "inventory"));
		ModelLoader.setCustomModelResourceLocation(woolbit, 12, new ModelResourceLocation(RDTReference.MOD_ID + ":" + "ItemWoolbit_lightBlue", "inventory"));
		ModelLoader.setCustomModelResourceLocation(woolbit, 13, new ModelResourceLocation(RDTReference.MOD_ID + ":" + "ItemWoolbit_magenta", "inventory"));
		ModelLoader.setCustomModelResourceLocation(woolbit, 14, new ModelResourceLocation(RDTReference.MOD_ID + ":" + "ItemWoolbit_orange", "inventory"));
		ModelLoader.setCustomModelResourceLocation(woolbit, 15, new ModelResourceLocation(RDTReference.MOD_ID + ":" + "ItemWoolbit_white", "inventory"));
	}
}
