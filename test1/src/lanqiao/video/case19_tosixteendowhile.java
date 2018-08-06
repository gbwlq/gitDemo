package lanqiao.video;

import java.util.Scanner;

public class case19_tosixteendowhile {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("请输入一个整数：");
	int num = input.nextInt();
	//这些变量，每次循环都改变并且每次都会使用上次的值
	//需要将它们放在循环之外声明
	int shang = num;
	int yu ;
	String hex = "";
	
	do {
		yu = shang % 16;//余
	    shang = shang / 16;//商
	    char result;
	    
			if(yu>9) {
				result = ((char)( 'A'+ (yu -10 )));
			}else{
				result = ((char)('0' + (yu -0)));
			}
			
			hex = result + hex;

		}while(shang != 0);
}
}