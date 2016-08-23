package tw.org.iii.claassroom;

import javax.swing.JOptionPane;

public class GuessNum {

	public static void main(String[] args) {
		// 產生謎底
		String answer = createAnswer(4);
		System.out.println(answer);
		for (int i = 0; i < 3; i++) {
			// 開始猜
			String guess = JOptionPane.showInputDialog("猜");
			// 比對
			if (guess.equals(answer)) {
				// 對了=> 恭喜
				JOptionPane.showMessageDialog(null, "恭喜");
				break;
			} else {
				String result = checkAB(answer, guess);
				JOptionPane.showMessageDialog(null, "不對");
			}
			// 錯了 => 提示 1A2B
		}

	}
	static String checkAB(String a, String g){
		int A, B; A = B = 0;
		for(int i=0; i<g.length();i++){
			if(g.charAt(i) == a.charAt(i)){
				A++;
			}else if (a.indexOf(g.charAt(i))!= -1){//g中的數字有在a中出現
				B++;
			}
		}
		return A+ " A "+ B+ " B ";
	}

	static String createAnswer(int n) {
		int[] poker = new int[n]; // 0, 0, 0.....0
		boolean isOK;
		int rand;
		for (int i = 0; i < poker.length; i++) {

			do {
				rand = (int) (Math.random() * 10);
				// check point
				isOK = true;
				for (int j = 0; j < i; j++) {
					if (poker[j] == rand) {
						isOK = false;
						break;
					}
				}
			} while (!isOK);
			poker[i] = rand;}
		
			String ret = "";
			for(int v : poker ) ret += v;
			return ret;	
		}
		
		
	

}
