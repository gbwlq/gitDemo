package lanqiao.book;

import java.util.Scanner;

public class case5 {

	public static void main(String[] args) {
		
//		int[] num= {};
//		int[] num2=new int[3];
//		int[] num3=new int[] {};
		Scanner in=new Scanner(System.in);
		
		int sum=0;
		int[] num=new int[] {8,4,2,1,23,344,12};
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+",");
			sum=num[i]+sum;
			System.out.println();
		}
		System.out.println("和为："+sum);
		System.out.println("请输入：");
		int number=in.nextInt();
		boolean a=true;
		for(int j=0;j<num.length&&a;j++) {
			if(number==num[j]) {
				a=true;
				System.out.println("包含");
				
			}else {
				a=false;
				System.out.println("不包含");
			}
		}
		
		
		
		
		
		
		
		

	}

}
