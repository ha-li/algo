package com.gecko.adt.card.sort;

import com.gecko.adt.card.Card;

/**
 * Attempt to implement dequeue sort on a deck of card - 
 * only allowed operations are swapping the front 2 cards,
 * and moving the front card to the bottom of the deck
 * -not yet completed
 * @author hlieu
 *
 */
public class CardSort {
	
	
	public static void dequeueSort(Card[] deck) {
		for(int i = 0; i < deck.length; i++) {
			for(int j = 1; j < deck.length - i; j++) {
				if( less(deck[0], deck[1] ) ) {
					exchange(deck, 0, 1);
				}
				topWash(deck);
			}
			for(int s = i; s < 0; s--) {
				move(deck, 0, 4);
			}
			topWash(deck);
		}
		// topWash(deck);
	}
	
	public static void move(Card[] deck, int x, int y) {
		Card _tmp = deck[x];
		
		for(int i = x+1; x < y+1; i++) {
			moveForward(deck, i);
		}
		deck[y] = _tmp;
	}
	
	public static boolean less(Card _this, Card _that) {
		return _this.compareTo(_that) < 0;
	}
	
	// exchanges the top two cards in the deck
	public static void exchange(Card[] deck, int x, int y) {
		Card tmp = deck[x];
		deck[x] = deck[y];
		deck[y] = tmp;
	}
	
	public static void topWash(Card[] deck) {
		Card _tmp = deck[0];
		for(int i = 1; i < deck.length; i++) {
			moveForward(deck, i);
		}
		deck[deck.length - 1] = _tmp;
	}
	
	public static void moveForward(Card[] deck, int index) {
		deck[index-1] = deck[index];
	}
	
	public static void print(Card[] deck) {
		for(int i = 0; i < deck.length; i++)
		System.out.println(deck[i].toString());
	}
}
