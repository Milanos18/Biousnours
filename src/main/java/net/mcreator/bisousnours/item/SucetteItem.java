
package net.mcreator.bisousnours.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.bisousnours.init.BisousnoursModItems;

public class SucetteItem extends PickaxeItem {
	public SucetteItem() {
		super(new Tier() {
			public int getUses() {
				return 1000;
			}

			public float getSpeed() {
				return 20f;
			}

			public float getAttackDamageBonus() {
				return 22221.9f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 50000;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BisousnoursModItems.SUCETTE.get()));
			}
		}, 1, 96f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
