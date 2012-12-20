package caseProject_1;

import javax.swing.JOptionPane;

public class TravelTicket {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_TICKET = 999999;
		final int MIN_TICKET = 99999;
		boolean loop = true;
		String ticketNumberStr;
		int ticketNumber = 0;
		int lastDigit;
		int checkNum;
		while (loop == true) {
			ticketNumberStr = JOptionPane.showInputDialog(null,
					"Enter ticket number: ");

			try {
				ticketNumber = Integer.parseInt(ticketNumberStr);
				if (ticketNumber > MAX_TICKET || ticketNumber < MIN_TICKET) {
					JOptionPane.showMessageDialog(null,
							"Invalid ticket number, please enter again!");
				} else {
					loop = false;
				}
			} catch (NumberFormatException e) {

				int answer = JOptionPane
						.showConfirmDialog(
								null,
								"No value have enter. Would you like to re-enter or cancel!",
								"Confirm", JOptionPane.YES_NO_OPTION);
				if (answer == JOptionPane.NO_OPTION) {
					loop = false;
					System.exit(1);
				}

			}

		}
		lastDigit = ticketNumber % 10;
		checkNum = (ticketNumber / 10) % 7;
		if (checkNum == lastDigit) {
			JOptionPane
					.showMessageDialog(null, "Ticket number is valid (true)");
		} else {
			JOptionPane.showMessageDialog(null,
					"Ticket number is invalid (false)");
		}
		System.exit(0);
	}

}
