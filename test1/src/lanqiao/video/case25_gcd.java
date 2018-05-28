package lanqiao.video;
import java.util.Scanner;
//最大公约数
public class case25_gcd {

	public static void main(String[] args) {
		int gcd = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("输入两个整数，用空格或换行隔开：");
		int x = in.nextInt();
		int y = in.nextInt();
		if(x<y) {
		}else {
			int a = 0;
			a=x;
			x =y;
			y= a;
		}
			for(int num =1;num <= (0.5*x);num++) {
				if(x%num==0 && y%num==0) {
					gcd = num;
				}else {
					continue;
				}
		}
			System.out.println("最大公约数为:"+gcd);	
		}
	}


