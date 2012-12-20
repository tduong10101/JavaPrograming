package gameZone_1;

import javax.swing.JOptionPane;

public class PickTwoCards {
	final static String WIN = "You won!";
	final static String LOSE = "You lost!";
	static int totalWin = 0;
	static int totalGame = 0;
	static int totalLost = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int playAgain = 0;
		String result = "";
		do {

			int cardValue = ((int) (Math.random() * 100) % 12 + 0);
			int cardSuit = ((int) (Math.random() * 10) % 3 + 0);
			Card myCard = new Card(cardValue, cardSuit);
			int cardValue1 = cardValue;
			while (cardValue1 == cardValue) {
				cardValue1 = ((int) (Math.random() * 100) % 12 + 0);
			}
			int cardSuit1 = ((int) (Math.random() * 10) % 3 + 0);
			Card myCard1 = new Card(cardValue1, cardSuit1);
			if (cardValue > cardValue1) {
				result = WIN;
				totalWin++;
			} else if (cardValue < cardValue1) {
				result = LOSE;
				totalLost++;
			} else {
				if (cardSuit > cardSuit1) {
					result = WIN;
					totalWin++;
				} else if (cardSuit < cardSuit1) {
					result = LOSE;
					totalLost++;
				}
			}
			totalGame++;
			String message = "Your Card: " + myCard.result + "\nPC Card: "
					+ myCard1.result + "\n" + result + "\nNumber of win: "
					+ totalWin + "\nNumber of Lost: " + totalLost+"\nNumber of Game played: "+totalGame
					+ "\nPlay again?";
			playAgain = JOptionPane.showConfirmDialog(null, message,
					"Pick two card game", JOptionPane.YES_NO_OPTION);
		} while (playAgain == JOptionPane.YES_OPTION);
	}

}
