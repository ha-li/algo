package com.gecko.algorithms.merge;

import org.junit.Assert;
import org.junit.Test;

public class MergeTest {

	@Test
	public void arraySize1Test() {
		Integer[] ints = new Integer[1];
		
		ints[0] = 5;
		
		Merge.merge(ints, 0, (ints.length-1)/2, ints.length - 1);

		Assert.assertTrue( Merge.isSorted(ints) );
	}

	@Test
	public void arraySize2Test() {
		Integer[] ints = new Integer[2];
		
		ints[0] = 5;
		ints[1] = 1;

		Merge.merge(ints, 0, (ints.length-1)/2, ints.length - 1);

		Assert.assertTrue( Merge.isSorted(ints) );
	}

	@Test
	public void arraySize3Test() {
		Integer[] ints = new Integer[3];
		
		ints[0] = 5;
		ints[1] = 6;
		ints[2] = 5;

		Merge.merge(ints, 0, (ints.length-1)/2, ints.length - 1);

		Assert.assertTrue( Merge.isSorted(ints) );
	}

	@Test
	public void arraySize4Test() {
		Integer[] ints = new Integer[4];
		
		ints[0] = 5;
		ints[1] = 6;
		ints[2] = 5;
		ints[3] = 6;

		Merge.merge(ints, 0, (ints.length-1)/2, ints.length - 1);

		Assert.assertTrue( Merge.isSorted(ints) );
	}
	
	@Test
	public void arraySize4Test2() {
		Integer[] ints = new Integer[4];
		
		ints[0] = 5;
		ints[1] = 6;
		ints[2] = 1;
		ints[3] = 2;

		Merge.merge(ints, 0, (ints.length-1)/2, ints.length - 1);

		Assert.assertTrue( Merge.isSorted(ints) );
	}

	@Test
	public void arraySize5Test() {
		Integer[] ints = new Integer[5];
		
		ints[0] = 5;
		ints[1] = 6;
		ints[2] = 10;
		ints[3] = 2;
		ints[4] = 8;

		Merge.merge(ints, 0, (ints.length-1)/2, ints.length - 1);

		Assert.assertTrue( Merge.isSorted(ints) );
	}

	
	@Test
	public void arraySize6Test() {
		Integer[] ints = new Integer[6];
		
		ints[0] = 5;
		ints[1] = 10;
		ints[2] = 13;
		ints[3] = 2;
		ints[4] = 5;
		ints[5] = 14;
		
		Merge.merge(ints, 0, (ints.length-1)/2, ints.length - 1);

		Assert.assertTrue( Merge.isSorted(ints) );
	}

	
}
