package net.mcreator.virolia;

import net.minecraft.item.ItemStack;

@Elementsvirolia.ModElement.Tag
public class MCreatorScraphiteFuel extends Elementsvirolia.ModElement {
	public MCreatorScraphiteFuel(Elementsvirolia instance) {
		super(instance, 9);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(MCreatorScraphite.block, (int) (1)).getItem())
			return 500;
		return 0;
	}
}
