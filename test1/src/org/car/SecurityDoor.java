package org.car;

public class SecurityDoor extends Door implements Lock{

	@Override
	public void openLock() {
		System.out.println("开锁");		
	}

	@Override
	public void closeLock() {
		System.out.println("锁门");
	}

}
