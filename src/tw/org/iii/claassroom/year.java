package tw.org.iii.claassroom;

import java.util.Scanner;

public class year {

	public static void main(String[] args) {
		//int Year = (int)(Math.random()*3000+1); //1-3000
		//System.out.println(Year);
		System.out.println("�п�J�~���G");
		int Year;
		Scanner scanner = new Scanner(System.in);
		Year = scanner.nextInt();
		if (Year%4 != 0){
			System.out.println("���~");
		} else {
			if(Year%100 != 0){
				System.out.println("�|�~");
			}else {
				if(Year%400 !=0){
					System.out.println("���~");
				}else{
					System.out.println("�|�~");
				}
				
			}
		}

	}

}
