package com.capgemini.fasttrack.impl;

import com.capgemini.fasttrack.Food;
import com.capgemini.fasttrack.Human;

public class AbstractHuman implements Human {
	
	private String name = "unknown";

	@Override
	public void eat(Food food) {
		// TODO Auto-generated method stub

	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub

	}

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Food cooking(float amount) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
