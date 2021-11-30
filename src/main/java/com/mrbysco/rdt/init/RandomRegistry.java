package com.mrbysco.rdt.init;

import com.mrbysco.rdt.RandomTabs;
import com.mrbysco.rdt.Reference;
import com.mrbysco.rdt.blocks.BarrelBlock;
import com.mrbysco.rdt.blocks.BookshelfBlock;
import com.mrbysco.rdt.blocks.CrateBlock;
import com.mrbysco.rdt.blocks.GreenPlumberBlock;
import com.mrbysco.rdt.blocks.LawnMowerBlock;
import com.mrbysco.rdt.blocks.RedPlumberBlock;
import com.mrbysco.rdt.blocks.StrawBerryCakeBlock;
import com.mrbysco.rdt.blocks.ToyCastleBlock;
import com.mrbysco.rdt.blocks.villages.BlacksmithVillageBlock;
import com.mrbysco.rdt.blocks.villages.VillageButcherBlock;
import com.mrbysco.rdt.blocks.villages.VillageHut2Block;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RandomRegistry {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);

	public static final RegistryObject<Block> LAWNMOWER = BLOCKS.register("lawnmower", () ->
			new LawnMowerBlock(Block.Properties.of(Material.WOOL, MaterialColor.COLOR_RED).strength(1.0F).sound(SoundType.WOOL)));
	public static final RegistryObject<Block> TOY_CASTLE = BLOCKS.register("toy_castle", () ->
			new ToyCastleBlock(Block.Properties.of(Material.CLAY, MaterialColor.COLOR_LIGHT_GRAY).strength(1.0F).sound(SoundType.STONE)));

	public static final RegistryObject<Block> OAK_CRATE = BLOCKS.register("oak_crate", () -> new CrateBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> SPRUCE_CRATE = BLOCKS.register("spruce_crate", () -> new CrateBlock(Block.Properties.of(Material.WOOD, MaterialColor.PODZOL).strength(3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> BIRCH_CRATE = BLOCKS.register("birch_crate", () -> new CrateBlock(Block.Properties.of(Material.WOOD, MaterialColor.SAND).strength(3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> JUNGLE_CRATE = BLOCKS.register("jungle_crate", () -> new CrateBlock(Block.Properties.of(Material.WOOD, MaterialColor.DIRT).strength(3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> ACACIA_CRATE = BLOCKS.register("acacia_crate", () -> new CrateBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_ORANGE).strength(3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> DARK_OAK_CRATE = BLOCKS.register("dark_oak_crate", () -> new CrateBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN).strength(3.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> OAK_BARREL = BLOCKS.register("oak_barrel", () -> new BarrelBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> SPRUCE_BARREL = BLOCKS.register("spruce_barrel", () -> new BarrelBlock(Block.Properties.of(Material.WOOD, MaterialColor.PODZOL).strength(3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> BIRCH_BARREL = BLOCKS.register("birch_barrel", () -> new BarrelBlock(Block.Properties.of(Material.WOOD, MaterialColor.SAND).strength(3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> JUNGLE_BARREL = BLOCKS.register("jungle_barrel", () -> new BarrelBlock(Block.Properties.of(Material.WOOD, MaterialColor.DIRT).strength(3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> ACACIA_BARREL = BLOCKS.register("acacia_barrel", () -> new BarrelBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_ORANGE).strength(3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> DARK_OAK_BARREL = BLOCKS.register("dark_oak_barrel", () -> new BarrelBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN).strength(3.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> OAK_BOOKSHELF = BLOCKS.register("oak_bookshelf", () -> new BookshelfBlock(Block.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> SPRUCE_BOOKSHELF = BLOCKS.register("spruce_bookshelf", () -> new BookshelfBlock(Block.Properties.of(Material.WOOD, MaterialColor.PODZOL).strength(3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> BIRCH_BOOKSHELF = BLOCKS.register("birch_bookshelf", () -> new BookshelfBlock(Block.Properties.of(Material.WOOD, MaterialColor.SAND).strength(3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> JUNGLE_BOOKSHELF = BLOCKS.register("jungle_bookshelf", () -> new BookshelfBlock(Block.Properties.of(Material.WOOD, MaterialColor.DIRT).strength(3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> ACACIA_BOOKSHELF = BLOCKS.register("acacia_bookshelf", () -> new BookshelfBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_ORANGE).strength(3.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> DARK_OAK_BOOKSHELF = BLOCKS.register("dark_oak_bookshelf", () -> new BookshelfBlock(Block.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN).strength(3.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> STRAWBERRY_CAKE = BLOCKS.register("strawberry_cake", () -> new StrawBerryCakeBlock(Block.Properties.of(Material.CAKE).strength(1.0F).sound(SoundType.WOOL)));
	public static final RegistryObject<Block> RED_PLUMBER = BLOCKS.register("red_plumber", () -> new RedPlumberBlock(Block.Properties.of(Material.CLAY, MaterialColor.COLOR_RED).strength(1.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> GREEN_PLUMBER = BLOCKS.register("green_plumber", () -> new GreenPlumberBlock(Block.Properties.of(Material.CLAY, MaterialColor.COLOR_GREEN).strength(1.0F).sound(SoundType.STONE)));
	public static final RegistryObject<Block> VILLAGE_HUT_2 = BLOCKS.register("village_hut_2", () -> new VillageHut2Block(Block.Properties.of(Material.WOOD).strength(1.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> VILLAGE_BLACKSMITH = BLOCKS.register("village_blacksmith", () -> new BlacksmithVillageBlock(Block.Properties.of(Material.WOOD).strength(1.0F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> VILLAGE_BUTCHER = BLOCKS.register("village_butcher", () -> new VillageButcherBlock(Block.Properties.of(Material.WOOD).strength(1.0F).sound(SoundType.WOOD)));

	public static final RegistryObject<Item> LAWNMOWER_ITEM = ITEMS.register("lawnmower", () -> new BlockItem(LAWNMOWER.get(), itemBuilder()));
	public static final RegistryObject<Item> TOY_CASTLE_ITEM = ITEMS.register("toy_castle", () -> new BlockItem(TOY_CASTLE.get(), itemBuilder()));

	public static final RegistryObject<Item> OAK_CRATE_ITEM = ITEMS.register("oak_crate", () -> new BlockItem(OAK_CRATE.get(), itemBuilder()));
	public static final RegistryObject<Item> SPRUCE_CRATE_ITEM = ITEMS.register("spruce_crate", () -> new BlockItem(SPRUCE_CRATE.get(), itemBuilder()));
	public static final RegistryObject<Item> BIRCH_CRATE_ITEM = ITEMS.register("birch_crate", () -> new BlockItem(BIRCH_CRATE.get(), itemBuilder()));
	public static final RegistryObject<Item> JUNGLE_CRATE_ITEM = ITEMS.register("jungle_crate", () -> new BlockItem(JUNGLE_CRATE.get(), itemBuilder()));
	public static final RegistryObject<Item> ACACIA_CRATE_ITEM = ITEMS.register("acacia_crate", () -> new BlockItem(ACACIA_CRATE.get(), itemBuilder()));
	public static final RegistryObject<Item> DARK_OAK_CRATE_ITEM = ITEMS.register("dark_oak_crate", () -> new BlockItem(DARK_OAK_CRATE.get(), itemBuilder()));

	public static final RegistryObject<Item> OAK_BARREL_ITEM = ITEMS.register("oak_barrel", () -> new BlockItem(OAK_BARREL.get(), itemBuilder()));
	public static final RegistryObject<Item> SPRUCE_BARREL_ITEM = ITEMS.register("spruce_barrel", () -> new BlockItem(SPRUCE_BARREL.get(), itemBuilder()));
	public static final RegistryObject<Item> BIRCH_BARREL_ITEM = ITEMS.register("birch_barrel", () -> new BlockItem(BIRCH_BARREL.get(), itemBuilder()));
	public static final RegistryObject<Item> JUNGLE_BARREL_ITEM = ITEMS.register("jungle_barrel", () -> new BlockItem(JUNGLE_BARREL.get(), itemBuilder()));
	public static final RegistryObject<Item> ACACIA_BARREL_ITEM = ITEMS.register("acacia_barrel", () -> new BlockItem(ACACIA_BARREL.get(), itemBuilder()));
	public static final RegistryObject<Item> DARK_OAK_BARREL_ITEM = ITEMS.register("dark_oak_barrel", () -> new BlockItem(DARK_OAK_BARREL.get(), itemBuilder()));

	public static final RegistryObject<Item> OAK_BOOKSHELF_ITEM = ITEMS.register("oak_bookshelf", () -> new BlockItem(OAK_BOOKSHELF.get(), itemBuilder()));
	public static final RegistryObject<Item> SPRUCE_BOOKSHELF_ITEM = ITEMS.register("spruce_bookshelf", () -> new BlockItem(SPRUCE_BOOKSHELF.get(), itemBuilder()));
	public static final RegistryObject<Item> BIRCH_BOOKSHELF_ITEM = ITEMS.register("birch_bookshelf", () -> new BlockItem(BIRCH_BOOKSHELF.get(), itemBuilder()));
	public static final RegistryObject<Item> JUNGLE_BOOKSHELF_ITEM = ITEMS.register("jungle_bookshelf", () -> new BlockItem(JUNGLE_BOOKSHELF.get(), itemBuilder()));
	public static final RegistryObject<Item> ACACIA_BOOKSHELF_ITEM = ITEMS.register("acacia_bookshelf", () -> new BlockItem(ACACIA_BOOKSHELF.get(), itemBuilder()));
	public static final RegistryObject<Item> DARK_OAK_BOOKSHELF_ITEM = ITEMS.register("dark_oak_bookshelf", () -> new BlockItem(DARK_OAK_BOOKSHELF.get(), itemBuilder()));

	public static final RegistryObject<Item> STRAWBERRY_CAKE_ITEM = ITEMS.register("strawberry_cake", () -> new BlockItem(STRAWBERRY_CAKE.get(), itemBuilder()));
	public static final RegistryObject<Item> RED_PLUMBER_ITEM = ITEMS.register("red_plumber", () -> new BlockItem(RED_PLUMBER.get(), itemBuilder()));
	public static final RegistryObject<Item> GREEN_PLUMBER_ITEM = ITEMS.register("green_plumber", () -> new BlockItem(GREEN_PLUMBER.get(), itemBuilder()));
	public static final RegistryObject<Item> VILLAGE_HUT_2_ITEM = ITEMS.register("village_hut_2", () -> new BlockItem(VILLAGE_HUT_2.get(), itemBuilder()));
	public static final RegistryObject<Item> VILLAGE_BLACKSMITH_ITEM = ITEMS.register("village_blacksmith", () -> new BlockItem(VILLAGE_BLACKSMITH.get(), itemBuilder()));
	public static final RegistryObject<Item> VILLAGE_BUTCHER_ITEM = ITEMS.register("village_butcher", () -> new BlockItem(VILLAGE_BUTCHER.get(), itemBuilder()));

	private static Item.Properties itemBuilder() {
		return new Item.Properties().tab(RandomTabs.MAIN_TAB);
	}
}