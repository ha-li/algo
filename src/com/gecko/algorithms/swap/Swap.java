package com.gecko.algorithms.swap;

public class Swap {
	public static void swap(AnyObject _a, AnyObject _b) {
		System.out.print(_a.getI() + " " + _b.getI() + "\n");

		AnyObject _t = _a;
		_a = _b;
		_b = _t;

		System.out.print(_a.getI() + " " + _b.getI() + "\n");

	}
	
	public static void modify(AnyObject _a) {
		_a.setI(100);
	}
	
	public static void notModify(AnyObject _a) {
		_a = new AnyObject(1000);
	}
	
	public static void notSure(AnyObject _a) {
		_a.setI(10005);
		_a = new AnyObject(15);
		_a.setI(25);
	}
	
/**
 *  java is always pass by value - to see why, run this.
 *  see this page 
 *  http://stackoverflow.com/questions/7893492/is-java-really-passing-objects-by-value/7893495#7893495
 * @param args
 */
	public static void main(String[] args) {
		AnyObject one = new AnyObject(1);
		AnyObject two = new AnyObject(2);
		System.out.print(one.getI() + " " + two.getI() + "\n");
		swap(one, two);
		System.out.print(one.getI() + " " + two.getI() + "\n");
		
		modify(one);
		System.out.println(one.getI());
		notModify(one);
		System.out.println(one.getI());
		notSure(one);
		System.out.println(one.getI());
	}	
}	
