package tw.org.iii.claassroom;

public class Duck16 {

	public static void main(String[] args) {
		for (int i=0; i<10; i++){
			if (i%2==0){
				continue; //不往下做，進入下一個迴圈, 只印奇數
			}
			System.out.println(i);//
		}
	}

}
