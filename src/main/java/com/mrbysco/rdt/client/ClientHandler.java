package com.mrbysco.rdt.client;

import com.mrbysco.rdt.init.RandomRegistry;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientHandler {

	public static void onClientSetup(final FMLClientSetupEvent event) {
		ItemBlockRenderTypes.setRenderLayer(RandomRegistry.STRAWBERRY_CAKE.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(RandomRegistry.VILLAGE_BUTCHER.get(), RenderType.cutoutMipped());
		ItemBlockRenderTypes.setRenderLayer(RandomRegistry.VILLAGE_BLACKSMITH.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(RandomRegistry.VILLAGE_HUT_2.get(), RenderType.cutout());
	}

	public static void registerBlockColors(final ColorHandlerEvent.Block event) {
		BlockColors colors = event.getBlockColors();

		colors.register((state, reader, pos, color) -> {
			return reader != null && pos != null ? BiomeColors.getAverageGrassColor(reader, pos) : GrassColor.get(0.5D, 1.0D);
		}, RandomRegistry.VILLAGE_BUTCHER.get());
	}

	public static void registerItemColors(final ColorHandlerEvent.Item event) {
		ItemColors colors = event.getItemColors();
		BlockColors blockColors = event.getBlockColors();

		colors.register((stack, tintIndex) -> {
			BlockState state = ((BlockItem) stack.getItem()).getBlock().defaultBlockState();
			return blockColors.getColor(state, null, null, tintIndex);
		}, RandomRegistry.VILLAGE_BUTCHER.get());
	}
}
