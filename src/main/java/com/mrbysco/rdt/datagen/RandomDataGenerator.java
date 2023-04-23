package com.mrbysco.rdt.datagen;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mrbysco.rdt.Reference;
import com.mrbysco.rdt.init.RandomRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.LootTable.Builder;
import net.minecraft.world.level.storage.loot.LootTables;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RandomDataGenerator {
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
		ExistingFileHelper helper = event.getExistingFileHelper();

		if (event.includeServer()) {
			generator.addProvider(new Loots(generator));
		}
		if (event.includeClient()) {
			generator.addProvider(new Language(generator));
//			generator.addProvider(new BlockStates(generator, helper));
			generator.addProvider(new ItemModels(generator, helper));
		}
	}

	private static class Loots extends LootTableProvider {
		public Loots(DataGenerator gen) {
			super(gen);
		}

		@Override
		protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, Builder>>>, LootContextParamSet>> getTables() {
			return ImmutableList.of(Pair.of(ForceBlocks::new, LootContextParamSets.BLOCK));
		}

		@Override
		protected void validate(Map<ResourceLocation, LootTable> map, ValidationContext validationtracker) {
			map.forEach((name, table) -> LootTables.validate(validationtracker, name, table));
		}

		private class ForceBlocks extends BlockLoot {
			@Override
			protected void addTables() {
				dropSelf(RandomRegistry.LAWNMOWER.get());
				dropSelf(RandomRegistry.TOY_CASTLE.get());

				dropSelf(RandomRegistry.OAK_CRATE.get());
				dropSelf(RandomRegistry.SPRUCE_CRATE.get());
				dropSelf(RandomRegistry.BIRCH_CRATE.get());
				dropSelf(RandomRegistry.JUNGLE_CRATE.get());
				dropSelf(RandomRegistry.ACACIA_CRATE.get());
				dropSelf(RandomRegistry.DARK_OAK_CRATE.get());

				dropSelf(RandomRegistry.OAK_BARREL.get());
				dropSelf(RandomRegistry.SPRUCE_BARREL.get());
				dropSelf(RandomRegistry.BIRCH_BARREL.get());
				dropSelf(RandomRegistry.JUNGLE_BARREL.get());
				dropSelf(RandomRegistry.ACACIA_BARREL.get());
				dropSelf(RandomRegistry.DARK_OAK_BARREL.get());

				add(RandomRegistry.OAK_BOOKSHELF.get(), (bookshelf) -> createSingleItemTableWithSilkTouch(bookshelf, Items.BOOK, ConstantValue.exactly(3)));
				add(RandomRegistry.SPRUCE_BOOKSHELF.get(), (bookshelf) -> createSingleItemTableWithSilkTouch(bookshelf, Items.BOOK, ConstantValue.exactly(3)));
				add(RandomRegistry.BIRCH_BOOKSHELF.get(), (bookshelf) -> createSingleItemTableWithSilkTouch(bookshelf, Items.BOOK, ConstantValue.exactly(3)));
				add(RandomRegistry.JUNGLE_BOOKSHELF.get(), (bookshelf) -> createSingleItemTableWithSilkTouch(bookshelf, Items.BOOK, ConstantValue.exactly(3)));
				add(RandomRegistry.ACACIA_BOOKSHELF.get(), (bookshelf) -> createSingleItemTableWithSilkTouch(bookshelf, Items.BOOK, ConstantValue.exactly(3)));
				add(RandomRegistry.DARK_OAK_BOOKSHELF.get(), (bookshelf) -> createSingleItemTableWithSilkTouch(bookshelf, Items.BOOK, ConstantValue.exactly(3)));

				dropSelf(RandomRegistry.STRAWBERRY_CAKE.get());
				dropSelf(RandomRegistry.RED_PLUMBER.get());
				dropSelf(RandomRegistry.GREEN_PLUMBER.get());
				dropSelf(RandomRegistry.VILLAGE_HUT_2.get());
				dropSelf(RandomRegistry.VILLAGE_BLACKSMITH.get());
				dropSelf(RandomRegistry.VILLAGE_BUTCHER.get());
			}

			@Override
			protected Iterable<Block> getKnownBlocks() {
				return (Iterable<Block>) RandomRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
			}
		}
	}

	private static class Language extends LanguageProvider {
		public Language(DataGenerator gen) {
			super(gen, Reference.MOD_ID, "en_us");
		}

		@Override
		protected void addTranslations() {
			add("itemGroup.randomdecorativethings", "Random Decorative Things");

			add(RandomRegistry.LAWNMOWER.get(), "Lawnmower");
			add(RandomRegistry.TOY_CASTLE.get(), "Toy Castle");

			add(RandomRegistry.OAK_CRATE.get(), "Oak Crate");
			add(RandomRegistry.SPRUCE_CRATE.get(), "Spruce Crate");
			add(RandomRegistry.BIRCH_CRATE.get(), "Birch Crate");
			add(RandomRegistry.JUNGLE_CRATE.get(), "Jungle Crate");
			add(RandomRegistry.ACACIA_CRATE.get(), "Acacia Crate");
			add(RandomRegistry.DARK_OAK_CRATE.get(), "Dark Oak Crate");

			add(RandomRegistry.OAK_BARREL.get(), "Oak Barrel");
			add(RandomRegistry.SPRUCE_BARREL.get(), "Spruce Barrel");
			add(RandomRegistry.BIRCH_BARREL.get(), "Birch Barrel");
			add(RandomRegistry.JUNGLE_BARREL.get(), "Jungle Barrel");
			add(RandomRegistry.ACACIA_BARREL.get(), "Acacia Barrel");
			add(RandomRegistry.DARK_OAK_BARREL.get(), "Dark Oak Barrel");

			add(RandomRegistry.OAK_BOOKSHELF.get(), "Oak Bookshelf");
			add(RandomRegistry.SPRUCE_BOOKSHELF.get(), "Spruce Bookshelf");
			add(RandomRegistry.BIRCH_BOOKSHELF.get(), "Birch Bookshelf");
			add(RandomRegistry.JUNGLE_BOOKSHELF.get(), "Jungle Bookshelf");
			add(RandomRegistry.ACACIA_BOOKSHELF.get(), "Acacia Bookshelf");
			add(RandomRegistry.DARK_OAK_BOOKSHELF.get(), "Dark Oak Bookshelf");

			add(RandomRegistry.STRAWBERRY_CAKE.get(), "Strawberry Cake");
			add(RandomRegistry.RED_PLUMBER.get(), "Red Plumber");
			add(RandomRegistry.GREEN_PLUMBER.get(), "Green Plumber");
			add(RandomRegistry.VILLAGE_HUT_2.get(), "Village Hut 2");
			add(RandomRegistry.VILLAGE_BLACKSMITH.get(), "Village Blacksmith");
			add(RandomRegistry.VILLAGE_BUTCHER.get(), "Village Butcher");
		}
	}

	private static class ItemModels extends ItemModelProvider {
		public ItemModels(DataGenerator gen, ExistingFileHelper helper) {
			super(gen, Reference.MOD_ID, helper);
		}

		@Override
		protected void registerModels() {
			withExistingParent("lawnmower", modLoc("block/lawnmower"));
			withExistingParent("toy_castle", modLoc("block/toy_castle"));

			withExistingParent("oak_crate", modLoc("block/oak_crate"));
			withExistingParent("spruce_crate", modLoc("block/spruce_crate"));
			withExistingParent("birch_crate", modLoc("block/birch_crate"));
			withExistingParent("jungle_crate", modLoc("block/jungle_crate"));
			withExistingParent("acacia_crate", modLoc("block/acacia_crate"));
			withExistingParent("dark_oak_crate", modLoc("block/dark_oak_crate"));

			withExistingParent("oak_barrel", modLoc("block/oak_barrel"));
			withExistingParent("spruce_barrel", modLoc("block/spruce_barrel"));
			withExistingParent("birch_barrel", modLoc("block/birch_barrel"));
			withExistingParent("jungle_barrel", modLoc("block/jungle_barrel"));
			withExistingParent("acacia_barrel", modLoc("block/acacia_barrel"));
			withExistingParent("dark_oak_barrel", modLoc("block/dark_oak_barrel"));

			withExistingParent("oak_bookshelf", modLoc("block/oak_bookshelf"));
			withExistingParent("spruce_bookshelf", modLoc("block/spruce_bookshelf"));
			withExistingParent("birch_bookshelf", modLoc("block/birch_bookshelf"));
			withExistingParent("jungle_bookshelf", modLoc("block/jungle_bookshelf"));
			withExistingParent("acacia_bookshelf", modLoc("block/acacia_bookshelf"));
			withExistingParent("dark_oak_bookshelf", modLoc("block/dark_oak_bookshelf"));

			withExistingParent("strawberry_cake", modLoc("block/strawberry_cake"));
			withExistingParent("red_plumber", modLoc("block/red_plumber"));
			withExistingParent("green_plumber", modLoc("block/green_plumber"));
			withExistingParent("village_hut_2", modLoc("block/village_hut_2"));
			withExistingParent("village_blacksmith", modLoc("block/village_blacksmith"));
			withExistingParent("village_butcher", modLoc("block/village_butcher"));
		}

		@Override
		public String getName() {
			return "Item Models";
		}
	}
}
