package lanqiao.video;


import java.util.Scanner;

public class case6_changeTosixteen {
//输入0~15整数，转换为16进制表示的数字
	public static void main(String[] args) {
		System.out.println("输入0~15的一个整数：");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		if(num<=9) {
			System.out.println((char)( '0'+  (num-0) ));
		}
		else {
			System.out.println((char)('A' + (num -10)));
		}
		char result = num > 9?((char)('A' + num -10)):((char)( '0'+  num ));
		System.out.println(result);
	}

	
}
