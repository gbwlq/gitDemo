package lanqiao.video;

public class case3_randomNumber {
	public static void main(String[] args) {
		 //任意范围内随机整数
		int a =1;
		int b =100;
		int r = (int)(a +Math.random()*(b-a+1));
		
		System.out.println("随机数为：" + r);
	}
	

}
