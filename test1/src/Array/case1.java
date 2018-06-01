package Array;


import java.util.Arrays;
import java.util.Scanner;

public class case1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int max;
		int[] score= {99,85,82,63,60};
		int[] score1=new int[6];
		
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

		int num=in.nextInt();
		score1[score1.length-1]=num;
		
		for(int i=0;i<score1.length-1;i++) {
			if(score1[score1.length-1-i]<score1[score1.length-i-2]) {
				max=score1[score1.length-i-1];
				score1[score1.length-i-1]=score1[score1.length-i-2];
				score1[score1.length-i-2]=max;
			}
		}
		System.out.println(Arrays.toString(score1));

	}
	

}
