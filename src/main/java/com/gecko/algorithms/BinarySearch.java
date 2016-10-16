package com.gecko.algorithms;


/** 
 * implementation of binary search 
 * @author hlieu
 *
 */
public class BinarySearch {
	
	/**
	 * returns the index where 'key' is located within a,
	 * or -1 if key cannot be found.
	 * 
	 * every iteration of the the loop the search range is 
	 * halved, so the run time is O(log n), log 2 scale.
	 * 
	 * if the iteration reduced range by 5, then run time
	 * would be O(log n), log 5 scale, etc
	 * 
	 * @param a - must be in sorted order
	 * @param key
	 * @return
	 */
	public static int binarySearch(int[] a, int key) {
		int lo = 0, hi = a.length;
		int mid = 0;  // the mid point to search
		
		while( lo < hi ) {
			
			// two ways to calculate mid point
			// bad way is  ( lo + hi ) / 2
			// which leads to overflow when hi 
		    // -> limits of int
			
			// this is the correct way to calculate mid point
			mid = lo + (hi-lo) / 2;
			
			if(key < a[mid]) {
				hi = mid - 1;
			} else if ( key > a[mid] ) {
				lo = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
