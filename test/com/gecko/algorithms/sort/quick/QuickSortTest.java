package com.gecko.algorithms.sort.quick;

import junit.framework.Assert;

import org.junit.Test;

import com.gecko.algorithms.order.ArrayOrder;
import com.gecko.algorithms.sort.QuickSort;

public class QuickSortTest extends ArrayOrder{

	private static <T> boolean isPartitioned(Comparable<T>[] comparables, int partition) {
		for(int i = 0; i < comparables.length; i++) {
			if(i < partition) {
				if(isLess(comparables[partition], comparables[i])) {
					return false;
				}
			}
			
			if(i > partition) {
				if(isLess(comparables[i], comparables[partition])) {
					return false;
				}
			}
		}
		return true;
	}
	
	//@Test
	public void partitionZeroTest() {
		Integer[] ints = new Integer[0];
		int i = QuickSort.partition(ints, 0, 0);
		
		Integer[] expected = {};
		Assert.assertTrue(isPartitioned(ints, i));
	}
	
	//@Test
	public void partitionOneTest() {
		Integer[] ints = new Integer[1];
		ints[0] = 1;
		int i = QuickSort.partition(ints, 0, 0);
		
		System.out.println("partition = " + i + ", array=" + QuickSort.toString(ints));
		Assert.assertTrue(isPartitioned(ints, i));
	}
	
	@Test
	public void partitionTwoSortedTest() {
		Integer[] ints = new Integer[2];
		ints[0] = 1;
		ints[1] = 5;
		int i = QuickSort.partition(ints, 0, 1);
		
		// Integer[] expected = {1, 5};
		System.out.println("partition = " + i + ", array=" + QuickSort.toString(ints));
		Assert.assertTrue(isPartitioned(ints, i));
	}
	
	@Test
	public void partitionTwoUnsortedTest() {
		Integer[] ints = new Integer[2];
		ints[0] = 5;
		ints[1] = 1;
		int i = QuickSort.partition(ints, 0, 1);
		
		//Integer[] expected = {1, 5};
		System.out.println("partition=" + i + ", array=" + QuickSort.toString(ints));
		Assert.assertTrue(isPartitioned(ints, i));
	}
	
	@Test
	public void partitionThreeSortedTest() {
		Integer[] ints = new Integer[] {0, 4, 5};
		int i = QuickSort.partition(ints, 0, ints.length - 1);
		
		System.out.println("partition=" + i + ", array=" + QuickSort.toString(ints));
		Assert.assertTrue(isPartitioned(ints, i));
	}
	
	@Test
	public void partitionThreeUnsortedTest() {
		Integer[] ints = new Integer[] {7, 4, 5};
		int i = QuickSort.partition(ints, 0, ints.length - 1);
		
		System.out.println("partition=" + i + ", array=" + QuickSort.toString(ints));
		Assert.assertTrue(isPartitioned(ints, i));
	}
	
	@Test
	public void partitionThreeUnsortedTest2() {
		Integer[] ints = new Integer[] {7, 8, 5};
		int i = QuickSort.partition(ints, 0, ints.length - 1);
		
		System.out.println("partition=" + i + ", array=" + QuickSort.toString(ints));
		Assert.assertTrue(isPartitioned(ints, i));
	}
	
	@Test
	public void partitionThreeUnsortedTest3() {
		Integer[] ints = new Integer[] {9, 8, 2};
		int i = QuickSort.partition(ints, 0, ints.length - 1);
		
		System.out.println("partition=" + i + ", array=" + QuickSort.toString(ints));
		Assert.assertTrue(isPartitioned(ints, i));
	}
}
