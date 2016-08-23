package tw.org.iii.claassroom;
//對Brad14.java  找出1~100的質數
public class Ducknum {

	public static void main(String[] args) {
		for(int i =1; i<=100; i++){
		//判斷是否為質數
			boolean isOK = true;
			for(int k=2; k<=i; k++){
				if(i%k == 0){
					//不是質數
					isOK = false;
					//break;
				}
			}
			System.out.print(i + (isOK?"* ":" "));
			if(i % 10 == 0){
				System.out.println();
			}
		}
		
//		for (int j = 0; j < 10; j++) {
//			for (int i = 1; i <= 10; i++) {
//				int v = j*10 +i; //j表示10位數，i表示個位數
//				//判斷是否為質數
//				boolean isOK = true;
//				for(int k=2; k<v; k++){
//					if(v%k == 0){
//						//不是質數
//						isOK = false;
//						break;
//					}
//				}
//				System.out.print(v+(isOK?"* ":" "));
//			}System.out.println();
//		}
	}

}
