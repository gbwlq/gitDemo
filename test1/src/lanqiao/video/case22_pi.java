package lanqiao.video;

import java.util.Scanner;
//求π的近似值
public class case22_pi {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		double result = 0;
				for(double i =1; i<=num;i++) {
			
			result += (double)(4* Math.pow(-1, i+1)/(2*i-1));
		}
		System.out.println("π ="+result );
	}

}
