package com.gecko.algorithms.merge;

import java.lang.reflect.Array;

public class Merge {
	
	public static <T extends Comparable<T>> void merge(T[] comparables, int lo, int mid, int high) {
		int _lo_idx = lo, _mid_idx = mid + 1;
		
		T[] _copy = copy(comparables);

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
	
	
	private static <T extends Comparable<T>>boolean less(T x, T y) {
		return x.compareTo(y) < 0;
	}
	
	private static <T extends Comparable<T>>boolean greater(T x, T y) {
		return x.compareTo(y) > 0;
	}
	
	private static <T extends Comparable<T>> T[] copy(T[] comparables) {
		T[] _copy = (T[]) Array.newInstance(comparables[0].getClass(),comparables.length);
		
		for(int i = 0; i < comparables.length; i++) {
			_copy[i] = comparables[i];
		}
		
		return _copy;
	}
	
	public static <T extends Comparable<T>> boolean isSorted(T[] comparables) {
		for(int i = 1; i < comparables.length; i++) {
			if( greater(comparables[i-1], comparables[i]) ) {
				return false;
			}
		}
		return true;
	}
}
