package com.gecko.algorithms.sort.client;

import com.gecko.algorithms.sort.InsertionSort;
import com.gecko.algorithms.sort.InsertionSortInt;
import com.gecko.stopwatch.StopWatch;
import com.gecko.util.StdRandom;

public class InsertionSortComparison {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 1000;
		int[] ints = StdRandom.populate(N, 0, 100);
		Integer[] intsI = StdRandom.populateI(N,  0, 100);
		
		StopWatch stopWatch = new StopWatch();
		
		double startI = stopWatch.time();
		InsertionSort.sort(intsI);
		double endI = stopWatch.time();
		
		double start = stopWatch.time();
		InsertionSortInt.sort(ints);
		double end = stopWatch.time();
		
		double totalTimeI = 0;
		double totalTime = 0;
		
		while ( N < 500000 ) {
			N = N*2;
			totalTimeI =+ endI - startI;
			totalTime =+ end - start;
			
			ints = StdRandom.populate(N, 0, 100);
			intsI = StdRandom.populateI(N, 0, 100);
			
			start = stopWatch.time();
			InsertionSortInt.sort(ints);
			end = stopWatch.time();
			
			startI = stopWatch.time();
			InsertionSort.sort(intsI);
			endI = stopWatch.time();

			System.out.printf("N=%d, Int[] total time=%.1f\n", N, endI-startI);
			System.out.printf("N=%d, int[] total time=%.1f\n", N, end-start);
		}
		totalTimeI =+ endI - startI;
		totalTime =+ end - start;
		
		System.out.printf("Total Time Int[] = %.1f\n", totalTimeI);
		System.out.printf("Total Time int[] = %.1f\n", totalTime);
		System.out.printf("Integer sort is %.1f\n", (totalTimeI/totalTime));
	}

}
