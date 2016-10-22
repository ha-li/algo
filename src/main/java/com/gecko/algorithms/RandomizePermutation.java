package com.gecko.algorithms;

//import com.gecko.PrintUtils;
import com.gecko.RandomUtils;
import com.gecko.algorithms.sort.BaseSort;

import java.lang.reflect.Array;
import java.util.Random;

/**
 * Created by hlieu on 10/20/16.
 */
public class RandomizePermutation {

    // this method will permutate the input array
    // by internally generating an array of same length, then sorts the array
    // and permutates the input by the same positions as required to sort the
    // random array
    // the run time of this method is O(n^2) which is not good
    public static <T extends Comparable<T>> void permutate(T[] comparables) {
        Integer[] random = (Integer[]) Array.newInstance(Integer.class, comparables.length);
        RandomUtils.populate(random, 1, 99);
        //PrintUtils.display(random);

        // sort the random array, using the same positional changes
        // as the permutating factor to randomize the input
        for(int i = 1; i < comparables.length; i++) {
            for(int j = 0; j < i; j++) {
                if( BaseSort.isLess(random[i], random[j]) ) {
                    BaseSort._exchange(random, i, j);
                    BaseSort._exchange(comparables, i, j);
                }
            }
        }
        //PrintUtils.display(random);
    }

    // this does a permutation in place, taking O(n), much better performance
    public static <T extends Comparable<T>> void permutateInPlace(T[] comparables) {
        int n = comparables.length;
        // generate a random number between [0, n)
        Random random = new Random();
        for(int i = 0; i < n; i++) {
            BaseSort._exchange(comparables, i, random.nextInt(n));
        }
    }
}
