package com.gecko.adt.client;

import com.gecko.adt.Queue;

public class QueueClient {

	private static void stringClient() {
		Queue<String> q_str = new Queue<String>();
		q_str.enqueue("Boujour");
		q_str.print();
		
		q_str.dequeue();
		q_str.print();
		
		
		q_str.enqueue("monsieur");
		q_str.enqueue("comme");
		q_str.print();
		
		q_str.dequeue();
		q_str.print();
		
		q_str.enqueue("bugs");
		q_str.enqueue("bunny");
		q_str.print();
		
		q_str.dequeue();
		q_str.dequeue();
		q_str.print();
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringClient();
	}

}
