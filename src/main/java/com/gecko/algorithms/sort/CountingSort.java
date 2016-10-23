package com.gecko.algorithms.sort;

/**
 * Created by hlieu on 10/23/16.
 */
public class CountingSort {
    // counting sort is a sort algorithm that
    // sorts an array of positive integers
    // in O(n)

    public static Integer[] sort(Integer[] a) {
        // where we'll put the sorted results in
        Integer[] b = new Integer[a.length];

        // our largest values
        int k = max(a);

        int[] aux_k = new int[k+1];
        _cardinal_count(aux_k, a);

        _final_sort(b, aux_k, a);
        return b;
    }

    private static void _final_sort(Integer[] ret, int[] aux, Integer[] input) {
        for(int i = 0; i < ret.length; i++) {
            ret[aux[input[i]]-1] = input[i];
            aux[input[i]] = aux[input[i]] - 1;
        }
    }

    private static void _cardinal_count(int[] aux_k, Integer[] input) {
        for(int i = 0; i < input.length; i++) {
            aux_k[input[i]] = aux_k[input[i]] + 1;
        }

        for(int i = 1; i < aux_k.length; i++) {
            aux_k[i] = aux_k[i] + aux_k[i-1];
        }
    }

    private static int max(Integer[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if ( a[i] > max ) { max = a[i]; }
        }
        return max;
    }
}
