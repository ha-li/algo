package com.gecko.adt.card;

public class Card {
	public enum Suit {
		DIAMOND("DIAMOND", 0),
		CLUB("CLUB", 1),
		HEARTS("HEARTS", 2),
		SPADE("SPADE", 3)
		;
		
		private int rank;
		private String suit;
		
		private Suit(String suit, int rank) {
			this.suit = suit;
			this.rank = rank;
		}
		
		public int rank() {
			return rank;
		}
		
		public String suit() {
			return suit;
		}
	}
	
	public enum Rank {
		ONE(1),
		TWO(2),
		THREE(3),
		FOUR(4),
		FIVE(5),
		SIX(6),
		SEVEN(7),
		EIGHT(8),
		NINE(9),
		TEN(10),
		JACK(11),
		QUEEN(12),
		KING(13),
		ACE(14)
		;

		
		private Rank(int _rank) {
			this.rank = _rank;
		}

		private int rank;
		public int rank() {
			return rank;
		}
	}
	
	private Suit suit;
	private Rank rank;

	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	public int compareTo(Card that) {
		if (this.suit.rank() < that.suit.rank() ) {return -1;} 
		if (this.suit.rank() > that.suit.rank() ) {return 1;}
		
		// get here ranks are equal
		if( this.rank.rank() < that.rank.rank() ) {return -1;}
		else if (this.rank.rank() > that.rank.rank() ) {return 1;}
		
		else return 0;
	}
	
	public String toString() {
		return this.suit.suit() + "-" + this.rank.rank(); 
	}
	
	public static void main(String[] args) {
		Card one_club = new Card(Suit.CLUB, Rank.ONE);
		Card ace_spade = new Card(Suit.HEARTS, Rank.TWO);
		
		System.out.println(one_club.compareTo(ace_spade));
	}
}
