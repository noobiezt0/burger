
package com.noobie.burger.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CheeseItem extends Item {
	public CheeseItem(Item.Properties properties) {
		super(properties.rarity(Rarity.COMMON).stacksTo(64).food((new FoodProperties.Builder()).nutrition(3).saturationModifier(1.7f).build()));
	}
}
