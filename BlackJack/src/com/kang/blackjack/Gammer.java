package com.kang.blackjack;

public class Gammer {
	protected Card[] myCards = new Card[10];
	protected int sum = 0;	
	
	public int getSum() {
		return sum;
	}
	
	//카드 주소값을 외부로부터 받아서 myCards배열에 차곡차곡
	//저장한다.
	public void addCard (Card card) {
		for(int i=0; i<myCards.length; i++) {
			if(myCards[i] == null) {
				myCards[i] = card;
				sum += card.value;
				return;
			}
		}
	}
	
	public void openCards() {	
		for(Card c : myCards) {
			if(c != null) {
				System.out.println(c);				
			}			
		}
		System.out.printf("sum : %d\n", sum);
	}
}
