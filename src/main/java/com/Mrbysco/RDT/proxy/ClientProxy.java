package com.Mrbysco.RDT.proxy;

import com.Mrbysco.RDT.init.RDTBlocks;
import com.Mrbysco.RDT.init.RDTItems;

public class ClientProxy implements CommonProxy {
	
	@Override
	public void init() {
		//RDTItems.registerRenders();
		RDTBlocks.registerRenders();
	}
	
	
	@Override
	public void Preinit() {
		RDTItems.registerRenderMetadata();
		//RDTBlocks.registerRenders();
	}

}
