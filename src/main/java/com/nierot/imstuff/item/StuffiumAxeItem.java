
package com.nierot.imstuff.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import com.nierot.imstuff.itemgroup.ImStuffItemGroup;
import com.nierot.imstuff.ImstuffModElements;

@ImstuffModElements.ModElement.Tag
public class StuffiumAxeItem extends ImstuffModElements.ModElement {
	@ObjectHolder("imstuff:stuffium_axe")
	public static final Item block = null;
	public StuffiumAxeItem(ImstuffModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1221;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 7f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 30;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(StuffiumIngotItem.block, (int) (1)));
			}
		}, 1, -3.1f, new Item.Properties().group(ImStuffItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("stuffium_axe"));
	}
}
