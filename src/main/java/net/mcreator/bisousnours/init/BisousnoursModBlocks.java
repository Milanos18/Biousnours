
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bisousnours.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.bisousnours.block.MineraideLUBlock;
import net.mcreator.bisousnours.block.GlacageBlock;
import net.mcreator.bisousnours.block.GateauBlock;
import net.mcreator.bisousnours.block.FeuilledebarbapapaBlock;
import net.mcreator.bisousnours.block.Feuilledebarbapapa2Block;
import net.mcreator.bisousnours.block.BoisdebarbapapaBlock;
import net.mcreator.bisousnours.BisousnoursMod;

public class BisousnoursModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BisousnoursMod.MODID);
	public static final RegistryObject<Block> GLACAGE = REGISTRY.register("glacage", () -> new GlacageBlock());
	public static final RegistryObject<Block> GATEAU = REGISTRY.register("gateau", () -> new GateauBlock());
	public static final RegistryObject<Block> MINERAIDE_LU = REGISTRY.register("mineraide_lu", () -> new MineraideLUBlock());
	public static final RegistryObject<Block> BOISDEBARBAPAPA = REGISTRY.register("boisdebarbapapa", () -> new BoisdebarbapapaBlock());
	public static final RegistryObject<Block> FEUILLEDEBARBAPAPA = REGISTRY.register("feuilledebarbapapa", () -> new FeuilledebarbapapaBlock());
	public static final RegistryObject<Block> FEUILLEDEBARBAPAPA_2 = REGISTRY.register("feuilledebarbapapa_2", () -> new Feuilledebarbapapa2Block());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
		}

		@SubscribeEvent
		public static void blockColorLoad(ColorHandlerEvent.Block event) {
			GlacageBlock.blockColorLoad(event);
		}
	}
}
