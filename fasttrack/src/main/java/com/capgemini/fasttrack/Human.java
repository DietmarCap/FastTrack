package com.capgemini.fasttrack;

public interface Human extends Creature {
	
	String speak();
	String getName();
	Food cooking(float amount);
	void setName(String name);

}
