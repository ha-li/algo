package com.gecko.algorithms.merge;

public class MergeSort extends Merge {

	public static <T extends Comparable<T>> void sort(T[] comparables) {

		sort(comparables, 0, comparables.length-1);
	}
	
	private static <T extends Comparable<T>> void sort(T[] comparables, int lo, int hi) {
		if(lo >= hi) return;
		
		int mid = lo + (hi-lo)/2;
		sort(comparables, lo, mid);
		sort(comparables, mid + 1, hi);
		merge(comparables, lo, mid, hi);
	}
}
