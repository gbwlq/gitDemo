package lanqiao.video;
         /**
 		 * a，b值互换
 		 */
public class test1_changevalues {
     public static void main(String[] args) {
    		
 		int a=3;
 		int b=4;
 		a=(a^b);
 		b=(a^b);//b=((a^b)^b)=a
 		a=(a^b);//a=((a^b)^a)=b
 		System.out.println("a= "+a+ " b=" +b);

	}

}
