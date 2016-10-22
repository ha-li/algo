package com.gecko.algorithms.sort;

/**
 * Created by hlieu on 10/22/16,
 *
 * a sorting algorithm I made up that pivots on the tail,
 * a variant of quick sort
 */
public class QuickSortTail {
    public static <T extends Comparable<T>> void sort(T[] comparables) {
        sort(comparables, 0, comparables.length - 1);
    }

    private static <T extends Comparable<T>> void sort(T[] comparables, int lo, int high) {
        if(lo < high) {
            int partition = partition(comparables, lo, high);
            sort(comparables, lo, high - 1);
        }
    }

    private static <T extends Comparable<T>> int partition(T[] comparables, int lo, int high){
        T pivot = comparables[high];

        //int max = 0;
        // find the max index
        int max = max(comparables, lo, high);

        // move the max to the tail end
        T tmp = comparables[max];
        comparables[max] = pivot;
        comparables[high] = tmp;
        return high;
    }

    private static <T extends Comparable<T>> int max(T[] comparables, int lo, int high){
        int max_i = 0;
        for ( int i = 1; i <= high; i++ ) {
            if( comparables[i].compareTo(comparables[max_i]) > 0 ) {
                max_i = i;
            }
        }
        return max_i;
    }
}
