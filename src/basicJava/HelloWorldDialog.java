package basicJava;
import javax.swing.JOptionPane;
public class HelloWorldDialog {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result;
		result = JOptionPane.showInputDialog("Hello World!!!!! What is your name?");
		JOptionPane.showMessageDialog(null, "Hello " +result+"!");
		System.exit(0);

	}

}
