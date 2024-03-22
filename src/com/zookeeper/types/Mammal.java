package com.zookeeper.types;

public class Mammal {
	protected int energyLevel = 100;
	
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public int displayEnergy() {
		System.out.println("El nivel de energia es: " + energyLevel);
		return energyLevel;
	}
	
	
}
