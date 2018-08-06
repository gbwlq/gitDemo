package lanqiao.video;

import java.util.Scanner;
//十进制转二进制
public class case17_totwo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
		System.out.println("请输入一个整数：");
		int num = input.nextInt();
		int shang = num;
		int yu;
		String two = "";
		int count = 0;
		while(shang != 0) {
			yu = shang % 2;
			shang = shang / 2;
			count++;
			if(count % 4 ==0) {//四位一个分组
				two = "_"+yu + two;
			}else {
				two = yu + two;
			}
		}
		//固定为31的长度
		while(count<31) {
			count++;
			if(count % 4 ==0) {//四位一个分组
				two = "_"+0 + two;
			}else {
				two = 0 + two;
			}
		}
		
		System.out.println(num+"的二进制为"+two);
		}
	}
}