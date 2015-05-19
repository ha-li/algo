package com.gecko.algorithms.merge;

import org.junit.Assert;
import org.junit.Test;

// hello
public class MergeSortTest {

	private static void assertIntegerArrayEquals(Integer[] expected, Integer[] actual) {
		for(int i = 0; i < expected.length; i++) {
			Assert.assertEquals(expected[i], actual[i]);
		}
	}

	@Test
	public void arraySize0Test() {
		Integer[] ints = new Integer[0];
		
		MergeSort.sort(ints);
		
		Integer[] expected = {};
		assertIntegerArrayEquals( expected, ints );
	}

	
	
	@Test
	public void arraySize1Test() {
		Integer[] ints = new Integer[1];
		ints[0] = 4;
		
		MergeSort.sort(ints);
		
		Integer[] expected = {4};
		assertIntegerArrayEquals( expected, ints );
	}

	
	@Test
	public void arraySize2Test() {
		Integer[] ints = new Integer[2];
		ints[0] = 4;
		ints[1] = 1;
		
		MergeSort.sort(ints);
		
		Integer[] expected = {1,4};
		assertIntegerArrayEquals( expected, ints );
	}

	@Test
	public void arraySize2SortedTest() {
		Integer[] ints = new Integer[2];
		ints[0] = 4;
		ints[1] = 5;
		
		MergeSort.sort(ints);
		
		Integer[] expected = {4,5};
		assertIntegerArrayEquals( expected, ints );
	}
	
	@Test
	public void arraySize2DuplicateTest() {
		Integer[] ints = new Integer[2];
		ints[0] = 4;
		ints[1] = 4;
		
		MergeSort.sort(ints);
		
		Integer[] expected = {4,4};
		assertIntegerArrayEquals( expected, ints );
	}

	@Test
	public void arraySize3Test() {
		Integer[] ints = new Integer[3];
		ints[0] = 4;
		ints[1] = 7;
		ints[2] = 6;
		
		MergeSort.sort(ints);
		
		Integer[] expected = {4,6,7};
		assertIntegerArrayEquals( expected, ints );
	}

	@Test
	public void arraySize3DuplicateTest() {
		Integer[] ints = new Integer[3];
		ints[0] = 4;
		ints[1] = 4;
		ints[2] = 4;
		
		MergeSort.sort(ints);
		
		Integer[] expected = {4,4,4};
		assertIntegerArrayEquals( expected, ints );
	}
	
	@Test
	public void arraySize3DuplicateIsSortedTest() {
		Integer[] ints = new Integer[3];
		ints[0] = 4;
		ints[1] = 4;
		ints[2] = 4;
		
		MergeSort.sort(ints);
		
		//Integer[] expected = {4,4,4};
		Assert.assertTrue( MergeSort.isSorted(ints) );
	}

	@Test
	public void arraySize3IsSortedTest() {
		Integer[] ints = new Integer[3];
		ints[0] = 4;
		ints[1] = 5;
		ints[2] = 6;
		
		MergeSort.sort(ints);
		
		//Integer[] expected = {4,4,4};
		Assert.assertTrue( MergeSort.isSorted(ints) );
	}

	@Test
	public void arraySize3ReverseIsSortedTest() {
		Integer[] ints = new Integer[3];
		ints[0] = 5;
		ints[1] = 4;
		ints[2] = 3;
		
		MergeSort.sort(ints);
		
		Assert.assertTrue( MergeSort.isSorted(ints) );
	}

	@Test
	public void arraySize4IsSortedTest() {
		Integer[] ints = new Integer[4];
		ints[0] = 5;
		ints[1] = 2;
		ints[2] = 8;
		ints[3] = 3;
		
		MergeSort.sort(ints);
		
		Assert.assertTrue( MergeSort.isSorted(ints) );
	}

}
