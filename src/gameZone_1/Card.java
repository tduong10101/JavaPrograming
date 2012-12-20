package gameZone_1;
public class Card {
	final int NUM_CARD = 13;
	final int NUMERIC_CAR = 9;
	String[] cardNum = new String[NUM_CARD];
	String[] cardSuit = {"Club","Heart","Diamond","Spade"};
	public String result;
	public Card(int cardNum_,int cardSuit_){
		for(int i = 0;i<NUMERIC_CAR;i++){
			cardNum[i]=(i+2)+"";
		}
		cardNum[9]="Joker";
		cardNum[10]="Queen";
		cardNum[11]="King";
		cardNum[12]="Ace";
		result = cardNum[cardNum_]+" "+cardSuit[cardSuit_];
	}
}
