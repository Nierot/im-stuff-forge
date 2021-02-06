
package com.nierot.imstuff.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import com.nierot.imstuff.item.StuffiumIngotItem;
import com.nierot.imstuff.ImstuffModElements;

@ImstuffModElements.ModElement.Tag
public class ImStuffItemGroup extends ImstuffModElements.ModElement {
	public ImStuffItemGroup(ImstuffModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabim_stuff") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(StuffiumIngotItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
