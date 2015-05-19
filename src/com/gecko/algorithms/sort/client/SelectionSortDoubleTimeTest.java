package com.gecko.algorithms.sort.client;

import com.gecko.algorithms.sort.SelectionSort;
import com.gecko.algorithms.sort.SortValidation;
import com.gecko.stopwatch.StopWatch;
import com.gecko.util.StdRandom;

public class SelectionSortDoubleTimeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int N = 150;
		
		Integer[] ints = new Integer[N];
		ints = StdRandom.populateI(N, 0, 100);
		
		StopWatch stopWatch = new StopWatch();
		double start = stopWatch.time();
		SelectionSort.sort(ints);
		double end = stopWatch.time();
		double total = end - start;
		
		double prev = 0;
		while ( N < 100000 ) {
			prev = total;
			N = N * 2;

			ints = StdRandom.populateI(N, 0, 100);
			
			start = stopWatch.time();
			SelectionSort.sort(ints);
			end = stopWatch.time();
			total = end - start;
			;
			System.out.printf("sorted=%b, N=%7d, %.1f\n",
				SortValidation.isSorted(ints), 
				N, 
				(total/prev) );
		}
		
		
	}

}
