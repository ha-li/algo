package com.gecko.algorithms.unionfind;

public class QuickUnion extends UF implements UnionFind {

	public QuickUnion(int N) {
		init(N);
	}
	
	@Override
	public void union(int x, int y) {
		// TODO Auto-generated method stub
		int j = root(x);
		int k = root(y);
		uf[j] = k;
	}

	@Override
	public boolean connected(int x, int y) {
		// TODO Auto-generated method stub
		return uf[x] == uf[y];
	}

	private int root(int r) {
		while (r != uf[r]) { r = uf[r]; }
		return r;
	}
}
