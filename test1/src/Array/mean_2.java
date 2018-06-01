package Array;

public class mean_2 {
	String name;
	int no;
	int age;
	public mean_2() {
		System.out.println("Student constructor");
	}
	public mean_2(String name) {
		this.name=name;//this表示当前对象
	}
	public mean_2(String name,int age) {
		this(name);//调用构造方法
		this.age=age;
	}
	public static void main(String[] args) {
		mean_2 m=new mean_2("zhangsan",11);
		System.out.println(m.age+"**"+m.name);
		
	}

}
