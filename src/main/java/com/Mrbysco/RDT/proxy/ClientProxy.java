package com.Mrbysco.RDT.proxy;

import com.Mrbysco.RDT.RDTReference;
import com.Mrbysco.RDT.gui.GuiProxy;
import com.Mrbysco.RDT.init.RDTBlocks;
import com.Mrbysco.RDT.init.RDTItems;

import net.minecraftforge.fml.common.network.NetworkRegistry;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void init() {
        //NetworkRegistry.INSTANCE.registerGuiHandler(RDTReference.MOD_ID, new GuiProxy());
		//RDTItems.registerRenders();
		//RDTBlocks.registerRenders();
	}
	
	
	@Override
	public void Preinit() {
		RDTItems.registerRenderMetadata();
		RDTItems.registerRenders();
		RDTBlocks.registerRenders();
	}

}
