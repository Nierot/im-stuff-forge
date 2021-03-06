
package com.nierot.imstuff.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import com.nierot.imstuff.itemgroup.ImStuffItemGroup;
import com.nierot.imstuff.ImstuffModElements;

@ImstuffModElements.ModElement.Tag
public class StuffiumShovelItem extends ImstuffModElements.ModElement {
	@ObjectHolder("imstuff:stuffium_shovel")
	public static final Item block = null;
	public StuffiumShovelItem(ImstuffModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 1221;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 30;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(StuffiumIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ImStuffItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("stuffium_shovel"));
	}
}
