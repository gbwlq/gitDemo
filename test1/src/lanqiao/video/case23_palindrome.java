package lanqiao.video;
import java.util.Scanner;
//判断用户输入的是否为回文
public class case23_palindrome {

	public static void main(String[] args) {
		System.out.println("");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		/**
		 * 1.循环怎么控制-何时退出，用什么变量来控制
		 * 2.控制条件
		 * 3.每次循环后，控制变量有何变化
		 * 4.最终要什么结果？是 否
		 * 5.怎么在循环中逐步得到结果
		 */
		boolean isPalindorme = false;
		int begin = 0;
		int end = str.length()-1;
		while(begin<end&&str.charAt(begin) == str.charAt(end)) {
			begin++;
			end--;
		}
		if(begin>=end) {
			isPalindorme = true;
		}
		System.out.println(str+(isPalindorme?"":"不")+"是一个回文串");
	}

}
