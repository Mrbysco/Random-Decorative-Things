package com.Mrbysco.RDT.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RDTRecipes {
	
	public static void register() {
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

	}
}