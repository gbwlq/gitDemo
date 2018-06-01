package org.lanqiao;

public class Thread_3 extends Thread{
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println(Thread.currentThread().getName()+"---"+i);
		}
	}
	public static void main(String[] args) {
		Thread.currentThread().setName("主线程");
		Thread_3 t=new Thread_3();
		t.run();
		//锁
		synchronized (t) {
			
		}
		//优先级
		t.setPriority(MIN_PRIORITY);
		
	}
}
