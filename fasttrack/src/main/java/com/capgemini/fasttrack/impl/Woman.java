package com.capgemini.fasttrack.impl;

import com.capgemini.fasttrack.Human;

public class Woman extends AbstractHuman implements Human {

	@Override
	public String speak() {
		return "Hello my name is " + getName();
	}
}
