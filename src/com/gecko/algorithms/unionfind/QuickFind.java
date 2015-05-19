package com.gecko.algorithms.unionfind;

public class QuickFind extends UF implements UnionFind {
	
	public QuickFind(int N) {
		init(N);
	}
	
	@Override
	public void union(int x, int y) {
		// TODO Auto-generated method stub
		int p_id = uf[x];
		int q_id = uf[y];
		
		for(int i = 0; i < uf.length; i++ ) {
			if(uf[i] == p_id) { uf[i] = q_id; }
		}
	}

	@Override
	public boolean connected(int x, int y) {
		// TODO Auto-generated method stub
		return uf[x] == uf[y];
	}
	
}
