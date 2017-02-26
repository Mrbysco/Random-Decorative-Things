package com.Mrbysco.RDT;

public class RDTReference {
	public static final String MOD_ID = "rdt";
	public static final String MOD_NAME = "Random Decorative Things";
	public static final String VERSION = "0.0.4.2";
	public static final String ACCEPTED_VERSIONS = "[1.11.2]";
			
	public static final String CLIENT_PROXY_CLASS = "com.Mrbysco.RDT.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.Mrbysco.RDT.proxy.ServerProxy";
	
	public static enum RDTItems {
		WOOLBIT("woolbit", "itemwoolbit"),
		CLAYBIT("claybit", "itemclaybit"),
		STONEBIT("stonebit", "itemstonebit"),
		STONEHAMMER("stonehammer", "itemstonehammer"),
		IRONHAMMER("ironhammer", "itemironhammer"),
		FLINTSAW("flintsaw", "itemflintsaw"),
		IRONSAW("ironsaw", "itemironsaw"),
		OAKBIT("oakbit", "itemoakbit"),
		BIGOAKBIT("bigoakbit", "itembigoakbit"),
		BIRCHBIT("birchbit", "itembirchbit"),
		JUNGLEBIT("junglebit", "itemjunglebit"),
		ACACIABIT("acaciabit", "itemacaciabit"),
		SPRUCEBIT("sprucebit", "itemsprucebit");
		
		
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
		
		STRAWBERRYCAKE("strawberrycake", "BlockStrawberryCake"),
		
		TOYPLUMBERRED("redplumber", "BlockRedPlumber"),
		TOYPLUMBERGREEN("greenplumber", "BlockGreenPlumber"),
		
		VILLAGEHUT2("villagehut2", "BlockVillageHut2"),
		VILLAGEBLACKSMITH("villageblacksmith", "BlockVillageBlacksmith"),
		VILLAGEBUTCHER("villagebutcher", "BlockVillageButcher");
		
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
