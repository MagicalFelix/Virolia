package net.mcreator.virolia;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.IBlockAccess;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

@Elementsvirolia.ModElement.Tag
public class MCreatorToreinumOreBlock extends Elementsvirolia.ModElement {
	@GameRegistry.ObjectHolder("virolia:toreinumoreblock")
	public static final Block block = null;

	public MCreatorToreinumOreBlock(Elementsvirolia instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom());
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("virolia:toreinumoreblock", "inventory"));
	}

	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.IRON);
			setRegistryName("toreinumoreblock");
			setUnlocalizedName("toreinumoreblock");
			setSoundType(SoundType.METAL);
			setHarvestLevel("pickaxe", 2);
			setHardness(5F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		}

		@Override
		public boolean isBeaconBase(IBlockAccess worldObj, BlockPos pos, BlockPos beacon) {
			return true;
		}
	}
}
