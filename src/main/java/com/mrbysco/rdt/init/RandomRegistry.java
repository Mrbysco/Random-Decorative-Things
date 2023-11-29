package com.mrbysco.rdt.init;

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
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;
import java.util.function.Supplier;

public class RandomRegistry {
	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Reference.MOD_ID);
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Reference.MOD_ID);
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Reference.MOD_ID);

	public static final DeferredBlock<LawnMowerBlock> LAWNMOWER = BLOCKS.register("lawnmower", () ->
			new LawnMowerBlock(Block.Properties.of().mapColor(MapColor.COLOR_RED).destroyTime(1.0F).sound(SoundType.STONE)));
	public static final DeferredBlock<ToyCastleBlock> TOY_CASTLE = BLOCKS.register("toy_castle", () ->
			new ToyCastleBlock(Block.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).destroyTime(1.0F).sound(SoundType.STONE)));

	public static final DeferredBlock<CrateBlock> OAK_CRATE = BLOCKS.register("oak_crate", () -> new CrateBlock(Block.Properties.copy(Blocks.OAK_PLANKS).destroyTime(3.0F).sound(SoundType.WOOD)));
	public static final DeferredBlock<CrateBlock> SPRUCE_CRATE = BLOCKS.register("spruce_crate", () -> new CrateBlock(Block.Properties.copy(Blocks.SPRUCE_PLANKS).destroyTime(3.0F).sound(SoundType.WOOD)));
	public static final DeferredBlock<CrateBlock> BIRCH_CRATE = BLOCKS.register("birch_crate", () -> new CrateBlock(Block.Properties.copy(Blocks.BIRCH_PLANKS).destroyTime(3.0F).sound(SoundType.WOOD)));
	public static final DeferredBlock<CrateBlock> JUNGLE_CRATE = BLOCKS.register("jungle_crate", () -> new CrateBlock(Block.Properties.copy(Blocks.JUNGLE_PLANKS).destroyTime(3.0F).sound(SoundType.WOOD)));
	public static final DeferredBlock<CrateBlock> ACACIA_CRATE = BLOCKS.register("acacia_crate", () -> new CrateBlock(Block.Properties.copy(Blocks.ACACIA_PLANKS).destroyTime(3.0F).sound(SoundType.WOOD)));
	public static final DeferredBlock<CrateBlock> DARK_OAK_CRATE = BLOCKS.register("dark_oak_crate", () -> new CrateBlock(Block.Properties.copy(Blocks.DARK_OAK_PLANKS).destroyTime(3.0F).sound(SoundType.WOOD)));
	public static final DeferredBlock<CrateBlock> MANGROVE_CRATE = BLOCKS.register("mangrove_crate", () -> new CrateBlock(Block.Properties.copy(Blocks.MANGROVE_PLANKS).destroyTime(3.0F).sound(SoundType.WOOD)));
	public static final DeferredBlock<CrateBlock> CHERRY_CRATE = BLOCKS.register("cherry_crate", () -> new CrateBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS).destroyTime(3.0F).sound(SoundType.WOOD)));

	public static final DeferredBlock<BarrelBlock> OAK_BARREL = BLOCKS.register("oak_barrel", () -> new BarrelBlock(Block.Properties.copy(Blocks.OAK_PLANKS).destroyTime(3.0F).sound(SoundType.WOOD)));
	public static final DeferredBlock<BarrelBlock> SPRUCE_BARREL = BLOCKS.register("spruce_barrel", () -> new BarrelBlock(Block.Properties.copy(Blocks.SPRUCE_PLANKS).destroyTime(3.0F).sound(SoundType.WOOD)));
	public static final DeferredBlock<BarrelBlock> BIRCH_BARREL = BLOCKS.register("birch_barrel", () -> new BarrelBlock(Block.Properties.copy(Blocks.BIRCH_PLANKS).destroyTime(3.0F).sound(SoundType.WOOD)));
	public static final DeferredBlock<BarrelBlock> JUNGLE_BARREL = BLOCKS.register("jungle_barrel", () -> new BarrelBlock(Block.Properties.copy(Blocks.JUNGLE_PLANKS).destroyTime(3.0F).sound(SoundType.WOOD)));
	public static final DeferredBlock<BarrelBlock> ACACIA_BARREL = BLOCKS.register("acacia_barrel", () -> new BarrelBlock(Block.Properties.copy(Blocks.ACACIA_PLANKS).destroyTime(3.0F).sound(SoundType.WOOD)));
	public static final DeferredBlock<BarrelBlock> DARK_OAK_BARREL = BLOCKS.register("dark_oak_barrel", () -> new BarrelBlock(Block.Properties.copy(Blocks.DARK_OAK_PLANKS).destroyTime(3.0F).sound(SoundType.WOOD)));
	public static final DeferredBlock<BarrelBlock> MANGROVE_BARREL = BLOCKS.register("mangrove_barrel", () -> new BarrelBlock(Block.Properties.copy(Blocks.MANGROVE_PLANKS).destroyTime(3.0F).sound(SoundType.WOOD)));
	public static final DeferredBlock<BarrelBlock> CHERRY_BARREL = BLOCKS.register("cherry_barrel", () -> new BarrelBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS).destroyTime(3.0F).sound(SoundType.WOOD)));

	public static final DeferredBlock<BookshelfBlock> OAK_BOOKSHELF = BLOCKS.register("oak_bookshelf", () -> new BookshelfBlock(Block.Properties.copy(Blocks.OAK_PLANKS).destroyTime(3.0F).sound(SoundType.WOOD)));
	public static final DeferredBlock<BookshelfBlock> SPRUCE_BOOKSHELF = BLOCKS.register("spruce_bookshelf", () -> new BookshelfBlock(Block.Properties.copy(Blocks.SPRUCE_PLANKS).destroyTime(3.0F).sound(SoundType.WOOD)));
	public static final DeferredBlock<BookshelfBlock> BIRCH_BOOKSHELF = BLOCKS.register("birch_bookshelf", () -> new BookshelfBlock(Block.Properties.copy(Blocks.BIRCH_PLANKS).destroyTime(3.0F).sound(SoundType.WOOD)));
	public static final DeferredBlock<BookshelfBlock> JUNGLE_BOOKSHELF = BLOCKS.register("jungle_bookshelf", () -> new BookshelfBlock(Block.Properties.copy(Blocks.JUNGLE_PLANKS).destroyTime(3.0F).sound(SoundType.WOOD)));
	public static final DeferredBlock<BookshelfBlock> ACACIA_BOOKSHELF = BLOCKS.register("acacia_bookshelf", () -> new BookshelfBlock(Block.Properties.copy(Blocks.ACACIA_PLANKS).destroyTime(3.0F).sound(SoundType.WOOD)));
	public static final DeferredBlock<BookshelfBlock> DARK_OAK_BOOKSHELF = BLOCKS.register("dark_oak_bookshelf", () -> new BookshelfBlock(Block.Properties.copy(Blocks.DARK_OAK_PLANKS).destroyTime(3.0F).sound(SoundType.WOOD)));
	public static final DeferredBlock<BookshelfBlock> MANGROVE_BOOKSHELF = BLOCKS.register("mangrove_bookshelf", () -> new BookshelfBlock(Block.Properties.copy(Blocks.MANGROVE_PLANKS).destroyTime(3.0F).sound(SoundType.WOOD)));
	public static final DeferredBlock<BookshelfBlock> CHERRY_BOOKSHELF = BLOCKS.register("cherry_bookshelf", () -> new BookshelfBlock(Block.Properties.copy(Blocks.CHERRY_PLANKS).destroyTime(3.0F).sound(SoundType.WOOD)));

	public static final DeferredBlock<StrawBerryCakeBlock> STRAWBERRY_CAKE = BLOCKS.register("strawberry_cake", () -> new StrawBerryCakeBlock(Block.Properties.copy(Blocks.CAKE).destroyTime(1.0F).sound(SoundType.WOOL)));
	public static final DeferredBlock<RedPlumberBlock> RED_PLUMBER = BLOCKS.register("red_plumber", () -> new RedPlumberBlock(Block.Properties.of().mapColor(MapColor.COLOR_RED).destroyTime(1.0F).sound(SoundType.STONE)));
	public static final DeferredBlock<GreenPlumberBlock> GREEN_PLUMBER = BLOCKS.register("green_plumber", () -> new GreenPlumberBlock(Block.Properties.of().mapColor(MapColor.COLOR_GREEN).destroyTime(1.0F).sound(SoundType.STONE)));
	public static final DeferredBlock<VillageHut2Block> VILLAGE_HUT_2 = BLOCKS.register("village_hut_2", () -> new VillageHut2Block(Block.Properties.copy(Blocks.OAK_PLANKS).destroyTime(1.0F).sound(SoundType.WOOD)));
	public static final DeferredBlock<BlacksmithVillageBlock> VILLAGE_BLACKSMITH = BLOCKS.register("village_blacksmith", () -> new BlacksmithVillageBlock(Block.Properties.copy(Blocks.OAK_PLANKS).destroyTime(1.0F).sound(SoundType.WOOD)));
	public static final DeferredBlock<VillageButcherBlock> VILLAGE_BUTCHER = BLOCKS.register("village_butcher", () -> new VillageButcherBlock(Block.Properties.copy(Blocks.OAK_PLANKS).destroyTime(1.0F).sound(SoundType.WOOD)));

	public static final DeferredItem<BlockItem> LAWNMOWER_ITEM = ITEMS.registerSimpleBlockItem(LAWNMOWER);
	public static final DeferredItem<BlockItem> TOY_CASTLE_ITEM = ITEMS.registerSimpleBlockItem(TOY_CASTLE);

	public static final DeferredItem<BlockItem> OAK_CRATE_ITEM = ITEMS.registerSimpleBlockItem(OAK_CRATE);
	public static final DeferredItem<BlockItem> SPRUCE_CRATE_ITEM = ITEMS.registerSimpleBlockItem(SPRUCE_CRATE);
	public static final DeferredItem<BlockItem> BIRCH_CRATE_ITEM = ITEMS.registerSimpleBlockItem(BIRCH_CRATE);
	public static final DeferredItem<BlockItem> JUNGLE_CRATE_ITEM = ITEMS.registerSimpleBlockItem(JUNGLE_CRATE);
	public static final DeferredItem<BlockItem> ACACIA_CRATE_ITEM = ITEMS.registerSimpleBlockItem(ACACIA_CRATE);
	public static final DeferredItem<BlockItem> DARK_OAK_CRATE_ITEM = ITEMS.registerSimpleBlockItem(DARK_OAK_CRATE);
	public static final DeferredItem<BlockItem> MANGROVE_CRATE_ITEM = ITEMS.registerSimpleBlockItem(MANGROVE_CRATE);
	public static final DeferredItem<BlockItem> CHERRY_CRATE_ITEM = ITEMS.registerSimpleBlockItem(CHERRY_CRATE);

	public static final DeferredItem<BlockItem> OAK_BARREL_ITEM = ITEMS.registerSimpleBlockItem(OAK_BARREL);
	public static final DeferredItem<BlockItem> SPRUCE_BARREL_ITEM = ITEMS.registerSimpleBlockItem(SPRUCE_BARREL);
	public static final DeferredItem<BlockItem> BIRCH_BARREL_ITEM = ITEMS.registerSimpleBlockItem(BIRCH_BARREL);
	public static final DeferredItem<BlockItem> JUNGLE_BARREL_ITEM = ITEMS.registerSimpleBlockItem(JUNGLE_BARREL);
	public static final DeferredItem<BlockItem> ACACIA_BARREL_ITEM = ITEMS.registerSimpleBlockItem(ACACIA_BARREL);
	public static final DeferredItem<BlockItem> DARK_OAK_BARREL_ITEM = ITEMS.registerSimpleBlockItem(DARK_OAK_BARREL);
	public static final DeferredItem<BlockItem> MANGROVE_BARREL_ITEM = ITEMS.registerSimpleBlockItem(MANGROVE_BARREL);
	public static final DeferredItem<BlockItem> CHERRY_BARREL_ITEM = ITEMS.registerSimpleBlockItem(CHERRY_BARREL);

	public static final DeferredItem<BlockItem> OAK_BOOKSHELF_ITEM = ITEMS.registerSimpleBlockItem(OAK_BOOKSHELF);
	public static final DeferredItem<BlockItem> SPRUCE_BOOKSHELF_ITEM = ITEMS.registerSimpleBlockItem(SPRUCE_BOOKSHELF);
	public static final DeferredItem<BlockItem> BIRCH_BOOKSHELF_ITEM = ITEMS.registerSimpleBlockItem(BIRCH_BOOKSHELF);
	public static final DeferredItem<BlockItem> JUNGLE_BOOKSHELF_ITEM = ITEMS.registerSimpleBlockItem(JUNGLE_BOOKSHELF);
	public static final DeferredItem<BlockItem> ACACIA_BOOKSHELF_ITEM = ITEMS.registerSimpleBlockItem(ACACIA_BOOKSHELF);
	public static final DeferredItem<BlockItem> DARK_OAK_BOOKSHELF_ITEM = ITEMS.registerSimpleBlockItem(DARK_OAK_BOOKSHELF);
	public static final DeferredItem<BlockItem> MANGROVE_BOOKSHELF_ITEM = ITEMS.registerSimpleBlockItem(MANGROVE_BOOKSHELF);
	public static final DeferredItem<BlockItem> CHERRY_BOOKSHELF_ITEM = ITEMS.registerSimpleBlockItem(CHERRY_BOOKSHELF);

	public static final DeferredItem<BlockItem> STRAWBERRY_CAKE_ITEM = ITEMS.registerSimpleBlockItem(STRAWBERRY_CAKE);
	public static final DeferredItem<BlockItem> RED_PLUMBER_ITEM = ITEMS.registerSimpleBlockItem(RED_PLUMBER);
	public static final DeferredItem<BlockItem> GREEN_PLUMBER_ITEM = ITEMS.registerSimpleBlockItem(GREEN_PLUMBER);
	public static final DeferredItem<BlockItem> VILLAGE_HUT_2_ITEM = ITEMS.registerSimpleBlockItem(VILLAGE_HUT_2);
	public static final DeferredItem<BlockItem> VILLAGE_BLACKSMITH_ITEM = ITEMS.registerSimpleBlockItem(VILLAGE_BLACKSMITH);
	public static final DeferredItem<BlockItem> VILLAGE_BUTCHER_ITEM = ITEMS.registerSimpleBlockItem(VILLAGE_BUTCHER);


	public static final Supplier<CreativeModeTab> MAIN_TAB = CREATIVE_MODE_TABS.register("tab", () -> CreativeModeTab.builder()
			.icon(() -> new ItemStack(RandomRegistry.VILLAGE_BUTCHER.get()))
			.withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
			.title(Component.translatable("itemGroup.randomdecorativethings"))
			.displayItems((displayParameters, output) -> {
				List<ItemStack> stacks = RandomRegistry.ITEMS.getEntries().stream()
						.map(reg -> new ItemStack(reg.get())).toList();
				output.acceptAll(stacks);
			}).build());
}