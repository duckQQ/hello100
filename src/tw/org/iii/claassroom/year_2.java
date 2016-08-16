package tw.org.iii.claassroom;

import java.util.Scanner;

public class year_2 {

	public static void main(String[] args) {
		int Year;
		System.out.println("Please enter number ");
		Scanner scanner = new Scanner(System.in);
		Year = scanner.nextInt();
		
		if(Year%4==0){
			if(Year%100==0){
				if(Year%400==0){
					System.out.println("This year is leap year.");
				}
				else{
					System.out.println("This year is average year.");
				}
			}else{
				System.out.println("This year is leap year.");
			}
		}else{
			System.out.println("This year is average year.");
		}
		
	}

}
