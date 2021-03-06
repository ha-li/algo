package com.gecko.algorithms.sort;

public class InsertionSort extends BaseSort {
	
	public static <T extends Comparable<T>> void sort(T[] comparables) {
		
		for(int i = 1; i < comparables.length; i++) {
			for(int j = i; j > 0; j--) {
				if( isGreater(comparables[j-1], comparables[j]) ) {
					_exchange(comparables, j-1, j);
				}				
			}
		}
	}

	public static <T extends Comparable<T>> void sort2(T[] comparables) {

		for(int i = 1; i < comparables.length; i++) {
			for(int j = 0; j < i; j++) {
				if( isLess ( comparables[i], comparables[j] ) ) {
					_exchange ( comparables, i, j );
				}
			}
		}
	}
	
	
}
