
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.medievaladventures.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.medievaladventures.MedievalAdventuresMod;

public class MedievalAdventuresModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MedievalAdventuresMod.MODID);
	public static final RegistryObject<CreativeModeTab> MEDIEVAL_ADVENTURES = REGISTRY.register("medieval_adventures",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.medieval_adventures.medieval_adventures")).icon(() -> new ItemStack(MedievalAdventuresModBlocks.STONEY_GRAVEL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MedievalAdventuresModBlocks.STONEY_GRAVEL.get().asItem());
			})

					.build());
}
