package tw.org.iii.claassroom;

public class Brad10 {

	public static void main(String[] args) {
		int month = (int)(Math.random()*12 +1) ;//1-12;
		System.out.println(month);
		//switch以結果來看有哪些case
		switch(month){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("31");
			break;
		case 2:
			System.out.println("28");
			break;
		case 4: case 6: case 11:
			System.out.println("30");
			break;
		default:
			System.out.println("XX");
			break;
			
		}
	}

}
