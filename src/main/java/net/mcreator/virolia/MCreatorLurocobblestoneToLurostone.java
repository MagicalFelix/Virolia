package net.mcreator.virolia;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvirolia.ModElement.Tag
public class MCreatorLurocobblestoneToLurostone extends Elementsvirolia.ModElement {
	public MCreatorLurocobblestoneToLurostone(Elementsvirolia instance) {
		super(instance, 11);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorLurocobblestone.block, (int) (1)), new ItemStack(MCreatorLurostone.block, (int) (1)), 0.5F);
	}
}
