
package com.noobie.burger.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CheeseburgerItem extends Item {
	public CheeseburgerItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64).food((new FoodProperties.Builder()).nutrition(6).saturationModifier(6.6f).build()));
	}
}
