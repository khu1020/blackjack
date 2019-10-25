package com.kang.blackjack;

public class Card {
	public final String shape;
	public final String mark;
	public final int value;
	
	public Card(String shape, int value) {
		this.shape = shape;
		this.mark = getMark(value);
		this.value = getValue(value);

	}
	
	private String getMark(int value) {
		switch(value) {
		case 0:
			return "A";
		case 10:
			return "J";
		case 11:
			return "Q";
		case 12:
			return "K";
		default: 
			return Integer.toString(value + 1);
		}
	}
	
	private int getValue(int value) {
		
		/*
		switch(value) {
		case 10: case 11: case 12:
			return 10;
		default:
			return value + 1;
		}
		*/
		
		if(value > 9) {
			return 10;
		} else {
			return value + 1;
		}
	}
	
	public String toString() {
		return String.format("%s - %s - %d", shape, mark, value);
	}
}