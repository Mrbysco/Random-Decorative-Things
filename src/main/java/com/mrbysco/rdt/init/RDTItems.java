package com.mrbysco.rdt.init;

public class RDTItems {

//	public static Item woolbit;
//	public static Item claybit;
//	public static Item stonebit;
//
//	public static Item oakbit;
//	public static Item bigoakbit;
//	public static Item birchbit;
//	public static Item sprucebit;
//	public static Item acaciabit;
//	public static Item junglebit;
//
//	public static Item stonehammer;
//	public static Item ironhammer;
//	public static Item flintsaw;
//	public static Item ironsaw;
//
//	public static void init()
//	{
//		woolbit = new ItemWoolbit();
//		claybit = new ItemClaybit();
//		stonebit = new ItemStonebit();
//		oakbit = new ItemOakBit();
//		bigoakbit = new ItemBigOakBit();
//		birchbit = new ItemBirchBit();
//		sprucebit = new ItemSpruceBit();
//		acaciabit = new ItemAcaciaBit();
//		junglebit = new ItemJungleBit();
//		stonehammer = new ItemCustomTool(ToolMaterial.STONE, "stonehammer", "itemstonehammer");
//		ironhammer = new ItemCustomTool(ToolMaterial.IRON, "ironhammer", "itemironhammer");
//		flintsaw = new ItemCustomTool(ToolMaterial.STONE, "flintsaw", "itemflintsaw");
//		ironsaw = new ItemCustomTool(ToolMaterial.IRON, "ironsaw", "itemironsaw");
//	}
//
//	public static void register()
//	{
//		ForgeRegistries.ITEMS.register(woolbit);
//		ForgeRegistries.ITEMS.register(claybit);
//		ForgeRegistries.ITEMS.register(stonebit);
//		ForgeRegistries.ITEMS.register(oakbit);
//		ForgeRegistries.ITEMS.register(bigoakbit);
//		ForgeRegistries.ITEMS.register(birchbit);
//		ForgeRegistries.ITEMS.register(sprucebit);
//		ForgeRegistries.ITEMS.register(acaciabit);
//		ForgeRegistries.ITEMS.register(junglebit);
//		ForgeRegistries.ITEMS.register(stonehammer);
//		ForgeRegistries.ITEMS.register(ironhammer);
//		ForgeRegistries.ITEMS.register(flintsaw);
//		ForgeRegistries.ITEMS.register(ironsaw);
//
//		OreDictionary.registerOre("bithammer", new ItemStack(RDTItems.stonehammer));
//		OreDictionary.registerOre("bithammer", new ItemStack(RDTItems.ironhammer));
//		OreDictionary.registerOre("bitsaw", new ItemStack(RDTItems.flintsaw));
//		OreDictionary.registerOre("bitsaw", new ItemStack(RDTItems.ironsaw));
//	}
//
//	public static void registerRenders()
//	{
//		registerRender(stonebit);
//		registerRender(oakbit);
//		registerRender(bigoakbit);
//		registerRender(birchbit);
//		registerRender(sprucebit);
//		registerRender(acaciabit);
//		registerRender(junglebit);
//		registerRender(stonehammer);
//		registerRender(ironhammer);
//		registerRender(flintsaw);
//		registerRender(ironsaw);
//	}
//
//	public static void registerRender(Item item)
//	{
//		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
//		//Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(RDTReference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
//	}
//
//	public static void registerRenderMetadata()
//	{
//		ModelLoader.setCustomModelResourceLocation(woolbit, 0, new ModelResourceLocation(Reference.MOD_ID +  ":" + "itemwoolbit_black", "inventory"));
//		ModelLoader.setCustomModelResourceLocation(woolbit, 1, new ModelResourceLocation(Reference.MOD_ID + ":" + "itemwoolbit_red", "inventory"));
//		ModelLoader.setCustomModelResourceLocation(woolbit, 2, new ModelResourceLocation(Reference.MOD_ID + ":" + "itemwoolbit_green", "inventory"));
//		ModelLoader.setCustomModelResourceLocation(woolbit, 3, new ModelResourceLocation(Reference.MOD_ID + ":" + "itemwoolbit_brown", "inventory"));
//		ModelLoader.setCustomModelResourceLocation(woolbit, 4, new ModelResourceLocation(Reference.MOD_ID + ":" + "itemwoolbit_blue", "inventory"));
//		ModelLoader.setCustomModelResourceLocation(woolbit, 5, new ModelResourceLocation(Reference.MOD_ID + ":" + "itemwoolbit_purple", "inventory"));
//		ModelLoader.setCustomModelResourceLocation(woolbit, 6, new ModelResourceLocation(Reference.MOD_ID + ":" + "itemwoolbit_cyan", "inventory"));
//		ModelLoader.setCustomModelResourceLocation(woolbit, 7, new ModelResourceLocation(Reference.MOD_ID + ":" + "itemwoolbit_lightgray", "inventory"));
//		ModelLoader.setCustomModelResourceLocation(woolbit, 8, new ModelResourceLocation(Reference.MOD_ID + ":" + "itemwoolbit_gray", "inventory"));
//		ModelLoader.setCustomModelResourceLocation(woolbit, 9, new ModelResourceLocation(Reference.MOD_ID + ":" + "itemwoolbit_pink", "inventory"));
//		ModelLoader.setCustomModelResourceLocation(woolbit, 10, new ModelResourceLocation(Reference.MOD_ID + ":" + "itemwoolbit_lime", "inventory"));
//		ModelLoader.setCustomModelResourceLocation(woolbit, 11, new ModelResourceLocation(Reference.MOD_ID + ":" + "itemwoolbit_yellow", "inventory"));
//		ModelLoader.setCustomModelResourceLocation(woolbit, 12, new ModelResourceLocation(Reference.MOD_ID + ":" + "itemwoolbit_lightblue", "inventory"));
//		ModelLoader.setCustomModelResourceLocation(woolbit, 13, new ModelResourceLocation(Reference.MOD_ID + ":" + "itemwoolbit_magenta", "inventory"));
//		ModelLoader.setCustomModelResourceLocation(woolbit, 14, new ModelResourceLocation(Reference.MOD_ID + ":" + "itemwoolbit_orange", "inventory"));
//		ModelLoader.setCustomModelResourceLocation(woolbit, 15, new ModelResourceLocation(Reference.MOD_ID + ":" + "itemwoolbit_white", "inventory"));
//
//		ModelLoader.setCustomModelResourceLocation(claybit, 0, new ModelResourceLocation(Reference.MOD_ID +  ":" + "itemclaybit_black", "inventory"));
//		ModelLoader.setCustomModelResourceLocation(claybit, 1, new ModelResourceLocation(Reference.MOD_ID + ":" + "itemclaybit_red", "inventory"));
//		ModelLoader.setCustomModelResourceLocation(claybit, 2, new ModelResourceLocation(Reference.MOD_ID + ":" + "itemclaybit_green", "inventory"));
//		ModelLoader.setCustomModelResourceLocation(claybit, 3, new ModelResourceLocation(Reference.MOD_ID + ":" + "itemclaybit_brown", "inventory"));
//		ModelLoader.setCustomModelResourceLocation(claybit, 4, new ModelResourceLocation(Reference.MOD_ID + ":" + "itemclaybit_blue", "inventory"));
//		ModelLoader.setCustomModelResourceLocation(claybit, 5, new ModelResourceLocation(Reference.MOD_ID + ":" + "itemclaybit_purple", "inventory"));
//		ModelLoader.setCustomModelResourceLocation(claybit, 6, new ModelResourceLocation(Reference.MOD_ID + ":" + "itemclaybit_cyan", "inventory"));
//		ModelLoader.setCustomModelResourceLocation(claybit, 7, new ModelResourceLocation(Reference.MOD_ID + ":" + "itemclaybit_lightgray", "inventory"));
//		ModelLoader.setCustomModelResourceLocation(claybit, 8, new ModelResourceLocation(Reference.MOD_ID + ":" + "itemclaybit_gray", "inventory"));
//		ModelLoader.setCustomModelResourceLocation(claybit, 9, new ModelResourceLocation(Reference.MOD_ID + ":" + "itemclaybit_pink", "inventory"));
//		ModelLoader.setCustomModelResourceLocation(claybit, 10, new ModelResourceLocation(Reference.MOD_ID + ":" + "itemclaybit_lime", "inventory"));
//		ModelLoader.setCustomModelResourceLocation(claybit, 11, new ModelResourceLocation(Reference.MOD_ID + ":" + "itemclaybit_yellow", "inventory"));
//		ModelLoader.setCustomModelResourceLocation(claybit, 12, new ModelResourceLocation(Reference.MOD_ID + ":" + "itemclaybit_lightblue", "inventory"));
//		ModelLoader.setCustomModelResourceLocation(claybit, 13, new ModelResourceLocation(Reference.MOD_ID + ":" + "itemclaybit_magenta", "inventory"));
//		ModelLoader.setCustomModelResourceLocation(claybit, 14, new ModelResourceLocation(Reference.MOD_ID + ":" + "itemclaybit_orange", "inventory"));
//		ModelLoader.setCustomModelResourceLocation(claybit, 15, new ModelResourceLocation(Reference.MOD_ID + ":" + "itemclaybit_white", "inventory"));
//	}
}
