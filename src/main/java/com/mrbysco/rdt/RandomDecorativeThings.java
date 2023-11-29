package com.mrbysco.rdt;

import com.mojang.logging.LogUtils;
import com.mrbysco.rdt.client.ClientHandler;
import com.mrbysco.rdt.init.RandomRegistry;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;
import net.neoforged.fml.loading.FMLEnvironment;
import org.slf4j.Logger;

@Mod(Reference.MOD_ID)
public class RandomDecorativeThings {
	public static final Logger LOGGER = LogUtils.getLogger();

	public RandomDecorativeThings() {
		IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

		RandomRegistry.BLOCKS.register(eventBus);
		RandomRegistry.ITEMS.register(eventBus);
		RandomRegistry.CREATIVE_MODE_TABS.register(eventBus);

		if (FMLEnvironment.dist.isClient()) {
			eventBus.addListener(ClientHandler::onClientSetup);
			eventBus.addListener(ClientHandler::registerBlockColors);
			eventBus.addListener(ClientHandler::registerItemColors);
		}
	}
}