package com.gecko.util;

import java.util.Random;

public class StdRandom {
	
	public static int[] populate(int N, int min, int max) {
		int[] a = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = random(min,max);
		}
		return a;
	}
	
	public static int random(int min, int max) {
		Random rand = new Random();
		int i = min + rand.nextInt(max-min+1);
		return i;
	}

	
	public static Integer[] populateI(int N, int min, int max) {
		Integer[] a = new Integer[N];
		for(int i = 0; i < N; i++) {
			a[i] = randomI(min,max);
		}
		return a;
	}

	
	public static Integer randomI(int min, int max) {
		Random rand = new Random();
		Integer i = min + rand.nextInt(max-min+1);
		return i;
	}

}
