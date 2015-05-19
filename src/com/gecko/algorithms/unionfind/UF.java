package com.gecko.algorithms.unionfind;

public abstract class UF implements UnionFind {

	protected int[] uf;
	
	protected void init(int N) {
		uf = new int[N];
		for(int i = 0; i < N; i++) { uf[i] = i; }
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for( int i = 0; i < uf.length; i++ ) {
			sb.append(uf[i] + ",");
		}
		return sb.toString();
	}
}
