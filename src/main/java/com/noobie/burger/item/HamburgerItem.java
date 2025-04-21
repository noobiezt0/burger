
package com.noobie.burger.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class HamburgerItem extends Item {
	public HamburgerItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64).food((new FoodProperties.Builder()).nutrition(5).saturationModifier(6.3f).build()));
	}
}
