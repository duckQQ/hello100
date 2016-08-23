package tw.org.iii.claassroom;

public class Duck15 {

	public static void main(String[] args) {
		brad://外圈迴圈命名為brad
		for (int j = 3; j > 0; j--) {
			for (int i = 0; i < 3; i++) {
				System.out.println(i + ";" + j);
				if (i==1) break brad; //脫離外圈迴圈
			}
		}
	}

}
