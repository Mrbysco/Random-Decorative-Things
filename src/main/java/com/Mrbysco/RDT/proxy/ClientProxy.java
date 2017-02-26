package com.Mrbysco.RDT.proxy;

import com.Mrbysco.RDT.init.RDTBlocks;
import com.Mrbysco.RDT.init.RDTColor;
import com.Mrbysco.RDT.init.RDTItems;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void init() {
		RDTColor.registerColourHandlers();
	}
	
	
	@Override
	public void Preinit() {
		RDTItems.registerRenderMetadata();
		RDTItems.registerRenders();
		RDTBlocks.registerRenders();
	}

}
