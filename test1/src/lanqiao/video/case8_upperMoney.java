package lanqiao.video;

import java.util.Scanner;

/**
 * 给定5位整数，2位小数金额，转换为半中文大写金额
 * @author Administrator
 *
 */
public class case8_upperMoney {

	public static void main(String[] args) {
		//double num = 89735.12;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("请输入5位正整数，2位小数：");
		double num = input.nextDouble();
	    if (num >0 && num < 100000 ) {
		//转换为分
		num = num * 100;
		
		//求万位的数值
		int wan = (int) (num / Math.pow(10, 6));
		
		//求千位的数值
		double totalqian = num % Math.pow(10, 6);
		int qian = (int)(totalqian /Math.pow(10, 5)); 
		
		//求百位的数值
		double totalbai = num % Math.pow(10, 5);
		int bai = (int)(totalbai / Math.pow(10, 4));
		
		//求十位的数值
		double totalshi = num % Math.pow(10, 4);
		int shi = (int)(totalshi / Math.pow(10, 3));
		
		//求个位的数值
		double totalge = num % Math.pow(10, 3);
		int ge = (int)(totalge / Math.pow(10, 2));
		
		//求十分位的数值
		double totalshifen = num % Math.pow(10, 2);
		int shifen = (int)(totalshifen / Math.pow(10, 1));
		
		//求百分位的数值
		double totalbaifen = num % Math.pow(10, 1);
		int baifen = (int)(totalbaifen / Math.pow(10, 0));
		
		System.out.println(wan + "萬" + qian + "仟" + bai + "佰" + shi + "拾" + ge + "园" + shifen + "角" + baifen + "分" );
	    }else {
	    	System.out.println("无效数据");
	    }
	}

}
