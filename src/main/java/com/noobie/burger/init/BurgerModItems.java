
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.noobie.burger.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import java.util.function.Function;

import com.noobie.burger.item.HamburgerItem;
import com.noobie.burger.item.CheeseburgerItem;
import com.noobie.burger.item.CheeseItem;
import com.noobie.burger.BurgerMod;

public class BurgerModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(BurgerMod.MODID);
	public static final DeferredItem<Item> HAMBURGER = register("hamburger", HamburgerItem::new);
	public static final DeferredItem<Item> CHEESE = register("cheese", CheeseItem::new);
	public static final DeferredItem<Item> CHEESEBURGER = register("cheeseburger", CheeseburgerItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}
