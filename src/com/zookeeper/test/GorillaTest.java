package com.zookeeper.test;
import com.zookeeper.types.animals.Gorilla;

public class GorillaTest {
	public static void main(String[] args) {
		Gorilla koko = new Gorilla(100);
		koko.displayEnergy();
		koko.throwSomething();
		koko.throwSomething();
		koko.throwSomething();
		koko.displayEnergy();
		koko.eatBananas();
		koko.eatBananas();
		koko.displayEnergy();
		koko.climb();
		koko.displayEnergy();
	}
}