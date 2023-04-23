package com.mrbysco.rdt;

import com.mrbysco.rdt.init.RandomRegistry;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.List;

public class RandomTabs {
	private static CreativeModeTab MAIN_TAB;

	@SubscribeEvent
	public void registerCreativeTabs(final CreativeModeTabEvent.Register event) {
		MAIN_TAB = event.registerCreativeModeTab(new ResourceLocation(Reference.MOD_ID, "tab"), builder ->
				builder.icon(() -> new ItemStack(RandomRegistry.VILLAGE_BUTCHER.get()))
						.title(Component.translatable("itemGroup.randomdecorativethings"))
						.displayItems((displayParameters, output) -> {
							List<ItemStack> stacks = RandomRegistry.ITEMS.getEntries().stream()
									.map(reg -> new ItemStack(reg.get())).toList();
							output.acceptAll(stacks);
						}));
	}
}