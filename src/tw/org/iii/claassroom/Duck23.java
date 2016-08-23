package tw.org.iii.claassroom;
//while 
public class Duck23 {

	public static void main(String[] args) {
		int i = 0, sum =0, n= 947;
//		while (i<10){
//			System.out.println(i++);
//		}
		while(i<=n){
//			sum = i+ sum;
//			i++; ?這個可以嗎?  
			sum += i++;
		}
		System.out.println(sum);
	}

}
