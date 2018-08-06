package lanqiao.book;

public class case4_f {

	public static void main(String[] args) {
		
//			chookNum + rabbitNum=35;
//			2*chookNum+4*rabbitNum=94;
		int i=0;
		int j=0;

		for(;i<36;i++) {
				for(;j<36-i;j++) {
					if((i+j==35)&&(2*i+4*j==94)) {
						System.out.println(" "+i+" "+j);
					}
				}
			}
	}

}
