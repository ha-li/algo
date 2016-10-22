package com.gecko.algorithms;

import com.gecko.PrintUtils;
import com.gecko.RandomUtils;
import com.gecko.algorithms.sort.InsertionSort;
import org.junit.Test;

/**
 * Created by hlieu on 10/20/16.
 */
public class RandomizeTest {

    @Test
    public void permutate() throws Exception {
        Integer[] ints = new Integer[4];
        RandomUtils.populate(ints, 1, 99);
        InsertionSort.sort(ints);

        PrintUtils.display(ints);

        RandomizePermutation.permutate(ints);
        PrintUtils.display(ints);
    }

    @Test
    public void permutateTest2() throws Exception{
        Integer[] ints = new Integer[10];
        RandomUtils.populate(ints, 1, 99);
        //InsertionSort.sort(ints);
        PrintUtils.display(ints);
        RandomizePermutation.permutateInPlace(ints);
        PrintUtils.display(ints);
    }
}