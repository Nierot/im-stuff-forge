
package com.nierot.imstuff.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import com.nierot.imstuff.itemgroup.ImStuffItemGroup;
import com.nierot.imstuff.ImstuffModElements;

@ImstuffModElements.ModElement.Tag
public class StaatsMogoolSteenItem extends ImstuffModElements.ModElement {
	@ObjectHolder("imstuff:staats_mogool_steen")
	public static final Item block = null;
	public StaatsMogoolSteenItem(ImstuffModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, ImstuffModElements.sounds.get(new ResourceLocation("imstuff:steen_staats-mongool")),
					new Item.Properties().group(ImStuffItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("staats_mogool_steen");
		}
	}
}
