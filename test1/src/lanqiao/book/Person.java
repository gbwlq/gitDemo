package lanqiao.book;

public class Person {
String name;
public void showInfo() {
	System.out.println(name);
}
public static void main(String[] args) {
	Person p = new Person();
	p.showInfo();
}
}
