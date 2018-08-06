package lanqiao.video;
/**
 * 字符串
 * @author Administrator
 *
 */
public class string {

	public static void main(String[] args) {
		char ch =(char)65.25;
		int i = (int) ch;
		int i1 = '2' + '3' ;
		int j =2 + 'a';
		String num = "num";
		String num1 = new String ("num1");
		int len = num.length();
		
		System.out.println(ch + ", "+ i +" ;" + i1);
		System.out.println("j:" + j);
		System.out.println("a" + '2');
		System.out.println((char)('A'+(15-10))   );
		System.out.println( i + 1 +" num :"  +( i + 1 ));
		System.out.println("num1:" + num1);
		System.out.println("len =" + len);
	}

}
