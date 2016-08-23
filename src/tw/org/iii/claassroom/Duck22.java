package tw.org.iii.claassroom;
//Array and for loop ;for each
public class Duck22 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[][] b = {{1,2},{3,4,5},{6,7,8,9}};
		int[][][] c = new int[2][2][1];
		c[0][0][0] = 1;
		c[0][1][0] = 2;
		c[1][0][0] = 3;
		c[1][1][0] = 4;
		
		// for- each
		for (int v: a ){
			System.out.println(v);
		}
		System.out.println("--------"); //2 D array
		for (int[] v1:b){
			for (int v2:v1){
				System.out.println(v2);
			}
			System.out.println("++++");
		}
		System.out.println("=========");//3-d array
		
		for (int[][] v3:c){
			for(int[] v4:v3){
				for(int v5:v4){
					System.out.println(v5);
				}
				System.out.println("+++");
			}
			System.out.println("=======");
		}
			
	}

}
