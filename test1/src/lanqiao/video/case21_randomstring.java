package lanqiao.video;

import java.util.Scanner;
//产生随机字符串
public class case21_randomstring {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入字符串长度：");
		int num = input.nextInt();
		String result="";
		
		for(int i = 0;i<num ; i++) {
			char c = (char)(Math.random()*(0xffff+1));
			if((c>='0'&&c<='9')||(c>='A'&&c<='Z')||(c>='a'&&c<='z')) {
				result +=c; 
			}else {
				i--;
			}
		}
		int i = 0;
		while(i<num) {
		char c = (char)(Math.random()*(0xffff+1));
		
		if((c>='0'&&c<='9')||(c>='A'&&c<='Z')||(c>='a'&&c<='z')) {
			result +=c; 
			i++;
		}
		}
		System.out.print("产生的随机数为：" + result);
		
		}

}
