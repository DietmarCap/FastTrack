package com.capgemini.fasttrack.impl;

import com.capgemini.fasttrack.Food;
import com.capgemini.fasttrack.Supermarket;

public class Lidl implements Supermarket {

	@Override
	public Food buy(float amount) {
		if (amount <= 0)
			throw new IllegalArgumentException("I need some money!");		
		else if (amount < 10)
			return new Fruit();
		return new Meat();
	}

}
