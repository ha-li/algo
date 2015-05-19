package com.gecko.adt;

import java.util.Iterator;
import java.util.NoSuchElementException;
 

/**
 * A simple stack container class.
 * A LIFO data structure with some degree of memory optimization,
 * but no guarantee of thread safety.
 * 
 * An exercise in implementing a half-ass stack
 * 
 * @author hlieu
 *
 * @param <T>
 */
public class Stack<T> implements Iterable<T> {
	
	private T[] STACK;
	private int index;   // the index of the most recently added item + 1
	private int DEFAULT_SIZE = 2;
	
	public Stack() {
		STACK = (T[]) new Object[DEFAULT_SIZE];
		index = 0;
	}
	
	
	/**
	 * pushes an item onto the top of the stack
	 * @param t
	 */
	public void push(T t) {
		if( isFull() ) { _resize( size() * 2 + 1 ); }  // the stack is full so we have to resize it
		
		// here we know that the stack will fit the new items
		// so lets stick it in
		STACK[index++] = t;
	}
	
	
	// removes and returns the top item from the stack
	public T pop() {
		if(index == 0) { return null; }
		
		T t = STACK[--index];
		
		// no loitering allowed
		// let gc kick in, clean up some memory
		STACK[index] = null; 
		
		// lets optimize our memory by resizing when we only using
		// 1/4 of capacity
		if( size() < STACK.length/4 ) { 
			_resize( STACK.length/2 ); 
		}
		return t;
	}
	
	
	// the current count of items in the stack
	private int size() {
		return index;
	}
	
	// should be obvious
	private boolean isFull() {
		return index == STACK.length;
	}
	
	// resize the stack to size, only allowed to call this
	// internally, do not make this a public method
	private void _resize(int size) {
		T[] _new = (T[]) new Object[size];
		_copy(STACK, _new);
		STACK = _new;
	}
	
	// copy the contents of old into _new
	// do not make this public, only allowed to be called
	// internally
	private void _copy(T[] old, T[] _new) {
		
		int count = Math.min(old.length, _new.length);
		
		for( int i = 0; i < count; i++ ) {
			_new[i] = old[i];
		}
	}
	
	public void print() {
		System.out.print("Stack content: ");
		for(int i = 0; i < index; i++) {
			System.out.print(STACK[i] + ",");
		}
		System.out.println();
	}


	@Override
	public Iterator<T> iterator() {
		return new StackIterator();
	}
	
	private class StackIterator implements Iterator<T> {

		private int i = size();
		
		// take away the constructor
		private StackIterator() {}
		
		@Override
		public boolean hasNext() {
			return i > 0;
		}

		@Override
		public T next() {
			// don't remove the item in next because
			// next time iterate, should still be there
			if(i == 0) { throw new NoSuchElementException(); }
			
			return STACK[--i];
		}

		@Override
		public void remove() {
			// should not modify the data during iteration
			throw new UnsupportedOperationException();
			// STACK[--i] = null;
		}
		
	}
}
