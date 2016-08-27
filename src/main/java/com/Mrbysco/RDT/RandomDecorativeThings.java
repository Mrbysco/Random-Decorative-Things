package com.Mrbysco.RDT;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Mrbysco.RDT.init.RDTItems;
import com.Mrbysco.RDT.init.RDTRecipes;
import com.Mrbysco.RDT.proxy.CommonProxy;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RDTReference.MOD_ID, name = RDTReference.MOD_NAME, version = RDTReference.VERSION, acceptedMinecraftVersions = RDTReference.ACCEPTED_VERSIONS, dependencies = RDTReference.MOD_ID)
public class RandomDecorativeThings
{
	
	@Instance(RDTReference.MOD_ID)
	public static RandomDecorativeThings instance;
	
	@SidedProxy(clientSide = RDTReference.CLIENT_PROXY_CLASS, serverSide = RDTReference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final Logger logger = LogManager.getLogger(RDTReference.MOD_ID);
	public static boolean isMiabEnabled = false;
	
	public static final RDTTab tabRDT = new RDTTab("tabRDT");
	
    @EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {
    	isMiabEnabled = Loader.isModLoaded("miab");
		if(isMiabEnabled)logger.info("Loading With Meme In A Bottle");
		else{logger.info("Loading Without Meme In A Bottle");}

		if(isMiabEnabled){
			
		}
		
    	RDTItems.init();
    	RDTItems.register();
    	RDTRecipes.register();
    	
    	proxy.Preinit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	proxy.init();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	
    }
}