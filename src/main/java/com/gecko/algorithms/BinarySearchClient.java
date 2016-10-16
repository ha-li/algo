package com.gecko.algorithms;

import java.util.Arrays;

import com.gecko.stopwatch.StopWatch;
import com.gecko.util.StdRandom;

public class BinarySearchClient {

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 150;
		int[] ints = StdRandom.populate(N, -10000, 10000);
		Arrays.sort(ints);

		int[] keys = StdRandom.populate(N, -10000, 10000);
		double start, end, total = 0, prev;
		
		StopWatch stopWatch = new StopWatch();
		int rank, count = 0;
		for(int key: keys) {
			start = stopWatch.time();
			rank = BinarySearch.binarySearch(ints, key);
			end = stopWatch.time();
			if(rank > 0) count++;
			total += end - start;
		}
		// double prev = 0;
		
		while(N < 5000000) {
			prev = total;
			total = 0;
			N = N * 2;
			count = 0;
			ints = StdRandom.populate(N, -10000, 10000);
			keys = StdRandom.populate(N, -10000, 10000);
			Arrays.sort(ints);
			start = stopWatch.time();

			for(int key: keys) {
				rank = BinarySearch.binarySearch(ints, key);
				if(rank > 0) count++;
			}
			end = stopWatch.time();
			total = end - start;
			
			System.out.printf("N=%d, count=%d, total=%.5f, ratio=%.1f\n", N, count, total, total/prev);
		}
		System.out.println("end");
	}

}
