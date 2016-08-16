package tw.org.iii.claassroom;

import java.util.Scanner;

public class year {

	public static void main(String[] args) {
		//int Year = (int)(Math.random()*3000+1); //1-3000
		//System.out.println(Year);
		System.out.println("請輸入年份：");
		int Year;
		Scanner scanner = new Scanner(System.in);
		Year = scanner.nextInt();
		if (Year%4 != 0){
			System.out.println("平年");
		} else {
			if(Year%100 != 0){
				System.out.println("閏年");
			}else {
				if(Year%400 !=0){
					System.out.println("平年");
				}else{
					System.out.println("閏年");
				}
				
			}
		}

	}

}
