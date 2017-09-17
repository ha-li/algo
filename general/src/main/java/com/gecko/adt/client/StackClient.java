package com.gecko.adt.client;

import com.gecko.adt.Stack;

public class StackClient {

	/**
	 * @param args
	 */ 
	public static void stringClient() {
		// TODO Auto-generated method stub
		Stack<String> s = new Stack<String> ();
		s.push("Bell");
		s.push("Lafontaine");
		s.print();
		
		s.push("Hello");
		s.print();
		
		s.pop();
		s.print();
		
		s.pop();
		s.pop();
		s.print();
		
		s.pop();
		s.pop();
		s.print();
		
		stringIterator();
	}

	public static void stringIterator() {
		Stack<String> s = new Stack<String> ();
		s.push("Bell");
		s.push("Lafontaine");
		s.push("Monet");
		
		for(String str: s) {
			System.out.println(str);
		}
	}
	
	public static void intClient() {
		Stack<Integer> i = new Stack<Integer>();
		i.push(50);
		i.push(50);
		i.print();
		
		i.pop();
		i.print();
		
		i.push(25);
		i.print();
		
		i.pop();
		i.pop();
		i.pop();
		i.pop();
		i.print();
	}
	
	public static void main(String[] args) {
		stringClient();
		intClient();
	}
}
