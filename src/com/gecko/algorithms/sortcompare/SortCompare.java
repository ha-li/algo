package com.gecko.algorithms.sortcompare;

import java.lang.reflect.Array;

import com.gecko.algorithms.sort.InsertionSort;
import com.gecko.algorithms.sort.SelectionSort;
import com.gecko.stopwatch.StopWatch;
import com.gecko.util.StdRandom;

public class SortCompare {

	public static <T extends Comparable<T>> T[] copy(T[] toCopy) {
		// if(toCopy[0].isAssignableFrom(toCopy[0].getClass()))
		T[] duplicate = (T[]) Array.newInstance(toCopy[0].getClass(), toCopy.length);
		for(int i = 0; i < toCopy.length; i++) {
			duplicate[i] = toCopy[i];
		}
		return duplicate;
	}
	
	public static void sortCompare() {
		int N = 150;
		
		Integer[] ints = StdRandom.populateI(N, 0, 100);
		Integer[] dup = copy(ints);
	
		StopWatch stopWatch = new StopWatch();
		double start = stopWatch.time();
		InsertionSort.sort(ints);
		double end = stopWatch.time();
		double insertionTime = end - start;
		
		double start2 = stopWatch.time();
		SelectionSort.sort(dup);
		double end2 = stopWatch.time();
		double selectionTime = end2 - start2;
		
		double totalInsertionTime = 0;
		double totalSelectionTime = 0;

		while (N < 35000) {
			N = N * 2;
			totalInsertionTime += insertionTime;
			totalSelectionTime += selectionTime;
			
			ints = StdRandom.populateI(N, 0, 100);
			dup = copy(ints);
			
			start = stopWatch.time();
			InsertionSort.sort(ints);
			end = stopWatch.time();
			insertionTime = end - start;
			
			start2 = stopWatch.time();
			SelectionSort.sort(dup);
			end2 = stopWatch.time();
			selectionTime = end2 - start2;
			System.out.println("finished sorting " + N);
		}
		
		System.out.printf("total insertion time = %.1f\n", totalInsertionTime );
		System.out.printf("total selection time = %.1f\n", totalSelectionTime );
		
		System.out.printf("%s is faster than %s by %.1f\n", 
				totalInsertionTime < totalSelectionTime ? "insertion sort" : "selection sort",
				totalInsertionTime < totalSelectionTime ? "selection sort" : "insertion sort",
				totalInsertionTime < totalSelectionTime	? (totalSelectionTime/totalInsertionTime) : (totalInsertionTime/totalSelectionTime)
			);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sortCompare();
	}

}
