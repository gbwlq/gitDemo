package lanqiao.video;
import java.util.Scanner;

/**
 * 读取用户输入的操作数与符号，计算并输出结果
 * @author Administrator
 *
 */
public class case13_calculator {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		double num1 = input.nextDouble();//第一个操作数
		
		String symbol = input.next();//操作符
		
		double num2 = input.nextDouble();//第二个操作数
		
		double result = 0;
		switch(symbol) {
		case "+" : result = num1 + num2; 
		break;
		case "-" : result = num1 - num2;
		break;
		case "*" :result = num1 * num2;
		break;
		case "/" :result = num1 / num2;
		break;
		case "%" :result = num1 % num2;
		break;
		default:
			result =Double.NaN;//not a number
		}
		System.out.println("结果为：" + "\n"+num1+symbol+num2+"="+result);
		System.out.printf("%.2f %s %.2f = %.2f \n", num1,symbol,num2,result);
	}

}
