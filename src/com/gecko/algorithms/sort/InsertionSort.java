package com.gecko.algorithms.sort;

public class InsertionSort extends BaseSort {
	
	public static <T> void sort(Comparable<T>[] comparables) {
		
		for(int i = 1; i < comparables.length; i++) {
			for(int j = i; j > 0; j--) {
				if( isGreater(comparables[j-1], comparables[j]) ) {
					_exchange(comparables, j-1, j);
				}				
			}
		}
	} 
	
	
}
