package com.gecko.algorithms.sort;

/**
 * selection sort is an O(n^2) sorting algorithm.
 * at each iteration i, it finds the smallest value from i ... length-1,
 * then swaps i with that smallest value, to produce a sorted array
 * @author hlieu
 *
 * @param <T>
 */
public class SelectionSort<T> extends BaseSort {
	
	@SuppressWarnings("unchecked")
	public static <T> void sort(Comparable<T>[] comparables){
		
		int min = 0;
		for(int i = 0; i < comparables.length; i++) {
			min = i;   // min start off at i
			for(int j = i; j < comparables.length; j++) {   // from i ... length, find min
				if( comparables[j].compareTo((T)comparables[min]) == -1) { min = j; }				
			}
			
			_exchange(comparables, i, min);
		}
	}

}
