package Array;

public class mean_1 {
	public void eat() {//无参
		System.out.println("吃饭");
	}
	public void eat(String name) {
		System.out.println(name+"吃饭");
	}
	public void eat(String name,int time) {
		System.out.println(name+time+"点"+"吃饭");
	}
	public void eat(int time,String name) {
		System.out.println(name+time+"点"+"吃饭");
	}
	public void eat(String[] args_1) {//数组
		System.out.println(args_1[0]+args_1[1]+"吃饭");
	}
	public void eat(Args a) {//对象
		System.out.println(a.name+a.place+a.time+"点"+"吃饭");
	}
	public static void main(String[] args) {
		mean_1 m=new mean_1();
		m.eat();
		Args a=new Args();
		a.name="zhangsan";
		a.place="在家";
		a.time=5;
		m.eat(a);
		m.eat("lisi");
		String[] args_1= {"wangwu","在家"}; 
		m.eat(args_1);
		m.eat(8, "zhaoliu");
		
	}

}
