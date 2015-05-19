package com.gecko.threesum;

public class ThreeSum {
	
	public static int threesum(int[] a) 
	{
		int cnt = 0;
		
		int N = a.length;
		
		for (int i = 0; i < N; i++) {
			for (int j = i; j < N; j++) {
				for (int k = j; k < N; k++) {
					if(a[i] + a[j] + a[k] == 0) {
						cnt++;
					}
				}
			}
		}
		
		return cnt;
	}
}
