package com.Mrbysco.RDT.init;

import com.Mrbysco.RDT.blocks.BlockCrateAcacia;
import com.Mrbysco.RDT.blocks.BlockCrateBigOak;
import com.Mrbysco.RDT.blocks.BlockCrateBirch;
import com.Mrbysco.RDT.blocks.BlockCrateJungle;
import com.Mrbysco.RDT.blocks.BlockCrateOak;
import com.Mrbysco.RDT.blocks.BlockCrateSpruce;
import com.Mrbysco.RDT.blocks.BlockLawnmower;
import com.Mrbysco.RDT.blocks.BlockToyCastle;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RDTBlocks {
	
	public static Block lawnmower;
	public static Block toycastle;
	public static Block acaciacrate;
	public static Block bigoakcrate;
	public static Block birchcrate;
	public static Block junglecrate;
	public static Block oakcrate;
	public static Block sprucecrate;
	
	public static void init()
	{
		lawnmower = new BlockLawnmower();
		toycastle = new BlockToyCastle();
		acaciacrate = new BlockCrateAcacia();
		bigoakcrate = new BlockCrateBigOak();
		birchcrate = new BlockCrateBirch();
		junglecrate = new BlockCrateJungle();
		oakcrate = new BlockCrateOak();
		sprucecrate = new BlockCrateSpruce();
	}
	
	public static void register()
	{
		registerBlock(lawnmower);
		registerBlock(toycastle);
		registerBlock(acaciacrate);
		registerBlock(bigoakcrate);
		registerBlock(birchcrate);
		registerBlock(junglecrate);
		registerBlock(oakcrate);
		registerBlock(sprucecrate);
	}
	
	public static void registerBlock(Block block) 
	{
		registerBlock(block, new ItemBlock(block));
	}
	
	public static void registerBlock(Block block, ItemBlock item) 
	{
		GameRegistry.register(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders()
	{
		registerRender(lawnmower);
		registerRender(toycastle);
		registerRender(acaciacrate);
		registerRender(bigoakcrate);
		registerRender(birchcrate);
		registerRender(junglecrate);
		registerRender(oakcrate);
		registerRender(sprucecrate);
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		//Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(RDTReference.MOD_ID + ":" + block.getUnlocalizedName().substring(5).toLowerCase(Locale.US), "inventory"));
	}
}
