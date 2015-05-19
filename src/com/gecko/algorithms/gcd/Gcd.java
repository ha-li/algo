package com.gecko.algorithms.gcd;

/**
 * Greatest Common Divisor (GCD)
 * @author hlieu
 *
 */
public class Gcd {

	public static int gcd(int p, int q) {
		if(q == 0) return p;
	
		int r = p % q;
		
		return gcd(q, r);
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gcd = Gcd.gcd(15, 500);
		System.out.println(gcd);
	}

}
