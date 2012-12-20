package basicJava;
import javax.swing.JOptionPane;
public class SalaryDialog {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String wageString, dependentString;
		double weeklyPay;
		int dependents;
		double hourInWeek = 37.5;
		wageString = JOptionPane.showInputDialog(null,"Enter employee's hour wage ($) ", "Salary dialog 1", JOptionPane.INFORMATION_MESSAGE);
		weeklyPay = Double.parseDouble(wageString);
		dependentString = JOptionPane.showInputDialog(null, "How many dependent(s)?", "Salary dialog 2", JOptionPane.QUESTION_MESSAGE);
		dependents = Integer.parseInt(dependentString);
		JOptionPane.showMessageDialog(null,"Weekly salary is $"+weeklyPay*hourInWeek+"\n Deduction will be make for "+dependents+" dependent(s)");
		System.exit(0);
		
		
	}

}
