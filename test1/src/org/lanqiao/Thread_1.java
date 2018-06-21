package org.lanqiao;
//线程
public class Thread_1 extends Thread{

	public void run() {
		for(int i=0;i<20;i++) {
			System.out.println(Thread.currentThread().getName()+"--"+i);
		}
	}
	public static void main(String[] args) {
		Thread_1 t1=new Thread_1();
		Thread_1 t2=new Thread_1();
		
		t1.start();
		t2.start();
		
		t1.setName("aa");
		t2.setName("bb");
		
	}
}
