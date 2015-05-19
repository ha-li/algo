package com.gecko.adt;

public class Bag<T> {
	
	
	private class Node {
		T item;
		Node next;
	}
	
	private Node head;
	
	
	public Bag() {}
	
	public T add(T item) {
		Node _new = new Node();
		_new.item = item;
		
		if(head == null) {
			head = _new;
		} else {
			head.next = _new;
		}
		
		
		return item;
	}
	
	
}
