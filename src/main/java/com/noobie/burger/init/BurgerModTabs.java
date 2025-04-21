
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.noobie.burger.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import com.noobie.burger.BurgerMod;

public class BurgerModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BurgerMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BURGERS_TAB = REGISTRY.register("burgers_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.burger.burgers_tab")).icon(() -> new ItemStack(BurgerModItems.CHEESEBURGER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BurgerModItems.HAMBURGER.get());
				tabData.accept(BurgerModItems.CHEESE.get());
				tabData.accept(BurgerModItems.CHEESEBURGER.get());
			}).build());
}
