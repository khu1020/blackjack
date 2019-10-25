package com.kang.blackjack;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		CardDeck cd = new CardDeck();
		Dealer d = new Dealer();
		Gammer g = new Gammer();
		
		d.addCard(cd.pick());
		g.addCard(cd.pick());
		d.addCard(cd.pick());
		g.addCard(cd.pick());
		d.needMoreCard(cd);
		
		Scanner scan = new Scanner(System.in);		
		while(true) {
			g.openCards();			
			System.out.print("카드 더 받는다 (y) : ");
			String answer = scan.next();
			
			if(answer.equals("y")) {
				g.addCard(cd.pick());
			} else {
				break;
			}
		}		
		scan.close();		
		Rule.getWinner(g, d);
	}
}
