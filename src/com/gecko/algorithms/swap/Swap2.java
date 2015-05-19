package com.gecko.algorithms.swap;

public class Swap2 {

	public static void swap(AnyObject _a, AnyObject _b) {
		System.out.print(_a + " " + _b + "\n");

		AnyObject _t = _a;
		_a = _b;
		_b = _t;

		System.out.print(_a + " " + _b + "\n");

	}
	public static void modify(AnyObject _a) {
		System.out.print(_a + "\n");
		_a.setI(100);
		System.out.print(_a + "\n");
	}
	
	public static void notModify(AnyObject _a) {
		System.out.print(_a + "\n");
		_a = new AnyObject(1000);
		System.out.print(_a + "\n");
	}
	
	public static void notSure(AnyObject _a) {
		System.out.print(_a + "\n");

		_a.setI(10005);
		System.out.print(_a + "\n");

		_a = new AnyObject(15);
		System.out.print(_a + "\n");

		_a.setI(25);
		System.out.print(_a + "\n");

	}

	
	public static void main(String [] args) {
		AnyObject one = new AnyObject(1);
		AnyObject two = new AnyObject(2);
		System.out.print(one + " " + two + "\n");
		swap(one, two);
		System.out.print(one + " " + two + "\n");
		
		modify(one);
		System.out.println(one);
		notModify(one);
		System.out.println(one);
		notSure(one);
		System.out.println(one);
		
	}

}
