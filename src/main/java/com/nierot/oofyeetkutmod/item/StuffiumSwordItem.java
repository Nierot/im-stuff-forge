
package com.nierot.oofyeetkutmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import com.nierot.oofyeetkutmod.itemgroup.ImStuffItemGroup;
import com.nierot.oofyeetkutmod.OofyeetkutmodModElements;

@OofyeetkutmodModElements.ModElement.Tag
public class StuffiumSwordItem extends OofyeetkutmodModElements.ModElement {
	@ObjectHolder("oofyeetkutmod:stuffium_sword")
	public static final Item block = null;
	public StuffiumSwordItem(OofyeetkutmodModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1221;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 4.5f;
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
		}, 3, -2.4f, new Item.Properties().group(ImStuffItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("stuffium_sword"));
	}
}
