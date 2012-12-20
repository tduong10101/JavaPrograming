package basicJava;
import javax.swing.JOptionPane;
import java.text.*;
public class SalaryCal {

	public static void main(String[] args) {
		double salary,salaryPre;
		String salaryStr;
		String pattern = "###,###.00";
		DecimalFormat moneyFormat = new DecimalFormat(pattern);
		salaryStr = JOptionPane.showInputDialog(null,"Enter salary value: ");
		salary = Double.parseDouble(salaryStr);
		salaryPre = salaryPre(salary);
		JOptionPane.showMessageDialog(null, "Your salary raise calculation is: $"+moneyFormat.format(salaryPre))
		;
	}
	public static double salaryPre (double salary){
		return salary*1.1;
	}
}
