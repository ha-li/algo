package com.gecko.leetcode.maxnonconsecutivetwosums;


/**
 * return the sum of the largest two non-consecutive integers.
 *
 * [1, 100, 99, 10] gives back 110
 * [1, 90, 100, 80]
 */
public class MaxTwoSum {
   public int[] twoSums (int[] values) {
      int max = Integer.MIN_VALUE;
      int[] index = {-1, -1};

      for (int i = 0; i < values.length; i++) {
         for (int j = i + 2; j < values.length; j++) {
            if (values[i] + values[j] > max) {
               index[0] = i;
               index[1] = j;
               max = values[i] + values[j];
            }
         }
      }
      return index;
   }
}
