package net.mcreator.virolia;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvirolia.ModElement.Tag
public class MCreatorToreinumOreSmelting extends Elementsvirolia.ModElement {
	public MCreatorToreinumOreSmelting(Elementsvirolia instance) {
		super(instance, 17);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorToreinumOre.block, (int) (1)), new ItemStack(MCreatorToreinumIngot.block, (int) (1)), 0.7F);
	}
}
