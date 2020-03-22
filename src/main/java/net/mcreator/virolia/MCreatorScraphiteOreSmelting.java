package net.mcreator.virolia;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsvirolia.ModElement.Tag
public class MCreatorScraphiteOreSmelting extends Elementsvirolia.ModElement {
	public MCreatorScraphiteOreSmelting(Elementsvirolia instance) {
		super(instance, 6);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorScraphiteOre.block, (int) (1)), new ItemStack(MCreatorScraphite.block, (int) (1)),
				1.0499999999999998F);
	}
}
