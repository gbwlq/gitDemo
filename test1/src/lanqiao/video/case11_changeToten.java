package lanqiao.video;
import java.util.Scanner;

/**
 * 将16进制的字符转换后输出
 * @author Administrator
 *
 */
public class case11_changeToten {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("请输入0~9或A~F或a~f的一个字符:");
		String num = input.next();
		char x = num.charAt(0);
		
		if(x >=48 && x <=57) {
			System.out.println(" 0~9:" + x);
		}else if(x>=65 && x <=70) {
			System.out.println("A~F: "+ (x-'A'+10));
		}else if(x>=97 && x<=102) {
			System.out.println(" a~f:" +(x-'a'+10));
		}else {
			System.out.println("输入错误......");
		}
		}

}
