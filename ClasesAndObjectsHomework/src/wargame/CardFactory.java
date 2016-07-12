package wargame;

import java.util.ArrayList;
import java.util.Random;

public class CardFactory {

	public Card[] generateDeck() {
		ArrayList<Card> deck = new ArrayList<Card>();

		for (int i = 0; i < 4; i++) {
			deck.add(new Card("2", 2));
			deck.add(new Card("3", 3));
			deck.add(new Card("4", 4));
			deck.add(new Card("5", 5));
			deck.add(new Card("6", 6));
			deck.add(new Card("7", 7));
			deck.add(new Card("8", 8));
			deck.add(new Card("9", 9));
			deck.add(new Card("10", 10));
			deck.add(new Card("J", 11));
			deck.add(new Card("D", 12));
			deck.add(new Card("K", 13));
			deck.add(new Card("A", 14));
		}

		return shuffle(deck);
	}

	private Card[] shuffle(ArrayList<Card> cards) {
		Random rnd = new Random();
		Card[] array = new Card[cards.size()];
		cards.toArray(array);
		int n = array.length;
		for (int i = 0; i < n; i++) {
			int r = i + rnd.nextInt(n - i);
			Card temp = array[i];
			array[i] = array[r];
			array[r] = temp;
		}
		return array;
	}
}
