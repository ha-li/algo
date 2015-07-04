package com.gecko.algorithms.order;

import org.junit.Assert;

public class ArrayOrder {
	protected static void assertIntegerArrayEquals(Integer[] expected, Integer[] actual) {
		for(int i = 0; i < expected.length; i++) {
			Assert.assertEquals(expected[i], actual[i]);
		}
	}
	
	protected static boolean isLess(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}
}
