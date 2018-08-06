package lanqiao.video;
import java.util.Scanner;
/**
 * 根据用户输入的年份判断是否为闰年
 *
 */
public class case9_leapYear {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("请输入大于1582的年份：");
		int year = input.nextInt();
		if(year > 1582) {
			if((year%4==0&&year%100!=0)||year%400==0) {
				System.out.println("这是一个闰年");
			}else {
				System.out.println("这不是一个闰年");
			}
		}else{
			System.out.println("无效年份");
		}
			
	}

}
