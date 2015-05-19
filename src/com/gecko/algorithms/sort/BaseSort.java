package com.gecko.algorithms.sort;

public class BaseSort {
	
	public static <T> void _exchange(Comparable<T>[] comparables, int _x, int _y) {
		Comparable<T> _t = comparables[_x];
		comparables[_x] = comparables[_y];
		comparables[_y] = _t;
	}
	
	@SuppressWarnings("unchecked")
	public static <T> boolean isLess(Comparable _this, Comparable _that) {
		return _this.compareTo(_that) < 0;
	}
	
	public static <T> boolean isGreater(Comparable _this, Comparable _that) {
		return _this.compareTo(_that) > 0;
	}

}
