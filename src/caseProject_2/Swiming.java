package caseProject_2;
import javax.swing.JOptionPane;


public class Swiming {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int FEE_CLEAN = 75;
		final double GALLON_PER_CUBIC = 7.5;
		final int RATE_OF_FLOW = 50;
		final int MINUTE_PER_HOUR=60;
		final int FEE_FILL_PER_MINUTE=8;
		
		double length = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter pool length: "));
		double width = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter pool width: "));
		double depth  = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter pool average depth: "));
		double volume  = length*width*depth*GALLON_PER_CUBIC;
		double timeFill = volume/(RATE_OF_FLOW*MINUTE_PER_HOUR);
		double feeFill = timeFill*FEE_FILL_PER_MINUTE;
		
		double totalFee = FEE_CLEAN + feeFill;
		JOptionPane.showMessageDialog(null, "Total calculated fee is: "+totalFee);
		System.exit(0);
	}

}
