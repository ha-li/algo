package com.gecko.algorithms.sort;

public interface Sort {
	public <T extends Comparable<T>> void sort(T[] comparables);
}
