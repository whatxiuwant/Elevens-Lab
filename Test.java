package elpkg;

public class Test {
	public static void main(String[] args) {
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jacks", "Queen", "King", "Ace"};
		String[] suits = {"Diamond", "Club", "Heart", "Spade"};
		int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		Deck deck = new Deck(ranks, suits, values);
		deck.shuffle();
		System.out.println(deck);
	}
	
	public static void perfectShuffle(int[] values) {
		if (values.length > 1) {
			int[] front = new int[values.length / 2];
			for (int i = 0; i < front.length; i++)
				front[i] = values[i];
			perfectShuffle(front);
			
			int[] end = new int[values.length - front.length];
			for (int i = values.length / 2; i < values.length; i++)
				end[i - values.length / 2] = values[i];
			perfectShuffle(end);
			
			shuffle(front, end, values);
		}
	}
	
	public static void shuffle(int[] a, int[] b, int[] temp) {
		
	}
	
	public static void selectionShuffle(int[] values) {
	}
}