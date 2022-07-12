
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bisousnours.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.Items;

@Mod.EventBusSubscriber
public class BisousnoursModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == Items.SUGAR)
			event.setBurnTime(9000);
	}
}
