
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.medievaladventures.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.medievaladventures.block.StoneyGravelBlock;
import net.mcreator.medievaladventures.MedievalAdventuresMod;

public class MedievalAdventuresModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MedievalAdventuresMod.MODID);
	public static final RegistryObject<Block> STONEY_GRAVEL = REGISTRY.register("stoney_gravel", () -> new StoneyGravelBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
