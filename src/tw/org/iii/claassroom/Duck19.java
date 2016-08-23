package tw.org.iii.claassroom;
//from Duck17, using array
public class Duck19 {

	public static void main(String[] args) {
		int[] p = new int[9]; //p[0]=0, ....p[8]=0;
		//int[] q = new int[6];
		for (int i = 0; i < 10000; i++) {
			int point = (int) (Math.random()*9); // 0-8
			p[(point>=6?point-3:point)]++;
			
//				switch(point)
//				{
//				case 6:
//					p[3]++;
//					break;
//				case 7:
//					p[4]++;
//					break;
//				case 8:
//					p[5]++;
//					break;
//				case 0: case 1: case 2: case 3: case 4: case 5:	
//				p[point]++;
//				}			
			}	
		for (int i=0;i<p.length; i++){
			System.out.println( (i+1)+ ":" + p[i]);
		}
	} 
	

}
