package lanqiao.video;
import java.util.Scanner;

/**
 * “你又胖了” “滚！”
 * “你是最美的” “你这样说，人家会害羞啦......”
 * “娘子，夜深了” “不用说了，先把灯关上吧” 程序终止
 * “ ” “你说什么，我听不懂啦......”
 * @author Administrator
 *
 */
public class case15_friend {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("请输入对话内容:");
			String talk = input.nextLine();
			//1
		/*	@SuppressWarnings("unused")
			String reply = " ";
			switch(talk) {
			case "你又胖了" : reply="滚!";
			break;
			case "你是最美的" : reply = "你这样说，人家会害羞啦......";
			break;
			case "娘子，夜深了" : reply = "不用说了，先把灯关上吧";
			System.exit(0);
			break;
			default: reply = "你说什么，我听不懂啦......";
			break;
			}
			System.out.println(reply);*/
			
			//2
			if(talk.equals("你又胖了")) {
				System.out.println("滚！");
			}else if(talk.equals("你是最美的")) {
				System.out.println("你这样说，人家会害羞啦......");
			}else if(talk.equals("娘子，夜深了")) {
				System.out.println("不用说了，先把灯关上吧");
				break;
			}else {
				System.out.println("你说什么，我听不懂啦......");
			}
			
		}
	}

}
