package com.Mrbysco.RDT.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class RDTRecipes {
	public static void register() {
		
		/*if(RandomDecorativeThings.isQuarkInstalled){
			RandomDecorativeThings.logger.info("Changing Woolbit recipe For Compatability");	
			//Quark Compatability recipe
			GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.woolbit, 8, 15)), "WM", 'W', new ItemStack(Blocks.WOOL, 1, 0), 'M', "bitsaw"));
			GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.woolbit, 8, 14)), "WM", 'W', new ItemStack(Blocks.WOOL, 1, 1), 'M', "bitsaw"));
			GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.woolbit, 8, 13)), "WM", 'W', new ItemStack(Blocks.WOOL, 1, 2), 'M', "bitsaw"));
			GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.woolbit, 8, 12)), "WM", 'W', new ItemStack(Blocks.WOOL, 1, 3), 'M', "bitsaw"));
			GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.woolbit, 8, 11)), "WM", 'W', new ItemStack(Blocks.WOOL, 1, 4), 'M', "bitsaw"));
			GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.woolbit, 8, 10)), "WM", 'W', new ItemStack(Blocks.WOOL, 1, 5), 'M', "bitsaw"));
			GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.woolbit, 8, 9)), "WM", 'W', new ItemStack(Blocks.WOOL, 1, 6), 'M', "bitsaw"));
			GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.woolbit, 8, 8)), "WM", 'W', new ItemStack(Blocks.WOOL, 1, 7), 'M', "bitsaw"));
			GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.woolbit, 8, 7)), "WM", 'W', new ItemStack(Blocks.WOOL, 1, 8), 'M', "bitsaw"));
			GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.woolbit, 8, 6)), "WM", 'W', new ItemStack(Blocks.WOOL, 1, 9), 'M', "bitsaw"));
			GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.woolbit, 8, 5)), "WM", 'W', new ItemStack(Blocks.WOOL, 1, 10), 'M', "bitsaw"));
			GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.woolbit, 8, 4)), "WM", 'W', new ItemStack(Blocks.WOOL, 1, 11), 'M', "bitsaw"));
			GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.woolbit, 8, 3)), "WM", 'W', new ItemStack(Blocks.WOOL, 1, 12), 'M', "bitsaw"));
			GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.woolbit, 8, 2)), "WM", 'W', new ItemStack(Blocks.WOOL, 1, 13), 'M', "bitsaw"));
			GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.woolbit, 8, 1)), "WM", 'W', new ItemStack(Blocks.WOOL, 1, 14), 'M', "bitsaw"));
			GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.woolbit, 8, 0)), "WM", 'W', new ItemStack(Blocks.WOOL, 1, 15), 'M', "bitsaw"));
			RandomDecorativeThings.logger.info("Compatability Changes Finished");	
		}
		else
		{*/
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
		//}
		
		
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
		OreDictionary.registerOre("bitsaw", new ItemStack(RDTItems.flintsaw));
		OreDictionary.registerOre("bitsaw", new ItemStack(RDTItems.ironsaw));
		
		//Add bookshelves to oredict
		OreDictionary.registerOre("bookshelf_acacia", new ItemStack(RDTBlocks.acaciabookshelf));
		OreDictionary.registerOre("bookshelf_bigoak", new ItemStack(RDTBlocks.bigoakbookshelf));
		OreDictionary.registerOre("bookshelf_birch", new ItemStack(RDTBlocks.birchbookshelf));
		OreDictionary.registerOre("bookshelf_jungle", new ItemStack(RDTBlocks.junglebookshelf));
		OreDictionary.registerOre("bookshelf_oak", new ItemStack(RDTBlocks.oakbookshelf));
		OreDictionary.registerOre("bookshelf_spruce", new ItemStack(RDTBlocks.sprucebookshelf));
		
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
		
		//Wood into woodbits
		GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.oakbit, 8)), "WM", 'W', new ItemStack(Blocks.PLANKS, 1, 0), 'M', "bitsaw"));
		GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.bigoakbit, 8)), "WM", 'W', new ItemStack(Blocks.PLANKS, 1, 5), 'M', "bitsaw"));
		GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.birchbit, 8)), "WM", 'W', new ItemStack(Blocks.PLANKS, 1, 2), 'M', "bitsaw"));
		GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.acaciabit, 8)), "WM", 'W', new ItemStack(Blocks.PLANKS, 1, 4), 'M', "bitsaw"));
		GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.sprucebit, 8)), "WM", 'W', new ItemStack(Blocks.PLANKS, 1, 1), 'M', "bitsaw"));
		GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.junglebit, 8)), "WM", 'W', new ItemStack(Blocks.PLANKS, 1, 3), 'M', "bitsaw"));
		
		//Stone into stonebits
		GameRegistry.addRecipe(new ShapedOreRecipe((new ItemStack(RDTItems.stonebit, 8)), "WM", 'W', new ItemStack(Blocks.WOOL, 1, 0), 'M', "bithammer"));
		
		//recipe for the Hammers and Saw
		GameRegistry.addShapedRecipe(new ItemStack(RDTItems.stonehammer, 1), " G ", "GS ", " S ", 'G', Blocks.COBBLESTONE, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(RDTItems.ironhammer, 1), " G ", "GS ", " S ", 'G', Items.IRON_INGOT, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(RDTItems.flintsaw, 1), " S ", "SG ", " S ", 'G', Items.FLINT, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(RDTItems.ironsaw, 1), " S ", "SG ", " S ", 'G', Items.IRON_INGOT, 'S', Items.STICK);
		
		//Recipe for the blocks 
		
		//crates
		GameRegistry.addShapedRecipe(new ItemStack(RDTBlocks.oakcrate, 1), "BSB", "S S", "BSB", 'S', new ItemStack(Blocks.WOODEN_SLAB, 1, 0), 'B', RDTItems.oakbit);
		GameRegistry.addShapedRecipe(new ItemStack(RDTBlocks.bigoakcrate, 1), "BSB", "S S", "BSB", 'S', new ItemStack(Blocks.WOODEN_SLAB, 1, 5), 'B', RDTItems.bigoakbit);
		GameRegistry.addShapedRecipe(new ItemStack(RDTBlocks.birchcrate, 1), "BSB", "S S", "BSB", 'S', new ItemStack(Blocks.WOODEN_SLAB, 1, 2), 'B', RDTItems.birchbit);
		GameRegistry.addShapedRecipe(new ItemStack(RDTBlocks.acaciacrate, 1), "BSB", "S S", "BSB", 'S', new ItemStack(Blocks.WOODEN_SLAB, 1, 4), 'B', RDTItems.acaciabit);
		GameRegistry.addShapedRecipe(new ItemStack(RDTBlocks.sprucecrate, 1), "BSB", "S S", "BSB", 'S', new ItemStack(Blocks.WOODEN_SLAB, 1, 1), 'B', RDTItems.sprucebit);
		GameRegistry.addShapedRecipe(new ItemStack(RDTBlocks.junglecrate, 1), "BSB", "S S", "BSB", 'S', new ItemStack(Blocks.WOODEN_SLAB, 1, 3), 'B', RDTItems.junglebit);
		
		//crates
		GameRegistry.addShapedRecipe(new ItemStack(RDTBlocks.oakbarrel, 1), "BSB", "B B", "BSB", 'S', new ItemStack(Blocks.WOODEN_SLAB, 1, 0), 'B', RDTItems.oakbit);
		GameRegistry.addShapedRecipe(new ItemStack(RDTBlocks.bigoakbarrel, 1), "BSB", "B B", "BSB", 'S', new ItemStack(Blocks.WOODEN_SLAB, 1, 5), 'B', RDTItems.bigoakbit);
		GameRegistry.addShapedRecipe(new ItemStack(RDTBlocks.birchbarrel, 1), "BSB", "B B", "BSB", 'S', new ItemStack(Blocks.WOODEN_SLAB, 1, 2), 'B', RDTItems.birchbit);
		GameRegistry.addShapedRecipe(new ItemStack(RDTBlocks.acaciabarrel, 1), "BSB", "B B", "BSB", 'S', new ItemStack(Blocks.WOODEN_SLAB, 1, 4), 'B', RDTItems.acaciabit);
		GameRegistry.addShapedRecipe(new ItemStack(RDTBlocks.sprucebarrel, 1), "BSB", "B B", "BSB", 'S', new ItemStack(Blocks.WOODEN_SLAB, 1, 1), 'B', RDTItems.sprucebit);
		GameRegistry.addShapedRecipe(new ItemStack(RDTBlocks.junglebarrel, 1), "BSB", "B B", "BSB", 'S', new ItemStack(Blocks.WOODEN_SLAB, 1, 3), 'B', RDTItems.junglebit);
		
		/*if(RandomDecorativeThings.isQuarkInstalled){
			RandomDecorativeThings.logger.info("Changing Bookshelf Recipe For Compatability");	
			//Quark Compatability recipe
			GameRegistry.addShapedRecipe(new ItemStack(RDTBlocks.oakbookshelf, 1), "B", 'B', new ItemStack(Blocks.BOOKSHELF, 1, 0));
			
			GameRegistry.addShapedRecipe(new ItemStack(RDTBlocks.bigoakbookshelf, 1), "B", 'B', new ItemStack(RDTBlocks.oakbookshelf, 1));
			GameRegistry.addShapedRecipe(new ItemStack(RDTBlocks.birchbookshelf, 1), "B", 'B', new ItemStack(RDTBlocks.bigoakbookshelf, 1));
			GameRegistry.addShapedRecipe(new ItemStack(RDTBlocks.acaciabookshelf, 1), "B", 'B', new ItemStack(RDTBlocks.birchbookshelf, 1));
			GameRegistry.addShapedRecipe(new ItemStack(RDTBlocks.sprucebookshelf, 1), "B", 'B', new ItemStack(RDTBlocks.acaciabookshelf, 1));
			GameRegistry.addShapedRecipe(new ItemStack(RDTBlocks.junglebookshelf, 1), "B", 'B', new ItemStack(RDTBlocks.sprucebookshelf, 1));
			GameRegistry.addShapedRecipe(new ItemStack(RDTBlocks.oakbookshelf, 1), "B", 'B', new ItemStack(RDTBlocks.junglebookshelf, 1));
			RandomDecorativeThings.logger.info("Compatability Changes Finished");	
		}
		else
		{ */
			//bookshelves
			GameRegistry.addShapedRecipe(new ItemStack(RDTBlocks.oakbookshelf, 1), "WWW", "BBB", "WWW", 'W', new ItemStack(Blocks.PLANKS, 1, 0), 'B', Items.BOOK);
			GameRegistry.addShapedRecipe(new ItemStack(RDTBlocks.bigoakbookshelf, 1), "WWW", "BBB", "WWW", 'W', new ItemStack(Blocks.PLANKS, 1, 5), 'B', Items.BOOK);
			GameRegistry.addShapedRecipe(new ItemStack(RDTBlocks.birchbookshelf, 1), "WWW", "BBB", "WWW", 'W', new ItemStack(Blocks.PLANKS, 1, 2), 'B', Items.BOOK);
			GameRegistry.addShapedRecipe(new ItemStack(RDTBlocks.acaciabookshelf, 1), "WWW", "BBB", "WWW", 'W', new ItemStack(Blocks.PLANKS, 1, 4), 'B', Items.BOOK);
			GameRegistry.addShapedRecipe(new ItemStack(RDTBlocks.sprucebookshelf, 1), "WWW", "BBB", "WWW", 'W', new ItemStack(Blocks.PLANKS, 1, 1), 'B', Items.BOOK);
			GameRegistry.addShapedRecipe(new ItemStack(RDTBlocks.junglebookshelf, 1), "WWW", "BBB", "WWW", 'W', new ItemStack(Blocks.PLANKS, 1, 3), 'B', Items.BOOK);
		//}
		
		//Toy castle
		GameRegistry.addShapedRecipe(new ItemStack(RDTBlocks.toycastle, 1), "RRR", "GGG", "GYG", 'R', new ItemStack(RDTItems.woolbit, 1, 1), 'G', new ItemStack(RDTItems.woolbit, 1, 7), 'Y', new ItemStack(RDTItems.woolbit, 1, 11));
		//Lawnmower
		GameRegistry.addShapedRecipe(new ItemStack(RDTBlocks.lawnmower, 1), "  B", "RGR", "WRW", 'B', new ItemStack(RDTItems.woolbit, 1, 0), 'R', new ItemStack(RDTItems.claybit, 1, 1), 'G', new ItemStack(RDTItems.claybit, 1, 8), 'W', new ItemStack(RDTItems.woolbit, 1, 15));
		//Cake
		GameRegistry.addShapedRecipe(new ItemStack(RDTBlocks.strawberrycake, 1), " R ", "WWW", "OOO", 'O', new ItemStack(RDTItems.claybit, 1, 14), 'W', new ItemStack(RDTItems.claybit, 1, 15), 'R', new ItemStack(RDTItems.claybit, 1, 1));
		
		//Red Plumber
		GameRegistry.addShapedRecipe(new ItemStack(RDTBlocks.redplumber, 1), "RR ", "WBW", "WWM", 'B', new ItemStack(RDTItems.claybit, 1, 12), 'W', new ItemStack(RDTItems.claybit, 1, 15), 'R', new ItemStack(RDTItems.claybit, 1, 1), 'M', new ItemStack(RDTItems.claybit, 1, 8));
		GameRegistry.addShapedRecipe(new ItemStack(RDTBlocks.greenplumber, 1), "GG ", "WBW", "WWM", 'B', new ItemStack(RDTItems.claybit, 1, 12), 'W', new ItemStack(RDTItems.claybit, 1, 15), 'G', new ItemStack(RDTItems.claybit, 1, 2), 'M', new ItemStack(RDTItems.claybit, 1, 8));

		GameRegistry.addShapedRecipe(new ItemStack(RDTBlocks.villagehut2, 1), "PPP", "SPS", "SSS", 'P', new ItemStack(RDTItems.oakbit, 1), 'S', new ItemStack(RDTItems.stonebit, 1));
		GameRegistry.addShapedRecipe(new ItemStack(RDTBlocks.villageblacksmith, 1), "SSS", "SSP", "SSS", 'S', new ItemStack(RDTItems.stonebit, 1), 'P', new ItemStack(RDTItems.oakbit, 1));
		GameRegistry.addShapedRecipe(new ItemStack(RDTBlocks.villagebutcher, 1), "PPP", "PPP", "SSS", 'S', new ItemStack(RDTItems.stonebit, 1), 'P', new ItemStack(RDTItems.oakbit, 1));
	}
}
