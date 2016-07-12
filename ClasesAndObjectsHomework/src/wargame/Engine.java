package wargame;

import java.util.ArrayList;

public class Engine {
	private Player playerOne;
	private Player playerTwo;
	private CardFactory fac;

	public Engine() {
		this.playerOne = new Player();
		this.playerTwo = new Player();
		this.fac = new CardFactory();
	}

	public void run() {

		this.populateDecks(this.playerOne.getCards(), this.playerTwo.getCards());
		battle();
		if (playerOne.getCollectedCards().size() > playerTwo.getCollectedCards().size()) {
			System.out.println("Player one wins");
		} else if (playerOne.getCollectedCards().size() < playerTwo.getCollectedCards().size()) {
			System.out.println("Player two wins");
		} else {
			System.out.println("Draw !");
		}
	}

	private void battle() {
		int i = 0;
		Card[] deckOne = playerOne.getCards();
		Card[] deckTwo = playerTwo.getCards();
		while (playerOne.getCards().length > i && playerTwo.getCards().length > i) {
			if (deckOne[i].getStrenght() > deckTwo[i].getStrenght()) {
				playerOne.addCard(deckOne[i]);
				playerOne.addCard(deckTwo[i]);
				i++;
			} else if (deckOne[i].getStrenght() < deckTwo[i].getStrenght()) {
				playerTwo.addCard(deckOne[i]);
				playerTwo.addCard(deckTwo[i]);
				i++;
			} else {
				if (deckOne.length - i > 3 && deckTwo.length > 3) {
					i += 3;
					ArrayList<Card> tempCards = new ArrayList<Card>();
					tempCards.add(deckOne[i]);
					tempCards.add(deckOne[i - 1]);
					tempCards.add(deckOne[i - 2]);
					tempCards.add(deckOne[i - 3]);
					tempCards.add(deckTwo[i]);
					tempCards.add(deckTwo[i - 1]);
					tempCards.add(deckTwo[i - 2]);
					tempCards.add(deckTwo[i - 3]);
					do {
						if (deckOne[i].getStrenght() > deckTwo[i].getStrenght()) {
							playerOne.addAll(tempCards);
							i++;
							break;
						} else if (deckOne[i].getStrenght() < deckTwo[i].getStrenght()) {
							playerTwo.addAll(tempCards);
							i++;
							break;
						} else {
							i++;
							tempCards.add(deckOne[i]);
							tempCards.add(deckTwo[i]);
						}
					} while (deckOne.length > i && deckTwo.length > i);
				} else {
					return;
				}
			}
		}
	}

	private void populateDecks(Card[] one, Card[] two) {
		Card[] deck = this.fac.generateDeck();
		for (int i = 0; i < 26; i++) {
			two[i] = deck[i];
		}
		for (int i = 26; i < deck.length; i++) {
			one[i - 26] = deck[i];
		}
	}

}
