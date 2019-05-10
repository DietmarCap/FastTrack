package com.capgemini.fasttrack.impl;

import com.capgemini.fasttrack.Food;
import com.capgemini.fasttrack.Human;
import com.capgemini.fasttrack.Supermarket;

public class Woman extends AbstractHuman implements Human {
	private Supermarket shop;
	private float budget = 100;
	
	public Woman(Supermarket shop) {	
		this.shop = shop; 
	}
	
	@Override
	public String speak() {
		return "Hello my name is " + getName();
	}
	
	public Food cooking(float amount) {
		if (budget < amount) 
			throw new IllegalArgumentException ("Your budget is to low.");
		budget -= amount;
		return shop.buy(amount);
	}
}
