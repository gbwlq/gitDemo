package lanqiao.book;

public class Person_1 {
//	String name;
	String sex;
//	int age;
//	int height;
	public void showInfo() {
		System.out.println(sex);
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(height);
	}

	public static void main(String[] args) {
		Person_1 p=new Person_1();
//		p.name="lisi";
//		p.age=11;
		p.sex="男";
//		p.height=162;
		p.showInfo();
	}

}
