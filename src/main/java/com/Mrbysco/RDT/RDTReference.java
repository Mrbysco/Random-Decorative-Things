package com.Mrbysco.RDT;

public class RDTReference {
	public static final String MOD_ID = "rdt";
	public static final String MOD_NAME = "Random Decorative Things";
	public static final String VERSION = "0.0.1";
	public static final String ACCEPTED_VERSIONS = "[1.10.2]";
			
	public static final String CLIENT_PROXY_CLASS = "com.Mrbysco.RDT.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.Mrbysco.RDT.proxy.ServerProxy";
	
	public static enum RDTItems {
		WOOLBIT("woolbit", "ItemWoolbit"),
		CLAYBIT("claybit", "ItemClaybit"),
		STONEBIT("stonebit", "ItemStonebit"),
		STONEHAMMER("stonehammer", "ItemStoneHammer"),
		IRONHAMMER("ironhammer", "ItemIronHammer"),
		FLINTSAW("flintsaw", "ItemFlintSaw"),
		IRONSAW("ironsaw", "ItemIronSaw"),
		OAKBIT("oakbit", "ItemOakBit"),
		BIGOAKBIT("bigoakbit", "ItemBigOakBit"),
		BIRCHBIT("birchbit", "ItemBirchBit"),
		JUNGLEBIT("junglebit", "ItemJungleBit"),
		ACACIABIT("acaciabit", "ItemAcaciaBit"),
		SPRUCEBIT("sprucebit", "ItemSpruceBit");
		
		
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
	
	public static enum RDTBlocks {
		LAWNMOWER("lawnmower", "BlockLawnmower"),
		TOYCASTLE("toycastle", "BlockToyCastle"),
		
		OAKCRATE("oakcrate", "BlockCrateOak"),
		BIRCHCRATE("birchcrate", "BlockCrateBirch"),
		SPRUCECRATE("sprucecrate", "BlockCrateSpruce"),
		JUNGLECRATE("junglecrate", "BlockCrateJungle"),
		ACACIACRATE("acaciacrate", "BlockCrateAcacia"),
		BIGOAKCRATE("bigoakcrate", "BlockCrateBigOak"),
		
		OAKBARREL("oakbarrel", "BlockBarrelOak"),
		BIRCHBARREL("birchbarrel", "BlockBarrelBirch"),
		SPRUCEBARREL("sprucebarrel", "BlockBarrelSpruce"),
		JUNGLEBARREL("junglebarrel", "BlockBarrelJungle"),
		ACACIABARREL("acaciabarrel", "BlockBarrelAcacia"),
		BIGOAKBARREL("bigoakbarrel", "BlockBarrelBigOak"),
		
		OAKBOOKSHELF("oakbookshelf", "BlockBookshelfOak"),
		BIRCHBOOKSHELF("birchbookshelf", "BlockBookshelfBirch"),
		SPRUCEBOOKSHELF("sprucebookshelf", "BlockBookshelfSpruce"),
		JUNGLEBOOKSHELF("junglebookshelf", "BlockBookshelfJungle"),
		ACACIABOOKSHELF("acaciabookshelf", "BlockBookshelfAcacia"),
		BIGOAKBOOKSHELF("bigoakbookshelf", "BlockBookshelfBigOak"),
		
		STRAWBERRYCAKE("strawberrycake", "BlockStrawberryCake");
		
		private String unlocalisedName;
		private String registryName;
		
		RDTBlocks(String unlocalisedName, String registryName) {
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
