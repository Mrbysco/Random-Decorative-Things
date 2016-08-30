package com.Mrbysco.RDT.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class RDTRecipes {
	
	public static void register() {
		//Wool into woolbits
		GameRegistry.addShapedRecipe(new ItemStack(RDTItems.woolbit, 8, 15), "W", 'W', new ItemStack(Blocks.WOOL, 1, 0));
		GameRegistry.addShapedRecipe(new ItemStack(RDTItems.woolbit, 8, 14), "W", 'W', new ItemStack(Blocks.WOOL, 1, 1));
		GameRegistry.addShapedRecipe(new ItemStack(RDTItems.woolbit, 8, 13), "W", 'W', new ItemStack(Blocks.WOOL, 1, 2));
		GameRegistry.addShapedRecipe(new ItemStack(RDTItems.woolbit, 8, 12), "W", 'W', new ItemStack(Blocks.WOOL, 1, 3));
		GameRegistry.addShapedRecipe(new ItemStack(RDTItems.woolbit, 8, 11), "W", 'W', new ItemStack(Blocks.WOOL, 1, 4));
		GameRegistry.addShapedRecipe(new ItemStack(RDTItems.woolbit, 8, 10), "W", 'W', new ItemStack(Blocks.WOOL, 1, 5));
		GameRegistry.addShapedRecipe(new ItemStack(RDTItems.woolbit, 8, 9), "W", 'W', new ItemStack(Blocks.WOOL, 1, 6));
		GameRegistry.addShapedRecipe(new ItemStack(RDTItems.woolbit, 8, 8), "W", 'W', new ItemStack(Blocks.WOOL, 1, 7));
		GameRegistry.addShapedRecipe(new ItemStack(RDTItems.woolbit, 8, 7), "W", 'W', new ItemStack(Blocks.WOOL, 1, 8));
		GameRegistry.addShapedRecipe(new ItemStack(RDTItems.woolbit, 8, 6), "W", 'W', new ItemStack(Blocks.WOOL, 1, 9));
		GameRegistry.addShapedRecipe(new ItemStack(RDTItems.woolbit, 8, 5), "W", 'W', new ItemStack(Blocks.WOOL, 1, 10));
		GameRegistry.addShapedRecipe(new ItemStack(RDTItems.woolbit, 8, 4), "W", 'W', new ItemStack(Blocks.WOOL, 1, 11));
		GameRegistry.addShapedRecipe(new ItemStack(RDTItems.woolbit, 8, 3), "W", 'W', new ItemStack(Blocks.WOOL, 1, 12));
		GameRegistry.addShapedRecipe(new ItemStack(RDTItems.woolbit, 8, 2), "W", 'W', new ItemStack(Blocks.WOOL, 1, 13));
		GameRegistry.addShapedRecipe(new ItemStack(RDTItems.woolbit, 8, 1), "W", 'W', new ItemStack(Blocks.WOOL, 1, 14));
		GameRegistry.addShapedRecipe(new ItemStack(RDTItems.woolbit, 8, 0), "W", 'W', new ItemStack(Blocks.WOOL, 1, 15));
		
		//woolbits into Wool (revert method)
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.WOOL, 1, 0), "WWW","W W","WWW", 'W', new ItemStack(RDTItems.woolbit, 8, 15));
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.WOOL, 1, 1), "WWW","W W","WWW", 'W', new ItemStack(RDTItems.woolbit, 8, 14));
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.WOOL, 1, 2), "WWW","W W","WWW", 'W', new ItemStack(RDTItems.woolbit, 8, 13));
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.WOOL, 1, 3), "WWW","W W","WWW", 'W', new ItemStack(RDTItems.woolbit, 8, 12));
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.WOOL, 1, 4), "WWW","W W","WWW", 'W', new ItemStack(RDTItems.woolbit, 8, 11));
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.WOOL, 1, 5), "WWW","W W","WWW", 'W', new ItemStack(RDTItems.woolbit, 8, 10));
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.WOOL, 1, 6), "WWW","W W","WWW", 'W', new ItemStack(RDTItems.woolbit, 8, 9));
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.WOOL, 1, 7), "WWW","W W","WWW", 'W', new ItemStack(RDTItems.woolbit, 8, 8));
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.WOOL, 1, 8), "WWW","W W","WWW", 'W', new ItemStack(RDTItems.woolbit, 8, 7));
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.WOOL, 1, 9), "WWW","W W","WWW", 'W', new ItemStack(RDTItems.woolbit, 8, 6));
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.WOOL, 1, 10), "WWW","W W","WWW", 'W', new ItemStack(RDTItems.woolbit, 8, 5));
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.WOOL, 1, 11), "WWW","W W","WWW", 'W', new ItemStack(RDTItems.woolbit, 8, 4));
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.WOOL, 1, 12), "WWW","W W","WWW", 'W', new ItemStack(RDTItems.woolbit, 8, 3));
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.WOOL, 1, 13), "WWW","W W","WWW", 'W', new ItemStack(RDTItems.woolbit, 8, 2));
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.WOOL, 1, 14), "WWW","W W","WWW", 'W', new ItemStack(RDTItems.woolbit, 8, 1));
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.WOOL, 1, 15), "WWW","W W","WWW", 'W', new ItemStack(RDTItems.woolbit, 8, 0));
		
		//Add hammers to their own kind
		OreDictionary.registerOre("bithammer", new ItemStack(RDTItems.stonehammer));
		OreDictionary.registerOre("bithammer", new ItemStack(RDTItems.ironhammer));
		
		//Clay into claybits
		GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.claybit, 8, 15)), "WM", 'W', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 0), 'M', "bithammer"));
		GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.claybit, 8, 14)), "WM", 'W', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 1), 'M', "bithammer"));
		GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.claybit, 8, 13)), "WM", 'W', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 2), 'M', "bithammer"));
		GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.claybit, 8, 12)), "WM", 'W', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 3), 'M', "bithammer"));
		GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.claybit, 8, 11)), "WM", 'W', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 4), 'M', "bithammer"));
		GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.claybit, 8, 10)), "WM", 'W', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 5), 'M', "bithammer"));
		GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.claybit, 8, 9)), "WM", 'W', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 6), 'M', "bithammer"));
		GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.claybit, 8, 8)), "WM", 'W', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 7), 'M', "bithammer"));
		GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.claybit, 8, 7)), "WM", 'W', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 8), 'M', "bithammer"));
		GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.claybit, 8, 6)), "WM", 'W', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 9), 'M', "bithammer"));
		GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.claybit, 8, 5)), "WM", 'W', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 10), 'M', "bithammer"));
		GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.claybit, 8, 4)), "WM", 'W', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 11), 'M', "bithammer"));
		GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.claybit, 8, 3)), "WM", 'W', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 12), 'M', "bithammer"));
		GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.claybit, 8, 2)), "WM", 'W', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 13), 'M', "bithammer"));
		GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.claybit, 8, 1)), "WM", 'W', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 14), 'M', "bithammer"));
		GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.claybit, 8, 0)), "WM", 'W', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, 15), 'M', "bithammer"));
		
		//Stone into stonebits
		GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.stonebit, 8)), "WM", 'W', Blocks.STONE, 'M', "bithammer"));
		
		//recipe for the Hammers
		GameRegistry.addShapedRecipe(new ItemStack(RDTItems.stonehammer, 1), " G ", "GS ", " S ", 'G', Blocks.COBBLESTONE, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(RDTItems.ironhammer, 1), " G ", "GS ", " S ", 'G', Items.IRON_INGOT, 'S', Items.STICK);
	}
}
