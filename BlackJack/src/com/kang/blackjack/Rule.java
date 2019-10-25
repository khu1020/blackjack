package com.kang.blackjack;

public class Rule {
	public static void getWinner(Gammer gm, Dealer dl) {
		//둘다 21을 넘은 경우 > 비겼다
		System.out.println("--게이머--");
		gm.openCards();
		System.out.println("--딜러--");
		dl.openCards();
		
		final int SCORE = 21;
		int gSum = gm.getSum();
		int dSum = dl.getSum();
		
		if((gSum > SCORE && dSum > SCORE) || gSum == dSum) {
			System.out.println("비김");
			
		} else {			
			if(gSum > SCORE) {
				System.out.println("딜러 이김");
			} else if(dSum > SCORE) {
				System.out.println("게이머 이김");
			
			} else {
				if(gSum > dSum) {
					System.out.println("게이머 이김");
				} else {
					System.out.println("딜러 이김");
				}
			}
		}
	}
}
