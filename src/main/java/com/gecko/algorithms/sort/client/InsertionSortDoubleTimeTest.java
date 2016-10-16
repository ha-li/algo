package com.gecko.algorithms.sort.client;

import com.gecko.algorithms.sort.InsertionSort;
import com.gecko.algorithms.sort.SortValidation;
import com.gecko.stopwatch.StopWatch;
import com.gecko.util.StdRandom;

public class InsertionSortDoubleTimeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int N = 1000;
		Integer[] ints = StdRandom.populateI(N, 0, 100);
		StopWatch stopWatch = new StopWatch();
		double start = stopWatch.time();
		InsertionSort.sort(ints);
		double end = stopWatch.time();
		double total = end - start;
		
		double prev = 0;
		while ( N < 500000 ) {
			prev = total;
			N = N * 2;
			
			ints = StdRandom.populateI(N, 0, 100);
			start = stopWatch.time();
			InsertionSort.sort(ints);
			end = stopWatch.time();
			total = end - start;
			
			System.out.printf("sorted=%b, N=%7d, ratio=%.1f\n", 
					SortValidation.isSorted(ints),
					N,
					(total/prev));
			
			
		}
		
	}

}
