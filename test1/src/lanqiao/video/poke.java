package lanqiao.video;

import java.util.Arrays;

public class poke {
	//将扑克牌随机取出
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//扑克牌
		int[] card = new int[54];
		for(int i=0;i<card.length;i++) {
			card[i] = i+1;
		}
		//玩家
//		int[] player1 =new int[17];
//		int[] player2 =new int[17];
//		int[] player3 =new int[17];
//		//player1
//		for(int j=0;j<player1.length;) {//循环17次
//			int random=(int)(Math.random()*54);//0-53随机数
//			int rcard = card[random];
//			if(rcard>=0) {
//				card[random]=-1;
//				player1[j]=rcard;
//				j++;
//			}
//		}
//			//player2
//		for (int j = 0; j < player2.length;) {// 循环17次
//			int random = (int) (Math.random() * 54);// 0-53随机数
//			int rcard = card[random];
//			if (rcard >= 0) {
//				card[random] = -1;
//				player2[j] = rcard;
//				j++;
//			}
//		}
//		// player3
//		for (int j = 0; j < player3.length;) {// 循环17次
//			int random = (int) (Math.random() * 54);// 0-53随机数
//			int rcard = card[random];
//			if (rcard >= 0) {
//				card[random] = -1;
//				player3[j] = rcard;
//				j++;
//			}
//		}
//		System.out.println(Arrays.toString(player1));
//		System.out.println(Arrays.toString(player2));
//		System.out.println(Arrays.toString(player3));
		
		int[][] players = new int[3][17];
		
		for(int i=0;i<players.length;i++) {
			for(int j=0;j<players[i].length;) {//循环17次
				int random=(int)(Math.random()*54);//0-53随机数
				int rcard = card[random];
				if(rcard>=0) {
					card[random]=-1;
					players[i][j]=rcard;
					j++;
				}
			}
			System.out.println("玩家"+(i+1)+"的手牌为"+Arrays.toString(players[i]));
		}

		for(int i=0;i<card.length;i++) {
			if(card[i]!=-1) {
				System.out.print(card[i]+",");
			}
		}
	}
}
