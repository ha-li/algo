package com.gecko.algorithms;

import java.lang.reflect.Array;

/**
 * Created by hlieu on 10/24/16.
 */
public class MinMax {

    // a clever little min max algorith that finds both the min and the max
    // of an input array in a using less then the 2n-2 comparisons if
    // each input was compared against the  min and max.
    // It does this by comparing the input in pairs first to themselves,
    // then the lesser of this is compared to the min, and the larger of the pairs
    // to the max. There for there will be 3n/2 comparisons.
    public static <T extends Comparable<T>> T[] min_max_find(T[] input) {

        // our return value, ret[0] will be min, ret[1] will be max
        T[] ret = (T[]) Array.newInstance(input[0].getClass(), 2);

        // our min and max values
        T min = input[0];
        T max = input[0];

        int start = 0;
        // int end = 0;
        if(input.length % 2 == 0) {
            start = 0;
            //end = input.length;
        } else {
            start = 1;
        }

        for (int i = start; i < input.length; i = i+2) {
            T[] min_max_l = min_max_find(input, i);
            if( min_max_l[0].compareTo(min) < 0 ) min = min_max_l[0];
            if( min_max_l[1].compareTo(max) > 0 ) max = min_max_l[1];
        }

        ret[0] = min;
        ret[1] = max;
        return ret;
    }

    private static <T extends Comparable<T>> T[] min_max_find(T[] input, int start) {
        T[] min_max = (T[]) Array.newInstance(input[0].getClass(), 2);

        if ( input[start].compareTo(input[start+1]) <= 0 ) {
            min_max[0] = input[start];
            min_max[1] = input[start + 1];
        } else {
            min_max[1] = input[start];
            min_max[0] = input[start + 1];
        }
        return min_max;
    }
}
