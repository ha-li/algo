package com.gecko.algorithms;

import java.text.DecimalFormat;
/**
 * int limit is 2,147,483,647
 * this class helps us find that limit
 * the lower limit for a n-bit int is -2^(n-1)
 * the upper limit for a n-bit int is 2^(n-1) - 1
 * 
 * 
 * @author hlieu
 *
 */
public class LimitsInt {

	public static int limit() {
		int lim = 0;
		int next = lim + 1;
		
		while (true) {
			lim++;
			next = lim + 1;  // next should be larger except at overflow
			
			if(next < lim) break;
		}
		
		return lim;
	}
	
	public static void formattedOutput(int i) {
		System.out.println(new DecimalFormat("###,###").format(i));
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		formattedOutput(limit());
	}

}
