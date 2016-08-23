package tw.org.iii.claassroom;

import javax.swing.JOptionPane;
//萬年曆 calender
public class Brad11 {

	public static void main(String[] args) {
		String strYear = JOptionPane.showInputDialog("Year");
		String strMonth = JOptionPane.showInputDialog("Month");
		int intYear = Integer.parseInt(strYear);
		System.out.println(intYear + "/" + strMonth);
		
	}

}
