package tw.org.iii.claassroom;
//Array
public class Duck18 {

	public static void main(String[] args) {
		int[] a;
		int b[];
		a = new int[8];
		a[2] = 12;
		a[3] = 50;
		a[7] = 100;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("------");
		int[] d = new int[3];
		int[] e = new int[]{1,2,3,5,7};
		//equals to 
		//int[]e;  e = new int[]{1,2,3,5,7};
		for(int i =0; i<e.length; i++){
			System.out.println(e[i]);
		}
		System.out.println("------");
		int[] f = {1,2,3,5,7};
		for (int i=0; i<f.length;i++){
			System.out.println(f[i]);
		}
	}

	
	
}
