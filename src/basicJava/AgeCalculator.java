package basicJava;
import java.util.*;
import javax.swing.*;

public class AgeCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar now = new GregorianCalendar();
		int nowYear;
		int birthYear;
		int yearOld;
		birthYear = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your birth year: "));
		nowYear = now.get(Calendar.YEAR);
		yearOld = nowYear - birthYear;
		JOptionPane.showMessageDialog(null, "This is the year you become "+yearOld+" years old");
		System.exit(0);
	}

}
