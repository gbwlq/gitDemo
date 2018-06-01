package lanqiao.video;
import java.util.Scanner;
/**
 * 猜生日
 *
 */
public class case7_Birthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day=0;
		@SuppressWarnings({ "unused", "resource" })
		Scanner input = new Scanner(System.in);
		/**
		 * 集合
		 */
		int[] num=new int[5];
		System.out.println("你的生日在这个集合中吗？"
				          +"\n   1  3  5  7 "
				          +"\n  9 11 13 15 "
				          +"\n 17 19 21 23 "
				          +"\n 25 27 29 31");
		System.out.print("是，输入1；否，输入0：");
		num[0]= input.nextInt();
		System.out.println("你的生日在这个集合中吗？"
				          + "\n  2  3  6  7 "
				          + "\n 10 11 14 15"
				          + "\n 18 19 22 23"
				          + "\n 26 27 30 31");
		System.out.print("是，输入1；否，输入0：");
		num[1] = input.nextInt();
		System.out.println("你的生日在这个集合中吗？"
				          + "\n  4  5  6  7 "
				          + "\n 12 13 14 15 "
				          + "\n 20 21 22 23 "
				          + "\n 28 29 30 31");
		System.out.print("是，输入1；否，输入0：");
		num[2 ]= input.nextInt();
		System.out.println("你的生日在这个集合中吗？"
				          + "\n  8  9 12 11 "
				          + "\n 12 13 14 15 "
				          + "\n 24 25 26 27 "
				          + "\n 28 25 30 31");
		System.out.print("是，输入1；否，输入0：");
		num[3] = input.nextInt();
		System.out.println("你的生日在这个集合中吗？"
				          + "\n 16 17 18 19 "
				          + "\n 20 21 22 23 "
				          + "\n 24 25 26 27 "
				          + "\n 28 29 30 31");
		System.out.print("是，输入1；否，输入0：");
		num[4] = input.nextInt();
		/**
		 * 计算方法1
		 */
		/*
		if(num1 != 0) {
			day += num1 * 1;
		}else {
			day += num1*0;
		}
		if(num2 != 0) {
			day += num2 * 2;
		}else {
			day += num2 * 0;
		}
		if(num3 != 0) {
			day += num3 * 4;
		}else {
			day += num3 * 0;
		}
		if(num4 != 0) {
			day += num4 * 8;
		}else {
			day += num4 * 0;
		}
		if(num5 != 0) {
			day += num5 * 16;
		}else {
			day += num5 * 0;
		}
		if(num1 <= 0 && num2 <= 0 && num3 <= 0 && num4 <= 0&& num5 <= 0) {
			System.out.println("生日不存在.....");
		}else {
			System.out.println("生日为：" + day + "号");
		}*/
		/**
		 * 方法2
		 */
		/*if(num1 != 0) {
			day += 1<<0;
		}else {
			day += num1 * 0;
		}
		if(num2 != 0) {
			day += 1<<1;
		}else {
			day += num2 * 0;
		}
		if(num3 != 0) {
			day += 1<<2;
		}else {
			day += num3 * 0;
		}
		if(num4 != 0) {
			day += 1<<3;
		}else {
			day += num4 * 0;
		}
		if(num5 != 0) {
			day += 1<<4;
		}else {
			day += num5 * 0;
		}
		if(num1 <= 0 && num2 <= 0 && num3 <= 0 && num4 <= 0&& num5 <= 0) {
			System.out.println("生日不存在......");
		}else {
			System.out.println("生日为：" + day + "号");
		}*/
		/**
		 * 3
		 */
		for(int i=0;i<5;i++) {
			if(num[i] != 0) {
				day += Math.pow(2, i);
			}else {
				day += 0;
			}
			
		}
		if(num[0] <= 0 && num[1] <= 0 && num[2] <= 0 && num[3] <= 0 && num[4] <= 0 ) {
			System.out.println("生日不存在......");
		}else {
			System.out.println("生日为：" + day + "号");
		}
	}

}
