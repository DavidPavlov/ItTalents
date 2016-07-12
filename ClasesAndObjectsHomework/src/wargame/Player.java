package wargame;

import java.util.ArrayList;

public class Player {
	private Card[] cards;
	private ArrayList<Card> collectedCards;

	public Player() {
		this.cards = new Card[26];
		this.collectedCards = new ArrayList<Card>();
	}

	public Card[] getCards() {
		return cards;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}

	public ArrayList<Card> getCollectedCards() {
		return collectedCards;
	}

	public void addCard(Card c) {
		this.collectedCards.add(c);
	}

	public void addAll(ArrayList<Card> cards) {
		for (int i = 0; i < cards.size(); i++) {
			this.addCard(cards.get(i));
		}
	}
}
