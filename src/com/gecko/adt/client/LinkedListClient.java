package com.gecko.adt.client;

import com.gecko.adt.LinkedList;

public class LinkedListClient {

	
	private static void linkedListStr() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Booyah");
		list.print();
		
		list.add("Knuckles");
		list.print();
		
		list.add("Jingle");
		list.add("Bells");
		list.add("Christmas");
		list.print();
	}
	
	private static void linkedListInt() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(5);
		list.print();
		
		list.add(6);
		list.print();
		
		list.add(7);
		list.add(10);
		list.add(22);
		list.print();
	}

	private static void linkedListJoin() {
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(5);		
		list1.add(6);
		list1.print();

		LinkedList<Integer> list2 = new LinkedList<Integer>();

		list2.add(7);
		list2.add(10);
		list2.add(22);
		list2.print();
		
		list1.join(list2);
		list1.print();
	}
	
	private static void linkedListJoin2() {
		LinkedList<Integer> list1 = new LinkedList<Integer>();

		LinkedList<Integer> list2 = new LinkedList<Integer>();

		list2.add(22);
		list2.print();
		
		list1.join(list2);
		list1.print();
	}
	
	private static void linkedListJoin3() {
		LinkedList<Integer> list2 = new LinkedList<Integer>();

		list2.add(33);
		list2.print();

		LinkedList<Integer> list1 = new LinkedList<Integer>();

		list2.join(list1);
		list2.print();
		
		list2.head();
		list2.print();
	}
	
	private static void linkedListJoin4() {
		LinkedList<Integer> list2 = new LinkedList<Integer>();

		LinkedList<Integer> list1 = new LinkedList<Integer>();

		list2.join(list1);
		list2.print();
		list2.head();
		list2.print();
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedListStr();
		linkedListInt();
		linkedListJoin();
		linkedListJoin2();
		linkedListJoin3();
		linkedListJoin4();
	}

}
