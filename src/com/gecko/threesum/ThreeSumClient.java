package com.gecko.threesum;

import com.gecko.stopwatch.StopWatch;
import com.gecko.util.StdRandom;

public class ThreeSumClient {

	public static int[] populate(int N) {
		int[] a = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = StdRandom.random(-1000,1000);
		}
		return a;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StopWatch stopWatch = new StopWatch();
		int N = 150;
		
		int[] ints = populate(N);
		double prev = 0;
		
		double start = stopWatch.time();
		int count = ThreeSum.threesum(ints);
		double end = stopWatch.time();
		double total = end - start;
		
		
		while(N < 10000) {
			prev = total;
			N = N * 2;
			ints = populate(N);
			start = stopWatch.time();
			count = ThreeSum.threesum(ints);
			end = stopWatch.time();
			total = end - start;
			
			System.out.printf("N=%4d, count:%7d, ratio:%.1f\n", N, count, total/prev);	
		}
		System.out.println("end for");
		System.out.printf("As N -> INF, the order of growth for 2^x -> %.1f\n", (total/prev));
		//System.out.println("Number of three sums " + count + ". elapsed time " + time);
		
	}

}
