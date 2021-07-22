package com.mrbysco.rdt;

import com.mrbysco.rdt.init.RandomRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class RandomTabs {
	public static final CreativeModeTab MAIN_TAB = new CreativeModeTab(Reference.MOD_ID) {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(RandomRegistry.VILLAGE_BUTCHER.get());
		}
	};
}