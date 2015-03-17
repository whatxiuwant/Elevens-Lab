package elpkg;

public class Card {
	private String suit, rank;
	private int value;
	
	public Card(String s, String r, int v) {
		suit = s;
		rank = r;
		value = v;
	}
	
	public boolean matches(Card other) {return suit.equals(other.suit) && rank.equals(other.rank) && value == other.value;}
	
	public String getSuit() {return suit;}
	public String getRank() {return rank;}
	public int getValue() {return value;}
	
	public String toString() {return rank + " of " + suit + " (point value: " + value + ")"; }
}