package tw.org.iii.claassroom;

public class shuffling {

	public static void main(String[] args) {
		//long begin = System.currentTimeMillis();
		int n = 52;
		int[] cards = new int[n];
		int rand, temp;

		//Assigning numbers
		for(int i=0; i<cards.length; i++){
			rand = (int)(Math.random()*n);
			cards[i] = i;	
			System.out.print(cards[i]+" ");
			}
		System.out.println();
		//shuffling
		for (int j = 0; j < 50; j++) {
			rand = (int) (Math.random() *n);
			int index = cards.length;			
				temp = cards[rand];
				cards[rand] = cards[index-1];
				cards[index-1] = temp;
				index--;
			
		}
		//System.out.println(System.currentTimeMillis()-begin);
		for(int v : cards){
			System.out.print(v+ "  ");
		}
		
		
	}

}
