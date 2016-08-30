package com.Mrbysco.RDT.proxy;

import com.Mrbysco.RDT.RDTReference;
import com.Mrbysco.RDT.gui.GuiProxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CommonProxy {

	public void init(FMLInitializationEvent e) {
        NetworkRegistry.INSTANCE.registerGuiHandler(RDTReference.MOD_ID, new GuiProxy());
    }


	public void Preinit() {
		
	}


	public void init() {
		// TODO Auto-generated method stub
		
	}
}
