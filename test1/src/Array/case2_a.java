package Array;

import java.util.Arrays;
import java.util.Scanner;
/**
 * score={99,85,82,63,60}
 * 新建一个数组，长度=6
 * 将输入的数字放入最后一位
 * 然后向前比较，插入正确的位置
 */
public class case2_a {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int max=0;
		int[] score= {99,85,82,63,60};
		int[] score1= new int[6];
		
		//
		for(int i=0;i<score.length-1;i++) {
			for(int k=0;k<score.length-i-1;k++) {
				max=score[k];
				if(max>score[k+1]) {
					score[k]=score[k+1];
					score[k+1]=max;
				}
			}
		}
		for(int i=0;i<score.length;i++) {
			score1[i]=score[i];
		}
//		score1[score1.length-1]=num;
//		for(int i=0;i<score1.length;i++) {
//			if(num<score1[score1.length-i-2]) {
//				max=num;
//				num=score1[score1.length-i-2];
//				score1[score1.length-i-2]=max;
//			}
//		}
		System.out.println(Arrays.toString(score1));
	}

}
