
package net.mcreator.modemachine.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.modemachine.itemgroup.MineraiItemGroup;
import net.mcreator.modemachine.ModemachineModElements;

@ModemachineModElements.ModElement.Tag
public class ZincIngotItem extends ModemachineModElements.ModElement {
	@ObjectHolder("modemachine:zinc_ingot")
	public static final Item block = null;
	public ZincIngotItem(ModemachineModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MineraiItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("zinc_ingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
