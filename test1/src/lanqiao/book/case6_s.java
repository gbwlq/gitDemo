package lanqiao.book;

import java.util.Scanner;

public class case6_s {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int max=9999999;
		for(int i=0;i<4;i++) {
			System.out.println("请输入第"+i+"家手机价格");
		    int num=in.nextInt();
			if(num<max) {
				 max=num;
			}
		}
		System.out.println(max);
	}

}
