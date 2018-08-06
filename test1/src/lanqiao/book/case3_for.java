package lanqiao.book;

public class case3_for {

	public static void main(String[] args) {
		int sum=0;
		for(int i=0;i<=10;i++) {
			
			sum=sum+i;
			
			if(sum>20) {
				System.out.println(i);
				break;
			}
		}

	}

}
