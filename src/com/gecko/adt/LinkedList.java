package com.gecko.adt;

public class LinkedList<T> {
	
	private Node head;
	private Node tail;
	private int size = 0;
	
	public LinkedList() {}
	
	// if this were a queue, this would be the same an enqueue method
	public T add(T t) {
		Node _new = new Node();
		_new.item = t;

		if(head == null) {   // new item
			head = _new;
		} else {
			tail.next = _new;
		}
		tail = _new;
		size++;
		
		return t;
	}
	
	// join list to the tail of this 
	public void join(LinkedList<T> list) {
		// need to handle 2 scenarios
		// 1. this is empty
		// 2. list is empty  -- then this stays the same
		// 3. list is not empty
		
		// scenario 1, just make this point to list
		if( size == 0 ) {
			head = list.head;
			tail = list.tail;
		} else if( list.size != 0 ) {
			tail.next = list.head;
			tail = list.tail;
		}
		size += list.size;
	}
	
	// remove the front from the list
	// if this were a queue, this would be dequeue method
	public T head() {   
		T _r = null;
		
		if(head == null) { return null; }
		else { 
			_r = head.item;
			head = head.next;
			--size;
		}
		return _r;
	}
	
	public int size() {
		return size;
	}

	public void print() {
		
		for (Node i = head; i != null; i = i.next ) {
			System.out.print(i.item);
			System.out.print(",");
		}
		System.out.println();
	}
	
	private class Node{
		T item;
		Node next;
	}

}
