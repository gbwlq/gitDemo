package lanqiao.video;

import java.util.Scanner;

public class case5_randomNumber {
/**
 * 输入两个整数代表范围，随机输出范围内的一个整数
 * 
 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		//输入整数
		System.out.println("输入两个整数，中间用空格/换行隔开:");
		int num1 = in.nextInt();
		
		
		int num2 = in.nextInt();
	    
		int num3 = num1 + (int)(Math.random() * (num2 - num1 + 1));
		System.out.println("随机数为：" + num3);
	}

}
