package org.lanqiao;

public class Thread_2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<20;i++) {
			System.out.println(Thread.currentThread().getName()+"--"+i);
		}
	}
	public static void main(String[] args) {
		
		Thread_2 t=new Thread_2();
		
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		
//		t1.start();
//		t2.start();
		
//		t1.setName("aa");
//		t2.setName("bb");
		//实例方法
		t1.run();
		t2.run();
	}
}
