package lanqiao.book;

import java.util.Scanner;

public class case1 {

	public static void main(String[] args) {
		double count1=0;
		Scanner in=new Scanner(System.in);
		System.out.println("请输入10个成绩：");
		for(int i=0;i<10;i++) {
			int s=in.nextInt();
			if(s>=80) {
				count1++;
		}
		}
		
		System.out.println("成绩在80以上的占："+count1/10*100+"%");
		System.out.println("成绩在80以下的占："+(10-count1)/10*100+"%");
	}

}

