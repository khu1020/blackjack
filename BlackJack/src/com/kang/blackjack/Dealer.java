package com.kang.blackjack;

public class Dealer extends Gammer{
	public void needMoreCard(CardDeck cd) {
		
		if(sum <= 16) {
			addCard(cd.pick());
		}
	}
}
