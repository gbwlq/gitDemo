package org.car;

public class Dog extends Pet{
	private String strain;
	public void setStrain() {
		
	}
	public void eat(Pet pet) {
		System.out.println("给狗喂狗粮");
		super.setHealth(super.getHealth()+3);
	}
}
