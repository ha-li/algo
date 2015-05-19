package com.gecko.algorithms.merge;

public class Merge {
	
	public static <T> void merge(Comparable<T>[] comparables, int lo, int mid, int high) {
		int _lo_idx = lo, _mid_idx = mid + 1;
		
		Comparable<T>[] _copy = copy(comparables);

		for(int i = lo; i <= high; i++) {
			if ( _lo_idx > mid )   { 
				// lo is pass the mid point, so the rest is the sorted mid ... hi
				comparables[i] = _copy[_mid_idx++]; 
			}
			else if ( _mid_idx > high )   { 
				// mid is pass hi, so everything else is lo...mid
				comparables[i] = _copy[_lo_idx++]; 
			}
			else if ( less(_copy[_mid_idx], _copy[_lo_idx]) ) { 
				// both lo and mid are in play, get the less of the two,
				// which is mid
				comparables[i] = _copy[_mid_idx++]; 
			} 
			else {
				// here min is lo
				comparables[i] = _copy[_lo_idx++];
			}
		}
	}
	
	
	private static boolean less(Comparable x, Comparable y) {
		return x.compareTo(y) < 0;
	}
	
	private static boolean greater(Comparable x, Comparable y) {
		return x.compareTo(y) > 0;
	}
	
	private static <T> Comparable<T>[] copy(Comparable<T>[] comparables) {
		Comparable<T>[] _copy = new Comparable[comparables.length];
		
		for(int i = 0; i < comparables.length; i++) {
			_copy[i] = comparables[i];
		}
		
		return _copy;
	}
	
	public static <T> boolean isSorted(Comparable<T>[] comparables) {
		for(int i = 1; i < comparables.length; i++) {
			if( greater(comparables[i-1], comparables[i]) ) {
				return false;
			}
		}
		return true;
	}
}
