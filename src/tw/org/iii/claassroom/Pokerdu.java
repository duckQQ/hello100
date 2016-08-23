package tw.org.iii.claassroom;

import java.util.Arrays;

//poker 
public class Pokerdu {

	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		
		// 洗牌 shuffle
		int[] poker = new int[52]; // 0, 0, 0.....0
		boolean isOK ;
		int rand;
		for (int i=0; i<poker.length; i++){
			
			do {
				rand = (int)(Math.random()*poker.length);
				//check point
				isOK = true;
				for (int j = 0; j < i; j++) {
					if (poker[j] == rand) {
						isOK = false;
						break;
					}
				}
			} while (!isOK);
			poker[i] = rand;
			System.out.println(poker[i]);
		}
		//System.out.println(System.currentTimeMillis()-begin);
		// 發牌=> 4 player
		int[][] player = new int[4][13];
		for(int i =0; i<poker.length; i++){
			player[i%4][i/4] = poker[i];
		}
//	check cards in player0	
//		for (int v:player[0]){
//			System.out.println(v);
//		}
		
		//理牌=> 攤牌
		
		String[] suit = {"黑桃","紅心","方塊","梅花"};
		String[] value = {"A ","2 ","3 ","4 ","5 ",
				"6 ","7 ","8 ",
				"9 ","10","J ","Q ","k "};
		for(int[] cards:player){
			Arrays.sort(cards);
			for(int card:cards){
				System.out.print(suit[card/13] + value[card%13]+" ");
			}
			System.out.println();
		}
		
		
	}

}
