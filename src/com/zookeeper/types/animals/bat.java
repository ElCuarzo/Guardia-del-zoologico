package com.zookeeper.types.animals;
import com.zookeeper.types.Mammal;

public class bat extends Mammal {
	public bat(int energyLevel) {
		super(energyLevel);
	}
	
	public void fly() {
		System.out.println("Fiuuuuuu!, Murcielago volando");
		energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("Bueno, no importa");
		energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("BOOM, un murcielago nos ataca");
		energyLevel -= 100;
	}
}
