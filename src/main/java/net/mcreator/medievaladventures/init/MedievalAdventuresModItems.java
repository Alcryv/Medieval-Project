
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.medievaladventures.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.medievaladventures.item.TestItem;
import net.mcreator.medievaladventures.MedievalAdventuresMod;

public class MedievalAdventuresModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MedievalAdventuresMod.MODID);
	public static final RegistryObject<Item> TEST = REGISTRY.register("test", () -> new TestItem());
	// Start of user code block custom items
	// End of user code block custom items
}
