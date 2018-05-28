package org.car;

public class Test {
	public static void main(String[] args) {
		//向上类型转换
		Pet pet=new Dog();
		//向下类型转换
		Dog dog=(Dog)pet;
//		pet.eat();
		
		SecurityDoor securityDoor=new SecurityDoor();
		securityDoor.openLock();
		securityDoor.open();
		System.out.println("----------------");
		securityDoor.close();
		securityDoor.closeLock();
	}
}
