package elpkg;
import java.util.*;

public class Deck {
	private List<Card> cards;
	private int size;			//num of not-yet-dealt cards; cards dealth from top down; next card = size - 1

	public Deck(String[] ranks, String[] suits, int[] values) {
		cards = new ArrayList<Card>();
		for (int i = 0; i < ranks.length; i++)
			for (String s : suits)
				cards.add(new Card(ranks[i], s, values[i]));
			
		size = cards.size();
	}

	public boolean isEmpty() {return size == 0;}
	
	public List<Card> getCards() {return cards;}
	public int getSize() {return size;}

	public void shuffle() {Collections.shuffle(cards);}
	
	public Card deal() {
		size--;
		return cards.get(cards.size() - 1);
	}

	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0)
				rtn = rtn + ", ";
			if ((size - k) % 2 == 0)
				rtn = rtn + "\n";
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size)
				rtn = rtn + ", ";
			if ((k - cards.size()) % 2 == 0)
				rtn = rtn + "\n";
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
