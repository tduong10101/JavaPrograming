package gameZone;

import javax.swing.JOptionPane;

public class MadLibs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String noun0, noun1, adjective0, pastTenseVerb0;
		noun0 = JOptionPane.showInputDialog(null, "Enter a noun word: ");
		noun1 = JOptionPane.showInputDialog(null, "Enter another noun word: ");
		adjective0 = JOptionPane.showInputDialog(null,
				"Enter an adjective word: ");
		pastTenseVerb0 = JOptionPane.showInputDialog(null,
				"Enter a past-tense verb: ");
		JOptionPane.showMessageDialog(null, "Marry had a little " + noun0
				+ "\nIts " + noun1 + " was " + adjective0 + " as snow\n"
				+ "And everywhere that Marry " + pastTenseVerb0 + "\nThe "
				+ noun0 + " was sure to go");
		System.exit(0);

	}

}
