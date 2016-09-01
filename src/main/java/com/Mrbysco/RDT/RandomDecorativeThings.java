package com.Mrbysco.RDT;

import com.Mrbysco.RDT.init.RDTBlocks;
import com.Mrbysco.RDT.init.RDTItems;
import com.Mrbysco.RDT.init.RDTRecipes;
import com.Mrbysco.RDT.init.RDTTileEntities;
import com.Mrbysco.RDT.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RDTReference.MOD_ID, name = RDTReference.MOD_NAME, version = RDTReference.VERSION, acceptedMinecraftVersions = RDTReference.ACCEPTED_VERSIONS)
public class RandomDecorativeThings
{
	
	@Instance(RDTReference.MOD_ID)
	public static RandomDecorativeThings instance;
	
	@SidedProxy(clientSide = RDTReference.CLIENT_PROXY_CLASS, serverSide = RDTReference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final RDTTab tabRDT = new RDTTab("tabRDT");
	
    @EventHandler
    public void PreInit(FMLPreInitializationEvent event)
    {		
    	RDTItems.init();
    	RDTBlocks.init();
    	RDTItems.register();
    	RDTBlocks.register();
    	
    	RDTRecipes.register();
    	
    	proxy.Preinit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	proxy.init();
    	
    	//Temporarily disabled
    	//RDTTileEntities.init();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	
    }
}