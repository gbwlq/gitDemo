package lanqiao.video;

import java.util.Scanner;

public class case4_circleArea {
	//计算圆的面积
    public  double area(){
    	System.out.println("输入半径r:");
    	 @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
    	 double r = in.nextDouble();
    	return 3.14159*r*r;
    }
	public static void main(String[] args) {
		case4_circleArea c =new case4_circleArea();
		System.out.println("面积为：" + c.area());
	}

}
