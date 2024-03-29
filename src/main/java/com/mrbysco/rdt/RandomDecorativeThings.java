package com.mrbysco.rdt;

import com.mojang.logging.LogUtils;
import com.mrbysco.rdt.client.ClientHandler;
import com.mrbysco.rdt.init.RandomRegistry;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Reference.MOD_ID)
public class RandomDecorativeThings {
	public static final Logger LOGGER = LogUtils.getLogger();

	public RandomDecorativeThings() {
		IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

		RandomRegistry.BLOCKS.register(eventBus);
		RandomRegistry.ITEMS.register(eventBus);

		DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> {
			eventBus.addListener(ClientHandler::onClientSetup);
			eventBus.addListener(ClientHandler::registerBlockColors);
			eventBus.addListener(ClientHandler::registerItemColors);
		});
	}
}