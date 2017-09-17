package com.gecko.algorithms.merge;


import java.lang.reflect.Array;

/**
 * Created by hlieu on 10/17/16.
 */
public class Merge2 {

    // a simple merge example, not useful for merge sort algorithm, but
    // is useful if you just want to merge two arrays together

    // merges the results of a1 and a2 in and returns the new array
    // a1 and a2 must be sorted
    public static <T extends Comparable<T>> T[] merge(T[] a1, T[] a2) {
        if(a1 == null || a2 == null || (a1.length + a2.length == 0)  ) {
            throw new IllegalArgumentException("Input array cannot be null.");
        }

        Class claz = a1.length == 0 ? a2[0].getClass() : a1[0].getClass() ;

        T[] a3 = (T[]) Array.newInstance(claz, a1.length + a2.length);

        int j = 0;
        int k = 0;

        for( int i = 0; i < a3.length; ) {
            if( j >= a1.length ) {
                a3[i++] = a2[k++];
            } else if ( k >= a2.length ) {
                a3[i++] = a1[j++];
            } else if ( less(a1[j], a2[k]) ) {
                a3[i++] = a1[j++];
            } else if ( greater(a1[j], a2[k]) ) {
                a3[i++] = a2[k++];
            } else if ( equal(a1[j], a2[k]) ) {      // they are equal, just use one of them
                a3[i++] = a1[j++];
            } else {
                throw new UnknownError("This should never happen.");
            }
        }

        return a3;
    }

    private static <T extends Comparable<T>> boolean less(T a, T b) {
        return a.compareTo(b) < 0;
    }

    private static <T extends Comparable<T>> boolean greater(T a, T b) {
        return a.compareTo(b) > 0;
    }

    private static <T extends Comparable<T>> boolean equal(T a, T b) {
        return a.compareTo(b) == 0;
    }
}
