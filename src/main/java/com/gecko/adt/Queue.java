package com.gecko.adt;


/**
 * This is a partially implemented (and has bugs in it) queue using an array.
 * It is a bad idea to attempt to implement a queue using an array.
 * Dequeuing leaves empty slots in the front of the array, which leads to 
 * errors in size() vs array.length.
 * 
 * I have left the errors in as a reminder. Do not use this for a queue.
 * Bugs still exist. You have been warned.
 * 
 * Instead of using an array to implement a queue, use a linked list of nodes
 * to implement a queue, which allows you to unlink a node at the front,
 * and better illustrates the true dequeuing effect.
 * 
 * @Date Dec 2010
 * @author hlieu
 *
 * @param <T>
 */
public class Queue<T> {
	private T[] _impl;
	private int DEFAULT_SIZE = 2;
	private int head = -1;   // always points to the first in queue
	private int tail = -1;   // always points to the last in queue
	
	public Queue() {
		_impl = (T[]) new Object[DEFAULT_SIZE];
	}
	
	public T enqueue(T t) {
		if( size() == 0 ) { 
			_reset();  // reset the queue to empty state
			++head;    // first guy in, head is set
		}  
		
		if( _isFull() ) {
			resize( size() * 2 + 1);
		}
		
		_impl[++tail] = t;
		return t;
	}
	
	public T dequeue() {
		T t = null;
		
		if( size() > 0) {
			t = _impl[head];
			_impl[head++] = null;   // prevent loitering 
		}
		return t;
	}
	
	public void print() {
		System.out.print("Queue[" + _impl.length + "," + head + "," + tail + "]: ");
		for(int i = head; i <= tail; i++) {
			System.out.print(_impl[i] + ",");
		}
		System.out.println();
	}
	
	private void resize(int size) {
		// allocate a new queue of size
		T[] tmp = (T[]) new Object[size];
		
		// move items to new queue
		for( int i = head; i <= tail; i++) {
			tmp[i] = _impl[i];
		}
		
		// set the queue to the new queue
		_impl = tmp;
	}
	
	private boolean _isFull() {
		return size() == _impl.length;
	}
	
	// resets the queue to an empty state
	private void _reset() {
		head = -1;
		tail = -1;
	}
	
	// returns the number of items in the queue
	private int size() {
		if( tail > -1 && tail >= head ) { return tail - head + 1; }
		else { return 0; }
	}
}
