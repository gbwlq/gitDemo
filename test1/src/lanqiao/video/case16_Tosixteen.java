package lanqiao.video;
import java.util.Scanner;

/**
 * 将任意整数转换为16进制
 * 
 * 先将转换数除以16，余数放在最后，除数将作为新的数去除以16
 *  
 */
public class case16_Tosixteen {

	public static void main(String[] args) {
		// 1
/*		int num = 123;
		char result;
		String hax = "";
		int shang = num / 16;//商7
		int yu = num % 16;//余11
		if(yu>9) {
			result = ((char)( 'A'+ (yu -10 )));
		}else{
			result = ((char)('0' + (yu -0)));
		}
		hax = result + hax;
		
		yu = shang % 16;//商0
		shang = shang /16;//余7
		if(yu>9) {
			result = ((char)( 'A'+ (yu -10 )));
		}else{
			result = ((char)('0' + (yu -0)));
		}
		hax = result + hax;
		System.out.println(hax);
*/		
		// 2
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int num = input.nextInt();
		//这些变量，每次循环都改变并且每次都会使用上次的值
		//需要将它们放在循环之外声明
		int shang = num;
		int yu ;
		String hex = "";
		
		while(shang != 0){
			yu = shang % 16;//余
		    shang = shang / 16;//商
		    char result;
		    
				if(yu>9) {
					result = ((char)( 'A'+ (yu -10 )));
				}else{
					result = ((char)('0' + (yu -0)));
				}
				
				hex = result + hex;

			}
		System.out.println(num+"的十六进制为"+hex);
	
	}

}