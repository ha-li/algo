package com.gecko.algorithms.sort;

public class SortValidation extends BaseSort {
	
	public static <T extends Comparable<T>> boolean isSorted(T[] comparables) {

		for(int i = 1; i < comparables.length; i++) {
			if( isLess(comparables[i], comparables[i-1]) ) return false;
		}
		
		return true;
	}
	
}
