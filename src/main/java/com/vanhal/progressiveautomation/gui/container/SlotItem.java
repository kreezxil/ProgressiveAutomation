package com.vanhal.progressiveautomation.gui.container;

import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SlotItem extends Slot {
	protected ItemStack slotItem;
	
	public SlotItem(ItemStack baseItem, IInventory par1iInventory, int par2, int par3, int par4) {
		super(par1iInventory, par2, par3, par4);
		slotItem = baseItem;
	}

	public boolean isItemValid(ItemStack itemStack) {
		return slotItem.isItemEqual(itemStack);
	}
}
