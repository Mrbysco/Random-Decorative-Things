package com.Mrbysco.RDT;

public class RDTReference {
	public static final String MOD_ID = "rdt";
	public static final String MOD_NAME = "Random Decorative Things";
	public static final String VERSION = "0.0.1";
	public static final String ACCEPTED_VERSIONS = "[1.10.2]";
			
	public static final String CLIENT_PROXY_CLASS = "com.Mrbysco.RDT.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.Mrbysco.RDT.proxy.ServerProxy";
	
	public static enum RDTItems {
		WOOLBIT("woolbit", "ItemWoolbit");
		
		private String unlocalisedName;
		private String registryName;
		
		RDTItems(String unlocalisedName, String registryName) {
			this.unlocalisedName = unlocalisedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalisedName() {
			return unlocalisedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
}
