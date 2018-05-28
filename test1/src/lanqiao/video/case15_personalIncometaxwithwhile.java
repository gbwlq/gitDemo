package lanqiao.video;
import java.util.Scanner;
import java.text.NumberFormat;
/**
 * 个税计算器
 *1500,税率3%,速算扣除数0
 *4500,10%,105
 *9000,20%,555
 *35000,25%,1005
 *55000,30%,2755
 *80000,35%,5505
 *80000,45%,13505
 */
public class case15_personalIncometaxwithwhile {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		NumberFormat nFormat=NumberFormat.getNumberInstance();
		nFormat.setMaximumFractionDigits(2);
		while(true) {
			System.out.println("请输入你的工资：");
			double sal = input.nextDouble();
			System.out.println("请输入你的各项社会保险费：");
			double fee = input.nextDouble();//各项社会保险费
			double salIncome = sal - 3500 - fee -sal*0.1;
			double tax = 0;//税
			double taxrate=0;//税率
			double deduct=0;//数算扣除数
					
			
			 if(sal < 0) {
				 System.out.println("输入错误!");
				 System.exit(0);
			 }
			 
			 if(salIncome <= 0) {
				 System.out.println("不用缴税！");
				 
			 }
			if(salIncome <=1500) {
				taxrate = 0.03;
				deduct = 0;
				tax=(salIncome  * 0.03 - 0); 
			}else if(salIncome <=4500) {
				taxrate = 0.1;
				deduct = 105;
				tax = (salIncome *0.1 - 105);
			}else if(salIncome <=9000) {
				taxrate = 0.2;
				deduct = 555;
				tax = (salIncome *0.2 -555);
			}else if(salIncome <=35000) {
				taxrate = 0.25;
				deduct = 1005;
				tax = (salIncome*0.25 - 1005);
			}else if(salIncome <=55000) {
				taxrate = 0.3;
				deduct = 2755;
				tax = (salIncome*0.3 - 2755);
			}else if(salIncome <=80000) {
				taxrate = 0.35;
				deduct = 55.5;
				tax = (salIncome*0.35 -5505);
			}else if(salIncome >80000) {
				taxrate = 0.45;
				deduct = 13505;
				tax = (salIncome*0.45 -13505);
			}
			System.out.println("税率："+taxrate+"数算扣除数："+deduct);
			System.out.println("应缴税：" + nFormat.format(tax));
			System.out.println("实发工资：" +nFormat.format (sal-tax-fee));
		}
		
	}
}