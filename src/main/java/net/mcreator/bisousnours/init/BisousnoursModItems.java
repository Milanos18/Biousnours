
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bisousnours.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.bisousnours.item.SucetteItem;
import net.mcreator.bisousnours.BisousnoursMod;

public class BisousnoursModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BisousnoursMod.MODID);
	public static final RegistryObject<Item> GLACAGE = block(BisousnoursModBlocks.GLACAGE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> GATEAU = block(BisousnoursModBlocks.GATEAU, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MINERAIDE_LU = block(BisousnoursModBlocks.MINERAIDE_LU, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BOISDEBARBAPAPA = block(BisousnoursModBlocks.BOISDEBARBAPAPA, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FEUILLEDEBARBAPAPA = block(BisousnoursModBlocks.FEUILLEDEBARBAPAPA, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> FEUILLEDEBARBAPAPA_2 = block(BisousnoursModBlocks.FEUILLEDEBARBAPAPA_2,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MINERAIDEMAOAM = block(BisousnoursModBlocks.MINERAIDEMAOAM, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SUCETTE = REGISTRY.register("sucette", () -> new SucetteItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
