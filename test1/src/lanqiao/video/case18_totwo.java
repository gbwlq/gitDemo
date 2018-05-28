package lanqiao.video;

import java.util.Scanner;
//十进制转二进制
public class case18_totwo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
		System.out.println("请输入一个整数：");
		int num = input.nextInt();
		int num2;
		if(num < 0) {
			num2 = (int)(Math.pow(2, 31) + num);
		}else {
			num2 = num;
		}
		int shang = num2;
		int yu;
		String two = "";
		int count = 0;
		while(shang != 0) {
			yu = shang % 2;
			shang = shang / 2;
			count++;
			if(count % 4 ==0) {
				two = "_"+yu + two;
			}else {
				two = yu + two;
			}
		}
		System.out.println(num+"的二进制为"+two);
		}
	}
}