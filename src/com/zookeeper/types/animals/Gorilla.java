package com.zookeeper.types.animals;
import com.zookeeper.types.Mammal;

public class Gorilla extends Mammal{
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	
	public void throwSomething() {
		System.out.println("El Gorila está arrojando algo");
		energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("Yummy Yummy");
		energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("El Gorila subio al tope del árbol");
		energyLevel -= 10;
	}
}
