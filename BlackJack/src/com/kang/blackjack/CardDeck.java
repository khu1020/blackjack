package com.kang.blackjack;

public class CardDeck {
	private Card[] cards = new Card[52];
	
	CardDeck () {
		int oneCardCnt = 13;
		String[] shapes = {"spade", "heart", "clover", "diamond"};
		
		int idx = 0;
		for(int i = 0; i < shapes.length; i++) {
			for(int z = 0; z < oneCardCnt; z++) {
				Card c = new Card(shapes[i], z);
				cards[idx++] = c;
			}
		}
		
		shuffle();
	}
	
	private void shuffle() {
		Card temp;
		for(int i = 0; i < 52; i++) {
			int randomidx = (int) (Math.random() * 51);
			temp = cards[randomidx];
			cards[randomidx] = cards[i];
			cards[i] = temp;
		}
	}
	
	public void showCards() {
		for(Card c : cards) {
			System.out.println(c);
		}
	}
	
	public Card pick() {
		Card c = null;
		for(int i = 0; i < cards.length; i++) {
			if(cards[i] != null) {
				c = cards[i];
				cards[i] = null;
				break;
			}
		}
		return c;
	}
}
