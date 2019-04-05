package com.capgemini.fasttrack.impl;

import com.capgemini.fasttrack.Creature;
import com.capgemini.fasttrack.Food;

public abstract class AbstractCreature implements Creature {
	
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void eat(Food food) {
		// TODO Auto-generated method stub

	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub

	}

}
