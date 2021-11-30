package com.mrbysco.rdt;

import com.mrbysco.rdt.init.RandomRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class RandomTabs {
	public static final ItemGroup MAIN_TAB = new ItemGroup(Reference.MOD_ID) {
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return new ItemStack(RandomRegistry.VILLAGE_BUTCHER.get());
		}
	};
}