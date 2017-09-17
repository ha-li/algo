package com.gecko.algorithms.sort;

/**
 * Created by hlieu on 10/21/16.
 */
public class HeapSort /* implements Sort */ {
    public static <T extends Comparable<T>> void sort(T[] comparables) {

    }

    private static <T extends Comparable<T>> void max_heapify(T[] i) {

    }

    private static int parent(int i) {
        return i%2 == 0 ? i/2 - 1 : i/2;
    }

    protected static int left(int i) {
        return 2*i+1;
    }

    private static int right(int i) { return (i+1)*2; }
}
