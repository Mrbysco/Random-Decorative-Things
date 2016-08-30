package com.Mrbysco.RDT.init;

import com.Mrbysco.RDT.RDTReference;
import com.Mrbysco.RDT.items.ItemClaybit;
import com.Mrbysco.RDT.items.ItemFlintSaw;
import com.Mrbysco.RDT.items.ItemIronHammer;
import com.Mrbysco.RDT.items.ItemIronSaw;
import com.Mrbysco.RDT.items.ItemStoneHammer;
import com.Mrbysco.RDT.items.ItemStonebit;
import com.Mrbysco.RDT.items.ItemWoolbit;
import com.Mrbysco.RDT.items.woodbits.ItemAcaciaBit;
import com.Mrbysco.RDT.items.woodbits.ItemBigOakBit;
import com.Mrbysco.RDT.items.woodbits.ItemBirchBit;
import com.Mrbysco.RDT.items.woodbits.ItemJungleBit;
import com.Mrbysco.RDT.items.woodbits.ItemOakBit;
import com.Mrbysco.RDT.items.woodbits.ItemSpruceBit;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RDTItems {
	
	public static Item woolbit;
	public static Item claybit;
	public static Item stonebit;
	
	public static Item oakbit;
	public static Item bigoakbit;
	public static Item birchbit;
	public static Item sprucebit;
	public static Item acaciabit;
	public static Item junglebit;
	
	public static Item stonehammer;
	public static Item ironhammer;
	public static Item flintsaw;
	public static Item ironsaw;
		
	public static void init()
	{
		woolbit = new ItemWoolbit();
		claybit = new ItemClaybit();
		stonebit = new ItemStonebit();
		oakbit = new ItemOakBit();
		bigoakbit = new ItemBigOakBit();
		birchbit = new ItemBirchBit();
		sprucebit = new ItemSpruceBit();
		acaciabit = new ItemAcaciaBit();
		junglebit = new ItemJungleBit();
		stonehammer = new ItemStoneHammer(ToolMaterial.STONE);
		ironhammer = new ItemIronHammer(ToolMaterial.IRON);
		flintsaw = new ItemFlintSaw(ToolMaterial.STONE);
		ironsaw = new ItemIronSaw(ToolMaterial.IRON);
	}
	
	public static void register()
	{
		GameRegistry.register(woolbit);
		GameRegistry.register(claybit);
		GameRegistry.register(stonebit);
		GameRegistry.register(oakbit);
		GameRegistry.register(bigoakbit);
		GameRegistry.register(birchbit);
		GameRegistry.register(sprucebit);
		GameRegistry.register(acaciabit);
		GameRegistry.register(junglebit);
		GameRegistry.register(stonehammer);
		GameRegistry.register(ironhammer);
		GameRegistry.register(flintsaw);
		GameRegistry.register(ironsaw);
	}
	
	public static void registerRenders()
	{
		registerRender(stonebit);
		registerRender(oakbit);
		registerRender(bigoakbit);
		registerRender(birchbit);
		registerRender(sprucebit);
		registerRender(acaciabit);
		registerRender(junglebit);
		registerRender(stonehammer);
		registerRender(ironhammer);
		registerRender(flintsaw);
		registerRender(ironsaw);
	}
	
	public static void registerRender(Item item)
	{		
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		//Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(RDTReference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
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
		
		ModelLoader.setCustomModelResourceLocation(claybit, 0, new ModelResourceLocation(RDTReference.MOD_ID +  ":" + "ItemClaybit_black", "inventory"));
		ModelLoader.setCustomModelResourceLocation(claybit, 1, new ModelResourceLocation(RDTReference.MOD_ID + ":" + "ItemClaybit_red", "inventory"));
		ModelLoader.setCustomModelResourceLocation(claybit, 2, new ModelResourceLocation(RDTReference.MOD_ID + ":" + "ItemClaybit_green", "inventory"));
		ModelLoader.setCustomModelResourceLocation(claybit, 3, new ModelResourceLocation(RDTReference.MOD_ID + ":" + "ItemClaybit_brown", "inventory"));
		ModelLoader.setCustomModelResourceLocation(claybit, 4, new ModelResourceLocation(RDTReference.MOD_ID + ":" + "ItemClaybit_blue", "inventory"));
		ModelLoader.setCustomModelResourceLocation(claybit, 5, new ModelResourceLocation(RDTReference.MOD_ID + ":" + "ItemClaybit_purple", "inventory"));
		ModelLoader.setCustomModelResourceLocation(claybit, 6, new ModelResourceLocation(RDTReference.MOD_ID + ":" + "ItemClaybit_cyan", "inventory"));
		ModelLoader.setCustomModelResourceLocation(claybit, 7, new ModelResourceLocation(RDTReference.MOD_ID + ":" + "ItemClaybit_lightGray", "inventory"));
		ModelLoader.setCustomModelResourceLocation(claybit, 8, new ModelResourceLocation(RDTReference.MOD_ID + ":" + "ItemClaybit_gray", "inventory"));
		ModelLoader.setCustomModelResourceLocation(claybit, 9, new ModelResourceLocation(RDTReference.MOD_ID + ":" + "ItemClaybit_pink", "inventory"));
		ModelLoader.setCustomModelResourceLocation(claybit, 10, new ModelResourceLocation(RDTReference.MOD_ID + ":" + "ItemClaybit_lime", "inventory"));
		ModelLoader.setCustomModelResourceLocation(claybit, 11, new ModelResourceLocation(RDTReference.MOD_ID + ":" + "ItemClaybit_yellow", "inventory"));
		ModelLoader.setCustomModelResourceLocation(claybit, 12, new ModelResourceLocation(RDTReference.MOD_ID + ":" + "ItemClaybit_lightBlue", "inventory"));
		ModelLoader.setCustomModelResourceLocation(claybit, 13, new ModelResourceLocation(RDTReference.MOD_ID + ":" + "ItemClaybit_magenta", "inventory"));
		ModelLoader.setCustomModelResourceLocation(claybit, 14, new ModelResourceLocation(RDTReference.MOD_ID + ":" + "ItemClaybit_orange", "inventory"));
		ModelLoader.setCustomModelResourceLocation(claybit, 15, new ModelResourceLocation(RDTReference.MOD_ID + ":" + "ItemClaybit_white", "inventory"));
	}
}
