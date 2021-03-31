package com.mrbysco.rdt.client;

import com.mrbysco.rdt.init.RandomRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.item.BlockItem;
import net.minecraft.world.GrassColors;
import net.minecraft.world.biome.BiomeColors;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientHandler {

	public static void onClientSetup(final FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(RandomRegistry.STRAWBERRY_CAKE.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(RandomRegistry.VILLAGE_BUTCHER.get(), RenderType.getCutoutMipped());
		RenderTypeLookup.setRenderLayer(RandomRegistry.VILLAGE_BLACKSMITH.get(), RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(RandomRegistry.VILLAGE_HUT_2.get(), RenderType.getCutout());
	}

	public static void registerBlockColors(final ColorHandlerEvent.Block event) {
		BlockColors colors = event.getBlockColors();

		colors.register((state, reader, pos, color) -> {
					return reader != null && pos != null ? BiomeColors.getGrassColor(reader, pos) : GrassColors.get(0.5D, 1.0D);
				}, RandomRegistry.VILLAGE_BUTCHER.get());
	}

	public static void registerItemColors(final ColorHandlerEvent.Item event) {
		ItemColors colors = event.getItemColors();
		BlockColors blockColors = event.getBlockColors();

		colors.register((stack, tintIndex) -> {
			BlockState state = ((BlockItem) stack.getItem()).getBlock().getDefaultState();
			return blockColors.getColor(state, null, null, tintIndex);
		}, RandomRegistry.VILLAGE_BUTCHER.get());
	}
}
