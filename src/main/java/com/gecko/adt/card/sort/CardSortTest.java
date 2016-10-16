package com.gecko.adt.card.sort;

import com.gecko.adt.card.Card;

public class CardSortTest {

	public static void lessTest() {
		Card[] deck = new Card[5];
		deck[0] = new Card(Card.Suit.DIAMOND, Card.Rank.ONE);
		deck[1] = new Card(Card.Suit.CLUB, Card.Rank.FIVE);
		deck[2] = new Card(Card.Suit.SPADE, Card.Rank.JACK);
		deck[3] = new Card(Card.Suit.HEARTS, Card.Rank.KING);		
		deck[4] = new Card(Card.Suit.HEARTS, Card.Rank.QUEEN);		
	
		System.out.println(CardSort.less(deck[0], deck[1]));
		System.out.println(CardSort.less(deck[1], deck[2]));
		System.out.println(CardSort.less(deck[2], deck[3]));
		System.out.println(CardSort.less(deck[3], deck[4]));
	}
	
	public static void topWashTest() {
		Card[] deck = new Card[5];
		deck[0] = new Card(Card.Suit.DIAMOND, Card.Rank.ONE);
		deck[1] = new Card(Card.Suit.CLUB, Card.Rank.FIVE);
		deck[2] = new Card(Card.Suit.SPADE, Card.Rank.JACK);
		deck[3] = new Card(Card.Suit.HEARTS, Card.Rank.KING);		
		deck[4] = new Card(Card.Suit.HEARTS, Card.Rank.QUEEN);

		CardSort.print(deck);
		CardSort.topWash(deck);
		CardSort.print(deck);
	}
	
	public static void moveForwardTest() {
		Card[] deck = new Card[5];
		deck[0] = new Card(Card.Suit.DIAMOND, Card.Rank.ONE);
		deck[1] = new Card(Card.Suit.CLUB, Card.Rank.FIVE);
		deck[2] = new Card(Card.Suit.SPADE, Card.Rank.JACK);
		deck[3] = new Card(Card.Suit.HEARTS, Card.Rank.KING);		
		deck[4] = new Card(Card.Suit.HEARTS, Card.Rank.QUEEN);

		Card _tmp = deck[1];
		CardSort.moveForward(deck, 2);
		deck[2] = _tmp;
		System.out.println("Move Foward");
		CardSort.print(deck);
	}
	
	public static void exchangeTest() {
		Card[] deck = new Card[5];
		deck[0] = new Card(Card.Suit.DIAMOND, Card.Rank.ONE);
		deck[1] = new Card(Card.Suit.CLUB, Card.Rank.FIVE);
		deck[2] = new Card(Card.Suit.SPADE, Card.Rank.JACK);
		deck[3] = new Card(Card.Suit.HEARTS, Card.Rank.KING);		
		deck[4] = new Card(Card.Suit.HEARTS, Card.Rank.QUEEN);
		System.out.println("Exchange Test");
		CardSort.exchange(deck, 3, 4);
		CardSort.print(deck);
	}
	
	public static void dequeueSortTest() {
		Card[] deck = new Card[5];
		deck[0] = new Card(Card.Suit.DIAMOND, Card.Rank.ONE);
		deck[1] = new Card(Card.Suit.CLUB, Card.Rank.FIVE);
		deck[2] = new Card(Card.Suit.SPADE, Card.Rank.JACK);
		deck[3] = new Card(Card.Suit.HEARTS, Card.Rank.KING);		
		deck[4] = new Card(Card.Suit.HEARTS, Card.Rank.QUEEN);
		CardSort.dequeueSort(deck);
		System.out.println("Dequeue Sort Test");
		CardSort.print(deck);		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//lessTest();
		//topWashTest();
		//moveForwardTest();
		//exchangeTest();
		dequeueSortTest();
	}

}
