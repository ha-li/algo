package com.gecko.algorithms.unionfind;


public class QuickFindClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * @param args
		 */
		int size = 10;
		UnionFind quickFind = new QuickFind(size);
		
		//Object StdIn;
		int p, q = 0;
		p = 5; q = 8;
		if( !quickFind.connected(p, q) ) {
			quickFind.union(p, q);
		}
		p = 7; q = 9;
		if( !quickFind.connected(p, q) ) {
			quickFind.union(p, q);
		}

		p = 5; q = 2;
		if( !quickFind.connected(p, q) ) {
			quickFind.union(p, q);
		}
		
		System.out.println(quickFind.toString());
	}

}
