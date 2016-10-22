package com.gecko.algorithms.sort;

public class QuickSort extends BaseSort{

	public static <T extends Comparable<T>> void sort(T[] comparables) {
		sort(comparables, 0, comparables.length - 1);
	}
	
	public static <T extends Comparable<T>> void sort(T[] comparables, int lo, int hi) {
		
		if(lo >= hi) return;
		int j = partition(comparables, lo, hi);
		sort(comparables, lo, j-1);
		sort(comparables, j+1, hi);
	}

	// 
	public static <T extends Comparable<T>> int partition(T[] comparables, int lo, int hi) {
		T p = comparables[lo];   // the pivot value
		int i = lo, j = hi+1;
		
		while(true) {
			while( isLess(comparables[++i], p) ) {
				if(i >= hi) {
					break;
				}
			}
			while( isLess(p, comparables[--j]) ) {
				if(j <= lo) {
					break;
				}
			}
			if(i>=j) { 
				break;
			}
			_exchange(comparables, i, j);
		}
		_exchange(comparables, lo, j);
		return j;
	}
	
	public static <T extends Comparable<T>> String toString(T[] comparables) {
		StringBuffer br = new StringBuffer();
		for(int i = 0; i < comparables.length; i++) {
			br.append(comparables[i] + ", ");
		}
		return br.toString().substring(0, br.length() - 2);
	}

}
