
public class Card {
	private int number;
	private int suit;
	public Card() {
		number = 0;
		suit = 0;
	}
	public Card(int n, int s) {
		// TODO Auto-generated constructor stub
		number = n;
		suit = s;
	}
	
	public String getSuit() {
		if((suit % 4) == 1) {
			return "Spades";
		}
		else if((suit % 4) == 2) {
			return "Clubs";
		}
		else if((suit % 4) == 3) {
			return "Hearts";
		}
		else {
			return "Diamonds";
		}
	}
	public String getNumber() {
		if(number == 1) {
			return "Ace";
		}
		else if(number == 11) {
			return "Jack";
		}
		else if(number == 12) {
			return "Queen";
		}
		else if(number == 13) {
			return "King";
		}
		else {
			return number + "";
		}
		
	}
	
	public String toString() {
		return "You have chosen the " + getNumber() + " of " + getSuit();
	}
	
}
