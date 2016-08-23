package tw.org.iii.claassroom;

public class Brad13 {

	public static void main(String[] args) {
		//宣告i只活在同一區塊
		int i;
		for(i=0; i<10; i++){
			System.out.println(i);
		}
		System.out.println(i);
	}

}
